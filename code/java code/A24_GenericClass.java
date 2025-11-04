// /**
//  * A24_GenericClass
//  */
// public class A24_GenericClass<T>
// {
//     private T t;
    
//     public void setname(T t)
//     {
//         this.t=t;    
//     }

//     public T getname()
//     {
//         return t;    
//     }

//     public static void main(String[] args)
//     {
//         A24_GenericClass<Integer> A24_gc = new A24_GenericClass<Integer>();
//         A24_gc.setname(10);
//         System.out.println(A24_gc.getname());
//     }
    
// }









// /**
//  * A24_GenericClass
//  */
// public class A24_GenericClass<T>
// {
//     private T t;
    
//     public void setname(T t)
//     {
//         this.t=t;    
//     }

//     public T getname()
//     {
//         return t;    
//     }

//     public static void main(String[] args)
//     {
//         A24_GenericClass<String> A24_gc = new A24_GenericClass<String>();
//         A24_gc.setname("10");
//         System.out.println(A24_gc.getname());
//         A24_gc.setname("Ten");
//         System.out.println(A24_gc.getname());
        
//     }
    
// }







// /**
//  * A24_GenericClass
//  */
// public class A24_GenericClass<T>
// {
//     private T t;
    
//     public void setname(T t)
//     {
//         this.t=t;    
//     }

//     public T getname()
//     {
//         return t;    
//     }

//     public static void main(String[] args)
//     {
//         A24_GenericClass<Integer> A24_gci = new A24_GenericClass<Integer>();
//         A24_gci.setname(10);
//         System.out.println(A24_gci.getname());
//         A24_gci.setname(1010);
//         System.out.println(A24_gci.getname());
        
//         A24_GenericClass<String> A24_gcs = new A24_GenericClass<String>();
//         A24_gcs.setname("10");
//         System.out.println(A24_gcs.getname());
//         A24_gcs.setname("Ten");
//         System.out.println(A24_gcs.getname());
        
//     }    
// }







// /**
//  * A24_GenericClass
//  */
// public class A24_GenericClass
// {
//     public <M> M namevalue(M var1)
//     {
//           return var1;  
//     }

//     public static void main(String[] args)
//     {
//         A24_GenericClass A24_gc=new A24_GenericClass();
//         System.out.println("call of method as string value="+A24_gc.namevalue(" string value for my method or function"));
//     }
   
// }








// /**
//  * A24_GenericClass
//  */
// public class A24_GenericClass
// {
//     public <M> M namevalue(M var1)
//     {
//           return var1;  
//     }

//     public static void main(String[] args)
//     {
//         A24_GenericClass A24_gc=new A24_GenericClass();
//         System.out.println("call of method as string value="+A24_gc.namevalue(10));
//     }   
// }









// /**
//  * A24_GenericClass
//  */
// public class A24_GenericClass
// {
//     public <M> M namevalue(M var1)
//     {
//           return var1;  
//     }

//     public static void main(String[] args)
//     {
//         A24_GenericClass A24_gc=new A24_GenericClass();
//         System.out.println("call of method as string value="+A24_gc.namevalue(10.10));
//     }   
// }









// /**
//  * A24_GenericClass
//  */
// public class A24_GenericClass
// {
//     public <M> M namevalue(M var1)
//     {
//           return var1;  
//     }

//     public static void main(String[] args)
//     {
//         A24_GenericClass A24_gc=new A24_GenericClass();
//         System.out.println("call of method as string value="+A24_gc.namevalue(true));
//         System.out.println("call of method as string value="+A24_gc.namevalue(false));
        
//     }   
// }







/**
 * A24_GenericClass
 */
public class A24_GenericClass
{
    public <M> M namevalue(M var1)
    {
          return var1;  
    }

    public static void main(String[] args)
    {
        A24_GenericClass A24_gc=new A24_GenericClass();
        System.out.println("call of method as string value="+A24_gc.namevalue(10));
        System.out.println("call of method as string value="+A24_gc.namevalue(10.10));
        System.out.println("call of method as string value="+A24_gc.namevalue("10.10.10"));
        System.out.println("call of method as string value="+A24_gc.namevalue("string values"));
        System.out.println("call of method as string value="+A24_gc.namevalue(true));
        System.out.println("call of method as string value="+A24_gc.namevalue(false));
        
    }   
}
