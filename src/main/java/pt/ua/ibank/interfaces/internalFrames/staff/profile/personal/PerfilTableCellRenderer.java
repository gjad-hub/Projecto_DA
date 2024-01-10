/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames.staff.profile.personal;

import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilTableElementPanel;
import com.mysql.cj.conf.ConnectionUrlParser.Pair;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ricar
 */
public class PerfilTableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        Component comm = super.getTableCellRendererComponent(table, value,
                isSelected,
                hasFocus, row, column);
        var currClientObject = (Pair<String, String>) value;

        var profileChildElement = new PerfilTableElementPanel(
                false,
                currClientObject.left,
                currClientObject.right);

        if (isSelected && row % 2 == 0) {
            profileChildElement.setBackground(Color.WHITE);
        } else {
            // profileChildElement.setBackground(comm.getBackground());
        }
        return profileChildElement;
    }

}
