/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Clases.Cliente;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Ambrosio
 */
public class Insertar {
            
         public static Cliente ingresarCliente(Cliente cliente) throws SQLException {
             
             Connection conn=null;
            Connection miConexion = (Connection) Conexion.Enlace(conn);
            
            try {
                Statement statement = (Statement) miConexion.createStatement();
            
                PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
                        + "CLIENTE(NOMBRE, APELLIDO, DPI, NIT, TELEFONO) "
                        + " values(?,?,?,?,?)");
                
               
                pstm.setString(1, cliente.getNombre());
                pstm.setString(2, cliente.getApellido());
                pstm.setString(3,cliente.getDpi());
                pstm.setString(4,cliente.getNit());
                pstm.setInt(5,cliente.getTelefono());
                
               
            
                pstm.execute();
                pstm.close();
            } catch (Exception ex) {
               
            }
            return cliente;
         }
    
}
