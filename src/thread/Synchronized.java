/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pham Phong
 */
public class Synchronized {
    static int i=0;
    public static synchronized void inc(){
        i++;
    }
    public static synchronized void dec(){
        i--;
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Synchronized.class.getName()).log(Level.SEVERE, null, ex);
                }
                inc();
                System.out.println("Thread 1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    inc();
                    System.out.println("Thread 2");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Synchronized.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Synchronized.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(i);
    }
}
