// enums?
// enums is a special type of java class that represents a group of constants(unchageable variables , like final variables).


// syntax example
// enum level
// {
//     low,
//     medium,
//     high
// }








// /**
//  * cj31_enums
//  */
// public class cj31_enums
// {
//     enum level
//     {
//         low, medium, high
//     }
    
//     public static void main(String[] args)
//     {
//         level env1 = level.medium;
//         System.out.println(env1);
//     }
// }














// enum level
// {
//     low, medium, high
// }

// /**
//  * cj31_enums
//  */
// public class cj31_enums
// {
//     public static void main(String[] args)
//     {
//         level env1 = level.low;
//         switch (env1)
//         {
//             case low:
//                 System.out.println("this is low");        
//             break;
            
//             case medium:
//                 System.out.println("this is medium");
//             break;
        
//             case high:
//                 System.out.println("this is high");
//             break;

//             default:
//                 System.out.println("that's default");
//             break;
//         }
//     }
// }

















// enum level
// {
//     low, medium, high
// }

// /**
//  * cj31_enums
//  */
// public class cj31_enums
// {
//     public static void main(String[] args)
//     {
//         for(level env1 : level.values())
//         {
//             System.out.println(env1);    
//         }
//     }
// }
