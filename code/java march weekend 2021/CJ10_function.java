// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static void fun1()
//     {
//         System.out.println("hello world");    
//     }

//     public static void main(String[] args)
//     {
//         fun1(); //calling of your fun1() method
//     }
// }















// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static void fun1()
//     {
//         int i=10;
//         System.out.println("hello world "+ i);    
//     }    

//     public static void main(String[] args)
//     {
//         fun1(); //calling of your fun1() method
//         fun1(); //calling of your fun1() method
//         fun1(); //calling of your fun1() method
//     }
// }











// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static void fun1(int i)
//     {
//         System.out.println("hello world "+ i);    
//     }    

//     public static void main(String[] args)
//     {
//         fun1(10); //calling of your fun1() method
//     }
// }










// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static void fun1(String i)
//     {
//         System.out.println("hello world "+ i);    
//     }    

//     public static void main(String[] args)
//     {
//         fun1("ten"); //calling of your fun1() method
//     }
// }










// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static void fun1(String i)
//     {
//         System.out.println("hello world "+ i);    
//     }    

//     public static void main(String[] args)
//     {
//         fun1("ten"); //calling of your fun1() method
//         fun1("six"); //calling of your fun1() method
//         fun1("one"); //calling of your fun1() method
//     }
// }













// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static void fun1(String i, String j) //function_name(int ,String)=prameters function
//     {
//         System.out.println(i+" "+ j);    
//     }    

//     public static void main(String[] args)
//     {
//         fun1("kamal ","nain"); //calling of your fun1() method
//         fun1("monika" ,"kumari"); //calling of your fun1() method
//         fun1("radhika ","sharma"); //calling of your fun1() method
//     }
// }













// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static void fun1(String i, String j, int age)
//     {
//         System.out.println(i+" "+ j+" "+age);    
//     }    

//     public static void main(String[] args)
//     {
//         fun1("kamal ","nain",30); //calling of your fun1() method
//         fun1("monika" ,"kumari",20); //calling of your fun1() method
//         fun1("radhika ","sharma",20); //calling of your fun1() method
//     }
// }













// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static void fun1(int i,int j)
//     {
//         int z=i*j;
//         System.out.println("the z value is :- "+z);    
//     }    
//     public static void main(String[] args)
//     {
//         fun1(10,20);
//     }
// }















// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static int fun1(int i,int j)
//     {
//         return i*j;
//     }    
//     public static void main(String[] args)
//     {
//         fun1(10,20);
//     }
// }
















// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static int fun1(int i,int j)
//     {
//         return i*j;
//     }    
//     public static void main(String[] args)
//     {
//         int z=fun1(10,20);
//         System.out.println(z);
        
//     }
// }














// /**
//  * CJ10_function
//  */
// public class CJ10_function
// {
//     static int fun1(int i)
//     {
//         return i;
//     }    
//     static int fun1(int i,int j)
//     {
//         return i*j;
//     }    
//     static int fun1(int i,int j,int z)
//     {
//         return i+j+z;
//     }    
//     public static void main(String[] args)
//     {
//         int z=fun1(10,20,30);
//         System.out.println(z);
        
//     }
// }
















// /**
//  * CJ10_function
//  */
// public class CJ10_function {

//     public static int sum(int k)
//     {   
//         if(k>=1)
//         {
//             return k*sum(k-1);
//         }
//         else
//         {
//             return 1;
//         }
//     }
//     public static void main(String[] args)
//     {
//         int result=sum(5);
//         System.out.println(result);
//     }
// }



















// /**
//  * CJ10_function
//  */
// public class CJ10_function {

//     public static int sum(int start, int end)
//     {   
//         if(end>start)
//         {
//             return end+sum(start,end-1);
//         }
//         else
//         {
//             return end;
//         }
//     }
//     public static void main(String[] args)
//     {
//         int result=sum(5,10);
//         System.out.println(result);
//     }
// }
