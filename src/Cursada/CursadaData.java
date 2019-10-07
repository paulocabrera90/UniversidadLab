/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cursada;

import Conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class CursadaData {
     Connection con = null;
    
    public CursadaData(ConexionDB conexion){
    
       con = conexion.conexion();
    
    }
    
     public void guardarCursada(Cursada cur){
        String sql = "INSERT INTO cursada (cur_id, alm_id, mat_id, nota) VALUES (?,?,?,?);";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                 ps.setInt(1, cur.getCur_id());
                ps.setInt(2, cur.getAlm_id());
                ps.setInt(3, cur.getCur_id());
                ps.setDouble(4, cur.getNota());
                ps.executeUpdate(); 

                ResultSet rs = ps.getGeneratedKeys();

                
            ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
