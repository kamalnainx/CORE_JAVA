// /**
//  * Innercj21_inheritance
//  */
// class Innercj21_inheritance {
// public static int x=5;
    
// }
// /**
//  * cj21_inheritance
//  */
// public class cj21_inheritance extends Innercj21_inheritance{
    
    
//     public static void main(String[] args) {
        
//         System.out.println(x);
//     }
// }































// /**
//  * Innercj21_inheritance
//  */
// class Innercj21_inheritance {
//     int x=5;
        
//     }
//     /**
//      * cj21_inheritance
//      */
//     public class cj21_inheritance extends Innercj21_inheritance
//     {
        
        
//         public static void main(String[] args) {
//             // Innercj21_inheritance icj_21=new Innercj21_inheritance();
//             // System.out.println(icj_21.x);
            
//             cj21_inheritance cj21=new cj21_inheritance();
//             System.out.println(cj21.x);
//         }
//     }




























// /**
//  * Innercj21_inheritance
//  */
// class Innercj21_inheritance {
//     public Innercj21_inheritance()
//     {
//         System.out.println("inner class start from this line.");
//     }
//     int x=5;
//     public static void fun1() {
//         System.out.println("this is inner class function.");
//     }    
//     }
//     /**
//      * cj21_inheritance
//      */
//     public class cj21_inheritance extends Innercj21_inheritance
//     {
        
        
//         public static void main(String[] args) {
//             // Innercj21_inheritance icj_21=new Innercj21_inheritance();
//             // System.out.println(icj_21.x);
            
//             cj21_inheritance cj21=new cj21_inheritance();
//             cj21.fun1();
//             System.out.println(cj21.x);

//         }
//     }
    





































































// // Multilevel inheritance
// /**
//  * Innercj21_inheritance
//  */
// class Innercj21_inheritance {
//     public Innercj21_inheritance()
//     {
//         System.out.println("inner class start from this line.");
//     }
//     int x=5;
//     public static void fun1() {
//         System.out.println("this is inner class function.");
//     }    
//     }

// /**
//  * Innercj21_inheritance_1
//  */
// class Innercj21_inheritance_1 extends Innercj21_inheritance{

    
// }
//     /**
//      * cj21_inheritance
//      */
//     public class cj21_inheritance extends Innercj21_inheritance_1
//     {
        
        
//         public static void main(String[] args) {
//             // Innercj21_inheritance icj_21=new Innercj21_inheritance();
//             // System.out.println(icj_21.x);
            
//             cj21_inheritance cj21=new cj21_inheritance();
//             cj21.fun1();
//             System.out.println(cj21.x);

//         }
//     }





























































// // Multilevel inheritance
// /**
//  * Innercj21_inheritance
//  */
// class Innercj21_inheritance {
//     public Innercj21_inheritance()
//     {
//         System.out.println("inner class start from this line.");
//     }
//     int x=5;
//     public static void fun1() {
//         System.out.println("this is inner class function.");
//     }    
//     }

// /**
//  * Innercj21_inheritance_1
//  */
// class Innercj21_inheritance_1 extends Innercj21_inheritance{

    
// }

// /**
//  * Innercj21_inheritance_2
//  */
// class Innercj21_inheritance_2 extends Innercj21_inheritance{

    
// }
//     /**
//      * cj21_inheritance
//      */
//     public class cj21_inheritance 
//     {
        
        
//         public static void main(String[] args) {
//             Innercj21_inheritance_1 icj_21_1=new Innercj21_inheritance_1();
//             System.out.println(icj_21_1.x);
            
//             Innercj21_inheritance_2 icj_21_2 = new Innercj21_inheritance_2();
//             icj_21_2.fun1();
//             System.out.println(icj_21_2.x);

//         }
//     }
