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

/**
 *
 * @author Pablo
 */
public class Consultar {
    
    public int login() throws SQLException{
        int result=0;
        Connection conn=null;
        Connection miConexion = (Connection) Conexion.Enlace(conn);
        
        ResultSet resultado = null;
        
       
        return result;
    }
     
}
