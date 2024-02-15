/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
     
        
       Scanner input = new Scanner(System.in);
       
       String word = input.next();
       String reversedWord = "";
       for(int i =word.length()-1; i>=0; i--){
           reversedWord += word.charAt(i);
       } 
       if(word.equals(reversedWord)){
           
           System.out.println("This word it's palindome");
       
       }else{
       
           System.out.println("This word isn't palindome");
       }
       
       
       
       
       
    
    }
    
}
