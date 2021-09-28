/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development_exercises_problem31;

/**
 *
 * @author Shadesh
 */

import java.text.DecimalFormat;			
import java.util.Scanner;			
public class Development_Exercises_Problem31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);		
						
	DecimalFormat df = new DecimalFormat("0.00");			
	double g = 9.8;			
	double v;			
	double angle;			
	int t= 1;			
	
        System.out.print("Enter velocity (v) :");			
	v= sc.nextDouble();			
	
        System.out.print("Enter angle alpha (degrees): ");			
	angle = sc.nextDouble();			
	angle = Math.toRadians(angle);			
	
        double vCosAlpha = v * Math.cos(angle);			
	double vSinAlpha = v * Math.sin(angle);			
	double x = vCosAlpha * t;			
	double y = (vSinAlpha * t ) - ( (g * Math.pow(t, 2)) / 2);
        
        while (y > 0) {
            System.out.println("(x,y) = (" + df.format(x) + " , " + df.format(y) + ")" );
            t++;
            x = vCosAlpha * t;
            y = (vSinAlpha * t ) - ( (g * Math.pow(t, 2)) / 2);
        }
    }
}
