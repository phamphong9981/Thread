/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pham Phong
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new MyRunable(1));
        Thread thread2=new Thread(new MyRunable(2));
        MyDeamonThread myDeamonThread=new MyDeamonThread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Deamon thread start");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    Random r=new Random();
                    int i=r.nextInt();
                    System.out.println("i="+i);
                    if(i>70){
                        throw new RuntimeException("Error");
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
        myDeamonThread.start();
        thread4.start();
        thread4.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            Thread.sleep(500);
        }
    }
}
