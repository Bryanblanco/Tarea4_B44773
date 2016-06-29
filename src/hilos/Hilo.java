/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import archivos.LeerArchivos;
import controlador.ControladorLecturaHilos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryam Stuart Blanco
 */
public class Hilo extends Thread 
{

    private final Lock lock;
    private final int id;
    private LeerArchivos leer;
    private File path;
    private ControladorLecturaHilos controlador;

    public Hilo(Lock lock, String name, int id, File path, ControladorLecturaHilos controlador, LeerArchivos leer) {
        super(name);
        this.lock = lock;
        this.id = id;
        this.path = path;
        this.controlador = controlador;
        this.leer=leer;
    }

    @Override
    public void run() //Reparar. No va a dar chance.
    {
        System.out.println("Ejecutando hilo: " + super.getName() + " " + id);
        try {
            leer.open(path);
            leer.read( lock);
            leer.close();
            System.out.println("Terminando de leer hilo:" + super.getName() + " " + id);
            controlador.Sumar(this);

        } catch (FileNotFoundException ex) 
        {
            System.out.println("Se cae el hilo:"+super.getName() + " " + id+"fnfe");
  
        } catch (IOException ex) 
        {
             System.out.println("Se cae el hilo:"+super.getName() + " " + id+"ioe");
        
        } catch (Exception ex) 
        {
 
             System.out.println("Otra vez se cae el hilo: "+super.getName() + " " + id+"e");
        }
    }//Fin de run

}//Fin de la clase
