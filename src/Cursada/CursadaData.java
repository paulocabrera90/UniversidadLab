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
    
     public void saveCursada(Cursada cur){
        String sql = "INSERT INTO cursada (cur_id, alm_id, mat_id, nota) VALUES (?,?,?,?);";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                 ps.setInt(1, cur.getCur_id());
                ps.setInt(2, cur.getAlm_id());
                ps.setInt(3, cur.getCur_id());
                ps.setDouble(4, cur.getNota());
                ps.executeUpdate(); 

                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()){

                         cur.setCur_id(rs.getInt(1)); //recupero el id
                         System.out.println("El id es :" + cur.getCur_id());
                }
                else {
                    System.out.println("No se pudo insertar ");
                }
            ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
     
      public void updateCursada(Cursada cur){
        String sql = "UPDATE cursada SET alm_id = ?,mat_id = ?, nota = ? where cur_id = ?;";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                
                ps.setInt(1, cur.getAlm_id());
                ps.setInt(2, cur.getMat_id());
                ps.setDouble(3, cur.getNota());
                ps.setInt(4, cur.getCur_id());
                ps.executeUpdate(); 

                ResultSet rs = ps.getGeneratedKeys();

                 if (rs.next()){

                         cur.setCur_id(rs.getInt(1)); //recupero el id
                         System.out.println("El id es :" + cur.getCur_id());
                }
                else {
                    System.out.println("No se pudo update ");
                }
            ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
      
       public void deleteCursada(Cursada cur){
        String sql = "DELETE INTO cursada WHERE cur_id = ?;";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                 ps.setInt(1, cur.getCur_id());
                ps.executeUpdate(); 

                ResultSet rs = ps.getGeneratedKeys();

                
            ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        public void findCursada(Cursada cur){
        String sql = "SELECT * FROM cursada;";
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
