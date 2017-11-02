/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando Ambrosio
 */
public class MostrarTabla {
    
    public DefaultTableModel Imprimir(ResultSet res, DefaultTableModel modelo ){
      int i;
      try {
          ResultSetMetaData rmeta= res.getMetaData();
          int numColumnas= rmeta.getColumnCount();
          for(i=1; i<=numColumnas;i++)
          {
              modelo.addColumn(rmeta.getColumnName(i));
          }
          while(res.next())
          {
              Object [] fila = new Object [numColumnas];
              for (i=0; i<numColumnas;i++)
              fila[i] = res.getObject(i+1);
              modelo.addRow(fila);
          }    
      } 
      catch (Exception e){
          JOptionPane.showMessageDialog(null,"Error" +e);
      }
        return modelo;
    }
    
}
