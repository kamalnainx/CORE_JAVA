// /**
//  * A16_polymorphismbolck
//  */
// class A16_polymorphismbolck
// {
//     {
//         System.out.println("xyz");
//     }
//     public static void main(String[] args)
//     {
//     A16_polymorphismbolck A16_pmpb =new A16_polymorphismbolck();    
//     }
// }






// /**
//  * A16_polymorphismbolck
//  */
// class A16_polymorphismbolck
// {
//     int num;
//     {
//         System.out.println(num=100);
//     }
//     public static void main(String[] args)
//     {
//     A16_polymorphismbolck A16_pmpb =new A16_polymorphismbolck();    
//     }
// }






// /**
//  * A16_polymorphismbolck
//  */
// class A16_polymorphismbolck
// {
//     int num=100;
//     A16_polymorphismbolck()
//     {
//         System.out.println("last number value "+num);
//     }
//     {
//         num=200;
//     }
//     public static void main(String[] args)
//     {
//         A16_polymorphismbolck A16_pmpb1 =new A16_polymorphismbolck();    
//         A16_polymorphismbolck A16_pmpb2 =new A16_polymorphismbolck();    
//     }
// }






// /**
//  * A16_polymorphismbolck
//  */
// public class A16_polymorphismbolck
// {
//     A16_polymorphismbolck()
//     {
//         System.out.println("abc");
//     }
//     {
//         System.out.println("xyz");
//     }
//     public static void main(String[] args)
//     {
//         A16_polymorphismbolck A16_pmpb1 = new A16_polymorphismbolck();    
//     } 
// }








// /**
//  * A16_polymorphismbolck
//  */
// public class A16_polymorphismbolck
// {
//     {
//         System.out.println("xyz");
//     }
//     A16_polymorphismbolck()
//     {
//         System.out.println("abc");
//     }

//     public static void main(String[] args)
//     {
//         A16_polymorphismbolck A16_pmpb1 = new A16_polymorphismbolck();    
//     }    
// }






// /**
//  * InnerA16_polymorphismbolck
//  *  
//  * */
// class InnerA16_polymorphismbolck
// {
//    InnerA16_polymorphismbolck()
//    {
//        System.out.println("this is innerA16_Polymorphismbolck class");
//    } 
// }
// /**
//  * A16_polymorphismbolck
//  */
// class A16_polymorphismbolck extends InnerA16_polymorphismbolck
// {
//     A16_polymorphismbolck()
//     {
//         System.out.println("A16_polymorphismbolck.A16_polymorphismbolck()");
//     }
//     public static void main(String[] args)
//     {
//         A16_polymorphismbolck A16_pmpb=new A16_polymorphismbolck();   
//     }  
// }






// /**
//  * InnerA16_polymorphismbolck
//  *  
//  * */
// class InnerA16_polymorphismbolck
// {
//    InnerA16_polymorphismbolck()
//    {
//        System.out.println("this is innerA16_Polymorphismbolck class");
//    } 
// }
// /**
//  * A16_polymorphismbolck
//  */
// class A16_polymorphismbolck extends InnerA16_polymorphismbolck
// {
//     A16_polymorphismbolck()
//     {
//         System.out.println("A16_polymorphismbolck.A16_polymorphismbolck()");
//     }
//     {
//         System.out.println("this is my block A16_polymorphismblock.");
//     }
//     public static void main(String[] args)
//     {
//         A16_polymorphismbolck A16_pmpb=new A16_polymorphismbolck();   
//     }  
// }





// /**
//  * InnerA16_polymorphismbolck
//  *  
//  * */
// class InnerA16_polymorphismbolck
// {
//    InnerA16_polymorphismbolck()
//    {
//        System.out.println("this is innerA16_Polymorphismbolck class");
//    } 
// }

// /**
//  * A16_polymorphismbolck
//  */
// class A16_polymorphismbolck extends InnerA16_polymorphismbolck
// {
//     A16_polymorphismbolck()
//     {
//         super ();
//         System.out.println("A16_polymorphismbolck.A16_polymorphismbolck()");
//     }
//     {
//         System.out.println("this is my block A16_polymorphismblock.");
//     }
//     public static void main(String[] args)
//     {
//         A16_polymorphismbolck A16_pmpb=new A16_polymorphismbolck();   
//     }  
// }







// /**
//  * InnerA16_polymorphismbolck
//  */
// class InnerA16_polymorphismbolck {
//     InnerA16_polymorphismbolck()
//     {
//         System.out.println("InnerA16_polymorphismbolck.InnerA16_polymorphismbolck()");
//     }
    
// }
// /**
//  * A16_polymorphismbolck
//  */
// public class A16_polymorphismbolck extends InnerA16_polymorphismbolck{
//     A16_polymorphismbolck()
//     {
//         super();
//         System.out.println("A16_polymorphismbolck.A16_polymorphismbolck()");
//     }

//     A16_polymorphismbolck(int a)
//     {
//         super();
//         System.out.println("A16_polymorphismbolck.A16_polymorphismbolck()"+a);
//     }
    
//     {
//         System.out.println("instance initializar block is call");
//     }
//     public static void main(String[] args) {
//         A16_polymorphismbolck A6_pmpb1=new A16_polymorphismbolck(10);
//         A16_polymorphismbolck A6_pmpb2=new A16_polymorphismbolck();
        
//     }
// }