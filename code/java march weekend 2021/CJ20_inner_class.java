// /**
//  * CJ20_inner_class
//  */
// public class CJ20_inner_class
// {
//     public static void main(String[] args)
//     {
//         System.out.println("main class");
        
//     }
// }


















/**
 * InnerCJ20_inner_class
 */
// class InnerCJ20_inner_class
// {
//     int x =10;
    
// }
// /**
//  * CJ20_inner_class
//  */
// public class CJ20_inner_class
// {
//     public static void main(String[] args)
//     {
//         System.out.println("main class");
//         InnerCJ20_inner_class icj20_1 = new InnerCJ20_inner_class();
//         System.out.println("inner cj 20 class var x vlaue x "+icj20_1.x);
        
//     }
// }





























// class InnerCJ20_inner_class
// {
//     int x =10;
//     /**
//      * InnerCJ20_inner_class_1
//      */
//     class InnerCJ20_inner_class_1
//     {
//         int y=20;        
//     }
// }
// /**
//  * CJ20_inner_class
//  */
// public class CJ20_inner_class
// {
//     public static void main(String[] args)
//     {
//         System.out.println("main class");

//         InnerCJ20_inner_class icj20_1 = new InnerCJ20_inner_class();
//         System.out.println("inner cj 20 class var x vlaue x "+icj20_1.x);

//         InnerCJ20_inner_class.InnerCJ20_inner_class_1 icj20_1_1 = icj20_1.new InnerCJ20_inner_class_1();
//         System.out.println("inner class y value is "+icj20_1_1.y);
//     }
// }













// /**
//  * InnerCJ20_inner_class
//  */
// class InnerCJ20_inner_class {
//     int x=10;
//     /**
//      * InnerCJ20_inner_class_1
//      */
//     static class InnerCJ20_inner_class_1 {
//         int y=20;
//     }
// }
// /**
//  * CJ20_inner_class
//  */
// public class CJ20_inner_class {

//     public static void main(String[] args) {
//         System.out.println("main class");

//         InnerCJ20_inner_class.InnerCJ20_inner_class_1 icj20_1_1 = new InnerCJ20_inner_class.InnerCJ20_inner_class_1();
//         System.out.println(icj20_1_1.y);
//     }
// }


























/**
 * InnerCJ20_inner_class
 */
// class InnerCJ20_inner_class {
//     int x=10;
//     /**
//      * InnerCJ20_inner_class_1
//      */
//     class InnerCJ20_inner_class_1 {
//         int y=20;
//         public int name() {
//             return x;
//         }
//     }
// }
// /**
//  * CJ20_inner_class
//  */
// public class CJ20_inner_class {

//     public static void main(String[] args) {
//         System.out.println("main class");

//         InnerCJ20_inner_class icj20_1 = new InnerCJ20_inner_class();

//         InnerCJ20_inner_class.InnerCJ20_inner_class_1 icj20_1_1 = icj20_1.new InnerCJ20_inner_class_1();
//         System.out.println(icj20_1_1.y);

//         System.out.println(icj20_1_1.name());
//     }
// }
