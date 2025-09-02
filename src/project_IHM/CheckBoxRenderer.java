package project_IHM;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class CheckBoxRenderer extends JCheckBox implements TableCellRenderer {
 CheckBoxRenderer() {
     this.setHorizontalAlignment(JLabel.CENTER);
 }

 public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
         boolean hasFocus, int row, int column) {
     if (isSelected) {
         setForeground(table.getSelectionForeground());
         super.setBackground(table.getSelectionBackground());
     } else {
         setForeground(table.getForeground());
         setBackground(table.getBackground());
     }
     setSelected((value != null && ((Boolean) value).booleanValue()));
     return this;
 }
}
/*
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
public class CheckBoxRenderer extends JFrame {
   private JTable table;
   private DefaultTableModel model;
   public CheckBoxRenderer() {
      Random rnd = new Random();
      model = new DefaultTableModel(new Object[]{"Check Box1","Check Box2", "Check Box3"}, 0) {
         @Override
         public Class getColumnClass(int columnIndex) {
            return Boolean.class;
         }
      };
      for (int index = 0; index < 10; index++) {
         model.addRow(new Object[]{rnd.nextBoolean()});
      }
      table = new JTable(model);
      add(new JScrollPane(table));
      setTitle("JCheckBoxJTable Test");
      setSize(375, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new CheckBoxRenderer();
   }
}

*/