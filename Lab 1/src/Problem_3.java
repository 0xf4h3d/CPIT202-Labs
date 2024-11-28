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
public class Problem_3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();
        int N = input.nextInt();
        int laps = V * N;

        for (int i = 10; i <= 90; i += 10) {
            if (i == 90) {
                System.out.printf("%d", (int)Math.ceil((i / 100.0) * laps));
            } else {
                System.out.printf("%d ", (int)Math.ceil((i / 100.0) * laps));
            }
        }
        System.out.println();
    }
}
// had to use if else just to bypass sick BeeCrowd i/o system 