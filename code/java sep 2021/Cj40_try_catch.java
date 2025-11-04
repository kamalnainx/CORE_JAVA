// // try catch block
// try statement allows you to define a block of code to be tested for errors while it is being executed.
// catch statement allows you to define a block of code to be executed , if an error occurs in the try clock.

// finally
// finally statement lets you execute code, after try-catch block, regardless of the resilt.

// syntax
// try
// {
    //user code
// }
// catch (Exception e)
// {
//     //TODO: handle exception
// }
















// /**
//  * Cj40_try_catch
//  */
// public class Cj40_try_catch
// {
//     public static void main(String[] args)
//     {
//         int[] a1={6,76,7};
//         System.out.println(a1[1]);    
//     }
    
// }


























































// /**
//  * Cj40_try_catch
//  */
// public class Cj40_try_catch
// {
//     public static void main(String[] args)
//     {
//         int[] a1={6,76,7};
//         System.out.println(a1[10]);    // error index not found
//     }
// }







































// /**
//  * Cj40_try_catch
//  */
// public class Cj40_try_catch
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             int[] a1={6,76,7};
//             System.out.println(a1[10]);    // error index not found
//         }
//         catch(Exception e)
//         {
//             System.out.println("Index 10 out of bounds for length 3");
//         }
//     }
// }





























// /**
//  * Cj40_try_catch
//  */
// public class Cj40_try_catch
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             int[] a1={6,76,7};
//             // System.out.println(a1[10]);    // error index not found
//             System.out.println(a1[1]); 
            
//         }
//         catch(Exception e)
//         {
//             System.out.println("Index 10 out of bounds for length 3");
//         }
//         finally
//         {
//             System.out.println("end of try-catch");
//         }
//     }
// }


























// // throw keyword
// // the throw statement allows you to create a custom error.

// /**
//  * Cj40_try_catch
//  */
// public class Cj40_try_catch
// {
//     public static void main(String[] args)
//     {
//         int agecheck=15;
//         if (agecheck<18)
//         {
//             // System.out.println("user age is less then 18");
//             throw new ArithmeticException("user age is less then 18, must be above 18.");
//         }
//         else
//         {
//             System.out.println("user is older then 18");
//         }
//     }
    
// }
