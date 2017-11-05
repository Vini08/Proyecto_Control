/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.io.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Fernando Ambrosio
 */
public class Conexion {


    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    
  
    static String bd="XE";
    static String login="facturacion";//Valores de prueba 
    static String password="bar1019";//Valores de prueba
    static String url="jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection Enlace(Connection conn)throws SQLException    {
        try {
         Class.forName("oracle.jdbc.OracleDriver");
         conn=DriverManager.getConnection(url, login, password);
        }
        catch(ClassNotFoundException e )
        {
            System.out.print("Clase no encontrada");
        }
        return conn;
    }
    
    public static Statement sta(Statement st)throws SQLException    {
        conn=Enlace(conn);
        st=conn.createStatement();
        return st;
    }
    
     public static ResultSet Cliente(ResultSet rs)throws SQLException    {
       st=sta(st);
       rs=st.executeQuery("select * from CLIENTE");
        return rs;
    }
     
     public static ResultSet Empleado(ResultSet rs) throws SQLException
                {
                     Connection conn=null;
                     Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select empleado.NOMBRE, empleado.APELLIDO, empleado.DPI, empleado.DIRECCION, empleado.TELEFONO from empleado");
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
     
      public static ResultSet Buscaridcliente(int dpi) throws SQLException
                {
                     Connection conn=null;
                     Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select cliente.idcliente from cliente where cliente.dpi = ?");
                        pstm.setInt(1, dpi);
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
}
