// /**
//  * A41_niojava
//  */
// public class A41_niojava
// {
//     public static void main(String[] args)
//     {
//         byte a=127;
//         System.out.println(a);
        
//         a++;
//         System.out.println(a);

//         a++;
//         System.out.println(a);


//     }
    
// }




abstract class Base
{
    abstract void fun();
}
class Derived extends Base
{
    void fun()
    {
        System.out.println("this is my derived class by base class");
    }
}

/**
 * A41_niojava
 */
public class A41_niojava
{
    public static void main(String[] args)
    {
        Base b=new Derived();
        b.fun();
    }
    
}