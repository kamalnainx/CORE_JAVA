// /**
//  * InnerCJ22_interface
//  */
// interface InnerCJ22_interface {
//     public void username();
    
// }

// /**
//  * InnerCJ22_interface_1
//  */
// class InnerCJ22_interface_1 implements InnerCJ22_interface
// {
//     public void username()
//     {
//         System.out.println("the user name is kamalnain");
//     }
    
// }
// /**
//  * CJ22_interface
//  */
// public class CJ22_interface {

//     public static void main(String[] args)
//     {
//         System.out.println("hello world");
//         InnerCJ22_interface_1 icj22i1_1 = new InnerCJ22_interface_1();
//         icj22i1_1.username();
//     }
// }


















// /**
//  * InnerCJ22_interface
//  */
// interface InnerCJ22_interface {
//     public void username();
    
// }

// /**
//  * InnerCJ22_interface_1
//  */
// class InnerCJ22_interface_1 //implements InnerCJ22_interface
// {
//     public void username()
//     {
//         System.out.println("the user name is kamalnain");
//     }
    
// }
// /**
//  * CJ22_interface
//  */
// public class CJ22_interface {

//     public static void main(String[] args)
//     {
//         System.out.println("hello world");
//         InnerCJ22_interface_1 icj22i1_1 = new InnerCJ22_interface_1();
//         icj22i1_1.username();
//     }
// }



















/**
 * InnerCJ22_interface
 */
interface InnerCJ22_interface {
    public void username();
    
}

/**
 * InnerCJ22_interface_1
 */
interface InnerCJ22_interface_1
{
    public void age();
    
}

/**
 * InnerCJ22_interface_2
 */
class InnerCJ22_interface_2 implements InnerCJ22_interface, InnerCJ22_interface_1
{
    public void username()
    {
        System.out.println("the user name is kamalnain");
    }
    
    public void age()
    {
        System.out.println("the user age is 30");    
    }
}
/**
 * CJ22_interface
 */
public class CJ22_interface {

    public static void main(String[] args)
    {
        System.out.println("hello world");
        InnerCJ22_interface_2 icj22i2_1 = new InnerCJ22_interface_2();
        icj22i2_1.username();
        icj22i2_1.age();
    }
}