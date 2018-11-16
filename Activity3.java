/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

/**
 *
 * @author CC2_1E-16
 */
public class Activity3 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
     
       int [] x = {3, 5, 7, 13, 2, 3, 9};
       int [] z = {1,2,3,4,5};
        display (z);
    }
    
    static void display (int []i){
       int num;
       
        for (num = 0; num < i.length ; num++){
        System.out.println("f(" + i[num] + ")= " + factorial (i[num]));
     
        }
    }
    
    static int factorial (int n){
    if (n <= 1){
        return n;
    }
    else {
        return (factorial (n-1) + factorial (n-2));
    }
  }
}