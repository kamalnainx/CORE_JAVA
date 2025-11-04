// /**
//  * cj6_if_else
//  */
// public class cj6_if_else {

//     public static void main(String[] args) {
//         int i=10, j=20;
//         if (i>j) {
//             System.out.println("i is greater than other");
//         }
//     }
// }





































// /**
//  * cj6_if_else
//  */
// public class cj6_if_else {

//     public static void main(String[] args) {
//         int i=10, j=20;
//         if (i>j) {
//             System.out.println("i is greater than other");
//         }
//         else{
//             System.out.println("y is greater than other");
//         }
//     }
// }



































// /**
//  * cj6_if_else
//  */
// public class cj6_if_else {

//     public static void main(String[] args) {
//         int i=10, j=10;
//         if (i>j) {
//             System.out.println("i is greater than other");
//         }
        
//         else{
//             if (j>i) {
//                 System.out.println("y is greater than other");
//             }
//             else {
//                 System.out.println("no one is greater than other");
//             }
//         }
//     }
// }





























// /**
//  * cj6_if_else
//  */
// public class cj6_if_else {

//     public static void main(String[] args) {
//         int i=10, j=10, k=20;
//         if (i>j) {
//             if (i>k) {
//                 System.out.println("i is greater than other");
//             }
//             else{
//                 System.out.println("i is smaller than other or not bigger than k");
//             }
//         }
        
//         else{
//             if (j>i) {
//                 if (j>k) {
//                     System.out.println("j is greater than other");
//                 }
//                 else{
//                     System.out.println("j is smaller than other or not bigger than k");
//                 }
//             }
//             else {
//                 if (k>i) {
//                     if (k>j) {
//                         System.out.println("k is greater than other");
//                     }
//                     else{
//                         System.out.println("k is smaller than other or not bigger than k");
//                     }
//                 }
//                 else {
//                     System.out.println("no one is greater than other");
//                 }
//             }
//         }
//     }
// }



























































// /**
//  * cj6_if_else
//  */
// public class cj6_if_else {

//     public static void main(String[] args) {
//         int i=10, j=10, k=20, l=40;
//         if (i>j && i>k && i>l) {
//                 System.out.println("i is greater than other");
//             }
        
//         else{
//             if (j>i && j>k && j>l) {
//                     System.out.println("j is greater than other");
//                 }
//                else {
//                 if (k>i && k>j && k>l) {
//                         System.out.println("k is greater than other");
//                     }
//                 else {
//                     if (l>i && l>j && l>k) {
//                         System.out.println("l is greater than other");
//                         }
//                     else {
//                         System.out.println("no one is greater than other");
//                     }
//                 }
//             }
//         }
//     }
// }





































































// /**
//  * cj6_if_else
//  */
// public class cj6_if_else {

//     public static void main(String[] args) {
//         int i=10, j=10, k=20, l=40, m=50;
//         if (i>j && i>k && i>l && i>m) {
//                 System.out.println("i is greater than other");
//             }
        
//         else if (j>i && j>k && j>l && j>m) {
//                     System.out.println("j is greater than other");
//                 }
//         else if (k>i && k>j && k>l && k>m) {
//                 System.out.println("k is greater than other");
//             }
//         else if (l>i && l>j && l>k && l>m) {
//             System.out.println("l is greater than other");
//             }
//         else if (m>i && m>j && m>k && m>m) {
//             System.out.println("l is greater than other");
//             }  
//         else {
//                 System.out.println("no one is greater than other");
//             }
//     }
// }








































































/**
 * cj6_if_else
 */
public class cj6_if_else {

    public static void main(String[] args) {
        int i=10, j=10, k=20, l=40, m=50, n=60;
        if (i>j && i>k && i>l && i>m && i>n) {
                System.out.println("i is greater than other");
            }
        
        else if (j>k && j>l && j>m && j>n) {
                    System.out.println("j is greater than other");
                }
        else if (k>l && k>m && k>n) {
                System.out.println("k is greater than other");
            }
        else if (l>m && l>n) {
            System.out.println("l is greater than other");
            }
        else if (m>n) {
            System.out.println("l is greater than other");
            }  
        else if (n>i && n>j && n>k && n>l && n>m) {
            System.out.println("l is greater than other");
            }  
            
        else {
                System.out.println("no one is greater than other");
            }
    }
}
