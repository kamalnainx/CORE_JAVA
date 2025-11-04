/**
 * Innerinterface1
 */
/*
public interface Innerinterface1
{
    //declare constant var/fields/key
    //declare methods/function as abstract    
}





*/
//call/define

/*
class-class
interface to class
interface-interface
*/

// /**
//  * Innerinterface1 interface
//  */
// interface Innerinterface1
// {
//     void name1();
// }
// /**
//  * interface1 class
//  */
// class interface1 implements Innerinterface1 
// {
//     public void name1()
//     {
//         System.out.println("interface caliing class");
//     }  
//     public static void main(String[] args)
//     {
//         interface1 if1=new interface1();
//         if1.name1();
//     } 
// }





// interface Innerinterface1
// {
//     void name1();
// }

// class interface2 implements Innerinterface1
// {
//     public void name1()
//     {
//         System.out.println("this in interface2 class with innerinterface1");    
//     }
// }

// class interface1 implements Innerinterface1 
// {
//     public void name1()
//     {
//         System.out.println("interface caliing class");
//     }  
//     public static void main(String[] args)
//     {
//         interface1 if1=new interface1();
//         if1.name1();
//         interface2 if2=new interface2();
//         if2.name1();
//     } 
// }





// interface Innerinterface1
// {
//     void name1();
// }

// class interface2 implements Innerinterface1
// {
//     public void name1()
//     {
//         System.out.println("this in interface2 class with innerinterface1");    
//     }
// }

// class interface3 implements Innerinterface1
// {
//     public void name1()
//     {
//         System.out.println("this in interface3 class with innerinterface1");    
//     }
// }

// class interface1 implements Innerinterface1 
// {
//     public void name1()
//     {
//         System.out.println("interface caliing class");
//     }  
//     public static void main(String[] args)
//     {
//         interface1 if1=new interface1();
//         if1.name1();
//         interface2 if2=new interface2();
//         if2.name1();
//         interface3 if3=new interface3();
//         if3.name1();
//     } 
// }




// interface Innerinterface1
// {
//     float height();
// }

// class interface2 implements Innerinterface1
// {
//     public float height()
//     {
//         System.out.println("this in interface2 class with innerinterface1");
//         return 6.1f;    
//     }
// }

// class interface3 implements Innerinterface1
// {
//     public float height()
//     {
//         System.out.println("this in interface3 class with innerinterface1");    
//         return 1.6F;
//     }
// }

// class interface1 
// {
//     public void name1()
//     {
//         System.out.println("interface caliing class");
//     }  
//     public static void main(String[] args)
//     {
//         interface1 if1=new interface1();
//         if1.name1();
//         interface2 if2=new interface2();
//         if2.height();
//         System.out.println(if2.height());
        
//         interface3 if3=new interface3();
//         if3.height();
//         System.out.println(if3.height());
//     } 
// }





// interface face1
// {
//     void print();
// }

// interface face2 
// {
//     void Print();
    
// }

// class interface1 implements face1, face2
// {
//     public void print(){ System.out.println("this is print from face1"); }
//     public void Print(){ System.out.println("this is Print from face2"); }    
//     public static void main(String[] args)
//     {
//         interface1 obj=new interface1();
//         obj.print();
//         obj.Print();
//     }    
// }






// interface face1
// {
//     void print();
// }

// interface face2 
// {
//     void print();
// }

// class interface1 implements face1, face2
// {
//     // public void print(){ System.out.println("this is print from face1"); }
//     public void print(){ System.out.println("this is Print from face2"); }    
//     public static void main(String[] args)
//     {
//         interface1 obj=new interface1();
//         obj.print();
//         obj.print();
//     }
// }





// interface face1
// {
//     void print1();
// }

// interface face2 
// {
//     void print2();
// }

// class joinclass implements face1, face2
// {
//     public void print1() 
//     {
//         System.out.println("print function");  
//     }
//     public void print2() 
//     {
//         System.out.println("print function");  
//     }
    
// }
// class interface1 
// {
//     public static void main(String[] args)
//     {
//         joinclass obj=new joinclass();
//         obj.print1();
//         obj.print2();
//     }
// }




// interface face1
// {
//     void print1();
// }

// interface face2 
// {
//     void print2();
// }

// class joinclass implements face1, face2
// {
//     public void print1() 
//     {
//         System.out.println("print function");  
//     }
//     public void print2() 
//     {
//         System.out.println("print function");  
//     }
    
// }
// class interface1 extends joinclass
// {
//     public static void main(String[] args)
//     {
//         interface1 obj=new interface1();
//         obj.print1();
//         obj.print2();
//     }
// }




// interface face1
// {
//     void print1();
// }

// interface face2 extends face1
// {
//     void print2();
// }

// class joinclass implements face2
// {
//     public void print1() 
//     {
//         System.out.println("print function");  
//     }
//     public void print2() 
//     {
//         System.out.println("print function");  
//     }
    
// }
// class interface1 extends joinclass
// {
//     public static void main(String[] args)
//     {
//         interface1 obj=new interface1();
//         obj.print1();
//         obj.print2();
//     }
// }





// interface if1
// {
//     void print();
//     default void def()
//     {
//         System.out.println("this is my default interface function");
//     }
// }

// /**
//  * interface1
//  */
// class interface1 implements if1
// {
//     public void print()
//     {
//         System.out.println("print function.");
//      }
//     public static void main(String[] args)
//     {
//         interface1 f1=new interface1();
//         f1.print();
//         f1.def();
//     }
    
// }




// interface if1
// {
//     void print();
//     default void def()
//     {
//         System.out.println("this is my default interface function");
//     }
// }

// class class1 implements if1
// {
//     public void print()
//     {
//         System.out.println("print function.");
//     }
// }
// class interface1 extends class1
// {
//     public static void main(String[] args)
//     {
//         interface1 f1=new interface1();
//         f1.print();
//         f1.def();
//     }
    
// }





// interface shape1
// {
//     void draw();
//     static int cube(int x)
//     {
//         return x*x*x;
//     }
// }

// class Shape implements shape1
// {
//     public void draw()
//     {
//         System.out.println("the size of qube is:");    
//     }
// }

// class interface1 
// {
//     public static void main(String[] args) {
//         shape1 s = new Shape();
//         s.draw();
//         System.out.println(shape1.cube(6));
//     }
// }
