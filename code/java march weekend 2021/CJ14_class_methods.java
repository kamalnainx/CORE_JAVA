// /**
//  * CJ14_class_methods
//  */
// public class CJ14_class_methods {

//     static void myfun1()
//     {
//         System.out.println("my function 1");
//     }
//     public void pm1()
//     {
//         System.out.println("my public method 1");
//     }
//     public static void main(String[] args) {
//         myfun1();
//         CJ14_class_methods cj14_1 = new CJ14_class_methods();
//         cj14_1.pm1();
//     }
// }















// /**
//  * CJ14_class_methods
//  */
// public class CJ14_class_methods {

//     static void myfun1()
//     {
//         System.out.println("my function 1");
//     }
//     public void pm1()
//     {
//         System.out.println("my public method 1 ");
//     }
//     public void pm1(int num)
//     {
//         System.out.println("user number value is "+num);
//     }
//     public static void main(String[] args) {
//         myfun1();
//         CJ14_class_methods cj14_1 = new CJ14_class_methods();
//         cj14_1.pm1();
//         cj14_1.pm1(10);
//     }
// }





















/**
 * InnerCJ14_class_methods
 */
class mymainclass
{
    public void name1()
    {
        System.out.println("my main class method .");    
    }
    public void name1(int num)
    {
        System.out.println("my main class method . "+num);    
    }
    
}
/**
 * CJ14_class_methods
 */
public class CJ14_class_methods {

    static void myfun1()
    {
        System.out.println("my function 1");
    }
    public void pm1()
    {
        System.out.println("my public method 1 ");
    }
    public void pm1(int num)
    {
        System.out.println("user number value is "+num);
    }
    public static void main(String[] args) {
        myfun1();
        CJ14_class_methods cj14_1 = new CJ14_class_methods();
        cj14_1.pm1();
        cj14_1.pm1(10);

        mymainclass obj1=new mymainclass();
        obj1.name1();
        obj1.name1(30);
          
    }
}
