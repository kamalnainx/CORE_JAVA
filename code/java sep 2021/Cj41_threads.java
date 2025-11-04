// threads 
// threads allows a programs to operate more efficiently by doing multiple things at the same time.
// threads can be used to perform complicated tasks in the background without interrupting the main programs






// /**
//  * Cj41_threads
//  */
// public class Cj41_threads //extends Thread
// {
    

//     public static void main(String[] args)
//     {
//         // Cj41_threads thread1=new Cj41_threads();
//         System.out.println("this is main class method with threads");
//     }
    
// }


























// /**
//  * Cj41_threads
//  */
// public class Cj41_threads extends Thread
// {
    

//     public static void main(String[] args)
//     {
//         Cj41_threads thread=new Cj41_threads();
//         // thread.start();
//         System.out.println("this is main class method with threads");
//     }
//     public void run()
//     {
//         System.out.println("this is run function");
//     }    
// }
































// /**
//  * Cj41_threads
//  */
// public class Cj41_threads extends Thread
// {
    

//     public static void main(String[] args)
//     {
//         Cj41_threads cj41_1=new Cj41_threads();
//         Thread thread1 = new Thread(cj41_1);

//         thread1.start();
//         System.out.println("this is main class method with threads");
//     }
//     public void run()
//     {
//         System.out.println("this is show function");
//     }    
// }






























// /**
//  * Cj41_threads
//  */
// public class Cj41_threads extends Thread
// {
//     public static int age=0;
//     public static void main(String[] args)
//     {
        
//         Cj41_threads cj41_1=new Cj41_threads();
//         Thread thread1 = new Thread(cj41_1);

//         thread1.start();

//         System.out.println("the user age is "+age);
//         age++;
//         System.out.println("the user age is "+age);
//     }
//     public void run()
//     {
//         age++;
//         System.out.println("this is show function");
//     }    
// }


























// /**
//  * Cj41_threads
//  */
// public class Cj41_threads extends Thread
// {
//     public static int age=0;
//     public static void main(String[] args)
//     {
        
//         Cj41_threads cj41_1=new Cj41_threads();
//         Thread thread1 = new Thread(cj41_1);

//         thread1.start();

//         while(thread1.isAlive());
//         System.out.println("the user age is "+age);
//         age++;
//         System.out.println("the user age is "+age);
//     }
//     public void run()
//     {
//         age++;
//         System.out.println("this is show function");
//     }    
// }

