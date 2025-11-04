// static use in :-
// variable
// method
// block
// nested class




// /**
//  * Innercj27_class_static
//  */
// class Innercj27_class_static
// {
//     int age;                    //instance variable
//     static String name="xyz";   //static variable
//     static String lname="xyzxyz";
//     String city="delhi";
    
    
//     Innercj27_class_static(int i, String s)
//     {
//         age=i;
//         name=s;
//     }
    
//     void display()
//     {
//         System.out.println("user age "+age+" user name "+name);
//         System.out.println("user last name is "+lname);
//         System.out.println("user city name is "+city);
        
//     }
// }
// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {
// public static void main(String[] args) {
//     Innercj27_class_static icj27_1= new Innercj27_class_static(5,"abc");
//     icj27_1.age=10;
//     System.out.println(icj27_1.age);
//     icj27_1.display();
// }
    
// }





















































// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {

//     int i=0;
//     static int i_static=0;
//     cj27_class_static()
//     {
//         i++;
//         i_static++;
        
//         System.out.println("the i is "+i+" and the i_static is "+i_static);
//     }
//     public static void main(String[] args) {
//         cj27_class_static cj27_1 = new cj27_class_static();
//         cj27_class_static cj27_2 = new cj27_class_static();
//         cj27_class_static cj27_3 = new cj27_class_static();
        
//     }
// }





























// /**
//  * Innercj27_class_static
//  */
// class Innercj27_class_static
// {
//     int age;                    //instance variable
//     String name="xyz";   
//     static String lname="xyzxyz";   //static variable
//     static String city="delhi";
    
//     static void change()
//     {
//         lname="cherry";
//         city="up";
//     }

//     Innercj27_class_static(int i, String s)
//     {
//         age=i;
//         name=s;
//     }
    
//     void display()
//     {
//         System.out.println("user age "+age+" user name "+name);
//         System.out.println("user last name is "+lname);
//         System.out.println("user city name is "+city);
//         System.out.println();
//     }
// }
// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {
// public static void main(String[] args) {
    
//     Innercj27_class_static icj27_1= new Innercj27_class_static(5,"abc");
//     Innercj27_class_static icj27_2= new Innercj27_class_static(15,"abc2");
//     Innercj27_class_static icj27_3= new Innercj27_class_static(25,"abc3");
    
//     icj27_1.display();
//     icj27_2.display();
//     icj27_3.display();
    
// }
    
// }





















































// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {

//     static void show()
//     {
//         System.out.println("this is my show function");
//     }
//     public static void main(String[] args) {
//         show();
//     }
// }





































// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {

//     static int show(int square)
//     {
//         System.out.println("the square is ");
//         return (square*square);
//     }
//     public static void main(String[] args) {
//         System.out.println(show(5));
//     }
// }




































// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {

//     static int x=10;
//     public static void main(String[] args) {
//         System.out.println(x);
//     }
// }








































// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {
//     static{
//         System.out.println("out side from main and inside of class");
//     }

//     public static void main(String[] args) {
        
//     }
// }






































// this keyword in java
// this keyword is a referance variable that refers to current object.

// this (reference variable)  -> state / behaviour =object






// /**
//  * Innercj27_class_static
//  */
// class Innercj27_class_static
// {

//     int rollno;
//     String uname;
//     Innercj27_class_static(int RollNo, String UName)
//     {
//         rollno=RollNo;
//         uname=UName;
//     }
//     void show()
//     {
//         System.out.println("user name is "+uname);
//         System.out.println("user roll no is "+rollno);
//     }

    
// }
// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {

//     public static void main(String[] args)
//     {
//         Innercj27_class_static icj27_1= new Innercj27_class_static(1,"amit");    
//         icj27_1.show();
//     }
// }



























































// /**
//  * Innercj27_class_static
//  */
// class Innercj27_class_static
// {
    
//     int rollno;
//     String uname;
//     Innercj27_class_static(int rollno, String uname)
//     {
//         this.rollno=rollno;
//         this.uname=uname;
//     }
//     void show()
//     {
//         System.out.println("user name is "+uname);
//         System.out.println("user roll no is "+rollno);
//     }

    
// }
// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {

//     public static void main(String[] args)
//     {
//         Innercj27_class_static icj27_1= new Innercj27_class_static(1,"amit");    
//         icj27_1.show();
//     }
// }



































































// /**
//  * Innercj27_class_static
//  */
// class Innercj27_class_static
// {
//     void myfun1()
//     {
//         System.out.println("this is my fun one");
//     }

//     void show()
//     {
//         this.myfun1();
    
//     }
    
// }
// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {

//     public static void main(String[] args)
//     {
//         Innercj27_class_static icj27_1= new Innercj27_class_static();    
//         icj27_1.show();
//     }
// }








































































// /**
//  * Innercj27_class_static
//  */
// class Innercj27_class_static
// {
//     Innercj27_class_static()
//     {
//         System.out.println("this is my fun one");
//     }

//     Innercj27_class_static(int x)
//     { 
//         this();
//         System.out.println(x);
        
//     }
    
// }
// /**
//  * cj27_class_static
//  */
// public class cj27_class_static {

//     public static void main(String[] args)
//     {
//         new Innercj27_class_static(1);    
        
//     }
// }
