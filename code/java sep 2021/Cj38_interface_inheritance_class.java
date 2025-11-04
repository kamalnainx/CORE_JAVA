// /**
//  * InnerCj38_interface_inheritance_class
//  */
// interface InnerCj38_interface_inheritance_class
// {
//     void show();
// }
// /**
//  * Cj38_interface_inheritance_class
//  */
// public class Cj38_interface_inheritance_class implements InnerCj38_interface_inheritance_class
// {
//     public void show()
//     {
//         System.out.println("this is interface method");    
//     }
//     public static void main(String[] args)
//     {
//         Cj38_interface_inheritance_class cj38_1 = new Cj38_interface_inheritance_class();
//         cj38_1.show();
//     }
// }



























// /**
//  * InnerCj38_interface_inheritance_class
//  */
// interface InnerCj38_interface_inheritance_class
// {
//     void show();
// }
// /**
//  * InnerCj38_interface_inheritance_class_1
//  */
// class InnerCj38_interface_inheritance_class_1 implements InnerCj38_interface_inheritance_class
// {
//     public void show()
//     {
//         System.out.println("this is interface method show by inner class");    
//     }    
// }
// /**
//  * Cj38_interface_inheritance_class
//  */
// public class Cj38_interface_inheritance_class implements InnerCj38_interface_inheritance_class
// {
//     public void show()
//     {
//         System.out.println("this is interface method show by main class");    
//     }
//     public static void main(String[] args)
//     {
//         Cj38_interface_inheritance_class cj38_1 = new Cj38_interface_inheritance_class();
//         cj38_1.show();
        
//         InnerCj38_interface_inheritance_class_1 icj38_1_1 = new InnerCj38_interface_inheritance_class_1();
//         icj38_1_1.show();
//     }
// }

































































/**
 * InnerCj38_interface_inheritance_class
 */
interface InnerCj38_interface_inheritance_class
{
    void show();
}
/**
 * InnerCj38_interface_inheritance_class_2
 */
interface InnerCj38_interface_inheritance_class_2
{
    void show2();
}
/**
 * InnerCj38_interface_inheritance_class_1
 */
class InnerCj38_interface_inheritance_class_1 implements InnerCj38_interface_inheritance_class, InnerCj38_interface_inheritance_class_2
{
    public void show()
    {
        System.out.println("this is interface method show by inner class from show 1 method ");    
    }
    public void show2()
    {
        System.out.println("this is interface method show by inner class from show 2 method ");    
    }
        
}

/**
 * Cj38_interface_inheritance_class
 */
public class Cj38_interface_inheritance_class implements InnerCj38_interface_inheritance_class
{
    public void show()
    {
        System.out.println("this is interface method show by main class");    
    }
    public static void main(String[] args)
    {
        Cj38_interface_inheritance_class cj38_1 = new Cj38_interface_inheritance_class();
        cj38_1.show();
        
        InnerCj38_interface_inheritance_class_1 icj38_1_1 = new InnerCj38_interface_inheritance_class_1();
        icj38_1_1.show();
        icj38_1_1.show2();
    }
}
