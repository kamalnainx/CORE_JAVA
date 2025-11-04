// recursion?
// function call itself that is recursion.


// /**
//  * cj16_function_recursion
//  */
// public class cj16_function_recursion
// {
//     public static void main(String[] args)
//     {
//         System.out.println("hello world!");  
//         System.out.println(num1(5));  
//     }
    
//     public static int num1(int n1)
//     {
        
//         if (n1>0)
//         {
//             System.out.println(n1);
//             return num1(n1-1);    
//         }
//         return 0;
//     }
// }























// /**
//  * cj16_function_recursion
//  */
// public class cj16_function_recursion
// {
//     public static void main(String[] args)
//     {
//         System.out.println("hello world!");  
//         System.out.println(num1(5));  
//     }
    
//     public static int num1(int n1)
//     {
        
//         if (n1>0)
//         {
//             System.out.println(n1);
//             return n1+num1(n1-1);    
//         }
//         return 0;
//     }
// }




























// /**
//  * cj16_function_recursion
//  */
// public class cj16_function_recursion
// {
//     public static void main(String[] args)
//     {
//         int x=num1(5);
//         System.out.println(x);  
//     }
    
//     public static int num1(int n1)
//     {
//         if(n1>=1)
//         {
//             System.out.println(n1);
//             return n1 * num1(n1-1);    
//         }
//         else{
//             return 1;
//         }
        
//     }
// }


























// /**
//  * cj16_function_recursion
//  */
// public class cj16_function_recursion {

//     public static void main(String[] args) {
//         System.out.println(num1(1,10));
//     }
//     public static int num1(int start, int end)
//     {
//         if(end>=start)
//         {
//             System.out.println(end);
//             return num1(start, end-1);
//         }
//         else{
//             return 0;
//         }
//     }
// }






























// /**
//  * cj16_function_recursion
//  */
// public class cj16_function_recursion {

//     public static void main(String[] args) {
//         System.out.println(num1(1,10));
//     }
//     public static int num1(int start, int end)
//     {
//         if(end>=start)
//         {
//             System.out.println(end);
//             return end+num1(start, end-1);
//         }
//         else{
//             return 0;
//         }
//     }
// }






























// /**
//  * cj16_function_recursion
//  */
// public class cj16_function_recursion {

//     public static void main(String[] args) {
//         System.out.println(num1(1,10));
//     }
//     public static int num1(int start, int end)
//     {
//         if(end>=start)
//         {
//             System.out.println(end);
//             return end*num1(start, end-1);
            
//         }
//         else{
//             return 1;
//         }
//     }
// }





























// /**
//  * cj16_function_recursion
//  */
// public class cj16_function_recursion {

//     public static void main(String[] args) {
//         System.out.println(num1());
//     }
//     public static int num1()
//     {
//             for(int i=1;i<=5;i++)
//             {
//                 System.out.println("Hello world "+i);
//                 return num1();
//             }            
//         }
//     }
// }
