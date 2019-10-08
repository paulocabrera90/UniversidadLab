/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unialumno;


import Conexion.ConexionDB;
import java.sql.Connection;
import Alumno.*;
import Cursada.Cursada;
import Cursada.CursadaData;
import Profesor.*;
import Materia.*;

/**
 *
 * @author Usuario
 */
public class UniAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Prueba");
        
        Connection con = null;
        ConexionDB conAlumnUni = new ConexionDB();
        
   
       //--- ALUMNOS
         Alumno a1 = new Alumno("Gonzalo","Caberera",38111144, "Barrio N C° 22",3);  
         a1.setAlm_id(1);
        Alumno a2 = new Alumno("Pauo","Nav",3822123, "Barri22",1);  
        a2.setAlm_id(2);
         
       //-- PROFESORES
   
         Profesor p1 = new Profesor("Aristide","Dasso",38111144, "Barrio N C° 22", 1234,"lic Matematica");  
         p1.setPro_id(1);
         Profesor p2 = new Profesor("Rene","Castro",381144, "Barrio N C° 22",1234,"lic Fisica");  
         p2.setPro_id(2);
       
       // ---MAterias
         Materia m1 = new Materia("Matematica", p1);
         m1.setMat_id(1);
         Materia m2 = new Materia("Lengua", p2);
         m2.setMat_id(2);
         
       // -----Cursada
         Cursada c1 = new Cursada(1, a1.getAlm_id(), m1.getMat_id(), 8.0);
        Cursada c2 = new Cursada(1, a2.getAlm_id(), m2.getMat_id(), 5.5);  
//        AlumnoData ad = new AlumnoData(conAlumnUni);
//        ad.saveAlumno(a1);
//        ad.saveAlumno(a2);
        
//        ProfesorData pd = new ProfesorData(conAlumnUni);
//        pd.saveProfesor(p1);
//        pd.saveProfesor(p2);
         
//         MateriaData md = new MateriaData(conAlumnUni);
//         md.saveMateria(m1);
//          md.saveMateria(m2);
         
         CursadaData cd = new CursadaData(conAlumnUni);
         cd.saveCursada(c1);
         cd.saveCursada(c2);
    }
    
}
