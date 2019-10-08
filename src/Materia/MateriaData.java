/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materia;

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
public class MateriaData {
    Connection con = null;
    
    public MateriaData(ConexionDB conexion){
    
       con = conexion.conexion();
    
    }
    public void saveMateria(Materia mat){
        String sql = "INSERT INTO materia (nombre, pro_id) VALUES (?,?);";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

               ps.setString(1, mat.getMat_nombre());
                 ps.setInt(2, mat.getProfesorACargo().getPro_id());
                ps.executeUpdate(); 

                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()){

                         mat.setMat_id(rs.getInt(1)); //recupero el id
                         System.out.println("El id es :" + mat.getMat_id());
                }
                else {
                    System.out.println("No se pudo insertar ");
                }
            ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
