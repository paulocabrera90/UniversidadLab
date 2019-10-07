/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

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
public class ProfesorData {
    
     Connection con = null;
    
    public ProfesorData(ConexionDB conexion){
    
       con = conexion.conexion();
    
    }
    
     public void guardarProfesor(Profesor profe){
        String sql = "INSERT INTO profesor ( pro_matricula, pro_titulo, pro_nombre, pro_apellido, pro_domicilio) VALUES (?,?,?,?,?);";
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                ps.setInt(1, profe.getPro_matricula());
                ps.setString(2, profe.getPro_titulo());
                ps.setString(3, profe.getNombre());
                ps.setString(4, profe.getApellido());
                ps.setString(5, profe.getDomicilio());
                ps.executeUpdate(); 

                ResultSet rs = ps.getGeneratedKeys();

                if (rs.next()){

                         profe.setPro_id(rs.getInt(1)); //recupero el id
                         System.out.println("El id es :" + profe.getPro_id());
                }
                else {
                    System.out.println("No se pudo insertar ");
                }
            ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(ProfesorData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
