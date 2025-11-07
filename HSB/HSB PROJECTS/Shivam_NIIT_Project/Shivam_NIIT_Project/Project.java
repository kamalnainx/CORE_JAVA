
// import java.net.InetAddress;
// import java.util.*;

// import Print_your_name;

// /**
//  * Project
//  */
// public class Project 
// {

//     public static void main(String[] args) throws Exception 

//     {
//         int key;
            
//         System.out.println("\n\n\n-----------------------------------------   Enter Your Choice !  ------------------------------------------\n");
//         System.out.println(" 1. Fibonacci series\n 2. Palindrome number\n 3. Print_Your_Name\n 4. Guess_the_Number_game\n 5. IP_Address\n \n0. Exit");

        
//         Scanner scn = new Scanner(System.in);
//         key = scn.nextInt();

//         switch (key) 
//         {
//             case 1:
//                 Fibonacci();
//                 break;
            
//             case 2:
//                 Palindrome();
//                 break;

//             case 3:
//                 Print_your_Name();
//                 break;

//             case 4:
//                 Guess_the_Number();
//                 break;

//             case 5:
//                 IPAddress();
//                 break;

//             case 0:
//                 exit();
//                 break;

//             default:
//                 System.out.println("Invalid Option !");
//                 break;

//         }
//         while (true)
//         {
//             main(args);
//         }
        
//     }
 

//     /**-------------------------------------- Function Defination ----------------------------------------------------------------------- */
//     public static void Fibonacci()  
//     { 
//      System.out.println("\nNOTE* :- In fibonacci series, next number is the sum of previous two numbers. \n\t\t for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1. \n\t\t You can give any two Numbers of Your choice !\n");
     
//      Scanner scn = new Scanner(System.in);   
//      int n1,n2,n3=0,i,count=10;    
//      System.out.println("enter the Two values");
//      n1 = scn.nextInt();
//      n2 = scn.nextInt();
//      System.out.println("\n");
//      System.out.print("Series :-  "+n1+" "+n2);//printing 0 and 1 
        
//      for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
//      {    
//       n3=n1+n2;    
//       System.out.print(" "+n3);    
//       n1=n2;    
//       n2=n3;    
//      }    
     
//     }


 
//     public static void Palindrome()
//     {  
//      System.out.println("\nNOTE* :- Palindrome number in java: A palindrome number is a number that is same after reverse.\n\t\t For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. ");
//      int n,r,sum=0,temp;    
//      Scanner scn = new Scanner(System.in);
//      System.out.println("\nenter a number :-  ");
//      n=scn.nextInt();
         
//      temp=n;    
//      while(n>0) // Reverse the number
//      {    
//       r=n%10;  //getting remainder  
//       sum=(sum*10)+r;    
//       n=n/10;    
//      }    
//      if(temp==sum)    
//            System.out.println("\npalindrome number ");    
//     else    
//           System.out.println("\nnot palindrome");   
          
//     }  


//     public static void Print_your_Name()
//     { 
//         int n=0;
//         System.out.println("\nNOTE* :- It is the program in which you can Print your Name in  STAR  PATTERN.\n\t\t It allows the 3 times Chances to print the NAME. \n\n");
//         Print_your_name obj = new Print_your_name();
//         for(n=0;n<3;n++)
//         {
//             obj.Main();
//         }
//     }

//     public static void Guess_the_Number() 
//     {
//         System.out.println("\nERROR  404");
//         System.out.println("\n sorry! for the ERROR, the game is not complete yet. Working in Progress and will be Launched Soon \n Thank you for your love and patience :-) ");
//         System.out.println("\n Please try other Options !");
//     }

 
      
//     public static void IPAddress() throws Exception 
//     {
//         System.out.println("\nIt is the Program to check the system IP_ADDRESS.");
//         // Returns the instance of InetAddress containing
//         // local host name and address
//         InetAddress localhost = InetAddress.getLocalHost();
//         System.out.println("\nSystem IP Address : " + (localhost.getHostAddress()).trim());
//     }

//     public static void exit() 
//     {
//         System.out.println("\n\n---------------------------- ---------------------                Bye  Bye            ----------------------- ----------------------------------------");
//         System.exit(0);
//     }
         
// }  