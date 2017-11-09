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
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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
private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:XE";;
private static final String DB_USER = "facturacion";
private static final String DB_PASSWORD = "bar1019";
public static String ID_INMueble; 
public static String ID_Tarifa;
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
                     
public static void insertarINMUEBLE_MEDIDOR(String direccion, String zona, String idcliente) throws SQLException {
             
  Connection conn=null;
  Connection miConexion = (Connection) Conexion.Enlace(conn);
  
  //INSERTA LOS DATOS A LA TABLA INMUEBE
  try {
      PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
      + "INMUEBLE(DIRECCION, ZONA, IDCLIENTE) "
      + " values(?,?,?)");        
      pstm.setString(1, direccion);
      pstm.setString(2, zona);
      pstm.setString(3, idcliente);
      pstm.execute();
      pstm.close();
      } catch (Exception ex) {
      System.out.println(ex.getMessage());
      }   
  //SELECCIONA IDINMUBLE PARA PODER USARLO EN LA TABLA MEDIDOR
                Statement stmt; 
                ResultSet rsult; 
                stmt = Conexion.Enlace(conn).createStatement(); 
                rsult= stmt.executeQuery("SELECT IDINMUEBLE FROM (SELECT INMUEBLE.IDINMUEBLE FROM INMUEBLE ORDER BY IDINMUEBLE DESC) WHERE ROWNUM = 1"); 
                while (rsult.next()) { 
                ID_INMueble = rsult.getString("IDINMUEBLE");                
                } 
  //INSERTA EL ESTADO Y IDINMUEBLE EN LA TABLA MEDIDOR              
            try {
                Statement statement = (Statement) miConexion.createStatement();
                PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("insert into "
                + "MEDIDOR(ESTADO, IDINMUEBLE) "
                + " values(?,?)");        
                pstm.setInt(1, 1);
                pstm.setString(2, ID_INMueble);
                pstm.execute();
                pstm.close();
                
            } catch (Exception ex) {
               System.out.println(ex.getMessage());
            }   
}

}
