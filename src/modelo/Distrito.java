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
public class Distrito   //Con un modelo
{
    String codElec, provincia, canton;

    public Distrito(String codElec, String provincia, String canton) {
        this.codElec = codElec;
        this.provincia = provincia;
        this.canton = canton;
    }

    public String getCodElec() {
        return codElec;
    }

    public void setCodElec(String codElec) {
        this.codElec = codElec;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }
    
    @Override
    public String toString() {
        return "Distrito{" + "codElec=" + codElec + ", provincia=" + provincia + ", canton=" + canton+ '}'; //Formato
    }
    
} //Fin del modelo de Distrito
