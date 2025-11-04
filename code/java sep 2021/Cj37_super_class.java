// core java - super 
// super keyword in java is a reference variable which is used to refer immediate class object

// class variable
// class method
// class constructor











































// /**
//  * InnerCj37_super_class
//  */
// class InnerCj37_super_class
// {
//     String color="red";
// }

// /**
//  * InnerCj37_super_class_1
//  */
// class InnerCj37_super_class_1 extends InnerCj37_super_class
// {
//     String color="green";
//     void myfun1()
//     {
//         System.out.println(color);//this class
//         System.out.println(super.color);// pre class
        
//     }
// }

// /**
//  * Cj37_super_class
//  */
// public class Cj37_super_class
// {
//     public static void main(String[] args)
//     {
//         InnerCj37_super_class_1 icj37_1_1 = new InnerCj37_super_class_1();
//         icj37_1_1.myfun1();
//     }
// }



































































// /**
//  * InnerCj37_super_class
//  */
// class InnerCj37_super_class
// {
//     void color()
//     {
//         System.out.println("this is red color");
//     }
// }

// /**
//  * InnerCj37_super_class_1
//  */
// class InnerCj37_super_class_1 extends InnerCj37_super_class
// {
//     void color()
//     {
//         System.out.println("this is green color");
//     }
//     void myfun1()
//     {
//         System.out.println("this is my function");
//     }
//     void work()
//     {
//         color();
//         myfun1();
//         super.color();
//     }

// }

// /**
//  * Cj37_super_class
//  */
// public class Cj37_super_class
// {
//     public static void main(String[] args)
//     {
//         InnerCj37_super_class_1 icj37_1_1 = new InnerCj37_super_class_1();
//         icj37_1_1.work();
//     }
// }
























































/**
 * InnerCj37_super_class
 */
class InnerCj37_super_class
{
    InnerCj37_super_class()
    {
        System.out.println("this is red color");
    }
}

/**
 * InnerCj37_super_class_1
 */
class InnerCj37_super_class_1 extends InnerCj37_super_class
{
    InnerCj37_super_class_1()
    {
        super();
        System.out.println("this is green color");
    }
    
}

/**
 * Cj37_super_class
 */
public class Cj37_super_class
{
    public static void main(String[] args)
    {
        new InnerCj37_super_class_1();
        
    }
}
