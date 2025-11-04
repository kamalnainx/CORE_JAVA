// what is method overloading?
// method overloading is use for or apply on multiple methods can have the same name but with different paeameters.

// public class CJ15_oops3_classobject_method_overloding
// {
//     static int total(int x, int y)
//     {
//         return x+y;
//     }
//     static double total(double x, double y)
//     {
//         return x*y;
//     }
    

//     public static void main(String[] args)
//     {
//         System.out.println("the total of x and y is "+total(4, 2));
//         System.out.println("the multi of x and y is "+total(4.4, 2.2));

//     }
// }







public class CJ15_oops3_classobject_method_overloding
{
    static int total(int x, int y)
    {
        return x+y;
    }
    static double total(double x, double y)
    {
        return x*y;
    }
    static void total(String name, double height, int age)
    {
        System.out.println("user name is "+name);
        System.out.println("user height is "+height);
        System.out.println("user age is "+age);
        
    }
    

    public static void main(String[] args)
    {
        System.out.println("the total of x and y is "+total(4, 2));
        System.out.println("the multi of x and y is "+total(4.4, 2.2));
        total("thekamalnain", 6.1, 29);
    }
}




// public class CJ15_oops3_classobject_method_overloding
// {
//     static int total(int x, int y)
//     {
//         return x+y;
//     }
//     static double total(double x, double y)
//     {
//         return x*y;
//     }
//     static void total(String name, double height, int age)
//     {
//         System.out.println("user name is "+name);
//         System.out.println("user height is "+height);
//         System.out.println("user age is "+age);
        
//     }
    

//     public static void main(String[] args)
//     {   
//         int sum=total(4,2);
//         System.out.println("the total of x and y is "+sum);

//         double multi=total(4.4,2.2);
//         System.out.println("the multi of x and y is "+multi);
//         total("thekamalnain", 6.1, 29);
//     }
// }






