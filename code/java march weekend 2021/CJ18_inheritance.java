// /**
//  * InnerCJ18_inheritance
//  */
// class InnerCJ18_inheritance {

//         public String x="base class";
    
// }
// /**
//  * CJ18_inheritance
//  */
// public class CJ18_inheritance {
//     String y="main class value.";
//     public static void main(String[] args)
//     {
//         InnerCJ18_inheritance icj18_1 =new InnerCJ18_inheritance();
//         CJ18_inheritance cj18_1 =new CJ18_inheritance();
        
//         System.out.println("Hello world");
//         System.out.println(icj18_1.x);
//         System.out.println(cj18_1.y);
        
//     }
// }















// /**
//  * InnerCJ18_inheritance
//  */
// class InnerCJ18_inheritance {

//     public String x="base class";

// }

// /**
// * CJ18_inheritance
// */
// public class CJ18_inheritance extends InnerCJ18_inheritance
// {
//     String y="main class value.";
//     public static void main(String[] args)
//     {
//         // InnerCJ18_inheritance icj18_1 =new InnerCJ18_inheritance();
//         CJ18_inheritance cj18_1 =new CJ18_inheritance();
        
//         System.out.println("Hello world");
//         System.out.println(cj18_1.x);
//         System.out.println(cj18_1.y);
        
//     }
// }


































// /**
//  * InnerCJ18_inheritance
//  */
// class InnerCJ18_inheritance
// {
//     public String x="base class";
// }

// /**
//  * InnerCJ18_inheritance_1
//  */
// class InnerCJ18_inheritance_1 extends InnerCJ18_inheritance
// {
//     public void show()
//     {
//         System.out.println("this is InnerCJ18_inheritance_1 class.");
//     }    
// }
// /**
// * CJ18_inheritance
// */
// public class CJ18_inheritance extends InnerCJ18_inheritance_1
// {
//     String y="main class value.";
//     public static void main(String[] args)
//     {
//         // InnerCJ18_inheritance icj18_1 =new InnerCJ18_inheritance();
//         CJ18_inheritance cj18_1 =new CJ18_inheritance();
        
//         System.out.println("Hello world");
//         System.out.println(cj18_1.x);
//         System.out.println(cj18_1.y);
//         cj18_1.show();
//     }
// }

































































// /**
//  * InnerCJ18_inheritance
//  */
// class InnerCJ18_inheritance
// {
//     public String x="base class 1";
// }

// /**
//  * InnerCJ18_inheritance_1
//  */
// class InnerCJ18_inheritance_1 extends InnerCJ18_inheritance
// {
//     public void show()
//     {
//         System.out.println("this is InnerCJ18_inheritance_1 class no 2.");
//     }    
// }

// /**
// * CJ18_inheritance
// */
// public class CJ18_inheritance extends InnerCJ18_inheritance
// {
//     String y="main class value.";
//     public static void main(String[] args)
//     {
//         InnerCJ18_inheritance_1 icj18_i_1_1 =new InnerCJ18_inheritance_1();
//         CJ18_inheritance cj18_1 =new CJ18_inheritance();
        
//         System.out.println("Hello world");
//         System.out.println("from main class"+cj18_1.x);
//         System.out.println(cj18_1.y);
//         icj18_i_1_1.show();
//         System.out.println("from 2nd class"+icj18_i_1_1.x);
        
//     }
// }
