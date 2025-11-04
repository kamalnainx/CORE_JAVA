// abstraction in java
// data abstraction is the process of hiding certain data details and showing only essential information to the user.

// we are using abstraction with abstract keyword.

// abstraction apply with:-
// class and methods


// /**
//  * Innercj19_class_abstraction
//  */
//  class Innercj19_class_abstraction
// {
//     public void show()
//     {
//         System.out.println("show this finction");
//     }        
// }
// /**
//  * cj19_class_abstraction
//  */
// public class cj19_class_abstraction
// {

//     public static void main(String[] args)
//     {
//         Innercj19_class_abstraction icj19_1 = new Innercj19_class_abstraction();
//         icj19_1.show();
//     }
// }


















// /**
//  * Innercj19_class_abstraction
//  */
// abstract class Innercj19_class_abstraction
// {
//     public abstract void show();
    
//     public void datashow()
//     {
//         System.out.println("Datashow this finction");
//     }        
    
// }

// /**
//  * Innercj19_class_abstraction_1
//  */
// class Innercj19_class_abstraction_1 extends Innercj19_class_abstraction
// {
//     public void show()
//     {
//         System.out.println("this is show method");
//     }
// }

// /**
//  * cj19_class_abstraction
//  */
// public class cj19_class_abstraction
// {

//     public static void main(String[] args)
//     {
//         Innercj19_class_abstraction_1 icj19_1_1 = new Innercj19_class_abstraction_1();
//         icj19_1_1.show();
//         icj19_1_1.datashow();
        
//     }
// }






























































// abstract class bank
// {
//     abstract int getrateofinterest();   
// }

// /**
//  * Innercj19_class_abstraction_1
//  */
// class sbi extends bank
// {
//     int getrateofinterest()
//     {
//         return 7;
//     }   
// }

// /**
//  * Innercj19_class_abstraction_2
//  */
// class idbi extends bank
// {
//     int getrateofinterest()
//     {
//         return 5;
//     }   
// }

// /**
//  * cj19_class_abstraction
//  */
// public class cj19_class_abstraction
// {
//     public static void main(String[] args)
//     {
//         bank b;
        
//         b=new sbi();
//         System.out.println(b.getrateofinterest());

//         b=new idbi();
//         System.out.println(b.getrateofinterest());
//     }
// }