package chapter05;

import java.util.Scanner;

class HardwareBook extends Book //Declaration of the Subclass
{

String hardwareCategory;
String publisher;

public void getDetails() 
{
                super.getDetails();
                Scanner details = new Scanner(System.in);
                                System.out.println("Hardware Category: ");
                                hardwareCategory = details.nextLine();
                System.out.println("Book publisher: ");
                                publisher = details.nextLine();
            showData();
}              

public void showData()
                {
                                System.out.println(" ");
                                super.show();
                                System.out.println("Hardware Category: " + hardwareCategory);
                                System.out.println("Publisher Name: " + publisher);
                                System.out.println(" ");
                }
}
