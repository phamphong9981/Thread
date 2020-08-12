/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AtomicModel;

/**
 *
 * @author Pham Phong
 */
public class Atomic {
    static AtomicInteger myInteger=new AtomicInteger(0);
    static AtomicModel myModel=new AtomicModel();
    public static void main(String[] args) throws InterruptedException {
        Thread myThread1=new Thread(new Runnable() {
            @Override
            public void run() {
                myModel.inc();
            }
        });
        Thread myThread2=new Thread(new Runnable() {
            @Override
            public void run() {
                myModel.inc();
            }
        });
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
//        myThread2.start();
        System.out.println(myModel.get());
    }
    
}
