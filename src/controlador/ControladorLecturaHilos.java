/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import archivos.EscribirArchivos;
import archivos.LeerArchivos;
import archivos.LeerDistElec;
import hilos.Hilo;
import hilos.Lock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan Stuart Blanco
 */
public class ControladorLecturaHilos 
{
    private Hilo hilo_1;
    private Hilo hilo_2;
    private Hilo hilo_3;
    private Hilo hilo_4;
    private Hilo hilo_5;
    private Hilo hilo_6;
    private int contadorX = 0;
    private Lock lock;
    
   private LeerDistElec leerD;
   private LeerArchivos leer;
   private EscribirArchivos escritor;
    
    public ControladorLecturaHilos(Lock lock, LeerDistElec leerD, LeerArchivos leer, EscribirArchivos escritor)
    {
        this.lock = lock;
        this.leerD = leerD;
        this.leer = leer;
        this.escritor = escritor;
    }//Fin del constructor

    public void iniciarHilos(File file) 
    {
            hilo_1 = new Hilo(lock, "Hilo1", 0, file, this, leer);
            hilo_1.start();
            
            hilo_2 = new Hilo(lock, "Hilo2", 10, file, this, leer);
            hilo_2.start();
            
            hilo_3 = new Hilo(lock, "Hilo3", 20, file, this, leer);
            hilo_3.start();
            
            hilo_4 = new Hilo(lock, "Hilo4", 30, file, this, leer);
            hilo_4.start();
            
            hilo_5 = new Hilo(lock, "Hilo5", 40, file, this, leer);
            hilo_5.start();
            
            hilo_6 = new Hilo(lock, "Hilo6", 50, file, this, leer);
            hilo_6.start();
               
        try{
    
         hilo_1.join();//Prueba
         
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorLecturaHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void leerDistrito(File file) throws IOException   //Paradistrito
    {
        leerD.open(file);
        leerD.read();
        leerD.close();
    }
    
    public void crearArchivo(String filePath) throws FileNotFoundException 
    {
        String provincias = leer.crearStringProvincias();
        String canton = leer.crearStringCanton();
        escritor.with_obj_in_file_xml(filePath, provincias);  //Intentar con escritor
        escritor.with_obj_in_file_xml(filePath, canton);  //Igual
    }
    
        public void Sumar(Thread t)  //Aunmenta contador
    {
        System.out.println(t.getName()+"aumento");
        contadorX++;
    }
    
}//Fin de la clase
