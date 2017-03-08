/*
 * To change this template, dosmilquinzechoose Tools | Templates
 * and open the template in the editor.
 */

package Presentacio;

import BLL.ArticleBLL;
import Entitat.Article;
import Entitat.Categoria;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sergi
 */

public class ModeloTabla_Articles extends AbstractTableModel {

    ArrayList datos = new ArrayList();
    String [] columnas = {"ID", "Nom", "Descripcio", "Familia", "Preu", "Data"};
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, 
        java.lang.Integer.class, java.lang.Double.class, java.sql.Date.class};
    
    public ModeloTabla_Articles() throws Exception {
        ArrayList <Article> articles;
        try {
            ArticleBLL aBLL = new ArticleBLL();
            articles = aBLL.obtenirArticles();
            Article a;
            for (int i=0 ; i<articles.size() ; i++) {
                a = articles.get(i);
                
                Object[] fila = new Object[6];
                
                fila[0] = a.getId();
                fila[1] = a.getNom();
                fila[2] = a.getDescripcio();
                fila[3] = a.getFamilia();
                fila[4] = a.getPreu();
                fila[5] = a.getData();
                
                datos.add(fila);
            }
        }
        catch (Exception e) {
            throw e;
        }
    }


    public ModeloTabla_Articles(String [] columnas, Class[] types) {
        this.columnas = columnas;
        this.types = types;
    }
    
    @Override
    public String getColumnName(int col) {
        return columnas[col].toString();
    }
    
    @Override
    public int getRowCount() { 
        return datos.size(); 
    }
    
    @Override
    public int getColumnCount() {
        return columnas.length; 
    }
    
    @Override
    public Object getValueAt(int row, int col) {
        Object[] fila = (Object[]) datos.get(row);
        return fila[col];
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }
    
    @Override
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
    
    public void setDades(ArrayList<Object> dades) {
        datos=dades;
    }
}