// what is abstract?

// a class which is declared with abstract keyword is known as abstract class
// abstract class have abstract & non-abstract methods(function).



// abstract class uname
// {
//     abstract void user_name();
// }

// public class CJ21_abstract1 extends uname
// {
//     void user_name()
//     {
//         System.out.println("this is function body.");
//     }
//     public static void main(String[] args)
//     {
//         uname un=new CJ21_abstract1();
//         un.user_name();        
//     }    
// }










// abstract class uname
// {
//     abstract void user_name();
// }

// /**
//  * InnerCJ21_abstract1
//  */
// class InnerCJ21_abstract1  extends uname
// {
//     void user_name()
//     {
//         System.out.println("user name is ram and age is 47");
//     }
    
// }

// public class CJ21_abstract1
// {
//     public static void main(String[] args)
//     {
//         uname un=new InnerCJ21_abstract1();
//         un.user_name();        
//     }    
// }















// abstract class uname
// {
//     abstract void user_name();
// }

// /**
//  * InnerCJ21_abstract1
//  */
// class InnerCJ21_abstract1  extends uname
// {
//     void user_name()
//     {
//         System.out.println("user name is ram and age is 47");
//     }
    
// }

// /**
//  * InnerCJ21_abstract1_1
//  */
// class InnerCJ21_abstract1_1 extends uname
// {
//     void user_name()
//     {
//         System.out.println("user name is sham and height is 6.8");
//     }
    
// }
// public class CJ21_abstract1
// {
//     public static void main(String[] args)
//     {
//         uname un_1=new InnerCJ21_abstract1();
//         un_1.user_name();        
//         uname un_2=new InnerCJ21_abstract1_1();
//         un_2.user_name();        
        
//     }    
// }











// abstract class uname
// {
//     abstract int user_name();
// }

// /**
//  * InnerCJ21_abstract1
//  */
// class InnerCJ21_abstract1  extends uname
// {
//     int user_name()
//     {
//         return 47;
//     }
    
// }

// /**
//  * InnerCJ21_abstract1_1
//  */
// class InnerCJ21_abstract1_1 extends uname
// {
//     int user_name()
//     {
//        return 6;
//     }
    
// }
// public class CJ21_abstract1
// {
//     public static void main(String[] args)
//     {
//         uname un_1=new InnerCJ21_abstract1();
//         System.out.println("user name is ram and age is"+ un_1.user_name());        
//         uname un_2=new InnerCJ21_abstract1_1();
//         System.out.println("user name is sham and height is"+un_2.user_name());        
        
//     }    
// }











// abstract class InnerCJ21_abstract1
// {
//     InnerCJ21_abstract1()
//     {
//         System.out.println("this is abstract constructor.");
//     }

//     abstract void print();
    
//     void print2()
//     {
//         System.out.println("print2 function method");
//     }    
// }

// /**
//  * InnerCJ21_abstract1_1
//  */
// class InnerCJ21_abstract1_1 extends InnerCJ21_abstract1
// {
//     void print()
//     {
//         System.out.println("print in inner cj21 abstract 1_1 class function.");
//     }
    
// }

// class CJ21_abstract1
// {
//     public static void main(String[] args)
//     {
//         InnerCJ21_abstract1 i_cj21_1 = new InnerCJ21_abstract1_1();
//         i_cj21_1.print();
//         i_cj21_1.print2();
            
//     }
    
// }