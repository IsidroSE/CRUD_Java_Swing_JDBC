/*
 * To change this template, dosmilquinzechoose Tools | Templates
 * and open the template in the editor.
 */

package Presentacio;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sergi
 */

public class ModeloTabla extends AbstractTableModel{
ArrayList datos = new ArrayList();
String [] columnas;
Class[] types = null;
/** Creates a new instance of SimpleTableModel */
    public ModeloTabla(String [] columnas, Class[] types) {
        this.columnas = columnas;
        this.types = types;
    }
    public int getRowCount() { return datos.size(); }

    public int getColumnCount() { return columnas.length; }

    public Object getValueAt(int row, int col) {
        Object[] fila = (Object[]) datos.get(row);
        return fila[col];
    }
    public String getColumnName(int col) {
        return columnas[col].toString();
    }
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }
    public boolean isCellEditable(int row, int col) {
            return true;
    }
    public void setValueAt(Object value, int row, int col) {
        Object [] fila = (Object []) datos.get(row);
        fila[col] = value;
        fireTableCellUpdated(row, col);
    }
    public void addRow(Object [] fila) {
        datos.add(fila);
        fireTableDataChanged();
    }
    public void removeRow(int fila) {
        datos.remove(fila);
    fireTableDataChanged();
    }
}