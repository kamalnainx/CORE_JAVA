// scope?
// in java we can not access variables inside the region they are work by created. this is called scope.
// method of scope vaiables declared directly inside a method are avilable anywhere in the method following the line of code in which they were declared.

// /**
//  * Cj20_scope
//  */
// public class Cj20_scope
// {
//     public static void main(String[] args)
//     {
        
//         int x=10;
//         System.out.println(x);    
//     }
    
// }
































// /**
//  * Cj20_scope
//  */
// public class Cj20_scope
// {
//     public static void main(String[] args)
//     {
        
//         int x=10;
//         System.out.println(x);    
//         {
//             System.out.println(x);    
//         }
//     }
    
// }


































// /**
//  * Cj20_scope
//  */
// public class Cj20_scope
// {
//     public static void main(String[] args)
//     {
//         {
//             int x=10;
//             System.out.println(x);
//         }
//         System.out.println(x); //error block of code for x not alow to work.   
//     }
// }




































// /**
//  * Cj20_scope
//  */
// public class Cj20_scope
// {
//     public static void main(String[] args)
//     {
//         int x=1;
//         {
//             int y=2;
//             System.out.println("the total of x and y "+(x+y));
//         }       
//     }
    
// }



































// /**
//  * Cj20_scope
//  */
// public class Cj20_scope
// {
//     public static void main(String[] args)
//     {
//         int x=1;
//         {
//             int y=2;
//             System.out.println("the total of x and y "+(x+y));
//             x=10;
//             y=20;
//             System.out.println("the total of x and y "+(x+y));
//         }       
//     }
// }

































// /**
//  * Cj20_scope
//  */
// public class Cj20_scope
// {
//     public static void main(String[] args)
//     {
//         int x=1;
//         {
//             int y=2;
//             System.out.println("the total of x and y "+(x+y));
//             x=10;
//             y=20;
//             System.out.println("the total of x and y "+(x+y));
//         }       
//         x=100;
//         y=200;//error
//     }
// }































/**
 * Cj20_scope
 */
public class Cj20_scope//class
{
    public String unamec;//variable

    public Cj20_scope(String name)//constructor
    {
        unamec=name;
        System.out.println("constructor name"+name);
        System.out.println("constructor unamec"+unamec);
        
    }

    public void myfun1()
    {
        System.out.println("function"+unamec);
    }

    static void myfun1(String uname)
    {
        System.out.println(uname);
    }
    public static void main(String[] args)
    {
        myfun1("user name");
        Cj20_scope cj20s_1 = new Cj20_scope("kamal nain");
        cj20s_1.myfun1();
    }
    
}

