/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Pham Phong
 */
public class MyDeamonThread extends Thread{
    public MyDeamonThread(){
    }
    
    public MyDeamonThread(Runnable runable){
        super(runable);
        setDaemon(true);
    }
    
    
}
