
package chapter05;
import java.util.Scanner;

class SoftwareBook extends Book //Declaration of the Subclass
{

String softwareName = "Windows"; 
String softwareVersion = "Mary Peterson";

public void getDetails() 
{
                super.getDetails();
                Scanner details = new Scanner(System.in);
                                System.out.println("Software Name: ");
                                softwareName = details.nextLine();
                System.out.println("Software Version: ");
                                softwareVersion = details.nextLine();
            showDetails();
}              
                
public void showDetails()
                {
                                super.show();
                                System.out.println("Software Name: " + softwareName);
                System.out.println("Software Version: " + softwareVersion);
                                System.out.println(" ");
                }

}