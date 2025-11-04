// /**
//  * CJ30_exception_try_chtch
//  */
// public class CJ30_exception_try_chtch {

//     public static void main(String[] args) {
        
//         int i = 6;
//         System.out.println(i);
//     }
// }






































// /**
//  * CJ30_exception_try_chtch
//  */
// public class CJ30_exception_try_chtch {

//     public static void main(String[] args) {
        
//         int[] i = {1,2,3};
//         System.out.println(i[1]);
//         System.out.println(i[10]);
        
//     }
// }





































// /**
//  * CJ30_exception_try_chtch
//  */
// public class CJ30_exception_try_chtch {

//     public static void main(String[] args) {
        
//         try
//         {
            
//         int[] i = {1,2,3};
//         System.out.println(i[1]);
//         System.out.println(i[10]);
//         }

//         catch(Exception e)
//         {
//             System.out.println("something went wrong");
//         }
//     }
// }





























// /**
//  * CJ30_exception_try_chtch
//  */
// public class CJ30_exception_try_chtch {

//     public static void main(String[] args) {
        
//         try
//         {
            
//         int[] i = {1,2,3};
//         System.out.println(i[1]);
//         // System.out.println(i[10]);
//         }

//         catch(Exception e)
//         {
//             System.out.println("something went wrong");
//         }

//         finally
//         {
//             System.out.println("the try catch is over.");
//         }
//     }
// }
























// /**
//  * CJ30_exception_try_chtch
//  */
// public class CJ30_exception_try_chtch
// {
//     static void agecheck(int age)
//     {
//         if(age>=18)
//         {
//             System.out.println("Access granted");
//         }
//         else
//         {
//             System.out.println("Access denied");
//         }
//     }
//     public static void main(String[] args)
//     {
//         agecheck(20);    
//     }
// }





























// /**
//  * CJ30_exception_try_chtch
//  */
// public class CJ30_exception_try_chtch
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             int i=10/0;
//             System.out.println(i);    
//         }
//         catch (Exception e)
//         {
//             System.out.println("divided by zero");
//             //TODO: handle exception
//         }    
//     }
    
// }






























// /**
//  * CJ30_exception_try_chtch
//  */
// public class CJ30_exception_try_chtch
// {
//     public static void main(String[] args)
//     {
//         int i=10, j = 0, data;
//         try
//         {
//             data=i/j;
//             System.out.println(i);    
//         }
//         catch (Exception e)
//         {
//             data=i/(j+1);
//             System.out.println(data);
//             //TODO: handle exception
//         }    
//     }
    
// }
