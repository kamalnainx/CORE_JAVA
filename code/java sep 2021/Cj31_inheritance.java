// /**
//  * Cj31_inheritance
//  */
// public class Cj31_inheritance
// {

//     public static void main(String[] args)
//     {
//         String uname="abc";
//         System.out.println("user name is "+uname);    
//     }
// }





































// /**
//  * Cj31_inheritance
//  */
// public class Cj31_inheritance
// {
//     static String uname="abc";
//     public static void main(String[] args)
//     {
    
//         System.out.println("user name is "+uname);    
//     }
// }






































// /**
//  * Cj31_inheritance
//  */
// public class Cj31_inheritance
// {
//     String uname="abc";
//     public static void main(String[] args)
//     {
//         Cj31_inheritance cj31_1 = new Cj31_inheritance();

//         System.out.println("user name is "+cj31_1.uname);    
//     }
// }





































// /**
//  * InnerCj31_inheritance
//  */
// class InnerCj31_inheritance
// {
//     String uname="abc";
//     protected int age=50;
// }


// /**
//  * Cj31_inheritance
//  */
// public class Cj31_inheritance extends InnerCj31_inheritance
// {
    
//     public static void main(String[] args)
//     {
//         Cj31_inheritance cj31_1 = new Cj31_inheritance();

//         System.out.println("user name is "+cj31_1.uname);    
//         System.out.println("and user age is "+cj31_1.age);    
        
//     }
// }

























// /**
//  * InnerCj31_inheritance
//  */
// class InnerCj31_inheritance
// {
//     String uname="abc";
//     protected int age=50;
// }

// /**
//  * InnerCj31_inheritance_1
//  */
// class InnerCj31_inheritance_1 extends InnerCj31_inheritance {   }

// /**
//  * Cj31_inheritance
//  */
// public class Cj31_inheritance
// {
    
//     public static void main(String[] args)
//     {
//         InnerCj31_inheritance_1 cj31_1_1 = new InnerCj31_inheritance_1();

//         System.out.println("user name is "+cj31_1_1.uname);    
//         System.out.println("and user age is "+cj31_1_1.age);    
        
//     }
// }





















// /**
//  * InnerCj31_inheritance
//  */
// class InnerCj31_inheritance
// {
//     String uname="abc";
//     protected int age=50;
// }

// /**
//  * InnerCj31_inheritance_1
//  */
// class InnerCj31_inheritance_1 extends InnerCj31_inheritance
// {
//     void printer()
//     {
//         System.out.println("this is my 2nd class");
//     }
// }

// /**
//  * InnerCj31_inheritance_2
//  */
// class InnerCj31_inheritance_2 extends InnerCj31_inheritance_1
// {

    
// }
// /**
//  * Cj31_inheritance
//  */
// public class Cj31_inheritance
// {
    
//     public static void main(String[] args)
//     {
//         InnerCj31_inheritance_2 cj31_2_1 = new InnerCj31_inheritance_2();

//         System.out.println("user name is "+cj31_2_1.uname);    
//         System.out.println("and user age is "+cj31_2_1.age);    
//         cj31_2_1.printer();
        
        
//     }
// }























































// /**
//  * InnerCj31_inheritance
//  */
// class InnerCj31_inheritance
// {
//     int x=10;
// }

// /**
//  * InnerCj31_inheritance_1
//  */
// class InnerCj31_inheritance_1 extends InnerCj31_inheritance
// {
//     int square=x*x;
    
// }

// /**
//  * InnerCj31_inheritance_2
//  */
// class InnerCj31_inheritance_2 extends InnerCj31_inheritance
// {
//     int cube= x*x*x;
// }
// /**
//  * Cj31_inheritance
//  */
// public class Cj31_inheritance
// {

//     public static void main(String[] args)
//     {
//         InnerCj31_inheritance_1 icj_1_1 = new InnerCj31_inheritance_1();
//         InnerCj31_inheritance_2 icj_2_1 = new InnerCj31_inheritance_2();
        
//         System.out.println("the square of x is "+icj_1_1.square);
//         System.out.println("the cube of x is "+icj_2_1.cube);
        
                
//     }
// }