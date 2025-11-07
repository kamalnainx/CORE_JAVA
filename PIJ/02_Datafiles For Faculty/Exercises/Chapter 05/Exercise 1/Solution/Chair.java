
package chapter05;

import java.util.Scanner;

class Chair extends Furniture
    {
        private int numOf_legs;
        public void Accept()
        {
Scanner sc = new Scanner(System.in);
            String str2, str3, str4;
             System.out.println("ENTER VALUES FOR CHAIR");

            System.out.println("Enter Color ");
            color = sc.nextLine();
             System.out.println("Enter Width ");
            
            width = sc.nextInt();
             System.out.println("Enter Height ");
            
            height = sc.nextInt();
             System.out.println("Enter No. of legs in a chair ");
           
            numOf_legs = sc.nextInt();
        }
        public void Display()
        {
             System.out.println("DISPLAYING VALUES FOR CHAIR");
             System.out.println("Color is "+ color);
             System.out.println("Width is "+ width);
             System.out.println("Height is "+ height);
             System.out.println("Number of legs is "+ numOf_legs);

        }
    }