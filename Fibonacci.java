
package fibonacci;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
     display();
    }
    static void display(){
    Scanner input = new Scanner (System.in);
   
    int x, num, i;
    
    System.out.print("Enter number: ");
    x = input.nextInt();
    
    for ( num = 0; num <= x; num++){
     System.out.print("f(" + num + ")" + "\t");
    }
    System.out.println(" ");
    
    for (num = 0; num <=x; num++){
        for (i = 0; i <= num; i++){
            System.out.print (factorial(i)+ "\t" + " ");
            
        }
        System.out.println(" ");
    }
   }
    static int factorial (int n){
    if (n <= 1){
    return n;
      }
    else {
    return (factorial (n -1) + factorial (n - 2));
    }
  }
}
