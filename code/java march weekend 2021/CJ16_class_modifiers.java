// /**
//  * CJ16_class_modifiers
//  */
// public class CJ16_class_modifiers
// {
//     int x=10;
//     double d=123.321;
//     public static void main(String[] args)
//     {
//         CJ16_class_modifiers cj16_1 = new CJ16_class_modifiers();
//         System.out.println(cj16_1.x);
//         System.out.println(cj16_1.d);
//         cj16_1. x=20;
//         cj16_1. d=246.321;
//         System.out.println(cj16_1.x);
//         System.out.println(cj16_1.d); 
//     }
// }





















// /**
//  * CJ16_class_modifiers
//  */
// public class CJ16_class_modifiers
// {
//     final int x=10;
//     final double d=123.321;
//     public static void main(String[] args)
//     {
//         CJ16_class_modifiers cj16_1 = new CJ16_class_modifiers();
//         System.out.println(cj16_1.x);
//         System.out.println(cj16_1.d);
//         cj16_1. x=20;
//         cj16_1. d=246.321;
//         System.out.println(cj16_1.x);
//         System.out.println(cj16_1.d); 
//     }
// }























// /**
//  * CJ16_class_modifiers
//  */
// public class CJ16_class_modifiers
// {
//     int x=10;
//     double d=123.321;
//     static void svm1()
//     {
//         System.out.println("this is static void method");
//     }
    
//     public void pvm1()
//     {
//         System.out.println("this is public void method");
//     }
    
//     public static void main(String[] args)
//     {
//         svm1();
//         // pvm1();
//         CJ16_class_modifiers cj16_1 = new CJ16_class_modifiers();
//         // cj16_1.svm1();
//         cj16_1.pvm1();
    
//     }
// }





















/**
 * InnerCJ16_class_modifiers
 */
abstract class InnerCJ16_class_modifiers
{
    public String uname ="kamalnain";
    public int    age   =30;
    // public void pvm1();//error
    public abstract void pavm1();//okay
}

/**
 * InnerCJ16_class_modifiers_1
 */
class InnerCJ16_class_modifiers_1 extends InnerCJ16_class_modifiers
{
    public void pavm1()
    {
        System.out.println("this is public abstract void method one.");    
    }
    
}
/**
 * CJ16_class_modifiers
 */
public class CJ16_class_modifiers {

    public static void main(String[] args)
    {
        InnerCJ16_class_modifiers_1 icj16m_1= new InnerCJ16_class_modifiers_1();
        System.out.println(icj16m_1.uname);
        System.out.println(icj16m_1.age);
        icj16m_1.pavm1();
        
                   
    }
}