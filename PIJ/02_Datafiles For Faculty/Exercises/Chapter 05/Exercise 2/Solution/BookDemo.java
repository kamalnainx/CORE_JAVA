
package chapter05;
import java.util.Scanner;
public class BookDemo {
    
    public static void main(String args[])
                {
                                    Scanner choice = new Scanner(System.in);
        //Person obj1 = new Person();
       System.out.println("Menu");
        System.out.println("1. Enter Software book details");
    System.out.println("2. Enter Harwdware book details");
    int a = choice.nextInt();
    switch(a)
    {
        case 1: 
    SoftwareBook Softdetails = new SoftwareBook();
            Softdetails.getDetails();
            
            break;
    
        case 2:
            HardwareBook Harddetails = new HardwareBook();
            Harddetails.getDetails();            
            break;
    }
    
    
                }
    
}
