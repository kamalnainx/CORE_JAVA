// Private access class

// /**
//  * Innercj23_specifiers_access_modifiers
//  */
// class Innercj23_specifiers_access_modifiers
// {
//     private Innercj23_specifiers_access_modifiers()
//     {
//         System.out.println("inner class");
//     }
//     private int data=1;
//     private void myfun1()
//     {
//         System.out.println("my fun one");
//     }
    
// }
// /**
//  * cj23_specifiers_access_modifiers
//  */
// public class cj23_specifiers_access_modifiers {

//     public static void main(String[] args)
//     {
//         Innercj23_specifiers_access_modifiers icj23_1 = new Innercj23_specifiers_access_modifiers();
        
//         System.out.println( icj23_1.data);//compile time errpr
//         icj23_1.myfun1();//compile time errpr
//     }
// }


















// default access 

// /**
//  * Innercj23_specifiers_access_modifiers
//  */
// class Innercj23_specifiers_access_modifiers
// {
//     Innercj23_specifiers_access_modifiers()
//     {
//         System.out.println("inner class");
//     }
//     int x=10;
    
//     void myfun1()
//     {
//         System.out.println("my fun 1");
//     }
    
// }

// /**
//  * cj23_specifiers_access_modifiers
//  */
// public class cj23_specifiers_access_modifiers {

//     public static void main(String[] args) {
//         Innercj23_specifiers_access_modifiers icj23_1 = new Innercj23_specifiers_access_modifiers();
//         System.out.println(icj23_1.x);
//         icj23_1.myfun1();
//     }
// }



















// /**
//  * Innercj23_specifiers_access_modifiers
//  */
// class Innercj23_specifiers_access_modifiers
// {
//     Innercj23_specifiers_access_modifiers()
//     {
//         System.out.println("inner class");
//     }
//     int x=10;
    
//     void myfun1()
//     {
//         System.out.println("my fun 1");
//     }
    
// }

// /**
//  * cj23_specifiers_access_modifiers
//  */
// public class cj23_specifiers_access_modifiers {

//     public static void main(String[] args) {
//         Innercj23_specifiers_access_modifiers icj23_1 = new Innercj23_specifiers_access_modifiers();
//         System.out.println(icj23_1.x);
//         icj23_1.myfun1();
//     }
// }





















// package mypack;
// import pack.*;

// /**
//  * cj23_specifiers_access_modifiers
//  */
// public class cj23_specifiers_access_modifiers {

//     public static void main(String[] args) {
//         cj23_specifiers_access_modifiers_default cj23_d_1= new cj23_specifiers_access_modifiers_default();
//         cj23_d_1.show();
//     }
// }





































// /**
//  * Innercj23_specifiers_access_modifiers
//  */
// class Innercj23_specifiers_access_modifiers
// {
//     protected void show()
//     {
//         System.out.println("this is show mwthod by protected access");
//     }
    
// }
// //protected
// /**
//  * cj23_specifiers_access_modifiers
//  */
// public class cj23_specifiers_access_modifiers extends Innercj23_specifiers_access_modifiers
// {

//     public static void main(String[] args)
//     {
//         cj23_specifiers_access_modifiers cj23_p_1 = new cj23_specifiers_access_modifiers();
//         cj23_p_1.show();
//     }
// }


























// /**
//  * cj23_specifiers_access_modifiers
//  */
// public class cj23_specifiers_access_modifiers extends cj23_specifiers_access_modifiers_default
// {
//     public static void main(String[] args) {
//         cj23_specifiers_access_modifiers cj23_1 = new cj23_specifiers_access_modifiers();
//         cj23_1.show();
//     }
    
// }







































//public
/**
 * cj23_specifiers_access_modifiers
 */
public class cj23_specifiers_access_modifiers
{
    public static void main(String[] args)
    {
        cj23_specifiers_access_modifiers_public cj23_1 = new cj23_specifiers_access_modifiers_public();
        cj23_1.msg();           
    }
    
}

