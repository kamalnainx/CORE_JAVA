// /**
//  * cj17_class
//  */
// public class cj17_class {

//     public static void main(String[] args) {
//         int i=10;
//         System.out.println(i);
//     }
// }







































// /**
//  * cj17_class
//  */
// public class cj17_class
// {
//     int i=10;
//     public static void main(String[] args)
//     {
//         cj17_class cj17c_1 =new cj17_class();
//         System.out.println(cj17c_1.i);
        
//     }
// }





































// /**
//  * cj17_class
//  */
// public class cj17_class
// {
//     int i=10;
//     public static void main(String[] args)
//     {
//         cj17_class cj17c_1 =new cj17_class();
//         cj17_class cj17c_2 =new cj17_class();

//         System.out.println("this is object 1 "+cj17c_1.i);
//         System.out.println("this is object 2 "+cj17c_2.i);
        
//     }
// }


































/**
 * Innercj17_class
 */
class Innercj17_class
{
    int i=10;
}
/**
 * cj17_class
 */
public class cj17_class
{

    public static void main(String[] args)
    {
        Innercj17_class icj17c_1 =new Innercj17_class();
        Innercj17_class icj17c_2 =new Innercj17_class();

        System.out.println("this is object 1 "+(icj17c_1.i+icj17c_1.i));
        System.out.println("this is object 2 "+icj17c_2.i*icj17c_2.i);
        
    }
}

