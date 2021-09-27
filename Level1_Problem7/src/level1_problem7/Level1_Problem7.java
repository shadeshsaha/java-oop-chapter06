/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem7;

/**
 *
 * @author Shadesh
 */

import java.util.Scanner;			
public class Level1_Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        boolean isPrime ;

        while (number > 0) {
            Level1_Problem7 obj = new Level1_Problem7();
            isPrime = obj.isPrimeNumber(number);
            
            if(isPrime) {
                System.out.println("PRIME");
            }
            else {
                System.out.println("NOT PRIME");
            }
            number = sc.nextInt();
        }
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
