/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author Bryam Stuart Blanco
 */
public class ArrayDistritos
{
    
    private ArrayList<Distrito> array = new ArrayList<>();
    private static ArrayDistritos instancia = new ArrayDistritos();

    

    public static ArrayDistritos getInstance() {
        return instancia;
    }

    public String devolver() //La idea es que retorne 10
    {
        String text = "";

        for (int i = 0; i < 120; i++) {
            if (array.get(i) != null) {
                text += array.get(i) + "\n";
            }
        }
        return text; //Intento
    }
    
    public Distrito buscarPersona(String num) throws Exception //Lo intenté, jaja
    {
        for (Distrito dist : array) {
            if(dist != null && num.equalsIgnoreCase(dist.getCodElec())) {
                return dist;
            }
        }
        throw new Exception("No existe el codigo");
    }//Fin del método

    public synchronized void agregar(Distrito e) 
    {
        if (array != null) {
            array.add(e);
        }
    }//Fin de "agregar"
    
}//Fin de la clase.
