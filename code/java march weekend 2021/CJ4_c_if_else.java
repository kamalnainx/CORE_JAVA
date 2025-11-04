// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         // syntax
//         // if (condition)
//         // {
            
//         // } 
//         // else
//         // {

//         // }   
//     }    
// }









// /**
//  * CJ4_c_if_else
//  */
// public class CJ4_c_if_else {

//     public static void main(String[] args) {
//         if (false) {
//             System.out.println("true");
//         }
//     }
// }








// import java.io.InputStream;
// import java.util.*;
// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         Scanner sc= new Scanner(System.in);

//         System.out.println("Please enter 1st value");
//         int i=sc.nextInt();
//         System.out.println("Please enter 2nd value");
//         int j=sc.nextInt();
        
//         if (i>j)
//         {
//             System.out.println("the i is much bigger then j"+i);
//         } 
//     }    
// }













// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {

//         int i=10,j=20;        
//         if (i>j)
//         {
//             System.out.println("the i is much bigger then j"+i);
//         }
//         else
//         {
//             System.out.println("the j is bigger then i");
//         } 
//     }    
// }













// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         int i=20,j=30;        
//         if (i>j)
//         {
//             System.out.println("the i is much bigger then j"+i);
//         }
//         else
//         {
//             if(j>i)
//             {
//                 System.out.println("the j is bigger then i");
//             }
//             else
//             {
//                 System.out.println("both are equal");
//             }
//         } 
//     }    
// }













// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         int i=20,j=80,k=40;        
//         if (i>j && i>k )
//         {
//             System.out.println("the i is much bigger then j & k"+i);
//         }
//         else
//         {
//             if(j>i && j>k)
//             {
//                 System.out.println("the j is bigger then i & k");
//             }
//             else
//             {
//                 if(k>i&&k>j)
//                 {
//                     System.out.println("the k is much bigger then i & j");
//                 }
//                 else
//                 {
//                     System.out.println("all are equal");
//                 }
//             }
//         } 
//     }    
// }











// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         int i=20,j=80,k=40;        
//         if (i>j && i>k )
//         {
//             System.out.println("the i is much bigger then j & k"+i);
//         }
//         else if(j>i && j>k)
//         {
//             System.out.println("the j is bigger then i & k");
//         }
//         else if(k>i&&k>j)
//         {
//             System.out.println("the k is much bigger then i & j");
//         }
//         else
//         {
//             System.out.println("all are equal");
//         }        
//     }    
// }

















// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         int i=20,j=80,k=40,l=50;        
//         if (i>j && i>k && i>l)
//         {
//             System.out.println("the i is much bigger then j & k,l");
//         }
//         else if(j>i && j>k && j>l)
//         {
//             System.out.println("the j is bigger then i & k,l");
//         }
//         else if(k>i && k>j && k>l)
//         {
//             System.out.println("the k is much bigger then i & j,l");
//         }
//         else if(l>i && l>j && l>k)
//         {
//             System.out.println("the l is much bigger then i & j,k");
//         }
//         else
//         {
//             System.out.println("all are equal");
//         }        
//     }    
// }













// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         int i=20,j=20,k=40,l=40;        
//         if (i>j && i>k && i>l)
//         {
//             System.out.println("the i is much bigger then j & k,l");
//         }
//         else if(j>k && j>l)
//         {
//             System.out.println("the j is bigger then i & k,l");
//         }
//         else if(k>l)
//         {
//             System.out.println("the k is much bigger then i & j,l");
//         }
//         else
//         {
//             System.out.println("the l is much bigger then i & j,k");
//         }        
//     }    
// }













// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         int i=20,j=20,k=40,l=40;        
//         if (i>=j && i>=k && i>=l)
//         {
//             System.out.println("the i is much bigger then j & k,l");
//         }
//         else if(j>=k && j>=l)
//         {
//             System.out.println("the j is bigger then i & k,l");
//         }
//         else if(k>=l)
//         {
//             System.out.println("the k is much bigger then i & j,l");
//         }
//         else if(l>=k)
//         {
//             System.out.println("the l is much bigger then i & j,k");
//         }        
//     }    
// }











// public class CJ4_c_if_else
// {
//     public static void main(String[] args)
//     {
//         int i=20,j=20,k=40,l=40;        
//         if (i>=j && i>=k && i>=l)
//         {
//             System.out.println("the i is much bigger then j & k,l");
//         }
//         else if(j>=k && j>=l)
//         {
//             System.out.println("the j is bigger then i & k,l");
//         }
//         else if(k>=l)
//         {
//             if(k>l)
//             {
//                 System.out.println("the k is much bigger then i & j,l");
//             }
//             else if (l>k)
//             {
//                 System.out.println("the value of l is much bigger then k");
//             }
//             else
//             {
//                 System.out.println("l and k is equal");
//             }
//         }
//         else if(l>=k)
//         {
//             System.out.println("the l is much bigger then i & j,k");
//         }        
//     }    
// }
