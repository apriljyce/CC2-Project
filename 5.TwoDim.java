/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twodim;
import java.util.Scanner;
public class TwoDim {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

    System.out.print("Enter number of columns:");
    int column= input.nextInt();
    
     System.out.print("Enter number of rows:");
     int row= input.nextInt();
     
   int array[][] = new int[row] [column];
     
     
      for (int i = 0; i<row; i++){
      
        for (int j =0; j<column; j++){
        System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
    
        array[i][j] =input.nextInt();
        
        }
       }
      //printing
      System.out.println("elements:");
      for(int x [] :array){
          for(int y:x){
          System.out.print(y +"\t");
          
          
          }
          System.out.println();
      }
     }
    }

