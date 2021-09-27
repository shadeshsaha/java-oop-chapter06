/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2_problem13;

/**
 *
 * @author Shadesh
 */

import java.util.Scanner;			
public class Level2_Problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        boolean isPrime ;
        
        long startTime = System.currentTimeMillis();

        if(number < 3) {
            System.out.println("Please enter number greater than 2");
        }
        else {
            for(int i=2; i<=number; i++) {
                Level2_Problem13 obj = new Level2_Problem13();
                isPrime = obj.isPrimeNumber(i);
                
                if(isPrime) {
                    System.out.println(i);
                }
            }
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Time took " + (endTime - startTime) + " milliseconds");
    }

        public boolean isPrimeNumber(int number) {
            
            boolean isPrime = true;
            
            if(number == 1) {
                System.out.println("1 is either prime nor real number");
            }
            else {
                for(int i=2; i< number; i++) {
                    if(number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            return isPrime;
        }
    
}
