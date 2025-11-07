package chapter03;

import java.util.Scanner;

public class VowelChecker 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String input;
        
        System.out.println("Enter the character (a to z): ");
        input = obj.nextLine();
                
        switch(input)
        {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "O":
            case "o":
            case "U":
            case "u": System.out.println("It is a vowel");
                        break;
            default: System.out.println("It is a consonant");
                        break;
        }
        
    }
}