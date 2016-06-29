/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bryam Stuart Blanco
 */
public class Persona
{
    private String ced, codigoElectoral, fechaVenc, junta;
    private char genero;                             //Con char
    private String nombre, apellido1, apellido2;

    public Persona(String ced, String codElec, char genero, String caducidad, String junta, String nombre, String apellido1, String apellido2) {
        this.ced = ced;
        this.codigoElectoral = codElec;
        this.fechaVenc = caducidad;
        this.junta = junta;
        this.genero = genero;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getCodElec() {
        return codigoElectoral;
    }

    public void setCodElec(String codElec) {
        this.codigoElectoral = codElec;
    }

    public String getCaducidad() {
        return fechaVenc;
    }

    public void setCaducidad(String caducidad) {
        this.fechaVenc = caducidad;
    }

    public String getJunta() {
        return junta;
    }

    public void setJunta(String junta) {
        this.junta = junta;
    }

  

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return "Persona{" + "ced=" + ced + ", codElec=" + codigoElectoral + ", caducidad=" + fechaVenc + ", junta=" + junta + ", genero=" + genero + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + '}';
    //Uno para cada tipo. Formato
    }

}//Fin de modelo Persona
