// variables 

// types of variables
// 1. local variable= it's declared inside the body od methed and class and we can call loacl.
// Note:- loacl variable cannot be defind in ot with static keyword.

// 2. instance variable=it's declared inside of class but outside the body of method
// Note:-  instance variable cannot be defind in ot with static keyword.

// 3. static variable = it's declared as static and its not be use as loacl and instance .memory allocation for ststic variable happens only once when class is loaded memory.


// /**
//  * cj2_var
//  */
// public class cj2_var
// {
//     public static void main(String[] args)
//     {
//      int data1=5;
//      System.out.println(data1);    
//     }

    
// }


// /**
//  * cj2_var
//  */
// public class cj2_var
// {
//     public static void main(String[] args)
//     {
//         int a = 5;
//         int b = 10;
//         int sum=0;
//         sum=a+b;
//         System.out.print("the total of a and b is =");
//         System.out.println(sum);
//     }
// }







// /**
//  * cj2_var
//  */
// public class cj2_var
// {
//     public static void main(String[] args)
//     {
//         int a = 5, b= 10, sum=a+b;
//         System.out.print("the total of a and b is ="+sum);
//     }
// }




// /**
//  * cj2_var
//  */
// public class cj2_var {

//     public static void main(String[] args) {
//         int i =10;
//         float f = i;

//         System.out.println("int var "+i);
//         System.out.println("int var "+f);
        

//     }
// }










// /**
//  * cj2_var
//  */
// public class cj2_var {

//     public static void main(String[] args) {
//         int i =10;
//         float f = i;
//         int newint=(int)f;
//         System.out.println("int var "+i);
//         System.out.println("int var "+f);
//         System.out.println("new int value is "+newint);
        

//     }
// }














// /**
//  * cj2_var
//  */
// public class cj2_var {

//     public static void main(String[] args) {
//         float f = 10.10f;
//         int newint=(int)f;
//         System.out.println("float var "+f);
//         System.out.println("new int value is "+newint);
//     }
// }








// /**
//  * cj2_var
//  */
// public class cj2_var {

//     public static void main(String[] args)
//     {
//         float f = 786.10f;
//         int newint=(int)f;
//         byte b=(byte)newint;
//         System.out.println("float var "+f);
//         System.out.println("new int value is "+newint);
//         System.out.println("byte value is "+b);
        
//     }
// }














/**
 * cj2_var
 */
public class cj2_var {

    public static void main(String[] args)
    {
        byte x=10;
        byte y=10;
        byte b=(byte)(x+y);
        
        System.out.println("byte value is "+b);
        
    }
}
