package chapter03;

import java.util.Scanner;

public class EmployeeManagement 
{
    String id, name, desg, dept, sal;
    int input, amt;

    public void addDetails() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Enter the Employee Details\n");
        System.out.print("Enter the Employee ID: ");
        id = sc.nextLine();
        System.out.print("\nEnter the Employee Name: ");
        name = sc.nextLine();
        System.out.print("\nEnter the Employee Designation: ");
        desg = sc.nextLine();
        System.out.print("\nEnter the Employee Department: ");
        dept = sc.nextLine();

        do 
        {
            System.out.print("\nEnter the Employee Salary Type(M/H): ");
            sal = sc.nextLine();

            if (sal.toUpperCase().equals("M")) 
            {
                System.out.print("\nEnter the Number of Months: ");
                amt = sc.nextInt();
                MonthlySalary mobj = new MonthlySalary(id, name, desg, dept, sal.toUpperCase(), amt);
                ProcessDetails<MonthlySalary> pd = new ProcessDetails<>(mobj);
                pd.printResult();
            } 
            else if (sal.toUpperCase().equals("H")) 
            {
                System.out.print("\nEnter the Number of Hours: ");
                amt = sc.nextInt();
                HourlySalary hobj = new HourlySalary(id, name, desg, dept, sal.toUpperCase(), amt);
                ProcessDetails<HourlySalary> pd = new ProcessDetails<>(hobj);
                pd.printResult();
            } 
            else 
            {
                System.out.println("Please enter the details properly");
            }
        } while (!(sal.toUpperCase().equals("M") || sal.toUpperCase().equals("H")));

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input;
        EmployeeManagement eobj = new EmployeeManagement();
        do 
        {
            eobj.addDetails();
            System.out.println("=====================================");
            System.out.print("Do you want to enter more details? (Y/N): ");
            input = sc.nextLine();
            
        } while(input.toUpperCase().equals("Y"));
    }
}
