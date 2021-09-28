/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level3_problem27;

/**
 *
 * @author Shadesh
 */

import static java.lang.Math.*;															
public class Level3_Problem27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Level3_Problem27 obj = new Level3_Problem27();

        float m = 90;
        float n = 30;

        obj.cakculateSIN(m);
        obj.calculateCOS(n);
    }


        public void cakculateSIN(float n){
            
        float accuracy = (float) 0.0001, denominator, sinx, sinval; n = n * (float)(3.142 / 180.0);
        float x1 = n;

        sinx = n;
        sinval = (float) sin(n);

        int i = 1;

        do{
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * n * n / denominator;
            sinx = sinx + x1;
            i = i + 1;
        }
        while (accuracy <= sinval - sinx); System.out.println(sinx);
        }


        public void calculateCOS(float n) {

        float accuracy = (float) 0.0001, x1, denominator, cosx, cosval; 
        n = n * (float) (3.142 / 180.0); 
        x1 = 1;
        
        cosx = x1;
        cosval = (float) cos(n);

        int i = 1;

        do {
            denominator = 2 * i * (2 * i - 1);
            x1 = -x1 * n * n / denominator;
            
            cosx = cosx + x1;
            i = i + 1;
        }
        while (accuracy <= cosval - cosx);
        System.out.println(cosx);

    }
    
}
