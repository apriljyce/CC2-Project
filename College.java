
package college;
import java.util.Scanner;
public class College {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
       
       String college, acadProg, major;
             
       System.out.println("What is your College? (CAS, CBA, CEA, CITCS, CTE, COA)");
               college = input.nextLine();
         
             
         if (college.equals ("CAS")){
           System.out.println("What is your Major? ( English, Political Science, Communication, Psychology )");
               acadProg = input.nextLine();
          
             if (acadProg.equals ("English")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else if (acadProg.equals ("Political Science")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else if (acadProg.equals ("Communication")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else  if (acadProg.equals ("Psycology")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else
                  System.out.println("Invalid input");
              }
         
         
        if (college.equals ("CBA")){
           System.out.println("What is your Major? (Business Administration, Entrepreneurship, Office Administration)");
               acadProg = input.nextLine();
          
             if (acadProg.equals ("Business Administration")){
                   System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else if (acadProg.equals ("Entrepreneurship")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }     
             else if (acadProg.equals ("Office Administration")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }   
               else
                   System.out.println("Invalid input");
            
        }
         
        if (college.equals ("CEA")){
           System.out.println("What is your Major? (Architecture, Civil Engineering, Computer Engineering, "
                   + "Electronics Engineering, Environmental & Sanitary )");
               acadProg = input.nextLine();
          
             if (acadProg.equals ("Architecture")){
                   System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else if (acadProg.equals ("Civil Engineering")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }     
             else if (acadProg.equals ("Computer Engineering")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }   
              else if (acadProg.equals ("Electronics Engineering")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }  
               else if (acadProg.equals ("Environmental & Sanitary")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }  
               else
                   System.out.println("Invalid input");
            
        }
        if (college.equals ("CITCS")){
           System.out.println("What is your Major? (Computer Science, Information System,"
                   + " Information Technology, Computer Technology)");
               acadProg = input.nextLine();
           
               if (acadProg.equals ("Computer Science")){
                  System.out.println("What is your Academic Program: (Mobile Technology, Digital Arts and Animation )");
                   major = input.nextLine();
                   
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
                  System.out.println (major + " track");
             }
             else if (acadProg.equals ("Information System")){
                 System.out.println("What is your Academic Program: (e-Learning Technology, Business Process Management)");
                   major = input.nextLine();
                   
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
                  System.out.println (major + " track");
             }     
             else if (acadProg.equals ("Information Technology")){
                  System.out.println("What is your Academic Program: (Call Center Services, Computer Maintenance and Network Management)");
                   major = input.nextLine();
                   
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
                  System.out.println (major + " track");
             }   
              else if (acadProg.equals ("Computer Technology")){
                  System.out.println("What is your Academic Program: (Enterprise Resource Planning, Network and Security, Web Technology)");
                   major = input.nextLine();
                   
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
                  System.out.println ("Emphasis in " +major + " track");
             }  
               else
                   System.out.println("Invalid input");
            
     }
        if (college.equals ("CTE")){
           System.out.println("What is your Major? (Elementary Education - General, Elementary Education, Secondary Education )");
               acadProg = input.nextLine();
          
             if (acadProg.equals ("Elementary Education - General")){
                   System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else if (acadProg.equals ("Elementary Education")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }     
             else if (acadProg.equals ("Secondary Education")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             } 
               else
                   System.out.println("Invalid input");
        } 
         if (college.equals ("COA")){
           System.out.println("What is your Major? ( Accountancy, Accounting Technology, Management Accounting, Forensic Accounting)");
               acadProg = input.nextLine();
          
             if (acadProg.equals ("Accountancy")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else if (acadProg.equals ("Accounting Technology")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else if (acadProg.equals ("Management Accounting")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             if (acadProg.equals ("Forensic Accounting")){
                  System.out.println("College of " + college);
                  System.out.println("Bachelor of Science in " + acadProg);
             }
             else
                  System.out.println("Invalid input");
              }
          
    }
    }

