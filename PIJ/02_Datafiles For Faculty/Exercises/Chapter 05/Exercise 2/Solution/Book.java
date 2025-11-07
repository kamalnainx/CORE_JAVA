package chapter05;

import java.util.Scanner;
class Book 
{
//Declaring the data members.
String author; 
String title;
int price;
int pages ;
int stock;
//Defining the methods.
public void getDetails()
                {
            Scanner details = new Scanner(System.in);
                                System.out.println(" ");
                                System.out.println("Enter Books Information");
                                System.out.println("Book Author: ");
                                author = details.nextLine();
                System.out.println("Book Title: ");
                                title = details.nextLine();
                System.out.println("Book Price: ");
                                price = details.nextInt();
                System.out.println("Number of pages: " );
                                pages = details.nextInt();
                System.out.println("Book Stock: ");
                                stock = details.nextInt();
                System.out.println(" ");
                }              
public void show()
                {
                                System.out.println(" ");
                                System.out.println("Books Information");
                                System.out.println("Book Author: " + author);
                                System.out.println("Book Title: " + title);
                                System.out.println("Book Price: " + price);
                                System.out.println("Number of pages: " + pages);
                                System.out.println("Book Stock: " + stock);
                                System.out.println(" ");
                }
}



