/* 
Course : CPCS 202 
Name :  
University ID :  
Section :  F9 
Name of lab instructor :  
Problem number :  #1
Assignment number :  #1
Beecrowd id :  
*/

import java.util.*;
public class Problem_2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        double i = input.nextDouble();
        double vol = (4/3.0)*pi*Math.pow(i, 3);
        System.out.println();
        System.out.printf("VOLUME = %.3f\n",vol); // \n to just pass BeeCrowd Presentation error 
    }
    
}
