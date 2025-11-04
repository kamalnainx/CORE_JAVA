// what is interface?

//     the interface is just like a class its used to achieve abstraction.
//     interface can be only abstract methods, not methods body.
//     interface also use for abstraction multtiple inheritance in java.




// interface interface1
// {
//     void show();
// }
// class CJ22_ABSTRACT2_interface implements interface1
// {
//     public void show()
//     {
//         System.out.println("this is show function.");
//     }
//     public static void main(String args[])
//     {
//         CJ22_ABSTRACT2_interface cj22_1 = new CJ22_ABSTRACT2_interface();
//         cj22_1.show();
//     }
// }









// interface interface1
// {
//     void show();
// }

// /**
//  * InnerCJ22_ABSTRACT2_interface
//  *  
//  **/
// class InnerCJ22_ABSTRACT2_interface implements interface1
// {
//     public void show()
//     {
//         System.out.println("Inner CJ_22 abstract2 interface1");
//     }
// }

// class CJ22_ABSTRACT2_interface
// {
//     public static void main(String args[])
//     {
//         interface1 icj22_1=new InnerCJ22_ABSTRACT2_interface();
//         icj22_1.show();
//     }
// }















// interface interface1
// {
//     void show();
// }

// /**
//  * InnerCJ22_ABSTRACT2_interface
//  *  
//  **/
// class InnerCJ22_ABSTRACT2_interface implements interface1
// {
//     public void show()
//     {
//         System.out.println("Inner CJ_22 abstract2 interface1");
//     }
// }

// /**
//  * InnerCJ22_ABSTRACT2_interface_1
//  */
// class InnerCJ22_ABSTRACT2_interface_2 implements interface1
// {
//     public void show()
//     {
//         System.out.println("Inner_2 cj22 abstract2 interface1 ");
//     }
    
// }
// class CJ22_ABSTRACT2_interface
// {
//     public static void main(String args[])
//     {
//         interface1 icj22_1=new InnerCJ22_ABSTRACT2_interface();
//         icj22_1.show();
        
//         interface1 icj22_2=new InnerCJ22_ABSTRACT2_interface_2();
//         icj22_2.show();
//     }
// }











// interface loan
// {
//     float rate();
// }

// class edu implements loan
// {
//     public float rate()
//     {
//         return 2.2f;
//     }
// }

// class home implements loan
// {
//     public float rate()
//     {
//         return 11.11f;
//     }
// }

// class car implements loan
// {
//     public float rate()
//     {
//         return 9.9f;
//     }
// }

// /**
//  * CJ22_ABSTRACT2_interface
//  */
// public class CJ22_ABSTRACT2_interface
// {
//     public static void main(String[] args)
//     {
//         loan edu_loan = new edu();  
//         System.out.println("edu loan is :- "+edu_loan.rate()+"%");
//         loan home_loan = new home();  
//         System.out.println("home loan is :- "+home_loan.rate()+"%");
//         loan car_loan = new car();  
//         System.out.println("car loan is :- "+car_loan.rate()+"%");   
//     }
// }
















// /**
//  * CJ22_ABSTRACT2_interface_1
//  */
// interface CJ22_ABSTRACT2_interface_1
// {
//     void show1();
// }

// /**
//  * CJ22_ABSTRACT2_interface_2
//  */
// interface CJ22_ABSTRACT2_interface_2
// {
//     void show2();
// }

// /**
//  * InnerCJ22_ABSTRACT2_interface=innercj22_a2_if
//  *  */
// class InnerCJ22_A2_if implements CJ22_ABSTRACT2_interface_1, CJ22_ABSTRACT2_interface_2
// {
//     public void show1()
//     {
//         System.out.println("this is 1st interface method printing");    
//     }
//     public void show2()
//     {
//         System.out.println("this is 2nd interface method printing");    
//     }    
// }

// /**
//  * CJ22_ABSTRACT2_interface
//  */
// public class CJ22_ABSTRACT2_interface {

