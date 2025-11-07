package chapter05;

import java.util.Scanner;

    class Bookshelf extends Furniture 
    {
        private int numOf_shelves;
        public void Accept()
        {
            String str2, str3, str4;
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER VALUES FOR BOOKSHELF");
             System.out.println("Enter Color ");
            color = sc.nextLine();
             System.out.println("Enter Width ");
            
            width = sc.nextInt();
             System.out.println("Enter Height ");
            
            height = sc.nextInt();
             System.out.println("Enter No. of shelves ");
         
            numOf_shelves =  sc.nextInt();
        }
        public void Display()
        {
             System.out.println("DISPLAYING VALUES FOR BOOKSHELF");
             System.out.println("Color is "+color);
             System.out.println("Width is "+width);
             System.out.println("Height is "+height);
             System.out.println("Number of shelves is "+numOf_shelves);
        }
    }