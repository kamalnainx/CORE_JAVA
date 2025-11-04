// threads
// threads allows a program to operate more effiently by doing multiple thing at the same time.

// /**
//  * CJ32_Threads
//  */
// public class CJ32_Threads extends Thread
// {
//     public static void main(String[] args)
//     {
//         CJ32_Threads thread = new CJ32_Threads();
//         thread.start();
//         System.out.println("this is main thread");

//     }
    

// }































// /**
//  * CJ32_Threads
//  */
// public class CJ32_Threads extends Thread
// {
//     public static void main(String[] args)
//     {
//         CJ32_Threads thread = new CJ32_Threads();
//         thread.start();
//         System.out.println("this is main thread");

//     }
    
//     public void run()
//     {
//         System.out.println("this  thread is running in thread");
//     }

// }































// /**
//  * CJ32_Threads
//  */
// public class CJ32_Threads implements Runnable
// {

//     public static void main(String[] args)
//     {
//         CJ32_Threads obj = new CJ32_Threads();
//         Thread thread = new Thread(obj);
//         thread.start();
//         System.out.println("this is main thread code.");
//     }
//     public void run()
//     {
//         System.out.println("this code is run with thread");
//     }
// }
































// /**
//  * CJ32_Threads
//  */
// public class CJ32_Threads extends Thread
// {
//     public static int amount=0;
//     public static void main(String[] args)
//     {
//         CJ32_Threads thread = new CJ32_Threads();
//         thread.start();
//         System.out.println(amount);
//         amount++;
//         System.out.println(amount);  //2  
//     }
//     public void run()
//     {
//         amount++;
//     }
// }































// /**
//  * CJ32_Threads
//  */
// public class CJ32_Threads extends Thread
// {
//     public static int amount =0;
//     public static void main(String[] args)
//     {
//         CJ32_Threads thread = new CJ32_Threads();
//         thread.start();
  
//         // wait for thread to finish
//         while (thread.isAlive())
//         {
//             System.out.println("waiting");    
//         }
//         System.out.println(amount);
//         amount++;
//         System.out.println(amount);
//     }
//     public void run()
//     {
//         amount++;
//     }
    
// }