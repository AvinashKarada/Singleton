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
public class Singleton 
{ 
    
    private static Singleton oSingleton = null; //Initialize object
  
   
    public String str; 
  
    
    private Singleton() 
    { 
        str = "This is string part of Singleton part"; 
    } 
  
    
    public static Singleton getInstance() 
    { 
        if (oSingleton == null) 
            oSingleton = new Singleton(); //Here our code will create single object 
  
        return oSingleton; //return the object
    } 
} 