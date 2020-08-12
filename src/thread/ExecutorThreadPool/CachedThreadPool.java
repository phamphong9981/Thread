/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.ExecutorThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import thread.MyRunable;

/**
 *
 * @author Pham Phong
 */
public class CachedThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService=Executors.newCachedThreadPool();
        
        for(int i=0;i<5;i++){
            MyRunable myRunable=new MyRunable(5);
            executorService.execute(myRunable);
            Thread.sleep(2000);
        }
        executorService.shutdown();
    }
}
