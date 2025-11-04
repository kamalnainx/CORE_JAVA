// what is method ?
// method is a block of code which use and run only when it's/we called. 
// we can pass data as parameters or as info into a method
// methond main use is reuse code / define code single and use many times.





// public class CJ14_oops1_classobject_method
// {
//     static void nameset()
//     {
//         System.out.println("this is my first method(function) in core java.  ");
//     }
//     public static void main(String[] args)
//     {
//         nameset();    
//     }    
// }









// public class CJ14_oops1_classobject_method
// {
//     static void nameset()
//     {
//         System.out.println("this is my first method(function) in core java.  ");
//         System.out.println(" for ifelse switch array all kind of basic work we can do in method(function).");
//     }
//     public static void main(String[] args)
//     {
//         nameset();    
//         nameset();    
//         nameset();    
//     }    
// }






// public class CJ14_oops1_classobject_method
// {
//     static void nameset()
//     {
//         int i,j,k;
//         for(i=0;i<=10;i++)
//         {
//             System.out.print("**********");
//             for(j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(i=0;i<=10;i++)
//         {
//             System.out.print("**********");
//             for(j=i;j<=10;j++)
//             {
//                 System.out.print("*");
//             }   
//             System.out.println();
//         }
//     }
//     public static void main(String[] args)
//     {
//         nameset();     
//     }    
// }











// /**
//  * CJ14_oops1_classobject_method
//  */
// public class CJ14_oops1_classobject_method
// {
//     static void myfun(String fname)
//     {
//         System.out.println("user name is "+fname);
//     }

//     public static void main(String[] args)
//     {
//         myfun("thekamalnain");    
//     }
// }










// /**
//  * CJ14_oops1_classobject_method
//  */
// public class CJ14_oops1_classobject_method
// {
//     static void myfun(String fname, String mname, String lname)
//     {
//         System.out.println("user name is "+fname+" "+mname+" "+lname);
//     }

//     public static void main(String[] args)
//     {
//         myfun("the","kamal","nain");    
//     }
// }










// /**
//  * CJ14_oops1_classobject_method
//  */
// public class CJ14_oops1_classobject_method
// {
//     static void myfun(String fname, int age, float height)
//     {
//         System.out.println("user name is "+fname);
//         System.out.println("user age is "+age);
//         System.out.println("user height is "+height);
//     }

//     public static void main(String[] args)
//     {
//         myfun("the kamal nain",29,6.1f);    
//     }
// }













// /**
//  * CJ14_oops1_classobject_method
//  */
// public class CJ14_oops1_classobject_method
// {
//     static void myfun(String fname, int age, float height)
//     {
//         System.out.println("user name is "+fname);
//         System.out.println("user age is "+age);
//         System.out.println("user height is "+height);
//     }

//     public static void main(String[] args)
//     {
//         myfun("the kamal nain",29,6.1f);    
//         myfun("kamal nain",9,6f);    
//         myfun("kamal",2,1.1f);    
//     }
// }











// /**
//  * CJ14_oops1_classobject_method
//  */
// public class CJ14_oops1_classobject_method
// {
//     static int myfun(int age)
//     {
//         return age;
//     }

//     public static void main(String[] args)
//     {
//         System.out.println(myfun(29));     
//         System.out.println(myfun(92));     
//         System.out.println(myfun(11));     
//     }

// }












// /**
//  * CJ14_oops1_classobject_method
//  */
// public class CJ14_oops1_classobject_method
// {
//     static int square(int var1)
//     {
//         return var1*var1;
//     }

//     public static void main(String[] args)
//     {
//         System.out.println(square(29));     
//         System.out.println(square(92));     
//         System.out.println(square(11));     
//     }
// }













// /**
//  * CJ14_oops1_classobject_method
//  */
// public class CJ14_oops1_classobject_method
// {
//     static int cube(int var1)
//     {
//         return var1*var1*var1;
//     }

//     public static void main(String[] args)
//     {
//         System.out.println("the cube is:"+cube(29));     
//         System.out.println("the cube is:"+cube(92));     
//         System.out.println("the cube is:"+cube(11));     
//     }
// }













// /**
//  * CJ14_oops1_classobject_method
//  */
// public class CJ14_oops1_classobject_method
// {
//     static int area(int height , int width)
//     {
//         return height*width;
//     }

//     public static void main(String[] args)
//     {
//         System.out.println("the area of height and width is:"+area(2,9));
//     }
// }










/**
 * CJ14_oops1_classobject_method
 */
public class CJ14_oops1_classobject_method
{
    static int area(int height , int width)
    {
        return height*width;
    }

    public static void main(String[] args)
    {
        int final1=area(2,9);
        System.out.println("the area of height and width is:"+final1);
    }
}
