// what is e num ?
// enum is a special class that use for represents a group of constants value(like final variables or unchangeable variables)







// enum Level { low, medium, high}
// public class java46_enum
// {
//     public static void main(String[] args)
//     {
//         Level myvar= Level.medium;
//         System.out.println(myvar);
//     }    
// }











/**
 * java46_enum
 */
public class java46_enum {

    enum Level { low, medium, high}
    public static void main(String[] args) {
        Level myvar=Level.low;
        System.out.println(myvar);       
    }
}









// /**
//  * java46_enum
//  */
// public class java46_enum {

//     enum Level { low, medium, high}
//     public static void main(String[] args) {
//         Level myvar=Level.low;
//         System.out.println(myvar);
//         switch (myvar) {
//             case low:
//                 System.out.println("this level is "+myvar);
//             break;
            
//             case meidum:
//                 System.out.println("this level is "+myvar);
//             break;

//             case high:
//                 System.out.println("this level is "+myvar);
//             break;
                
//             default:
//                 System.out.println("all level is not working");
//                 break;
//         }       
//     }
// }
