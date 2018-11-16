
package guessinggame;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
             Scanner input = new Scanner (System.in);
        
       int comp = ((int)(Math.random()*1000)+1);
        int user;
        
         System.out.println("Enter a number from 1 - 1000");
       user = input.nextInt();
       
        while(user != comp){
            
       //First hint
           if(comp %2 == 0 ){
               System.out.println("The number is even");
           }
           
           if (comp %2 == 1 ){
         
           System.out.println("The number is odd");
           }
           
           //Second hint
            if (user!= comp){
                if (user < comp){
                    System.out.println("The correct number is higher");
                }
                  if (user > comp){
                    System.out.println("The correct number is lower");
                }
        }
            
            if ((user > 1000) || (user < 0)){
            System.out.println("Invalid");
            
            }
            //prompt the user to enter a number
           System.out.println("Enter a number from 1 - 1000");
       user = input.nextInt();
           }
       
    
         System.out.println("Correct! The number is " + comp);
    }
}
    

