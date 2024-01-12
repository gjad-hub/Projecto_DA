package pt.ua.ibank.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import pt.ua.ibank.DTO.Funcionario;
import pt.ua.ibank.utilities.DBConnection;
import static pt.ua.ibank.utilities.DBConnection.conn;

public class FuncionarioDAO {

    public final static int codigoSucesso = 1;
    public final static int codigoErro = 2;
    public final static int codigoErroEmail = 3;

    public static int CreateFuncionario(String nome, String morada, String email,
            String telefone, String nif,
            String password) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            // Verifica se já existe alguma conta com aquele e-mail
            stmt = conn.prepareStatement(
                    "SELECT count(num_fun) AS valor FROM cliente where email like ?;");
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            rs.next();

            if (rs.getInt("valor") > 0) {
                return codigoErroEmail;
            }

            stmt = conn.prepareStatement(
                    "INSERT INTO funcionario (nome, morada, email, telemovel, nif, password) "
                    + "VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, nome);
            stmt.setString(2, morada);
            stmt.setString(3, email);
            stmt.setString(4, telefone);
            stmt.setString(5, nif);
            stmt.setString(6, password);
            stmt.execute();
            int num_fun = getFuncionarioIdByEmail(email);
            return codigoSucesso;
        } catch (SQLException e) {
            return codigoErro;
        } finally {
            DBConnection.closeConnection(stmt);
        }
    }

    public static Funcionario getFuncionarioByEmail(String email) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Funcionario fun = null;
        try {

            stmt = conn.prepareStatement(
                    "SELECT * FROM funcionario where email like ?;");
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            while (rs.next()) {
                fun = new Funcionario(rs.getInt("num_fun"),
                        rs.getString("nome"),
                        rs.getString("morada"),
                        rs.getString("email"),
                        rs.getString("telemovel"),
                        rs.getString("nif"),
                        rs.getString("password")); // falta adicionar um número de gerente ao funcionário
            }

            return fun;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }
        return null;
    }

    public static ArrayList<Funcionario> getFuncionarioList() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList list = new ArrayList<>();
        try {
            stmt = conn.prepareStatement(
                    "SELECT num_fun, nome, morada, email, telemovel, nif, gerente FROM funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Integer numero = rs.getInt("num_fun");
                String nome = rs.getString("nome");
                String morada = rs.getString("morada");
                String email = rs.getString("email");
                String telemovel = rs.getString("telemovel");
                String nif = rs.getString("nif");
                Integer numGerente = rs.getInt("gerente");

                list.add(new Funcionario(numero, nome, morada, email, telemovel, nif, morada, numGerente));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }
        return null;
    }

    public static Integer getFuncionarioIdByEmail(String email) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer num_fun = null;

        try {

            stmt = conn.prepareStatement(
                    "SELECT num_fun FROM funcionario where email like ?;");
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            while (rs.next()) {
                num_fun = rs.getInt("num_fun");
            }

            return num_fun;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }
        return null;
    }

    public static int UpdateFuncionario(String nome, String morada, String email,
            String telemovel, String nif,
            String old_email) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Verifica se já existe alguma conta com aquele e-mail
            stmt = conn.prepareStatement(
                    "SELECT count(num_fun) AS valor FROM funcionario where email like ?;");
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            rs.next();

            if (rs.getInt("valor") > 0 && !email.equals(old_email)) {
                return codigoErroEmail;
            }

            stmt = conn.prepareStatement(
                    "UPDATE funcionario SET nome = ? , morada = ?, email = ?, telemovel = ? WHERE email = ?");
            stmt.setString(1, nome);
            stmt.setString(2, morada);
            stmt.setString(3, email);
            stmt.setString(4, telemovel);
            stmt.setString(5, old_email);
            stmt.execute();
            return codigoSucesso;
        } catch (SQLException e) {
            return codigoErro;
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }
    }

    public static int UpdateFuncionario(String nome, String morada, String email,
            String telefone, String nif,
            String password, String old_email) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Verifica se já existe alguma conta com aquele e-mail
            stmt = conn.prepareStatement(
                    "SELECT count(num_fun) AS valor FROM funcionario where email like ?;");
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            rs.next();

            if (rs.getInt("valor") > 0 && !email.equals(old_email)) {
                return codigoErroEmail;
            }

            stmt = conn.prepareStatement(
                    "UPDATE funcionario SET nome = ? , morada = ?, email = ?, telemovel = ?, password = ? WHERE email = ?");
            stmt.setString(1, nome);
            stmt.setString(2, morada);
            stmt.setString(3, email);
            stmt.setString(4, telefone);
            stmt.setString(5, password);
            stmt.setString(6, old_email);
            stmt.execute();
            return codigoSucesso;
        } catch (SQLException e) {
            return codigoErro;
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }
    }

    public static Integer getNumContasCriadasMes() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer numContasCriadas = null;

        try {
            stmt = conn.prepareStatement("SELECT COUNT(*) AS total_contas FROM cliente;");
            rs = stmt.executeQuery();
            if (rs.next()) {
                numContasCriadas = rs.getInt("total_contas");
            }
            return numContasCriadas;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }
        return null;
    }

    public static Integer getNumDepositosPorAprovar() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer numDepositosPorAprovar = null;

        try {
            stmt = conn.prepareStatement("SELECT COUNT(*) AS depositos_pendentes FROM deposito WHERE pendente_aprovacao = 1;");
            rs = stmt.executeQuery();
            if (rs.next()) {
                numDepositosPorAprovar = rs.getInt("depositos_pendentes");
            }
            return numDepositosPorAprovar;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }
        return null;
    }

    public static String getFuncionarioComMaisDepositosAprovados() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nomeFuncionarioMaisDepositos = null;

        try {
            stmt = conn.prepareStatement("SELECT num_fun, COUNT(*) AS total_aprovados FROM deposito WHERE aprovado = 1 GROUP BY num_fun ORDER BY total_aprovados DESC LIMIT 1;");
            rs = stmt.executeQuery();
            if (rs.next()) {
                int numFun = rs.getInt("num_fun");
                nomeFuncionarioMaisDepositos = getNomeFuncionarioByNumber(numFun);
            }
            return nomeFuncionarioMaisDepositos;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }
        return null;
    }

    private static String getNomeFuncionarioByNumber(int numFun) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement("SELECT nome FROM funcionario WHERE num_fun = ?");
            stmt.setInt(1, numFun);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("nome");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }

        return null;
    }

    public static String getNomeUltimaContaCriada() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nomeUltimaConta = null;

        try {
            stmt = conn.prepareStatement("SELECT nome FROM cliente ORDER BY num_cliente DESC LIMIT 1;");
            rs = stmt.executeQuery();

            if (rs.next()) {
                nomeUltimaConta = rs.getString("nome");
            }

            return nomeUltimaConta;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }

        return null;
    }

    public static String getDataUltimoPedidoDeposito() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Timestamp dataUltimoPedido = null;

        try {
            stmt = conn.prepareStatement("SELECT data FROM deposito ORDER BY data DESC LIMIT 1;");
            rs = stmt.executeQuery();

            if (rs.next()) {
                dataUltimoPedido = rs.getTimestamp("data");
            }

            return dataUltimoPedido.toString();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }

        return null;
    }

    public static Integer getNumAprovacoesFuncionarioTop() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int totalAprovacoes = 0;

        try {
            stmt = conn.prepareStatement("SELECT num_fun, COUNT(*) AS total_aprovacoes FROM deposito WHERE aprovado = 1 GROUP BY num_fun ORDER BY total_aprovacoes DESC LIMIT 1;");
            rs = stmt.executeQuery();

            if (rs.next()) {
                totalAprovacoes = rs.getInt("total_aprovacoes");
            }

            return totalAprovacoes;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(stmt, rs);
        }

        return totalAprovacoes;
    }
}
