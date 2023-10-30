//FUNCTIONS/METHODS QUESTIONS

//Question 1 :Write a Java method to compute the averageof three numbers
import java.util.Scanner;

 public class Assignment7 {
    //New function to calaculate average of three numbers
      public static int averageNum(int a, int b,int c){
        int aver = (a + b + c)/3;
       System.out.println(aver);
       return aver;
      }
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Your Third Number ");
        int c = sc.nextInt();
        //function call by value
        averageNum(a,b,c);
         
    }
}
   

//Question2: Write a method named isEven that accepts an int argument.
//The method should return true if the argument iseven,or false otherwise.Also write a program to test your method.

import java.util.Scanner;

public class Assignment7{
  
  //isEven function
  public static boolean isEven(int n){
    if(n%2==0){
      return true;// it,s An Even number 
    }
    else{
      return false;// it's Not An even Number
    }
     
    }
  public static void main(String args[]){
    System.out.println("Enter Your Number : ");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt() ;
System.out.println(isEven(n));
 
  }
  
}



/*Question3:Write a Java program to check if a number is a palindrome in Java?
Palindrome Are Those number's Whose Reverse Is Exactly Same As The Original Number. Example :- 121 ,reverse = 121.*/

import java.util.Scanner;
public class Assignment7{
  public static void main(String args[]) {
    System.out.println("Please Enter a number :");
    Scanner sc = new Scanner(System.in);
    int palindrome = sc.nextInt();
    if(isPalindrome(palindrome)) {
      System.out.println("Number : "+palindrome+" is a palindrome");
    }
    else{
      System.out.println("Number : "+palindrome+" is not a palindrome");
    }
  }
      public static boolean isPalindrome(int number){
        int palindrome = number  ;// copied number into variable 
        int reverse = 0;

        while(palindrome!=0) {
          int remainder = palindrome % 10;
          reverse = reverse * 10 + remainder; // To get last digit of Number
          palindrome=palindrome/10;//To Delete The Last Digit of Number
        }

// if original and the reverse of number is equal means number is palindrome in Java

    if(number == reverse) {
    return true;
  }

    return false;
  }

} 



//Question 4:Write a Java method to compute the sum of the digits in an integer
import java.util.*;                                                       

public class Assignment7{
  public static void main(String argsd[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Integer :");
    int digit = sc.nextInt();
        // Function call and print at same
    System.out.println(digitsSum(digit));

  }

  public static int digitsSum(int n){//int n = Copy of int digit (Call by Value)
      int sum = 0;  // To calculate sum of digits

      while(n > 0 ){
        int lastDigit = n % 10;
        sum += lastDigit;
         n /= 10; // To Delete The Last Digit 
      }
      return sum;  //To Return the sum of digits
  }
}
