// inner class
// inner class in java is a type of nested class its meain a class with in side a class.
// in java to access the inner class, create an object of the outer class, and then create an object of the inner class.






// /**
//  * Innercj23_inner_class
//  */
// class outercj23_inner_class
// {
//     int x=10;
    
// }
// /**
//  * cj23_inner_class
//  */
// public class cj23_inner_class
// {
//     public static void main(String[] args)
//     {
//         outercj23_inner_class ocj23_1 = new outercj23_inner_class();
//         System.out.println( ocj23_1.x);
//     }
    
// }




















// /**
//  * Innercj23_inner_class
//  */
// class outercj23_inner_class
// {
//     int x=10;
//     /**
//      * Innercj23_inner_class
//      */
//     class Innercj23_inner_class
//     {
//         int y=20;
//     }    
// }
// /**
//  * cj23_inner_class
//  */
// public class cj23_inner_class
// {
//     public static void main(String[] args)
//     {
//         outercj23_inner_class ocj23_1 = new outercj23_inner_class();
//         System.out.println( ocj23_1.x);
//         outercj23_inner_class.Innercj23_inner_class icj23_1 = ocj23_1.new Innercj23_inner_class();
//         System.out.println(icj23_1.y);
//     }
    
// }






















// /**
//  * Innercj23_inner_class
//  */
// class outercj23_inner_class
// {
//     int x=10;
//     /**
//      * Innercj23_inner_class
//      */
//     static class Innercj23_inner_class
//     {
//         int y=20;
//     }    
// }
// /**
//  * cj23_inner_class
//  */
// public class cj23_inner_class
// {
//     public static void main(String[] args)
//     {

//         outercj23_inner_class.Innercj23_inner_class icj23_1 = new outercj23_inner_class.Innercj23_inner_class();
//         System.out.println(icj23_1.y);
//     }    
// }
























/**
 * Innercj23_inner_class
 */
class outercj23_inner_class
{
    int x=10;
    /**
     * Innercj23_inner_class
     */
    class Innercj23_inner_class
    {
        int y=20;
        public int valueofx()
        {
            return x;    
        }
    }    
}
/**
 * cj23_inner_class
 */
public class cj23_inner_class
{
    public static void main(String[] args)
    {
        outercj23_inner_class ocj23_1 = new outercj23_inner_class();
        // System.out.println( ocj23_1.x);
        outercj23_inner_class.Innercj23_inner_class icj23_1 = ocj23_1.new Innercj23_inner_class();
        System.out.println(icj23_1.y);
        System.out.println(icj23_1.valueofx());
    }    
}
