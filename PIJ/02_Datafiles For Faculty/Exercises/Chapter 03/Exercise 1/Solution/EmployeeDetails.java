package alchem;

import java.util.Scanner;

public class EmployeeDetails 
{
    public void showMenu()
    {
        int option;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------Menu---------");
        System.out.println("1. Enter Data");
        System.out.println("2. Display Data");
        System.out.println("3. Exit");
        System.out.print("\nChoose the option: ");
       
        option = sc.nextInt();
        
        switch(option)
        {
            case 1: enterData();
                    break;
            case 2: displayData();
                    break;
            case 3: exitMenu();
                    break;
            default: System.out.println("Incorrect menu option");
                     showMenu();
                    break;
       }
    }
    
    public void enterData() 
    {
	     System.out.println("enterData method is invoked");
    }

       
    public void displayData() 
    {
        System.out.println("displayData method is invoked");
    }
    
    public void exitMenu() 
    {
        System.out.println("exitMenu method is invoked");
        System.exit(0);
    }    

    public static void main(String[] args) 
    {
        EmployeeDetails obj = new EmployeeDetails();
		obj.showMenu();
    }

    
}