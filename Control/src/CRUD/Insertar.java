/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Inmueble;
import Clases.Lectura;
import Clases.Medidor;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ventanas_Administrador.Registrar_Usuario;

/**
 *
 * @author Fernando Ambrosio
 */
public class Insertar {
    
      public static Empleado ingresarEmpleado(Empleado empleado) throws SQLException {
             
             Connection conn=null;
            Connection miConexion = (Connection) Conexion.Enlace(conn);
            
            try {
                Statement statement = (Statement) miConexion.createStatement();
            
                PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
                        + "EMPLEADO(NOMBRE, APELLIDO, USUARIO, PASSWORD, DPI, DIRECCION, TELEFONO) "
                        + " values(?,?,?,?,?,?,?)");
                
               
                pstm.setString(1, empleado.getNombre());
                pstm.setString(2, empleado.getApellido());
                pstm.setString(3, empleado.getUsuario());
                pstm.setString(4, empleado.getPassword());
                pstm.setString(5, empleado.getDpi());
                pstm.setString(6, empleado.getDirrecion());
                pstm.setInt(7, empleado.getTelefono());
                
               
            
                pstm.execute();
                pstm.close();
            } catch (Exception ex) {
              
            }
            return empleado;
         }
            
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
         
         
           public static Inmueble ingresarInmueble(Inmueble inmueble) throws SQLException {
             
             Connection conn=null;
            Connection miConexion = (Connection) Conexion.Enlace(conn);
            
            try {
                Statement statement = (Statement) miConexion.createStatement();
            
                PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
                        + "INMUEBLE(DIRECCION, ZONA, IDCLIENTE) "
                        + " values(?,?,?)");
                
               
                pstm.setString(1, inmueble.getDireccion());
                pstm.setInt(2,inmueble.getZona());
                pstm.setInt(3,inmueble.getIdcliente());
               
            
                pstm.execute();
                pstm.close();
            } catch (Exception ex) {
               
            }
            return inmueble;
         }
           
           public static Medidor ingresarMedidor(Medidor medidor) throws SQLException {
             
             Connection conn=null;
            Connection miConexion = (Connection) Conexion.Enlace(conn);
            
            try {
                Statement statement = (Statement) miConexion.createStatement();
            
                PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
                        + "MEDIDOR(IDINMUEBLE) "
                        + " values(?)");
                
               
                pstm.setInt(1, medidor.getIdinmueble());
           
                pstm.execute();
                pstm.close();
            } catch (Exception ex) {
               
            }
            return medidor;
         }
           
            public static Lectura ingresarLectura(Lectura lectura) throws SQLException {
             
             Connection conn=null;
            Connection miConexion = (Connection) Conexion.Enlace(conn);
            
            try {
                Statement statement = (Statement) miConexion.createStatement();
            
                PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
                        + "LECTURA(FECHALECTURA, LECTURAANTERIOR, LECTURAACTUAL, METROSCUBICOS, IDMEDIDOR) "
                        + " values(?,?,?,?,?)");
                
               
                pstm.setString(1, lectura.getFechalectura());
                pstm.setInt(2, lectura.getLecturaanterior());
                pstm.setInt(3, lectura.getLecturaactual());
                pstm.setInt(4, lectura.getMetroscubicos());
                pstm.setInt(5, lectura.getIdmedidor());
                pstm.execute();
                pstm.close();
            } catch (Exception ex) {
               
            }
            return lectura;
         }
                     
}
