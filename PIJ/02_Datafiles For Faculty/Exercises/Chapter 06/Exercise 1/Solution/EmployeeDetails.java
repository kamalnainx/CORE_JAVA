package alchem;

import java.util.Scanner;

public class EmployeeDetails 
{
    String employeeDetails[][]=new String[100][8];
    public void showMenu () throws SelectionException
    {
        int option;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------Menu---------");
        System.out.println("1. Enter Data");
        System.out.println("2. Display Data");
        System.out.println("3. Exit");
        System.out.print("\nChoose the option: ");
       
        option = sc.nextInt();
if (option<1 || option>3)
{
throw new SelectionException();
}

else {
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
            //default: System.out.println("Incorrect menu option");
              //       showMenu();
                //    break;
       }
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
                 String empid = sc.next(); 
                 char c=empid.charAt(0);
                if(c!='e')
                {
                throw new PatternException();
                }
                
                
                 employeeDetails[i][0]=empid;
                  
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
  
    
    public void displayData() throws SelectionException 
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
        System.out.println("exitMenu method is invoked");
        System.exit(0);
    }    

    public static void main(String[] args) 
    {
        int flag=0;
        EmployeeDetails obj = new EmployeeDetails();
        do {
            flag=0;
        {
        try {                      
        obj.showMenu();
        }
        catch (SelectionException Obja)
		{
			System.out.println("Exception caught: " + Obja);
                
		}
        }
                    
           
        }
        while (flag!=1);
        
        }
    
    }
    

    



