// // what is final keyword?
// // the final keyword in java is used for restrict user.final key used with many context.
// // like:- 1 variable,   2 method(function),     3 class

// // final:-
// // stop value change(variable)
// // stop method(function) overrindding 
// // stop inheritance(class)

// // /**
// //  * A17_finalpolymorphism
// //  */
// // public class A17_finalpolymorphism 
// // {
// //     int size=10;

// //     {
// //         size=100;
// //         System.out.println(size);
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //     }
        
// // }








// // /**
// //  * A17_finalpolymorphism
// //  */
// // public class A17_finalpolymorphism 
// // {
// //     final int size=10;

// //     {
// //         size=100;
// //         System.out.println(size);
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //     }
        
// // }








// // /**
// //  * A17_finalpolymorphism
// //  */
// // class A17_finalpolymorphism 
// // {
// //     final int size=10;

// //     {
// //         // size=100;
// //         System.out.println(size);
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //     }
        
// // }








// // /**
// //  * A17_finalpolymorphism
// //  */
// // class A17_finalpolymorphism 
// // {
// //     final int size=10;

// //     void print()
// //     {
// //         // size=100;
// //         System.out.println(size);
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //         a17_fpmp.print();
// //     }
        
// // }






// // /**
// //  * A17_finalpolymorphism
// //  */
// // class A17_finalpolymorphism 
// // {
// //     int size=10;

// //     void print()
// //     {
// //         final int size=100;
// //         System.out.println(size);
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //         a17_fpmp.print();
// //     }
        
// // }






// // /**
// //  * A17_finalpolymorphism
// //  */
// // class A17_finalpolymorphism 
// // {
// //     int size=10;

// //     {
// //         // size=100;
// //         System.out.println("before method function"+size);
// //     }
// //     void print()
// //     {
// //         final int size=100;
// //         System.out.println(size);
// //     }
// //     {
// //         // size=100;
// //         System.out.println("after function or method"+size);
// //     }

// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //         a17_fpmp.print();
// //     }
        
// // }







// // final function method

// // /**
// //  * A17_finalpolymorphism
// //  */
// // class A17_finalpolymorphism
// // {
// //     void run()
// //     {
// //         System.out.println("run my method");
// //     }

// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //         a17_fpmp.run();
// //     }
    
// // }






// // /**
// //  * InnerA17_finalpolymorphism
// //  */
// // class InnerA17_finalpolymorphism 
// // {
// //     void run()
// //     {
// //         System.out.println("run my method from InnerA17_finalpolymorphim");
// //     }
    
// // }
// // /**
// //  * A17_finalpolymorphism
// //  */
// // class A17_finalpolymorphism extends InnerA17_finalpolymorphism
// // {
// //     void run()
// //     {
// //         System.out.println("run my method");
// //     }

// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //         a17_fpmp.run();
// //     }
    
// // }







// // /**
// //  * InnerA17_finalpolymorphism
// //  */
// // class InnerA17_finalpolymorphism 
// // {
// //     final void run()
// //     {
// //         System.out.println("run my method from InnerA17_finalpolymorphim");
// //     }
    
// // }
// // /**
// //  * A17_finalpolymorphism
// //  */
// // class A17_finalpolymorphism extends InnerA17_finalpolymorphism
// // {
// //     void run()
// //     {
// //         System.out.println("run my method");
// //     }

// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //         a17_fpmp.run();
// //     }
    
// // }







// // /**
// //  * InnerA17_finalpolymorphism
// //  */
// // class InnerA17_finalpolymorphism 
// // {
// //     void run()
// //     {
// //         System.out.println("run my method from InnerA17_finalpolymorphim");
// //     }
    
// // }
// // /**
// //  * A17_finalpolymorphism
// //  */
// // class A17_finalpolymorphism extends InnerA17_finalpolymorphism
// // {
// //     final void run()
// //     {
// //         System.out.println("run my method");
// //     }

// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_fpmp=new A17_finalpolymorphism();
// //         a17_fpmp.run();
// //     }
    
// // }







// // // final with class
// // /**
// //  * A17_finalpolymorphism
// //  */
// // public class A17_finalpolymorphism
// // {   void hieght()
// //     {
// //         System.out.println("user height is 10");
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_finalpolymorphism = new A17_finalpolymorphism();
// //         a17_finalpolymorphism.hieght();
// //     }
    
// // }




// // /**
// //  * InnerA17_finalpolymorphism
// //  */
// // class InnerA17_finalpolymorphism
// // {
// //     void hieght()
// //     {
// //         System.out.println("user height is 10 from innerA17_finalpolymorphism");
// //     }
// // }

// // /**
// //  * A17_finalpolymorphism
// //  */
// // public class A17_finalpolymorphism extends InnerA17_finalpolymorphism
// // {   void hieght()
// //     {
// //         System.out.println("user height is 10");
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_finalpolymorphism = new A17_finalpolymorphism();
// //         a17_finalpolymorphism.hieght();
// //     }
// // }





// // /**
// //  * InnerA17_finalpolymorphism
// //  */
// // final class InnerA17_finalpolymorphism
// // {
// //     void hieght()
// //     {
// //         System.out.println("user height is 10 from innerA17_finalpolymorphism");
// //     }
// // }

// // /**
// //  * A17_finalpolymorphism
// //  */
// // public class A17_finalpolymorphism extends InnerA17_finalpolymorphism
// // {   void hieght()
// //     {
// //         System.out.println("user height is 10");
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_finalpolymorphism = new A17_finalpolymorphism();
// //         a17_finalpolymorphism.hieght();
// //     }
// // }





// // /**
// //  * InnerA17_finalpolymorphism
// //  */
// // class InnerA17_finalpolymorphism
// // {
// //     void hieght()
// //     {
// //         System.out.println("user height is 10 from innerA17_finalpolymorphism");
// //     }
// // }

// // /**
// //  * A17_finalpolymorphism
// //  */
// // final public class A17_finalpolymorphism extends InnerA17_finalpolymorphism
// // {   void hieght()
// //     {
// //         System.out.println("user height is 10");
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_finalpolymorphism = new A17_finalpolymorphism();
// //         a17_finalpolymorphism.hieght();
// //     }
// // }





// // // final method inherited
// // /**
// //  * InnerA17_finalpolymorphism
// //  */
// // class InnerA17_finalpolymorphism
// // {
// //     final void hieght()
// //     {
// //         System.out.println("user height is 10 from innerA17_finalpolymorphism");
// //     }
// // }

// // /**
// //  * A17_finalpolymorphism
// //  */
// // final public class A17_finalpolymorphism extends InnerA17_finalpolymorphism
// // {   void hieght()
// //     {
// //         System.out.println("user height is 10");
// //     }
// //     public static void main(String[] args)
// //     {
// //         A17_finalpolymorphism a17_finalpolymorphism = new A17_finalpolymorphism();
// //         a17_finalpolymorphism.hieght();
// //     }
// // }




// // final method inherited
// /**
//  * InnerA17_finalpolymorphism
//  */
// class InnerA17_finalpolymorphism
// {
//     final void height1()
//     {
//         System.out.println("user height is 10 from innerA17_finalpolymorphism");
//     }
// }

// /**
//  * A17_finalpolymorphism
//  */
// class A17_finalpolymorphism extends InnerA17_finalpolymorphism
//     public static void main(String[] args)
//     {
//         new A17_finalpolymorphism().height1();
//     }
// }
