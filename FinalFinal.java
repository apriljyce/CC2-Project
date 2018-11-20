
package finalfinal;
import java.util.Scanner;
public class FinalFinal {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       String user ;
       
       System.out.println("What do you want to get? ");
       user = input.nextLine();
       
      while ((!user.equals ("Factorial")) && (!user.equals ("Fibonacci"))){
      System.out.println("invalid ");
      user = input.nextLine();
      }
         if (user.equals ("Fibonacci")){
             fibo();
        }
         if (user.equals ("Factorial")){
             fact();
        }
        
 }    //start of Fibonacci
   static void fibo(){
     display();
    }
    static void display(){
    Scanner input = new Scanner (System.in);
   
    int x, num, i,ar; 
         
     System.out.print("Enter array size: ");
    ar = input.nextInt();
    int []array = new int [ar];
     
    System.out.print("Enter elements: ");
    for (int z=0; z<ar; z++){
    array[z]=input.nextInt();
    }
 
    for (num = 0; num <array.length; num++){
       
            System.out.println ("f(" + array[num] + ")= " +fibo(array[num])+ "\t" + " ");
       }
        System.out.println(" ");
    
   }
    static int fibo (int n){
    if (n <= 1){
    return n;
      }
    else {
    return (fibo (n -1) + fibo (n - 2));
    }
  }

    //end of Factorial
    static void fact(){
       Scanner input = new Scanner (System.in);
   
    int x, num, i,ar; 
         
     System.out.print("Enter array size: ");
    ar = input.nextInt();
    int []array = new int [ar];
     
    System.out.print("Enter elements: ");
    for (int z=0; z<ar; z++){
    array[z]=input.nextInt();
  } 
    for(i=0;i<array.length;i++){    
     
      System.out.println("Factorial of "+ array[i] +" is: "+ getFact(array[i]));  
   } 
    }
    static int getFact(int n){
        if (n <=1){
        return n;
        }
        else 
            return n*getFact(n-1);
        
    }
 
}

    



     