//     public static void main(String[] args)
//     {
//         InnerCJ22_A2_if icj22_1 = new InnerCJ22_A2_if();
//         icj22_1.show1();
//         icj22_1.show2();
         
//     }
// }
















// /**
//  * CJ22_ABSTRACT2_interface_1
//  */
// interface CJ22_ABSTRACT2_interface_1
// {
//     void show1();
// }

// /**
//  * CJ22_ABSTRACT2_interface_2
//  */
// interface CJ22_ABSTRACT2_interface_2
// {
//     void show2();
// }

// /**
//  * CJ22_ABSTRACT2_interface
//  */
// public class CJ22_ABSTRACT2_interface implements CJ22_ABSTRACT2_interface_1, CJ22_ABSTRACT2_interface_2
// {

//     public void show1()
//     {
//         System.out.println("this is 1st interface method printing");    
//     }
//     public void show2()
//     {
//         System.out.println("this is 2nd interface method printing");    
//     }    

//     public static void main(String[] args)
//     {
//         CJ22_ABSTRACT2_interface icj22_1 = new CJ22_ABSTRACT2_interface();
//         icj22_1.show1();
//         icj22_1.show2();
//     }
// }












// /**
//  * CJ22_ABSTRACT2_interface_1
//  */
// interface CJ22_ABSTRACT2_interface_1
// {
//     void show1();
// }

// /**
//  * CJ22_ABSTRACT2_interface_2
//  */
// interface CJ22_ABSTRACT2_interface_2 extends CJ22_ABSTRACT2_interface_1
// {
//     void show2();
// }

// /**
//  * CJ22_ABSTRACT2_interface
//  */
// public class CJ22_ABSTRACT2_interface implements CJ22_ABSTRACT2_interface_2
// {

//     public void show1()
//     {
//         System.out.println("this is 1st interface method printing");    
//     }
//     public void show2()
//     {
//         System.out.println("this is 2nd interface method printing");    
//     }    

//     public static void main(String[] args)
//     {
//         CJ22_ABSTRACT2_interface icj22_1 = new CJ22_ABSTRACT2_interface();
//         icj22_1.show1();
//         icj22_1.show2();
//     }
// }












// /**
//  * CJ22_ABSTRACT2_interface_1
//  */
// interface CJ22_ABSTRACT2_interface_1
// {
//     void show1();

//     default void printfunction()
//     {
//         System.out.println("this in interface function data.");
//     }
// }

// /**
//  * CJ22_ABSTRACT2_interface_2
//  */
// interface CJ22_ABSTRACT2_interface_2 extends CJ22_ABSTRACT2_interface_1
// {
//     void show2();
// }

// /**
//  * CJ22_ABSTRACT2_interface
//  */
// public class CJ22_ABSTRACT2_interface implements CJ22_ABSTRACT2_interface_2
// {

//     public void show1()
//     {
//         System.out.println("this is 1st interface method printing");    
//     }
//     public void show2()
//     {
//         System.out.println("this is 2nd interface method printing");    
//     }    

//     public static void main(String[] args)
//     {
//         CJ22_ABSTRACT2_interface icj22_1 = new CJ22_ABSTRACT2_interface();
//         icj22_1.show1();
//         icj22_1.show2();

//         CJ22_ABSTRACT2_interface_1 cj22_if_1=new CJ22_ABSTRACT2_interface();
//         cj22_if_1.printfunction();        
//     }
// }









interface if1
{
    void show();
    static float height(float getheight)
    {
        return getheight;
    }
}

class if1_call implements if1
{
    public void show()
    {
        System.out.println("get value for user height at object calling time.");
    }
}

/**
 * CJ22_ABSTRACT2_interface
 */
public class CJ22_ABSTRACT2_interface
{
    public static void main(String[] args)
    {
        if1 f = new if1_call();
        f.show();
        System.out.println(if1.height(6.1f));     
    }
    
}