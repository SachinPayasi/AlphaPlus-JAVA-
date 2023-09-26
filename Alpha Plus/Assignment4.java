//CONDITIONAL STATEMENT'S

import java.util.*;


//Question 1: Write a Java program to get a number from the user and print whether it is positive or negative.

 public class Assignment4 {
    public static void main(String args[]){
       
    System.out.println("Enter A Number To Check Whether It Is Positive or Negative");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        
        // Codition to check positive naegative
        if(A>0){
            System.out.println("This Is A Positive Number");
        }else{
            System.out.println("This Is A Negative Number");
        }


/*Question 2:Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise
         prints You don't have a fever.
          
         public class Solution{ 
        public static void main(String[]args) {
            double temp = 103.5
           }
       }*/ 

         // Using Different class name

        public class Assignment4{
            public static void main(String args[]){

                //Using given input In Question

                double temp = 103.5;
                if(temp > 100 ){
                    System.out.println(temp + " : You have a fever");
                }
                else{
                    System.out.println("You don't have a fever");
                }

            }
    }  
 


 //Question 3:Write a Java program to input week number (1-7) and print day of week name using switch case.
 
      public class Assignment4{
            
            public static void main (String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the week number (1-7):");
                int week = sc.nextInt();
              
                // SWITCH CASE
                switch(week){

                    case 1:
                         System.out.println("Monday");
                         break;

                    case 2:
                         System.out.println("Tuesday");
                         break;

                    case 3:
                         System.out.println("Wednesday");
                         break;     

                    case 4:
                         System.out.println("Thursday");
                         break;
                    
                    case 5:
                         System.out.println("Friday");
                         break;
                          
                    case 6:
                         System.out.println("Saturday");
                         break;

                    case 7:
                         System.out.println("Sunday");
                         break;

                    default:
                         System.out.println("Invalid input! Please enter week number between 1-7.");
                        
           }     
                           
                
      }
 }  



 /*Question 4 :What will be the value of x & y in the following program:
        int a = 63,b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
  */

 public class Assignment4 {
    public static void main(String args[]) {
        int a = 63,b = 36;
        boolean x = (a < b) ? true : false;// print x to check output
        System.out.println(x);
        int y = (a > b) ? a : b; // print y to check outpu
        System.out.println(y);
        
  // output:  false
              63


    }
}



//Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not

public class Assignment4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year number :");
        int year = sc.nextInt();
  
    // FOR FINDING LEAP YEAR
    // A leap year is always divisible by 4 and not divisible by 100, or it must be divisible by 400.

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y||z)) {
            System.out.println(year +" is a leap year");
        }
        else{
            System.out.println(year +" is not a leap year");
        }
    }
}
