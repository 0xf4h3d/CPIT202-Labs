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

public class Problem_4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int years = i / 365;
        int months = (i%365)/30 ;
        int days = (i%365)%30;
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",years,months,days); // last new line to bypass Beecrowd p error 
    }
}
