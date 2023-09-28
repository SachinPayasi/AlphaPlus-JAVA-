//LOOPS QUESTIONS

import java.util.*;

public class Assignment5 {
    
    
//Question 1 :How many times 'Hello' is printed?
    
public static void main(String[]args){
    for(int i = 0;i < 5;i++) {
        System.out.println("Hello");
        i+=2;
    }
  }  

/*Output :-2 times-
            Hello
            Hello */

           
           
//Question2:Write a program that readS a set of integers,and then prints the sum of the even and odd integers.

public static void main(String args[]){
     
    Scanner sc  =new Scanner(System.in);
    int number;
    int choice;
    int evenSum=0;
    int oddSum=0;
    
    do{
        System.out.print("Enter the number ");
        number=sc.nextInt();
        if(number%2==0) {
            evenSum+=number;
        }else{
            oddSum+=number;
        
        }
        System.out.print("Do you want to continue ? Press 1 for yes or 0 for no");
        choice=sc.nextInt();
       }while(choice==1);

       System.out.println("Sum of even numbers: "+evenSum);
       System.out.println("Sum of odd numbers: "+oddSum);

}

//Question 3 :Write a program to find the factorial of any number entered by the user.
        
public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int input = sc.nextInt();
        
        int fact = 1; 
        for(int i = 1; i <= input; i = i+1) {  
            fact *= i; 
        }
        System.out.println("Output: " + res);

       }
       
    


//Question4:Write a program to print the multiplication table of a number N, entered by the user.
    
public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Number");
    int a = sc.nextInt();

    for (int i=1;i<=10;i++){
        int num = a*i;
        System.out.println(a + " * " +i + " = "    +num);
    }

}



//Question 5 :What is wrong in the following program?

 public static void main (String args[]) { 
         for (int  i = 0; i  <= 5 ; i++ ) {
            System.out.println("i = "+i);
            }
        }
         
        
    } 



