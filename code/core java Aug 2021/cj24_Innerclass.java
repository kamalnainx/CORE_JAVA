// /**
//  * outtercj24_Innerclass
//  */
// class outtercj24_Innerclass
// {
//     int i=10;
    
// }
// /**
//  * cj24_Innerclass
//  */
// public class cj24_Innerclass
// {
//     public static void main(String[] args) {
//         outtercj24_Innerclass ocj24_1 = new outtercj24_Innerclass();
//         System.out.println(ocj24_1.i);
//     }
    
// }






























// /**
//  * outtercj24_Innerclass
//  */
// class outtercj24_Innerclass
// {
//     int i=10;
    
//     /**
//      * Innercj24_Innerclass
//      */
//     public class Innercj24_Innerclass
//     {
//         int j=20;
//     }
// }
// /**
//  * cj24_Innerclass
//  */
// public class cj24_Innerclass
// {
//     public static void main(String[] args)
//     {
//         outtercj24_Innerclass ocj24_1 = new outtercj24_Innerclass();
//         System.out.println(ocj24_1.i);

//         outtercj24_Innerclass.Innercj24_Innerclass icj24_1 = ocj24_1.new Innercj24_Innerclass();
//         System.out.println(icj24_1.j);
//     }
    
// }




















// /**
//  * outtercj24_Innerclass
//  */
// class outtercj24_Innerclass
// {
//     int i=10;
    
//     /**
//      * Innercj24_Innerclass
//      */
//     private class Innercj24_Innerclass
//     {
//         int j=20;
//     }
// }
// /**
//  * cj24_Innerclass
//  */
// public class cj24_Innerclass
// {
//     public static void main(String[] args)
//     {
//         outtercj24_Innerclass ocj24_1 = new outtercj24_Innerclass();
//         System.out.println(ocj24_1.i);

//         outtercj24_Innerclass.Innercj24_Innerclass icj24_1 = ocj24_1.new Innercj24_Innerclass();
//         System.out.println(icj24_1.j);
//     }
    
// }







































































// /**
//  * outtercj24_Innerclass
//  */
// class outtercj24_Innerclass
// {
//     int i=10;
    
//     /**
//      * Innercj24_Innerclass
//      */
//     static class Innercj24_Innerclass
//     {
//         int j=20;
//     }
// }
// /**
//  * cj24_Innerclass
//  */
// public class cj24_Innerclass
// {
//     public static void main(String[] args)
//     {
//     //     outtercj24_Innerclass ocj24_1 = new outtercj24_Innerclass();
//     //     System.out.println(ocj24_1.i);

//         outtercj24_Innerclass.Innercj24_Innerclass icj24_1 = new outtercj24_Innerclass.Innercj24_Innerclass();
//         System.out.println(icj24_1.j);
//     }
// }







































































/**
 * outtercj24_Innerclass
 */
class outtercj24_Innerclass
{
    int i=10;
    
    /**
     * Innercj24_Innerclass
     */
    class Innercj24_Innerclass
    {
        int j=i;
    }
}
/**
 * cj24_Innerclass
 */
public class cj24_Innerclass
{
    public static void main(String[] args)
    {
        outtercj24_Innerclass ocj24_1 = new outtercj24_Innerclass();
        System.out.println(ocj24_1.i);

        outtercj24_Innerclass.Innercj24_Innerclass icj24_1 = ocj24_1.new Innercj24_Innerclass();
        System.out.println(icj24_1.j);

    }
}
