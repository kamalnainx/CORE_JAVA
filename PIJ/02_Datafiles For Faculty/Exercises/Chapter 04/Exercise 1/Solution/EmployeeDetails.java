package alchem;

import java.util.Scanner;

public class EmployeeDetails 
{
    String employeeDetails[][]=new String[100][8];
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
                    showMenu();
                    break;
            case 2: displayData();
                    showMenu();
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
        Scanner sc=new Scanner(System.in);
        char choice='y';
        int i=0;
           do 
             {
                 System.out.println("Enter Employee Id: ");
                  employeeDetails[i][0]=sc.next();
                  System.out.println("Enter Employee Name: ");
                  employeeDetails[i][1]=sc.next();
                  System.out.println("Enter Department: ");
                  employeeDetails[i][2]=sc.next();
                  System.out.println("Enter Designation: ");
                  employeeDetails[i][3]=sc.next();
                  System.out.println("Enter Date of Joining: ");
                  employeeDetails[i][4]=sc.next();
                  System.out.println("Enter Date of Birth: ");
                  employeeDetails[i][5]=sc.next();
                  System.out.println("Enter marital status: ");
                  employeeDetails[i][6]=sc.next().toLowerCase();
                  if(employeeDetails[i][6].equals("married")){
                      System.out.println("Enter date of marriage: ");
                      employeeDetails[i][7]=sc.next();
                  }
                  else
                  {
                      employeeDetails[i][7]="na";
                  }
                i++;
                System.out.println("Do you wish to add more records:");
                      String ch=sc.next().toLowerCase();
                              choice=ch.charAt(0);
             }while(choice=='y');
    }
  
    
    
    public void displayData() 
    {
        System.out.println("Employee Details:");
        for(int i=0; i<employeeDetails.length;i++)
        {
            for(int j=0;j<employeeDetails[i].length;j++){
                if(employeeDetails[i][j]==null)
                    showMenu();
                else
                {
                   System.out.println(employeeDetails[i][j]); 
                }
                    
            }
                    
        }

    }
    
    public void exitMenu() 
    {
        
        System.exit(0);
    }    

    public static void main(String[] args) 
    {
        EmployeeDetails obj = new EmployeeDetails();
		obj.showMenu();
    }

    
}