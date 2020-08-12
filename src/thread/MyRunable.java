/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pham Phong
 */
public class MyRunable implements Runnable{
    private int id;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("My Thread");
    }

    public MyRunable() {
    }

    public MyRunable(int id) {
        this.id = id;
    }
    
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            System.out.println("Runable is sleeping, id="+(id++)+":    "+dtf.format(now));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyRunable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
