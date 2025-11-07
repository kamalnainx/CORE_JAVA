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
        System.out.println("2. Update Data");
        System.out.println("3. Display Data");
        System.out.println("4. Exit");
        System.out.print("\nChoose the option: ");
        option = sc.nextInt();
    }
    
       public static void main(String[] args) 
    {
        EmployeeDetails obj = new EmployeeDetails();
	obj.showMenu();
    }
  
}