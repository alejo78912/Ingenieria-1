/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cousinnumbers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class CousinNumbers {

 


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        ArrayList<Integer> dividers = new ArrayList<>();

        if (number > 1) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    dividers.add(i);
                }
            }

            if (isPrime) {
                System.out.println("It's a prime number");
            } else {
                System.out.println("It's not a prime number");
                System.out.println("Its dividers are: " + dividers);
            }
        } else {
            System.out.println("It's not a prime number");
        }
    }
}

    
    

