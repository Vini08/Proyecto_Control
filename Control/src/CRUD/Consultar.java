/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import Conexion.Conexion;
import static Conexion.Conexion.sta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Consultar {
    
    private Connection conn=null;
    Connection miConexion=null;

    public Consultar() {
        try {
            miConexion=(Connection)Conexion.Enlace(conn);
        } catch (SQLException ex) {
            Logger.getLogger(null,ex.getMessage());
        }
    }
    
    
    
    public int login(String user,String pass) throws SQLException{
        int result=0;
        Statement sentencia = miConexion.createStatement();
        ResultSet resultado = sentencia.executeQuery( "SELECT usuario,password,idrol from EMPLEADO WHERE usuario='"+user+"'" );
        
        while(resultado.next()){
            String usu="",con="";
            int rol;
            usu=resultado.getString("usuario");
            con=resultado.getString("password");
            rol=resultado.getInt("idrol");
            //si la contraseña encontrada coincide con la que ingreso el usuario
            if(con.equals(pass)){
                result=rol;
            }else{
                result=-1;
            }
        }
        
        return result;
       
    }
     
}
