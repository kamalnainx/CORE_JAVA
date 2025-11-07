package chapter03;

import java.util.Scanner;

public class Prime 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
	int input, i, j, half, flag=0;
        
        System.out.println("Enter the number upto which you want to generate prime number: ");
        input = obj.nextInt();
        
        System.out.println("The prime number between 1 and " +input + " are: ");
        
        for(i=1;i<=input;i++)
        {
            flag=0;
            half = i/2;
            
            for(j=2;j<=half;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag==0)
            {
                System.out.println(i);
            }
            
        }
    }
    
}
