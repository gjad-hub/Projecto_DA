package pt.ua.ibank.interfaces.internalFrames.staff.profile.personal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilTableActionEvent;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilActionPanelElement;
import com.mysql.cj.conf.ConnectionUrlParser;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author ricar
 */
public class PerfilCellEditor extends DefaultCellEditor {

    private PerfilTableActionEvent event;

    public PerfilCellEditor(PerfilTableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        Component comm = super.getTableCellEditorComponent(table, value,
                isSelected, row, column);
        ConnectionUrlParser.Pair<String, String> componentValue = (ConnectionUrlParser.Pair) table.getModel().getValueAt(
                row, 0);

        if (componentValue.left.contains(": ")) {
            return new PerfilActionPanelElement(false);
        }

        PerfilActionPanelElement action = new PerfilActionPanelElement();

        action.InitEvent(event, row);

        action.setBackground(table.getSelectionBackground());
        return action;
    }

}
