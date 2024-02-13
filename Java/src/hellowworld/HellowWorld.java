/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellowworld;

import src.Fibonacci;

/**
 *
 * @author alejandro
 */
public class HellowWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
         System.out.println("Helo world");
        
        Fibonacci fibonacci = new Fibonacci(); 
        int n =10;

        for(int i = 0; i<n ; i++){
       
            System.out.println(fibonacci.fibonacci(i)+"");
    }
        
    
        
    }
    
}
