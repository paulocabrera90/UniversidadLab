/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materia;

import Profesor.Profesor;

/**
 *
 * @author Usuario
 */
public class Materia {
        private int mat_id;
        private String mat_nombre;
        private Profesor profesorACargo;

    public Materia( String nombre, Profesor profesorACargo) {
        this.mat_id = mat_id;
        this.mat_nombre = nombre;
        this.profesorACargo = profesorACargo;
    }

    public Materia() {
        this.mat_nombre = "";
        this.profesorACargo = null;
    }

    /**
     * @return the mat_id
     */
    public int getMat_id() {
        return mat_id;
    }

    /**
     * @param mat_id the mat_id to set
     */
    public void setMat_id(int mat_id) {
        this.mat_id = mat_id;
    }

    /**
     * @return the nombre
     */
    public String getMat_nombre() {
        return mat_nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setMat_nombre(String nombre) {
        this.mat_nombre = nombre;
    }

    /**
     * @return the profesorACargo
     */
    public Profesor getProfesorACargo() {
        return profesorACargo;
    }

    /**
     * @param profesorACargo the profesorACargo to set
     */
    public void setProfesorACargo(Profesor profesorACargo) {
        this.profesorACargo = profesorACargo;
    }
    
    
        
}
