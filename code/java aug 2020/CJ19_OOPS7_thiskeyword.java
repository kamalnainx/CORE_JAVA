// what is this keyword?
// this keyword have and can be lots of usage  of java and in java 
// this keyword is referece variable that refers to the cuurnt object value.

// /**
//  * CJ19_OOPS7_thiskeyword
//  */
// public class CJ19_OOPS7_thiskeyword
// {
//     int age;
//     String uname;
//     float height;

//     CJ19_OOPS7_thiskeyword(int age1, String uname1, float height1)
//     {
//         System.out.println("user name is "+uname1);
//         System.out.println("user age "+age1);
//         System.out.println("user height is "+height1);
//         uname=uname1;
//         age=age1;
//         height=height1;
//     }
//     void thiskeyword()
//     {
//         System.out.println("f user name is "+uname);
//         System.out.println("f user age "+age);
//         System.out.println("f user height is "+height);
//     }
    
//     public static void main(String[] args)
//     {
//         CJ19_OOPS7_thiskeyword cj19_1 = new CJ19_OOPS7_thiskeyword(19, "sarthak", 5.8f);
//         cj19_1.thiskeyword();
//         CJ19_OOPS7_thiskeyword cj19_2 = new CJ19_OOPS7_thiskeyword(19, "bhawi", 5.6f);
//         cj19_2.thiskeyword();   
//     }
// }












// /**
//  * CJ19_OOPS7_thiskeyword
//  */
// public class CJ19_OOPS7_thiskeyword
// {
//     int age;
//     String uname;
//     float height;

//     CJ19_OOPS7_thiskeyword(int age1, String uname1, float height1)
//     {
//         System.out.println("user name is "+uname1);
//         System.out.println("user age "+age1);
//         System.out.println("user height is "+height1);
//         this.uname=uname1;
//         this.age=age1;
//         this.height=height1;
//     }
//     void thiskeyword()
//     {
//         System.out.println("f user name is "+uname);
//         System.out.println("f user age "+age);
//         System.out.println("f user height is "+height);
//     }
    
//     public static void main(String[] args)
//     {
//         CJ19_OOPS7_thiskeyword cj19_1 = new CJ19_OOPS7_thiskeyword(19, "sarthak", 5.8f);
//         cj19_1.thiskeyword();
//         CJ19_OOPS7_thiskeyword cj19_2 = new CJ19_OOPS7_thiskeyword(19, "bhawi", 5.6f);
//         cj19_2.thiskeyword();   
//     }
// }







// /**
//  * CJ19_OOPS7_thiskeyword
//  */
// public class CJ19_OOPS7_thiskeyword {

//     void data1()
//     {
//         System.out.println("data1 function");
//     }
//     void getdate()
//     {
//         data1();
//     }
//     public static void main(String[] args) {
//        CJ19_OOPS7_thiskeyword cj19_1 = new CJ19_OOPS7_thiskeyword();
//        cj19_1.getdate(); 
//     }
// }







// /**
//  * CJ19_OOPS7_thiskeyword
//  */
// public class CJ19_OOPS7_thiskeyword {

//     void data1()
//     {
//         System.out.println("data1 function");
//     }
//     void getdate()
//     {
//         this.data1();
//     }
//     public static void main(String[] args) {
//        CJ19_OOPS7_thiskeyword cj19_1 = new CJ19_OOPS7_thiskeyword();
//        cj19_1.getdate(); 
//     }
// }







// /**
//  * CJ19_OOPS7_thiskeyword
//  */
// public class CJ19_OOPS7_thiskeyword {

//     CJ19_OOPS7_thiskeyword()
//     {
//         System.out.println("con function");
//     }
//     CJ19_OOPS7_thiskeyword(int i)
//     {
//         this();
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//     CJ19_OOPS7_thiskeyword cj19_1 = new CJ19_OOPS7_thiskeyword(1);        
//     }
// }