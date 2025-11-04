// public class abstract1 
// {
//     void name1()
//     {
//         System.out.println("kamal nain");
//     }
//     public static void main(String args[])
//     {
//         abstract1 abs1=new abstract1();
//         abs1.name1();
//     }    
// }

// class centre
// {
//     void name11()
//     {
//         System.out.println("center class function.");
//     }
// }
// class abstract1 
// {
//     public static void main(String args[])
//     {
//         centre c =new centre();
//         c.name11();
//     }    
// }

// abstract class centre
// {
//     void name11()
//     {
//         System.out.println("center class function.");
//     }
// }
// class abstract1 extends centre
// {
//     public static void main(String args[])
//     {
//         centre c =new abstract1();
//         c.name11();
//     }    
// }

// abstract class centre
// {
//     abstract void name11();
    
// }
// class abstract1 extends centre
// {
//     void name11()
//     {
//         System.out.println("center class function.");
//     }
//     public static void main(String args[])
//     {
//         centre c =new abstract1();
//         c.name11();
//     }    
// }

// abstract class centre
// {
//     abstract void name1();
// }
// class student extends centre
// {
//     void name1()
//     {
//         System.out.println("this is student class and name is ravi");
//     }
// }
// class teacher extends centre
// {
//     void name1()
//     {
//         System.out.println("this is teacher class and name is kamal");
//     }
// }
// class abstract1
// {
//     public static void main (String[] agrs)
//     {
//         centre s=new student();
//         centre t=new teacher();
//         s.name1();
//         t.name1();
//     }
// }