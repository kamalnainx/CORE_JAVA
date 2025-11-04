// interface
// an interface is a commpletely use with abstract class that is used to group related methods with empty.







// /**
//  * Innercj20_interface
//  */
// interface Innercj20_interface
// {
//     public void fname();
//     public void lname();    
// }

// /*
//  cj20_interface_1
//  */
// class Innercj20_interface_1 implements Innercj20_interface
// {
//     public void fname()
//     {
//         System.out.println("the user name is kamal");    
//     }
//     public void lname()
//     {
//         System.out.println("the user last is nain");    
//     }    
// }

// /**
//  * cj20_interface
//  */
// public class cj20_interface
// {
//     public static void main(String[] args)
//     {
//         Innercj20_interface_1 icj20_1_1 = new Innercj20_interface_1();
//         icj20_1_1.fname();
//         icj20_1_1.lname(); 
//     }
// }






















































// /**
//  * Innercj20_interface
//  */
// interface Innercj20_interface
// {
//     public void fname();
//     public void lname();
    
// }
// /**
//  * Innercj20_interface
//  */
// interface Innercj20_interface_age
// {
//     public void uage();
    
// }

// /*
//  cj20_interface_1
//  */
// class Innercj20_interface_1 implements Innercj20_interface, Innercj20_interface_age
// {
//     public void fname()
//     {
//         System.out.println("the user name is kamal");    
//     }
//     public void lname()
//     {
//         System.out.println("the user last is nain");    
//     }
//     public void uage()
//     {
//         System.out.println("the user age is 90");    
//     }
    
// }
// /**
//  * cj20_interface
//  */
// public class cj20_interface
// {
//     public static void main(String[] args)
//     {
//         Innercj20_interface_1 icj20_1_1 = new Innercj20_interface_1();
//         icj20_1_1.fname();
//         icj20_1_1.lname();
//         icj20_1_1.uage();
        
//     }    
// }

















































// /**
//  * cj20_interface
//  */
// interface Innercj20_interface
// {
//     void msg();
//     default int qube1()
//     {
//         return 2*2*2;
//     }

//     // default void  qube1()
//     // {
//     //     System.out.println( 2*2*2);
//     // }
// }
// /**
//  * Innercj20_interface_1
//  */
// class Innercj20_interface_1 implements Innercj20_interface
// {
//     public void msg()
//     {
//         System.out.print("the qube value is :- ");    
//     }
// }
// /**
//  * Innercj20_interface
//  */
// public class cj20_interface 
// {
//     public static void main(String[] args)
//     {
//         Innercj20_interface_1 icj20_1 = new Innercj20_interface_1();
//         icj20_1.msg();
//         // icj20_1.qube1();
        
//         System.out.println( icj20_1.qube1());
//     }   
// }




























































// /**
//  * Innercj20_interface
//  */
// interface Innercj20_interface
// {
//     void fun1();
//     void fun2();
//     void fun3();
// }

// abstract class Innercj20_interface_1 implements Innercj20_interface
// {
//     public void fun2()
//     {
//         System.out.println("this is my fun2 method");    
//     }
    
// }

// /**
//  * Innercj20_interface_2
//  */
// class Innercj20_interface_2 extends Innercj20_interface_1
// {
//     public void fun1()
//     {
//         System.out.println("this is my fun1 method");    
//     }
//     public void fun3()
//     {
//         System.out.println("this is my fun3 method");    
//     }
// }
// /**
//  * cj20_interface
//  */
// public class cj20_interface
// {
//     public static void main(String[] args)
//     {
//         Innercj20_interface icj20_1 = new Innercj20_interface_2();
//         icj20_1.fun1();
//         icj20_1.fun2();
//         icj20_1.fun3();
//     }
    
// }





















































// /**
//  * Innercj20_interface
//  */
// interface Innercj20_interface
// {
//     void fun1();
//     void fun2();
//     void fun3();
// }

abstract class Innercj20_interface_1 //implements Innercj20_interface
{
    public void fun2()
    {
        System.out.println("this is my fun2 method");    
    }
    
}

/**
 * Innercj20_interface_2
 */
class Innercj20_interface_2 extends Innercj20_interface_1
{
    public void fun1()
    {
        System.out.println("this is my fun1 method");    
    }
    public void fun3()
    {
        System.out.println("this is my fun3 method");    
    }
}
/**
 * cj20_interface
 */
public class cj20_interface
{
    public static void main(String[] args)
    {
        // Innercj20_interface icj20_1 = new Innercj20_interface_2();
        // icj20_1.fun1();
        // icj20_1.fun2();
        // icj20_1.fun3();
        Innercj20_interface_2 icj20_2_1 = new Innercj20_interface_2();
        icj20_2_1.fun1();
        icj20_2_1.fun2();
        icj20_2_1.fun3();
    }    
}






