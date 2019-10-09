/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cursada;
import Alumno.Alumno;
import Materia.Materia;
/**
 *
 * @author Usuario
 */
public class Cursada {
    
    private int alm_id;
    private int mat_id;
    private Alumno alum;
    private Materia mat;
    private double nota;

    public Cursada( int alm_id, int mat_id, double nota) {
        
        this.alm_id = alm_id;
        this.mat_id = mat_id;
        this.nota = nota;
    }

    public Cursada() {
        
        this.nota = 0.0;
    }
    
     /**
     * @return the alm_id
     */
    public int getAlm_id() {
        return alm_id;
    }

    /**
     * @param alm_id the alm_id to set
     */
    public void setAlm_id(int alm_id) {
        this.alm_id = alm_id;
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
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * @return the alum
     */
    public Alumno getAlum() {
        return alum;
    }

    /**
     * @param alum the alum to set
     */
    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    /**
     * @return the mat
     */
    public Materia getMat() {
        return mat;
    }

    /**
     * @param mat the mat to set
     */
    public void setMat(Materia mat) {
        this.mat = mat;
    }
    
    
    
}
