// encapsulation 
// what is encapsulation ?

// when we make sure that sensitive data is hidden form user that is encapsulation
// in encapsulation :-
// declare class variables / attributes as private
// provide public get and set methods to access and update the value of a private variable













// /**
//  * cj28_encapsulation
//  */
// public class cj28_encapsulation
// {
//     int x=10;

//     public static void main(String[] args)
//     {
//         System.out.println("hello world");    
//         cj28_encapsulation cj28_1 = new cj28_encapsulation();
//         System.out.println(cj28_1.x);    
        
//     }
    
// }































































// /**
//  * cj28_encapsulation
//  */
// public class cj28_encapsulation
// {
//     private int x=10;

//     public static void main(String[] args)
//     {
//         System.out.println("hello world");    
//         cj28_encapsulation cj28_1 = new cj28_encapsulation();
//         System.out.println(cj28_1.x);    
        
//     }
    
// }


































// /**
//  * Innercj28_encapsulation
//  */
// class Innercj28_encapsulation
// {
//     private int x1=10;//error private mamber hide in calling
    
// }
// /**
//  * cj28_encapsulation
//  */
// public class cj28_encapsulation
// {
//     private int x=10;

//     public static void main(String[] args)
//     {
//         System.out.println("hello world");    
//         cj28_encapsulation cj28_1 = new cj28_encapsulation();
//         System.out.println(cj28_1.x);    

//         Innercj28_encapsulation icj28_1 = new Innercj28_encapsulation();
//         System.out.println(icj28_1.x1);
//     }
    
// }
























// /**
//  * Innercj28_encapsulation
//  */
// class Innercj28_encapsulation
// {
//     private int x1;

//     public void set1(int X1)
//     {
//         this.x1=X1;
//     }

//     public int get1()
//     {
//         return x1;
//     }

    
    
// }
// /**
//  * cj28_encapsulation
//  */
// public class cj28_encapsulation
// {
//     private int x=10;

//     public static void main(String[] args)
//     {
//         System.out.println("hello world");    
//         cj28_encapsulation cj28_1 = new cj28_encapsulation();
//         System.out.println(cj28_1.x);    

//         Innercj28_encapsulation icj28_1 = new Innercj28_encapsulation();
        
//         // System.out.println(icj28_1.x1);
        
//         icj28_1.set1(10);
//         System.out.println(icj28_1.get1());
        
//     }
    
// }

























































// /**
//  * Innercj28_encapsulation
//  */
// class Innercj28_encapsulation
// {
//     private int x1=10;

    
//     public int get1()
//     {
//         return x1;
//     }

    
    
// }
// /**
//  * cj28_encapsulation
//  */
// public class cj28_encapsulation
// {
//     private int x=10;

//     public static void main(String[] args)
//     {
//         System.out.println("hello world");    
//         cj28_encapsulation cj28_1 = new cj28_encapsulation();
//         System.out.println(cj28_1.x);    

//         Innercj28_encapsulation icj28_1 = new Innercj28_encapsulation();
        
//         // System.out.println(icj28_1.x1);
        
//         System.out.println(icj28_1.get1());
        
//     }
    
// }












// /**
//  * Innercj28_encapsulation
//  */
// class Innercj28_encapsulation
// {
//     private String user_name;
//     private int user_age;
//     private float user_height;

//     public void uname(String name)
//     {
//         this.user_name=name;
//     }
//     public void uage(int age)
//     {
//         this.user_age=age;
//     }
//     public void uheight(float height)
//     {
//         this.user_height=height;
//     }
    
//     public void get_variables()
//     {
//         System.out.println("user name is "+user_name);
//         System.out.println("user age is "+user_age);
//         System.out.println("user height is "+user_height);
        
//     }
    
// }
// /**
//  * cj28_encapsulation
//  */
// public class cj28_encapsulation {

//     public static void main(String[] args)
//     {
//         Innercj28_encapsulation icj28_1 = new Innercj28_encapsulation();
//         icj28_1.uname("kamal");    
//         icj28_1.uage(30);
//         icj28_1.uheight(56.89f);

//         icj28_1.get_variables();
//     }
// }
