// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {

//     public static void main(String[] args)
//     {
//         int x=10;
//         System.out.println(x);    
//     }
// }





































/**
 * cj25_class_object
 */
public class cj25_class_object
{
    static int x;
    

    public static void main(String[] args)
    {
        System.out.println(x);    

    }
}




































// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     int x=10;
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {

//     public static void main(String[] args)
//     {
//         Innercj25_class_object icj25_1 = new Innercj25_class_object();
//         System.out.println(icj25_1.x);    
//     }
// }






























// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     Innercj25_class_object()
//     {
//         System.out.println("this is class calling");
//     }

//     int x=10;
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {

//     public static void main(String[] args)
//     {
//         Innercj25_class_object icj25_1 = new Innercj25_class_object();
//         System.out.println(icj25_1.x);    
//     }
// }

























// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     Innercj25_class_object()
//     {
//         System.out.println("this is class calling");
//     }

//     int x=10;
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {

//     public static void main(String[] args)
//     {
//         new Innercj25_class_object();
//         Innercj25_class_object icj25_1 = new Innercj25_class_object();
//         System.out.println(icj25_1.x);
//     }
// }
























// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     Innercj25_class_object(String uname)
//     {
//         System.out.println("the user name is "+uname);
//     }

//     int x=10;
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {

//     public static void main(String[] args)
//     {
//         new Innercj25_class_object("kamal nain");
//         Innercj25_class_object icj25_1 = new Innercj25_class_object("khushboo");
//         System.out.println(icj25_1.x);
//     }
// }
























// constructors 
// a constructors in java is a special method that is used to initializwe objects.
// a constructors is auto called   when we create object od a class or call.
// a constructors is use for set value pf object attributes.
// a constructors name must as same with class name.
// all class have constructors by default if we donot use or create a class constructors its in backend of class.


// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     Innercj25_class_object(String uname)
//     {
//         System.out.println("the user name is "+uname);
//     }

//     int x=10;
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {

//     public static void main(String[] args)
//     {
//         new Innercj25_class_object("kamal nain");
//         new Innercj25_class_object("kamal nain");
//         new Innercj25_class_object("kamal nain");
//         Innercj25_class_object icj25_1 = new Innercj25_class_object("khushboo");
//         System.out.println(icj25_1.x);
//     }
// }














// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     String user_name;
//     int user_age;
//     Innercj25_class_object(String uname, int age)
//     {

//         user_name=uname;
//         user_age=age;
//     }
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {
//     public static void main(String[] args)
//     {
//         new Innercj25_class_object("kamal nain",10);
//         new Innercj25_class_object("kamal nain",20);
//         new Innercj25_class_object("kamal nain",30);
//         Innercj25_class_object icj25_1 = new Innercj25_class_object("khushboo",40);
//         System.out.println(icj25_1.user_name);
//         System.out.println(icj25_1.user_age);
        
//     }
// }



















// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     String user_name;
//     int user_age;
//     Innercj25_class_object(String uname, int age)
//     {

//         user_name=uname;
//         user_age=age;
//         System.out.print(user_name+"\t");
//         System.out.println(user_age);
        
//     }
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {
//     public static void main(String[] args)
//     {
//         new Innercj25_class_object("kamal nain",10);
//         new Innercj25_class_object("kamal nain",20);
//         new Innercj25_class_object("kamal nain",30);
//         Innercj25_class_object icj25_1 = new Innercj25_class_object("khushboo",40);
//         System.out.println(icj25_1.user_name);
//         System.out.println(icj25_1.user_age);
        
//     }
// }
















// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     String user_name;
//     int user_age;
//     Innercj25_class_object(String uname, int age)
//     {

//         user_name=uname;
//         user_age=age;
//         System.out.print(user_name+"\t");
//         System.out.println(user_age);
        
//     }
//     void show()
//     {
//         System.out.println("this is my first function/method");
//     }
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {
//     public static void main(String[] args)
//     {
//         new Innercj25_class_object("kamal nain",10);
//         new Innercj25_class_object("kamal nain",20);
//         new Innercj25_class_object("kamal nain",30);
//         Innercj25_class_object icj25_1 = new Innercj25_class_object("khushboo",40);
//         System.out.println(icj25_1.user_name);
//         System.out.println(icj25_1.user_age);
//         icj25_1.show();
//     }
// }






























































// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     String user_name;
//     int user_age;
//     Innercj25_class_object(String uname, int age)
//     {

//         user_name=uname;
//         user_age=age;
//         System.out.print(user_name+"\t");
//         System.out.println(user_age);
        
//     }
//     void show()
//     {
//         System.out.println("this is my first function/method");
//     }

//     void show(String fname, String lname)
//     {
//         System.out.println("the user name is "+ fname+lname);
//     }
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {
//     public static void main(String[] args)
//     {
//         new Innercj25_class_object("kamal nain",10);
//         new Innercj25_class_object("kamal nain",20);
//         new Innercj25_class_object("kamal nain",30);
//         Innercj25_class_object icj25_1 = new Innercj25_class_object("khushboo",40);
//         System.out.println(icj25_1.user_name);
//         System.out.println(icj25_1.user_age);
//         icj25_1.show();
//         icj25_1.show("fname ", "lname");
//     }
// }
























































// /**
//  * Innercj25_class_object
//  */
// class Innercj25_class_object
// {
//     String user_name;
//     int user_age;
//     Innercj25_class_object(String uname, int age)
//     {

//         user_name=uname;
//         user_age=age;
//         System.out.print(user_name+"\t");
//         System.out.println(user_age);
        
//     }
//     void show()
//     {
//         System.out.println("this is my first function/method");
//     }

//     void show(String fname, String lname)
//     {
//         System.out.println("the user name is "+ fname+lname);
//     }

//     void show(String name)
//     {
//         System.out.println("the user name is "+ name+user_age);
//     }
    
// }
// /**
//  * cj25_class_object
//  */
// public class cj25_class_object
// {
//     public static void main(String[] args)
//     {
//         new Innercj25_class_object("kamal nain",10);
//         new Innercj25_class_object("kamal nain",20);
//         new Innercj25_class_object("kamal nain",30);
//         Innercj25_class_object icj25_1 = new Innercj25_class_object("khushboo",40);
//         System.out.println(icj25_1.user_name);
//         System.out.println(icj25_1.user_age);
//         icj25_1.show();
//         icj25_1.show("fname ", "lname");
//         icj25_1.show("fname lname ");
        
//     }
// }








