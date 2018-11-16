
package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
     
       
      int ans = 0 ;
   
       while (ans != 2){
           System.out.println("Enter first number: ");
       double num1 = input.nextDouble();
         
       System.out.println("Arithmetic operator: (+ , - , / , * , % OR  add, subtract, divide, multiply, modulo");
       String  arithOp = input.next();
       
       System.out.println("Enter second number: ");
       double num2 = input.nextDouble();
       
      
       switch (arithOp){
           case "+":
           case "add":
               System.out.println(num1 + " + " + num2 + " = " +  (num1 + num2)) ;
               break;
        
           case "-":
           case "subtract":
               System.out.println(num1 + " - " + num2 +  " = " + (num1 - num2)) ;
               break;
     
        case "/":
        case "divide":
               System.out.println(num1 + " / " + num2 +  " = " + (num1 / num2)) ;
               break;
        
        case "*":
        case "multiply":
               System.out.println(num1 + " * " + num2 + " = " +  (num1 * num2)) ;
               break;
            
        case "%":
        case  "modulo":
               System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)) ;
               break;
            
        default:
            System.out.println("Invalid");
           
       }
        System.out.println("Do you want to continue? (press 1 if Yes || 2 if No)");
       ans = input.nextInt();
       
       }
      }
    }
