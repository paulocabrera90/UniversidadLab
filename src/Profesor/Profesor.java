/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

import Persona.Persona;


/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
    private int pro_id;
    private int pro_matricula;
    private String pro_titulo;

    public Profesor(int matricula, String titulo) {
        this.pro_matricula = matricula;
        this.pro_titulo = titulo;
    }

    public Profesor() {
    }
    
    public Profesor(String nombre, String apellido, int dni, String domicilio, int matricula , String titulo){
        super(nombre, apellido, dni, domicilio);
        this.pro_matricula = matricula;
        this.pro_titulo = titulo;
    }

    /**
     * @return the matricula
     */
    public int getPro_matricula() {
        return this.pro_matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setPro_matricula(int matricula) {
        this.pro_matricula = matricula;
    }

    /**
     * @return the titulo
     */
    public String getPro_titulo() {
        return pro_titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setPro_titulo(String titulo) {
        this.pro_titulo = titulo;
    }

    /**
     * @return the pro_id
     */
    public int getPro_id() {
        return pro_id;
    }

    /**
     * @param pro_id the pro_id to set
     */
    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }
    
    
    
    
}
