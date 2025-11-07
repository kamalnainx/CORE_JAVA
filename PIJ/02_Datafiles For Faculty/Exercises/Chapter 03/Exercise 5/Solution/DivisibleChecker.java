package chapter03;

import java.util.Scanner;

public class DivisibleChecker 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Enter the first number: ");
        num1 = obj.nextInt();
        
        System.out.println("Enter the second number: ");
        num2 = obj.nextInt();
        
        if(num2==0)
        {
            System.out.println("Second number cannot be 0");
        }
        else
	{
             if(num1%num2==0)
             {
             	System.out.println("The first number is divisible by the second number");
             }      
             else
             {
                System.out.println("The first number is not divisible by the second number");
             }
	}
     }
}
