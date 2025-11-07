package chapter04;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Request 
{
    ArrayDeque<String> pool;

    public Request() 
    {
        pool = new ArrayDeque<String>();
    }

    public void menu() 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==============================================");
        System.out.println("-------MENU-------");
        System.out.println("1. Initiate Request");
        System.out.println("2. View Request Pool");
        System.out.println("3. View Request that needs to be attended");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1/2/3/4): ");
        choice = sc.nextInt();
        switch (choice) 
        {
            case 1:
                initRequest();
                break;
            case 2:
                dispRequest();
                break;
            case 3:
                attdRequest();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                menu();
                break;
        }
  }

    public void initRequest() 
    {
        System.out.println("==============================================");
        System.out.println("-------REQUEST GENERATOR-------");
        Scanner sc = new Scanner(System.in);
        String newrequest;
        do 
        {
            System.out.print("\nEnter the employee ID: ");
            String ID = sc.nextLine();
            System.out.print("\nEnter the problem: ");
            String prb = sc.nextLine();

            String rqt = "Employee ID: " + ID + "\nProblem: " + prb;
            pool.add(rqt);
            
            System.out.println("==============================================");
            System.out.print("Do you want to add more request? (Y/N): ");
            newrequest = sc.nextLine();
            
        } while (newrequest.toUpperCase().equals("Y"));
        menu();
    }

    public void dispRequest() 
    {
        System.out.println("==============================================");
        System.out.println("-------REQUEST POOL-------\n");

        if (pool.isEmpty() == true) 
        {
            System.out.println("Currently, there is no request in the pool.");
        } 
        else 
        {
            for (String s : pool) 
            {
                System.out.println(s);
                System.out.println("--------------------------------");
            }
        }
        menu();

    }

    public void attdRequest() 
    {
        Scanner sc = new Scanner(System.in);
        String status;
        
        if (pool.isEmpty() == true) 
        {
            System.out.println("==============================================");
            System.out.println("Currently, there is no request in the pool.");
        } 
        else 
        {
            System.out.println("==============================================");
            System.out.println("You need to resolve the following problem:");
            System.out.println(pool.getFirst());

            do 
            {
                System.out.print("Please specify the status (R-Resolved/P-Pending): ");
                status = sc.nextLine();
                
                if (status.toUpperCase().equals("R")) 
                {
                    System.out.println("\n==============================================");
                    System.out.println("The following problem has been resolved:");
                    System.out.println(pool.getFirst());
                    pool.remove();
                } 
                else if (status.toUpperCase().equals("P")) 
                {
                    System.out.println("\n==============================================");
                    System.out.println("Please resolve the problem ASAP.");
                } 
                else 
                {
                    status = "N";
                }
            } while (status.equals("N"));
        }
        menu();
    }

    public static void main(String[] args) 
    {
        Request rq = new Request();
        rq.menu();
    }
}
