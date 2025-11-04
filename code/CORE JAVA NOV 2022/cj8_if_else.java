// /**
//  * cj8_if_else
//  */
// public class cj8_if_else
// {
//     public static void main(String[] args) {
//         int a=10,b=20;
//         if (a>b) {
//             System.out.println("a is bigger then other");
//         }
//     }
    
// }




































// /**
//  * cj8_if_else
//  */
// public class cj8_if_else
// {
//     public static void main(String[] args) {
//         int a=10,b=20;
//         if (a>b) {
//             System.out.println("a is bigger then other");
//         }
//         else{
//             System.out.println("b is bigger then other");
//         }
//     }
    
// }


































// /**
//  * cj8_if_else
//  */
// public class cj8_if_else
// {
//     public static void main(String[] args) {
//         int a=10,b=10;
//         if (a>b) {
//             System.out.println("a is bigger then other");
//         }
//         else{
//             if (b>a) {
//                 System.out.println("b is bigger then other");
//             }
//             else
//             {
//                 System.out.println("no one is bigger from other.");
//             }
//         }
//     }
    
// }




























// /**
//  * cj8_if_else
//  */
// public class cj8_if_else
// {
//     public static void main(String[] args) {
//         int a=10,b=10,c=30;
//         if (a>b) {
//             if (a>c) {
//             System.out.println("a is bigger then other");
//             } else {
//                 System.out.println("a is bigger then but not fron c");
//             }
//         }
            
//         else{
//             if (b>a) {
//                 if (b>c) {
//                     System.out.println("b is bigger then other");    
//                 } else {
//                     System.out.println("b is bigger then a but not from c");
//                 }
                
//             }
//             else
//             {
//                 if (c>a) {
//                     if (c>b) {
//                         System.out.println("c is bigger then other");    
//                     } else {
//                         System.out.println("c is bigger then a but not from b");
//                     }
//                 }
//                 else
//                 {
//                     System.out.println("no one is bigger from other.");
//                 }
                
//             }
//         }
//     }
    
// }

























































// /**
//  * cj8_if_else
//  */
// public class cj8_if_else
// {
//     public static void main(String[] args) {
//         int a=10,b=10,c=30,d=40;
//         if (a>b) {
//             if (a>c&&a>d) {
//             System.out.println("a is bigger then other");
//             } else {
//                 System.out.println("a is bigger then but not fron c or d");
//             }
//         }
            
//         else{
//             if (b>a) {
//                 if (b>c&&b>d) {
//                     System.out.println("b is bigger then other");    
//                 } else {
//                     System.out.println("b is bigger then a but not from c or d");
//                 }
                
//             }
//             else
//             {
//                 if (c>d) {
//                     if (c>b&&c>d) {
//                         System.out.println("c is bigger then other");    
//                     } else {
//                         System.out.println("c is bigger then a but not from b and d");
//                     }
//                 }
//                 else
//                 {
//                     if (d>a) {
//                         if (b>b&&d>c) {
//                             System.out.println("d is bigger then other");    
//                         } else {
//                             System.out.println("d is bigger then a but not from b and c");
//                         }
//                     }
//                     else{
//                         System.out.println("no one is bigger from other.");
//                     }
//                 }
                
//             }
//         }
//     }
    
// }
















































// /**
//  * cj8_if_else
//  */
// public class cj8_if_else
// {
//     public static void main(String[] args) {
//         int a=10,b=10,c=30,d=40,e=50;
        
//         if (a>b&&a>c&&a>d&&a>e) {
//             System.out.println("a is bigger then other");   } 

//         else if (b>a && b>c && b>d && b>e) {
//             System.out.println("b is bigger then other");    }

//         else if (c>d && c>b && c>d && c>e) {
//             System.out.println("c is bigger then other");    }
        
//         else if (d>a && d>b &&d>c && d>e){
//             System.out.println("d is bigger then other");    }

//         else if (e>a && e>b && e>c && e>d){
//             System.out.println("e is bigger then other");    }
                        
//         else{
//             System.out.println("no one is bigger from other."); }
//     }
    
// }






















/**
 * cj8_if_else
 */
public class cj8_if_else
{
    public static void main(String[] args) {
        int a=10,b=10,c=30,d=40,e=50,f=60;
        
        if (a>b&&a>c&&a>d&&a>e&&a>f) {
            System.out.println("a is bigger then other");   } 

        else if (b>c && b>d && b>e && b>f) {
            System.out.println("b is bigger then other");    }

        else if (c>d && c>e && c>f) {
            System.out.println("c is bigger then other");    }
        
        else if (d>e && d>f){
            System.out.println("d is bigger then other");    }

        else if (e>f){
            System.out.println("e is bigger then other");    }
        
        else if (f>a && f>b && f>c && f>d && f>e){
            System.out.println("e is bigger then other");    }
    
        else{
            System.out.println("no one is bigger from other."); }
    }
    
}














