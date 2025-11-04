// what is constructors?
// constructors is a block of code similar like method(function),
// it's main use it is called autometic when we created class object.
// at the time of calling constructors memory for the object is allocated in momeory.

// public class CJ17_oops5_constructors
// {
//     CJ17_oops5_constructors()
//     {
//         System.out.println("this is my first constructor.");
//     }
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17 = new CJ17_oops5_constructors();    
//     }    
// }








// public class CJ17_oops5_constructors
// {
//     CJ17_oops5_constructors()
//     {
//         System.out.println("this is my first constructor.");
//     }
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17_1 = new CJ17_oops5_constructors();    
//         CJ17_oops5_constructors cj17_2 = new CJ17_oops5_constructors();    
//     }    
// }








// public class CJ17_oops5_constructors
// {
//     int age=10;

//     CJ17_oops5_constructors()
//     {
//         System.out.println("User age is "+age);
//     }
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17_1 = new CJ17_oops5_constructors();    
//         CJ17_oops5_constructors cj17_2 = new CJ17_oops5_constructors();    
//     }    
// }











// public class CJ17_oops5_constructors
// {
//     int age=10;
//     String uname="thekamalnain";

//     CJ17_oops5_constructors()
//     {
//         System.out.println("User name is "+uname);
//         System.out.println("User age is "+age);
        
//     }
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17_1 = new CJ17_oops5_constructors();    
//     }    
// }









// public class CJ17_oops5_constructors
// {
//     CJ17_oops5_constructors(int age, String uname)
//     {
//         System.out.println("User name is "+uname);
//         System.out.println("User age is "+age);   
//     }
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17_1 = new CJ17_oops5_constructors(10,"thekamalnain");    
//     }    
// }








// public class CJ17_oops5_constructors
// {
//     CJ17_oops5_constructors(int age, String uname)
//     {
//         System.out.println("User name is "+uname);
//         System.out.println("User age is "+age);   
//     }
    
//     CJ17_oops5_constructors(int age, String uname, double height)
//     {
//         System.out.println("User name is "+uname);
//         System.out.println("User age is "+age);   
//         System.out.println("User height is "+height);   
//     }
    
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17_1 = new CJ17_oops5_constructors(10,"thekamalnain");    
//         CJ17_oops5_constructors cj17_2 = new CJ17_oops5_constructors(10,"thekamalnain",5.5);    
//     }    
// }









// public class CJ17_oops5_constructors
// {
//     int age1;
//     String uname1;
//     double height1;

//     CJ17_oops5_constructors(int age, String uname)
//     {
//         System.out.println("User name is "+uname);
//         System.out.println("User age is "+age);   
//         age1=age;
//         uname1=uname;
//     }
    
//     void show()
//     {
//         System.out.println(age1+" "+uname1);
//     }

//     CJ17_oops5_constructors(int age, String uname, double height)
//     {
//         System.out.println("User name is "+uname);
//         System.out.println("User age is "+age);   
//         System.out.println("User height is "+height);   
//     }
    
    
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17_1 = new CJ17_oops5_constructors(10,"thekamalnain");    
//         CJ17_oops5_constructors cj17_2 = new CJ17_oops5_constructors(10,"thekamalnain",5.5); 
//         cj17_1.show();   
//     }    
// }











// public class CJ17_oops5_constructors
// {
//     int age1;
//     String uname1;
//     double height1;

//     CJ17_oops5_constructors(int age, String uname)
//     {
//         System.out.println("User name is "+uname);
//         System.out.println("User age is "+age);   
//         age1=age;
//         uname1=uname;
//     }
    
//     void show()
//     {
//         System.out.println(age1+" "+uname1);
//     }

//     CJ17_oops5_constructors(int age, String uname, double height)
//     {
//         System.out.println("User name is "+uname);
//         System.out.println("User age is "+age);   
//         System.out.println("User height is "+height);   
    
//         age1=age;
//         uname1=uname;
//         height1=height;
//     }
    
//     void print1()
//     {
//         System.out.println("user name is "+uname1+" height and age is "+height1+" "+age1 );
//     }
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17_1 = new CJ17_oops5_constructors(10,"thekamalnain");    
//         CJ17_oops5_constructors cj17_2 = new CJ17_oops5_constructors(10,"thekamalnain",5.5); 
//         cj17_1.show();
//         cj17_2.print1();   
//     }    
// }









// /**
//  * CJ17_oops5_constructors
//  */
// public class CJ17_oops5_constructors
// {
//     int ig;
//     String sg;

//     CJ17_oops5_constructors(int i ,String s)
//     {
//         System.out.println("the i is "+i+" and s is "+s);    
//         ig=i;
//         sg=s;
//     }
//     CJ17_oops5_constructors(CJ17_oops5_constructors cj_c)
//     {
//         ig=cj_c.ig;
//         sg=cj_c.sg;
//     }
//     void show()
//     {
//         System.out.println(ig+ " " +sg);
//     }
//     public static void main(String[] args)
//     {
//         CJ17_oops5_constructors cj17_1 = new CJ17_oops5_constructors(10,"thekamalnain");
//         CJ17_oops5_constructors cj17_2 = new CJ17_oops5_constructors(cj_c);

//         cj17_1.show();
//         cj17_2.show();           
//     }
// }
