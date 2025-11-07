/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06;

import java.util.Scanner;

public class NewAxis {
    String name; 
    int age,contactno;
   Scanner details = new Scanner(System.in);
    //  Scanner namedetail = new Scanner(System.in);
   static void showAge(int mage) throws SelectionException
	{
		if((mage<20) || (mage>55))
			throw new SelectionException();
		
	}   
   
      public void form ()
      {
          System.out.println("*******Employee Form*******");
   System.out.println("Enter the name of the employee: ");
  
       name = details.nextLine();
  //   assert(name.length()<5):"The name is too short.";
   
   System.out.println("Enter the contact number of the employee: ");
   contactno = details.nextInt();   
//     assert(name.length()>0):"The name is too short.";
   System.out.println("Enter the age of the employee: ");
   age = details.nextInt();   
   try
		{
			showAge(age);
		}
		catch (SelectionException Obja)
		{
			
                }
   
   
      }
    public static void main(String[] args) {
NewAxis obj1 = new NewAxis();
obj1.form();
    }
}


