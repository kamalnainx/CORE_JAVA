// java inner class
// in java , it's possible to nest classes(a class with a class).
// and the purpose of nested classes is to group classes that belong together.







// /**
//  * Cj33_inner_class
//  */
// public class Cj33_inner_class
// {
//     int y=5;
//     public static void main(String[] args)
//     {
//         Cj33_inner_class cj33ic = new Cj33_inner_class();
//         System.out.println(cj33ic.y);
//     }
// }



























// /**
//  * Cj33_inner_class
//  */
// public class Cj33_inner_class
// {
//     /**
//      * InnerCj33_inner_class
//      */
//     class InnerCj33_inner_class
//     {
//         int x =5;
        
//     }
//     int y=5;
//     public static void main(String[] args)
//     {
//         Cj33_inner_class cj33ic = new Cj33_inner_class();
//         System.out.println(cj33ic.y);
        
//         Cj33_inner_class.InnerCj33_inner_class cj33ic_i_1 = cj33ic.new InnerCj33_inner_class();
//         System.out.println(cj33ic_i_1.x);
        
//     }
// }


























// /**
//  * InnerCj33_inner_class_1
//  */
// class InnerCj33_inner_class_1
// {
//     /**
//      * InnerCj33_inner_class_2
//      */
//     class InnerCj33_inner_class_2
//     {
//         int z=10;
//     }
    
// }
// /**
//  * Cj33_inner_class
//  */
// public class Cj33_inner_class
// {
//     /**
//      * InnerCj33_inner_class
//      */
//     class InnerCj33_inner_class
//     {
//         int x =5;
        
//     }
//     int y=5;
//     public static void main(String[] args)
//     {
//         Cj33_inner_class cj33ic = new Cj33_inner_class();
//         System.out.println(cj33ic.y);
        
//         Cj33_inner_class.InnerCj33_inner_class cj33ic_i_1 = cj33ic.new InnerCj33_inner_class();
//         System.out.println(cj33ic_i_1.x);
        

//         InnerCj33_inner_class_1 icj33_1 = new InnerCj33_inner_class_1();
//         InnerCj33_inner_class_1.InnerCj33_inner_class_2 icj33_2_1 = icj33_1.new InnerCj33_inner_class_2();
//         System.out.println("inner core java class 2 var z is "+icj33_2_1.z);
//     }
// }


























































// // private innder class

// /**
//  * InnerCj33_inner_class
//  */
// class InnerCj33_inner_class
// {
//     /**
//      * InnerCj33_inner_class_1
//      */
//     private class InnerCj33_inner_class_1
//     {
//         int y=10;        
//     }    
// }
// /**
//  * Cj33_inner_class
//  */
// public class Cj33_inner_class
// {
//     public static void main(String[] args)
//     {
//         InnerCj33_inner_class icj33_1 = new InnerCj33_inner_class();
//         InnerCj33_inner_class.InnerCj33_inner_class_1 icj33_1_1 = icj33_1.new InnerCj33_inner_class_1();// get error bec... private
//         System.out.println(icj33_1_1.y);
//     }
// }























// static innder class

// /**
//  * InnerCj33_inner_class
//  */
// class InnerCj33_inner_class
// {
//     /**
//      * InnerCj33_inner_class_1
//      */
//     static class InnerCj33_inner_class_1
//     {
//         int y=10;        
//     }    
// }
// /**
//  * Cj33_inner_class
//  */
// public class Cj33_inner_class
// {
//     public static void main(String[] args)
//     {
//         InnerCj33_inner_class icj33_1 = new InnerCj33_inner_class();
//         InnerCj33_inner_class.InnerCj33_inner_class_1 icj33_1_1 = new InnerCj33_inner_class.InnerCj33_inner_class_1();// get error bec... private
//         System.out.println(icj33_1_1.y);
//     }
// }









