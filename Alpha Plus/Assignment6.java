 // PATTERN PROBLEM'S(PART:-1)
 
 /*Questionn 1:Print Pattern -

         *
         **
         ***
         **** 
*/
 
 
 public class Assignment6{
   public static void main(String args[]){
      
      for(int i = 1;i<=4;i++){
      for(int j = 1 ;j<=i;j++){
            System.out.print("*");
      }
          System.out.println( );
         
      } 
     
   }
}


/* Question 2 :Print pattern:-
        ****
        ***
        **
        *
*/

public class Assignment6{
   public static void main(String args[]){
         int n=4;
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
}


/*Question 3:Print Pattern:-
 
1
12
123
1234
*/

public class Assignment6{

public static void main(String args[]){

   int n =4;
   for(int i = 1;i<=n;i++ ){
      for (int j =1;j<=i;j++){
         System.out.print(j);
      }
      System.out.println();
   }

  }
}

/*Question 4:Print Pattern:-

A
BC
DEF
GHIJ

*/
 
 public class Assignment6{
   public static void main (String args[]){
      int n =4;
      char ch = 'A';
      for (int i=1;i<=n;i++){
         for (int j =1;j<=i;j++){
            System.out.print(ch);
            ch++;
         }
               System.out.println();
      }

   }
 }

