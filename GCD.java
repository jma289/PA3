// GCD.java
// Jia-hui Ma
// jma289
// pa3
// asks for two integers, prints out greatest common divisor

import java.util.Scanner;

class GCD{

   public static void main( String[] args ){

     Scanner sc = new Scanner(System.in);
     int Opositiveint1, Opositiveint2, positiveint1, positiveint2;

     System.out.print("Enter a positive integer: ");
     while(true){
       if( !sc.hasNextInt() ){
         sc.next();
         System.out.print("Please enter a positive integer: ");
       }
       else {
         Opositiveint1 = sc.nextInt();
         positiveint1 = Opositiveint1;
         if (positiveint1>0)
           break;
         else {
           System.out.print("Please enter a positive integer: ");
         }
       }
     }

     System.out.print("Enter another positive integer: ");
     while(true){
       if( !sc.hasNextInt() ){
         sc.next();
         System.out.print("Please enter a positive integer: ");
       }
       else {
         Opositiveint2 = sc.nextInt();
         positiveint2 = Opositiveint2;
         if (positiveint2>0)
           break;
         else {
           System.out.print("Please enter a positive integer: ");
         }
       }
     }

     int temp;


     if (positiveint1>positiveint2) {
         temp = positiveint1%positiveint2;
         if (temp==0) {
           System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint2 + ".");
         }
         while (temp!=0) {
           temp = positiveint1%positiveint2;
           if (temp==0){
             System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint2 + ".");
             break;
           }
           if (temp==1){
             System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint2 + ".");
             break;
           }
           positiveint1 = positiveint2;
           positiveint2 = temp;
         }
     }
     else if (positiveint2>positiveint1) {
         temp = positiveint2%positiveint1;
         if (temp==0) {
           System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint1 + ".");
         }
         while (temp!=0) {
           temp = positiveint2%positiveint1;
           if (temp==0){
             System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint1 + ".");
             break;
           }
           if (temp==1){
             System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint1 + ".");
             break;
           }
           positiveint2 = positiveint1;
           positiveint1 = temp;
         }
     }
     else {
         System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint1 + ".");
     }
   }
}
