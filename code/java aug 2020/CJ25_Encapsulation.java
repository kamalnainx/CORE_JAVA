// what is Encapsulation?
// Encapsulation is a process of warp code, informetion and data together in single unit.
// an Encapsulation - variable of class will be hidden from ther classes and accessed only through method of their current class

// /**
//  * InnerCJ25_Encapsulation
//  */
// class InnerCJ25_Encapsulation
// {
//     private int data=40;
//     private void fun1()
//     {
//         System.out.println("this is inner cj 12 encapsulation");
//     }
// }

// public class CJ25_Encapsulation
// {
//     public static void main(String[] args)
//     {
//         InnerCJ25_Encapsulation icj25_e_1=new InnerCJ25_Encapsulation();
//         icj25_e_1.fun1();//Error-compile time
//     }    
// }










// /**
//  * InnerCJ25_Encapsulation
//  */
// class InnerCJ25_Encapsulation
// {
//     private int data=40;
//     void fun1()
//     {
//         System.out.println("this is inner cj 12 encapsulation");
//     }
// }

// public class CJ25_Encapsulation
// {
//     public static void main(String[] args)
//     {
//         InnerCJ25_Encapsulation icj25_e_1=new InnerCJ25_Encapsulation();
//         icj25_e_1.fun1();//Error-compile time
//     }    
// }















// import pack.*;
// class CJ25_Encapsulation
// {
//     public static void main(String[] args)
//     {
//         InnerCJ25_Encapsulation icj25_e_1=new InnerCJ25_Encapsulation();
//         icj25_e_1.fun1();//Error-compile time
//     }    
// }





// package mypack;
// import pack.*;
// /**
//  * CJ25_Encapsulation
//  */
// public class CJ25_Encapsulation extends InnerCJ25_Encapsulation
// {
// public static void main(String[] args)
// {
//     CJ25_Encapsulation cj25_1=new CJ25_Encapsulation();
//     cj25_1.fun1();    
// }
    
// }












// /**
//  * InnerCJ25_Encapsulation
//  */
// class InnerCJ25_Encapsulation
// {
//     protected void show()
//     {
//         System.out.println("show protected function");
//     }
    
// }
// /**
//  * CJ25_Encapsulation
//  */
// public class CJ25_Encapsulation extends InnerCJ25_Encapsulation
// {
//     protected void show()
//     {
//         System.out.println("this is main class function.");//error
//     }
//     public static void main(String[] args)
//     {
//         CJ25_Encapsulation cj25_e_1 = new CJ25_Encapsulation();
//         cj25_e_1.show();
//     }
// }