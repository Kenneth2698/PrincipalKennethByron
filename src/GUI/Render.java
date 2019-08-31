/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author Kenneth
 */
public class Render extends DefaultTableCellHeaderRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean bln, boolean bln1, int i, int i1) {
        
        
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            return btn;
        }
        return super.getTableCellRendererComponent(jtable, value, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
}
