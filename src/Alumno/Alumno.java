/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

import Persona.Persona;



/**
 *
 * @author programador
 */
public class Alumno extends Persona{
    private int alm_id;
    private int alm_egb;
    
    
    public Alumno(){
        super();
        this.alm_id = 0;
        this.alm_egb = 0;
    }

    public Alumno( String nombre, String apellido, int dni, String domicilio, int alm_egb) {
        super(nombre, apellido, dni, domicilio);
       
        this.alm_egb = alm_egb;
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
     * @return the alm_egb
     */
    public int getAlm_egb() {
        return alm_egb;
    }

    /**
     * @param alm_egb the alm_egb to set
     */
    public void setAlm_egb(int alm_egb) {
        this.alm_egb = alm_egb;
    }

    

   
    
    
}