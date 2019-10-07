/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cursada;

/**
 *
 * @author Usuario
 */
public class Cursada {
    
    private int cur_id;
    private int alm_id;
    private int mat_id;
    private double nota;

    public Cursada(int cur_id, int alm_id, int mat_id, double nota) {
        this.cur_id = cur_id;
        this.alm_id = alm_id;
        this.mat_id = mat_id;
        this.nota = nota;
    }

    public Cursada() {
        
        this.nota = 0.0;
    }

    /**
     * @return the cur_id
     */
    public int getCur_id() {
        return cur_id;
    }

    /**
     * @param cur_id the cur_id to set
     */
    public void setCur_id(int cur_id) {
        this.cur_id = cur_id;
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
    
    
    
}
