// /**
//  * CJ12_class_object
//  */
// public class CJ12_class_object
// {
//     int x=5;
//     public static void main(String[] args)
//     {
//         CJ12_class_object obj1=new CJ12_class_object();

//         System.out.println(obj1.x);    
//     }
// }
















// /**
//  * CJ12_class_object
//  */
// public class CJ12_class_object
// {
//     int x=5;
//     public static void main(String[] args)
//     {
//         CJ12_class_object obj1=new CJ12_class_object();
//         CJ12_class_object obj2=new CJ12_class_object();

//         System.out.println(obj1.x);    
//         System.out.println(obj1.x);    
//         System.out.println(obj2.x);    
        
//     }
// }













/**
 * InnerCJ12_class_object
 */
class InnerCJ12_class_object
{
    int x=5;
}
/**
 * CJ12_class_object
 */
public class CJ12_class_object
{
    public static void main(String[] args) {
        InnerCJ12_class_object icj12co= new InnerCJ12_class_object();
        System.out.println(icj12co.x);
    }
    
}