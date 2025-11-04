// runtime polymorphism



// class Student
// {
//     void marks()
//     {
//         System.out.print("total marks is :- 499");
//     }
// }
// /**
//  * Student2
//  */
// class Student2 extends Student
// {
//     void marks()
//     {
//         System.out.print("total marks is :- 400");
//     }
// }
// /**
//  * CJ30_polymorphism5_runtime
//  */
// public class CJ30_polymorphism5_runtime
// {
//     public static void main(String[] args)
//     {
//         Student s1= new Student2();
//         s1.marks();    
//     }
// }












// /**
//  * loan
//  */
// class loan
// {
//     int roi()
//     {
//         return 5;
//     }
// }

// /**
//  * edu
//  */
// class edu extends loan
// {
//     int roi()
//     {
//         return 3;
//     }
// }

// /**
//  * home
//  */
// class home extends loan
// {
//     int roi()
//     {
//         return 8;
//     }
// }
// /**
//  * car
//  */
// class car extends loan
// {
//     int roi()
//     {
//         return 11;
//     }
// }

// /**
//  * CJ30_polymorphism5_runtime
//  */
// public class CJ30_polymorphism5_runtime
// {
//     public static void main(String[] args)
//     {
//         loan l1;
//         l1=new edu();
//         System.out.println("edu loan rate of interest is:- "+l1.roi()+"%");
//         l1=new home();
//         System.out.println("home loan rate of interest is:- "+l1.roi()+"%");
//         l1=new car();
//         System.out.println("car loan rate of interest is:- "+l1.roi()+"%");
        
//     }
    
// }














// /**
//  * loan
//  */
// class loan
// {
//     int roi=5;
// }

// /**
//  * edu
//  */
// class edu extends loan
// {
//     int roi=3;
// }

// /**
//  * home
//  */
// class home extends loan
// {
//     int roi=8;
// }
// /**
//  * car
//  */
// class car extends loan
// {
//     int roi=11;
// }

// /**
//  * CJ30_polymorphism5_runtime
//  */
// public class CJ30_polymorphism5_runtime
// {
//     public static void main(String[] args)
//     {
//         loan l1;
//         l1=new edu();
//         System.out.println("edu loan rate of interest is:- "+l1.roi+"%");
//         l1=new home();
//         System.out.println("home loan rate of interest is:- "+l1.roi+"%");
//         l1=new car();
//         System.out.println("car loan rate of interest is:- "+l1.roi+"%");
//     }
// }














/**
 * loan
 */
class loan
{
    int roi=5;
}

/**
 * edu
 */
class edu extends loan
{
    int roi=3;
}

/**
 * home
 */
class home extends loan
{
    int roi=8;
}
/**
 * car
 */
class car extends loan
{
    int roi=11;
}

/**
 * CJ30_polymorphism5_runtime
 */
public class CJ30_polymorphism5_runtime
{
    public static void main(String[] args)
    {
        loan l1,l2,l3;
        l1=new edu();
        System.out.println("edu loan rate of interest is:- "+l1.roi+"%");
        l2=new home();
        System.out.println("home loan rate of interest is:- "+l2.roi+"%");
        l3=new car();
        System.out.println("car loan rate of interest is:- "+l3.roi+"%");
    }
}
