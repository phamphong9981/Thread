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
public class SingleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService=Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++){
            MyRunable myRunable=new MyRunable(10);
            executorService.execute(myRunable);
        }
        executorService.shutdown();
        
        while (!executorService.isTerminated()) {            
            System.out.println("Wait");
            Thread.sleep(1000);
        }
    }
}
