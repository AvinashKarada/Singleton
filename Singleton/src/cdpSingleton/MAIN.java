/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdpSingleton;

/**
 *
 * @author 
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instance 1
        Singleton Singleton1= Singleton.getInstance(); //get instance
  
       //Instance 2
        Singleton Singleton2 = Singleton.getInstance(); //Get instance
  
        //Instance 3
        Singleton Singleton3 = Singleton.getInstance(); //Get instance
  
       
        Singleton1.str = (Singleton1.str).toUpperCase(); 
  
        System.out.println("Singletone1 : " + Singleton1.str); 
        System.out.println("Singleton2 : " + Singleton2.str); 
        System.out.println("Singleton3 : " + Singleton3.str); 
        System.out.println("\n"); 
  
        // instance Singleton3 
        Singleton3.str = (Singleton3.str).toLowerCase(); 
  
        System.out.println("Singleton1 :  " + Singleton1.str); 
        System.out.println("Singleton2 : " + Singleton2.str); 
        System.out.println("Singleton3 : " + Singleton3.str); 
    } 
} 

        
