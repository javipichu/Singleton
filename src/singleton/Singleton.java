/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author javiv
 */
public class Singleton {

   public static void main(String[] args) {
        
        ejemplosingleton obx1 = ejemplosingleton.getInstance();
        
        ejemplosingleton obx2 = ejemplosingleton.getInstance();
        
        ejemplosingleton obx3 = ejemplosingleton.getInstance();
        
        ejemplosingleton obx4 = ejemplosingleton.getInstance();
   
        System.out.println("obx1---"+obx1.toString());
         System.out.println("obx2---"+obx2.toString());
          System.out.println("obx3---"+obx3.toString());
           System.out.println("obx4---"+obx4.toString());
           System.out.println("Cambiamos nombre a obx1");
           obx1.setNombre("juan");
           obx2.setNumero(5);
           System.out.println("obx1---"+obx1.toString());
         System.out.println("obx2---"+obx2.toString());
          System.out.println("obx3---"+obx3.toString());
           System.out.println("obx4---"+obx4.toString());
    }
    
}
