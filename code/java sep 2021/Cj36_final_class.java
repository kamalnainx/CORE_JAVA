// final keyword in core java
// the final keyword is used to restrict the user.
// the java final keyword can be used with:-
// 1. variable
// 2. method
// 3. class



// //final variable
// /**
//  * Cj36_final_class
//  */
// public class Cj36_final_class
// {
//     final int x=10;
//     void myfun1()
//     {
//         x=20;// error we can't redefine x after user final
//         System.out.println(x);
//     }
//     public static void main(String[] args)
//     {
//         Cj36_final_class cj36_1 = new Cj36_final_class();
//         System.out.println(cj36_1);
//         cj36_1.myfun1();
//     }
    
// }




















// //final method

// /**
//  * InnerCj36_final_class
//  */
// class InnerCj36_final_class
// {
//     final void myfun1()
//     {
//         System.out.println("this is my function from inner cj36");
//     }
    
// }

// /**
//  * Cj36_final_class
//  */
// public class Cj36_final_class extends InnerCj36_final_class
// {
//     final int x=10;

//     // void myfun1() //error we can't overload function after use final
//     // {
//     //     // x=20;// error we can't redefine x after user final
//     //     System.out.println(x);
//     // }
//     public static void main(String[] args)
//     {
//         Cj36_final_class cj36_1 = new Cj36_final_class();
//         System.out.println(cj36_1);
//         cj36_1.myfun1();
//     }    
// }

















// //final class

// /**
//  * InnerCj36_final_class
//  */
// final class InnerCj36_final_class
// {
//     final void myfun1()
//     {
//         System.out.println("this is my function from inner cj36");
//     }
    
// }

// /**
//  * Cj36_final_class
//  */
// public class Cj36_final_class //extends InnerCj36_final_class //error final class not to be inherited
// {
//     final int x=10;

//     void myfun1() //error we can't overload function after use final
//     {
//         // x=20;// error we can't redefine x after user final
//         System.out.println(x);
//     }
//     public static void main(String[] args)
//     {
//         Cj36_final_class cj36_1 = new Cj36_final_class();
//         System.out.println(cj36_1);
//         cj36_1.myfun1();
//     }    
// }

















// //calling final variable

// public class Cj36_final_class
// {
//     final int x;
//     Cj36_final_class()
//     {
//         x=20;
//         System.out.println(x);
//     }
//     public static void main(String[] args)
//     {
//         new Cj36_final_class();
//     }    
// }



































// //calling static final variable

// public class Cj36_final_class
// {
//     static final int x;

//     static
//     {
//         x=20;
//         System.out.println(x);
//     }
//     public static void main(String[] args)
//     {
//         new Cj36_final_class();
//     }    
// }
























// //calling final method

// /**
//  * InnerCj36_final_class
//  */
// class InnerCj36_final_class
// {
//     final void myfun1()
//     {
//         System.out.println("this is my function from inner cj36");
//     }
// }

// /**
//  * Cj36_final_class
//  */
// public class Cj36_final_class extends InnerCj36_final_class 
// {
//     public static void main(String[] args)
//     {
//         Cj36_final_class cj36_1 = new Cj36_final_class();
//         new Cj36_final_class().myfun1();
//     }    
// }
