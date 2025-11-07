package chapter06;

import java.util.Scanner;

public class Division {
  public static void main(String args[]) {
   
      int num1, num2, result;
 Scanner input = new Scanner(System.in);
 System.out.println("Enter the 1st number");
   num1 = input.nextInt();
   
   System.out.println("Enter the 2nd number");
    
   num2 = input.nextInt();
      
 try {
 
      result = num1/num2;
      System.out.println("The result is " +result);
 
    }
 
    catch (ArithmeticException e) {
 
      System.out.println("Division by zero not Possible!");
 
    }
 
    
  }
 
}