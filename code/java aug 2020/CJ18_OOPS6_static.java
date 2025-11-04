// what is static keyword in java?
// static keyword is used for memory management in java(mainly)
// and we can also apply this static keyword with variables, method(function), class and blocks nested works.



// public class CJ18_OOPS6_static
// {
//     String uname="kamal";
//     int age=20;
//     static String lname="nain";

//     CJ18_OOPS6_static(int a, String un)
//     {
//         age=a;
//         uname=un;
//     }
//     void show()
//     {
//         System.out.println(uname+ " "+lname+" "+age);
//     }
    
//     public static void main(String[] args)
//     {
//         CJ18_OOPS6_static cj18_1=new CJ18_OOPS6_static(40, "k");   
//         cj18_1.show();
//     }
// }











// /**
//  * InnerCJ18_OOPS6_static
// */
// class InnerCJ18_OOPS6_static
// {

//     String uname="kamal";
//     int age=20;
//     static String lname="nain";

//     InnerCJ18_OOPS6_static(int a, String un)
//     {
//         age=a;
//         uname=un;
//     }

//     void show()
//     {
//         System.out.println(uname+ " "+lname+" "+age);
//     }
// }


//  public class CJ18_OOPS6_static
// {
//     public static void main(String[] args)
//     {
//         InnerCJ18_OOPS6_static cj18_1=new InnerCJ18_OOPS6_static(40, "k");   
//         cj18_1.show();
//         InnerCJ18_OOPS6_static cj18_2=new InnerCJ18_OOPS6_static(80, "kn");   
//         cj18_2.show();
        
//     }
// }











// /**
//  * CJ18_OOPS6_static
//  */
// public class CJ18_OOPS6_static
// {
//     int value=1;

//     CJ18_OOPS6_static()
//     {
//         System.out.println(value);
//         value++;//value =value +1   value=1+1   value =2
//     }
// public static void main(String[] args)
// {
//     CJ18_OOPS6_static cj18_1= new CJ18_OOPS6_static(); 
//     CJ18_OOPS6_static cj18_2= new CJ18_OOPS6_static(); 
//     CJ18_OOPS6_static cj18_3= new CJ18_OOPS6_static(); 
       
// }
    
// }














// /**
//  * CJ18_OOPS6_static
//  */
// public class CJ18_OOPS6_static
// {
//     static    int value=1;

//     CJ18_OOPS6_static()
//     {
//         System.out.println(value);
//         value++;//value =value +1   value=1+1   value =2
//     }
// public static void main(String[] args)
// {
//     CJ18_OOPS6_static cj18_1= new CJ18_OOPS6_static(); 
//     CJ18_OOPS6_static cj18_2= new CJ18_OOPS6_static(); 
//     CJ18_OOPS6_static cj18_3= new CJ18_OOPS6_static(); 
       
// }
    
// }














// /**
//  * CJ18_OOPS6_static
//  */
// public class CJ18_OOPS6_static
// {
//     static    int square(int s)
//     {
//         return s*s;
//     }
//     public static void main(String[] args)
//     {
        
//         System.out.println(CJ18_OOPS6_static.square(10));    
//     }
// }





// /**
//  * CJ18_OOPS6_static
//  */
// public class CJ18_OOPS6_static
// {
//     {System.out.println("this is my block");}
//     public static void main(String[] args)
//     {
//         System.out.println("this is main.");
//     }
    
// }













/**
 * CJ18_OOPS6_static
 */
public class CJ18_OOPS6_static
{
    static    {System.out.println("this is my block");}
    public static void main(String[] args)
    {
        System.out.println("this is main.");
    }
    
}

