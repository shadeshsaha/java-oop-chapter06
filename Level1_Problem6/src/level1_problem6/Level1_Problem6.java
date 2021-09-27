/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem6;

/**
 *
 * @author Shadesh
 */
public class Level1_Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=10; i<50; i++) {
            if( i> 10 && i%10 == 0) {
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}
