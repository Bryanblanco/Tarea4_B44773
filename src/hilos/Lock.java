/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Bryam Stuart Blanco
 */
public class Lock 
{
    private boolean isLocked = false;

    public synchronized void lock()
            throws InterruptedException 
    {
        while (isLocked) {
            wait();
        }
        isLocked = true;
    }//Fin de bloqueo

    public synchronized void unlock() 
    {
        isLocked = false;
        notifyAll();
    }//Fin de desbloquear

}//Fin de la clase lock
