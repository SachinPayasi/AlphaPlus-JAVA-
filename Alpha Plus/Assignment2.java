   //ASSIGNMENT2 (Alpha Plus)

import java.util.*;
public class Alpha {
    public static void main(String[]args){

//Question1:In a program,input3numbers:A,BandC.Youhave to output the average of these 3 numbers 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int A = sc.nextInt();

        System.out.println("Enter Second Number");
        int B = sc.nextInt();

        System.out.println("Enter Third Number");
        int C = sc.nextInt();

        int average = (A+B+C)/3;
        System.out.println("Average of three no. is :- "+average);*/


    //Question2: In a program,input the side of a square.You have to output the area of the square.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the one side of square");
        double side1 = sc.nextDouble();

        System.out.println("Enter another side of square");
        double another = sc.nextDouble();

        //area of square = side * side
        double area = side1*another; 
        System.out.println("The area of square is :- "+area);
        

        /*Question3:Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. 
        You have to output the total cost of the items back to the user as their bill.*/

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Cost Of Pencil");
        float pencil=sc.nextFloat();

        System.out.println("Enter The Cost Of Pen");
        float pen = sc.nextFloat();

        System.out.println("Enter The Cost Of Eraser");
        float eraser = sc.nextFloat();

        float totalcost = pencil + pen + eraser;
        System.out.println("Bill is :-" + totalcost);

        // adding 18% gst charges

        float newBill = totalcost + (0.18f * totalcost);
        System.out.println("Bill with 18% tax  : " + newBill) ; 


        //Question 4:What will be the type of result in the following Java code? 
            
            byte b =4;
            char c = 'a';
            short s = 512;
            int i = 1000;
            float f = 3.14f;
            double d = 99.9954;

            double result = (f*b)+(i%c)-(d*s);
            System.out.println(result);

            /*Question 5:(Advanced)Will the following statementgive any error in Java?
            int$=24*/

            int $ = 24;
            System.out.println($);


    }
   
}  

