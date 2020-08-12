/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Pham Phong
 */
public class AtomicModel {
   private static AtomicInteger c=new AtomicInteger(0);
   public void inc(){
       c.incrementAndGet();
   }
   public void dec(){
       c.decrementAndGet();
   }
   
   public int get(){
       return c.get();
   }
}
