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
         if (conn != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
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
       rs=st.executeQuery("select * from CLIENTE ORDER BY IDCLIENTE ASC");
        return rs;
    }
     
     public static ResultSet Empleado(ResultSet rs) throws SQLException
                {
                     Connection conn=null;
                     Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select empleado.NOMBRE, empleado.APELLIDO, empleado.DPI, empleado.DIRECCION, empleado.TELEFONO, ROL.NOMBREROL as ROL from empleado INNER JOIN ROL ON empleado.IDROL = ROL.IDROL");
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
     
      public static ResultSet Buscaridcliente(String dpi) throws SQLException
                {
                     Connection conn=null;
                     Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select cliente.idcliente, cliente.nombre, cliente.apellido from cliente where cliente.dpi = ?");
                        pstm.setString(1, dpi);
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       System.out.println(e.getMessage());
                    }
                    return res;
                }
      
        public static ResultSet BuscarInmueble(int dpi) throws SQLException
                {
                    Connection conn=null;
                    Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("SELECT IDINMUEBLE, DIRECCION, ZONA FROM INMUEBLE INNER JOIN CLIENTE ON CLIENTE.IDCLIENTE = INMUEBLE.IDCLIENTE WHERE CLIENTE.DPI = ?");
                        pstm.setInt(1, dpi);
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }

        public static ResultSet BuscarRecibo(int fechaa, int fecha,  int zona) throws SQLException
                {
                    Connection conn=null;
                    Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select cliente.nombre, CLIENTE.APELLIDO, inmueble.DIRECCION,inmueble.zona, lectura.LECTURAANTERIOR AS LECTURA_ANTERIOR, lectura.LECTURAACTUAL AS LECTURA_ACTUAL, lectura.METROSCUBICOS AS CONSUMO, recibo.fechavenci AS FECHA_VENCIMIENTO, recibo.TOTAL, recibo.IDRECIBO as NO_RECIBO from CLIENTE inner join inmueble on cliente.IDCLIENTE = inmueble.IDCLIENTE inner join medidor on inmueble.IDINMUEBLE = medidor.IDINMUEBLE inner join lectura on medidor.IDMEDIDOR = lectura.IDMEDIDOR inner join recibo on lectura.IDLECTURA =  recibo.IDLECTURA where  TO_char(recibo.FECHAVENCI, 'YYYY')= ? and TO_char(recibo.FECHAVENCI, 'MM')= ?  and inmueble.ZONA = ? and recibo.ESTADO=1 ORDER BY recibo.IDRECIBO asc ");
                       pstm.setInt(1,fechaa);
                       pstm.setInt(2,fecha);
                       pstm.setInt(3, zona);
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
        
           public static ResultSet GenerarFactura(int idrecibo) throws SQLException
                {
                    Connection conn=null;
                    Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select cliente.nombre, CLIENTE.APELLIDO, CLIENTE.NIT, inmueble.direccion,inmueble.zona, lectura.METROSCUBICOS, recibo.fechavenci, recibo.TOTAL from CLIENTE inner join inmueble on cliente.IDCLIENTE = inmueble.IDCLIENTE inner join medidor on inmueble.IDINMUEBLE = medidor.IDINMUEBLE inner join lectura on medidor.IDMEDIDOR = lectura.IDMEDIDOR inner join recibo on lectura.IDLECTURA =  recibo.IDLECTURA where recibo.IDRECIBO = ? and recibo.ESTADO= 1");
                       pstm.setInt(1, idrecibo);
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
           
             public static ResultSet BuscarReciboM(int medidor) throws SQLException
                {
                    Connection conn=null;
                    Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select cliente.nombre, CLIENTE.APELLIDO,inmueble.zona, lectura.LECTURAANTERIOR, lectura.LECTURAACTUAL, lectura.METROSCUBICOS, recibo.fechavenci, recibo.TOTAL, recibo.IDRECIBO from CLIENTE inner join inmueble on cliente.IDCLIENTE = inmueble.IDCLIENTE inner join medidor on inmueble.IDINMUEBLE = medidor.IDINMUEBLE inner join lectura on medidor.IDMEDIDOR = lectura.IDMEDIDOR inner join recibo on lectura.IDLECTURA =  recibo.IDLECTURA where medidor.idmedidor = ? and RECIBO.ESTADO =1 order by recibo.fechavenci asc ");
                       pstm.setInt(1,medidor);
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
             
              public static ResultSet BuscarReporteC(String cajero, String fecha) throws SQLException
                {
                    Connection conn=null;
                    Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select IDFACTURA AS NO_FACTURA,FECHA AS FECHA, TIPOPAGO.NOMBRETIPO AS TIPO_DE_PAGO, TOTAL from factura inner join EMPLEADO on factura.IDEMPLEADO = EMPLEADO.IDEMPLEADO inner join ROL on EMPLEADO.IDROL = ROL.IDROL inner join TIPOPAGO ON  FACTURA.IDPAGO = TIPOPAGO.IDTIPO where EMPLEADO.USUARIO = ? and TO_char(factura.FECHA, 'DD/MM/YYYY')= ? order by factura.FECHA asc ");
                       pstm.setString(1, cajero);
                       pstm.setString(2, fecha);
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
              
                public static ResultSet BuscarReporteA(String fecha) throws SQLException
                {
                    Connection conn=null;
                    Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select IDFACTURA AS NO_FACTURA,FECHA AS FECHA, TIPOPAGO.NOMBRETIPO AS TIPO_DE_PAGO, EMPLEADO.USUARIO AS USUARIO,TOTAL from factura inner join EMPLEADO on factura.IDEMPLEADO = EMPLEADO.IDEMPLEADO inner join ROL on EMPLEADO.IDROL = ROL.IDROL inner join TIPOPAGO ON  FACTURA.IDPAGO = TIPOPAGO.IDTIPO where TO_char(factura.FECHA, 'DD/MM/YYYY')= ? order by factura.FECHA , factura.IDFACTURA asc");
                       pstm.setString(1, fecha);
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
                
                public static ResultSet ClientesM(ResultSet rs) throws SQLException
                {
                     Connection conn=null;
                     Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select  CLIENTE.NOMBRE, CLIENTE.APELLIDO, inmueble.DIRECCION, inmueble.ZONA, SUM(recibo.estado) as Meses from CLIENTE inner join inmueble on cliente.IDCLIENTE = inmueble.IDCLIENTE inner join medidor on inmueble.IDINMUEBLE = medidor.IDINMUEBLE inner join lectura on medidor.IDMEDIDOR = lectura.IDMEDIDOR inner join recibo on lectura.IDLECTURA =  recibo.IDLECTURA where  lectura.IDMEDIDOR = medidor.IDMEDIDOR and recibo.ESTADO ='1'  GROUP BY CLIENTE.NOMBRE, CLIENTE.APELLIDO,  inmueble.DIRECCION, inmueble.ZONA HAVING sum(recibo.estado) >=4");
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
                
                public static ResultSet MostrarR(ResultSet rs) throws SQLException
                {
                     Connection conn=null;
                     Connection miConexion = (Connection) Conexion.Enlace(conn);
                    ResultSet res = null;
                    
                    try
                    {
                        
                        PreparedStatement pstm = Conexion.Enlace(conn).prepareStatement("select recibo.IDRECIBO as NO_RECIBO, cliente.nombre, CLIENTE.APELLIDO, inmueble.DIRECCION,inmueble.zona, lectura.LECTURAANTERIOR AS LECTURA_ANTERIOR, lectura.LECTURAACTUAL AS LECTURA_ACTUAL, lectura.METROSCUBICOS AS CONSUMO, recibo.fechavenci AS FECHA_VENCIMIENTO, recibo.TOTAL from CLIENTE inner join inmueble on cliente.IDCLIENTE = inmueble.IDCLIENTE inner join medidor on inmueble.IDINMUEBLE = medidor.IDINMUEBLE inner join lectura on medidor.IDMEDIDOR = lectura.IDMEDIDOR inner join recibo on lectura.IDLECTURA =  recibo.IDLECTURA where recibo.ESTADO=1 ORDER BY recibo.IDRECIBO asc");
                        res=pstm.executeQuery();
                    } catch (Exception e)
                    {
                       
                    }
                    return res;
                }
        
}
