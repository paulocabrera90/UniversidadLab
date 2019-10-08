/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

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
 * @author cris
 */
public class AlumnoData {
    
    Connection con = null;
    
    public AlumnoData(ConexionDB conexion){
    
       con = conexion.conexion();
    
    }
    
   
    public void saveAlumno(Alumno alumno){
    
    String sql = "INSERT INTO alumno ( alm_nombre, alm_apellido, alm_dni, alm_domicilio, alm_egb) VALUES (?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getDni());
            ps.setString(4, alumno.getDomicilio());
            ps.setInt(5, alumno.getAlm_egb());
            ps.executeUpdate(); 
             
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
            
                     alumno.setAlm_id(rs.getInt(1)); //recupero el id
                     System.out.println("El id es :" + alumno.getAlm_id());
            }
            else {
                System.out.println("No se pudo insertar ");
            }
        ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}