// /**
//  * CJ9_C_2D_array
//  */
// public class CJ9_C_2D_array {

//     public static void main(String[] args) {
//         int a[][]={ {1,2,3} ,   {1,2,3} ,   {1,2,3}};
//         System.out.println(a[0][1]);
//     }
// }









/**
 * CJ9_C_2D_array
 */
// public class CJ9_C_2D_array {

//     public static void main(String[] args) {
//         int a[][]={ {1,2,3} ,   {10,20,30} ,   {11,22,33}   };
//         System.out.println(a[2][2]);
//     }
// }










// /**
//  * CJ9_C_2D_array
//  */
// public class CJ9_C_2D_array {

//     public static void main(String[] args) {
//         int a[][]=new int[1][3];
//         // { {1,2,3} ,   {1,2,3} ,   {1,2,3}}
//         a[0][1]=1;
//         a[0][2]=2;
//         a[0][2]=3;

//         System.out.println(a[0][0]);
//         System.out.println(a[0][1]);
//         System.out.println(a[0][2]);        
//     }
// }













// /**
//  * CJ9_C_2D_array
//  */
// public class CJ9_C_2D_array {

//     public static void main(String[] args) {
//         int a[][]=new int[3][3];
//         // { {1,2,3} ,   {10,20,30} ,   {11,22,33}}
//         a[0][0]=1;
//         a[0][1]=2;
//         a[0][2]=3;

//         a[1][0]=10;
//         a[1][1]=20;
//         a[1][2]=30;

//         a[2][0]=11;
//         a[2][1]=22;
//         a[2][2]=33;

//         System.out.println(a[0][0]);
//         System.out.println(a[0][1]);
//         System.out.println(a[0][2]);        

//         System.out.println(a[1][0]);
//         System.out.println(a[1][1]);
//         System.out.println(a[1][2]);        

//         System.out.println(a[2][0]);
//         System.out.println(a[2][1]);
//         System.out.println(a[2][2]);        
//     }
// }

















// /**
//  * CJ9_C_2D_array
//  */
// public class CJ9_C_2D_array {

//     public static void main(String[] args) {
//         int a[][]=new int[3][3];
//         // { {1,2,3} ,   {10,20,30} ,   {11,22,33}}
//         a[0][0]=1;
//         a[0][1]=2;
//         a[0][2]=3;

//         a[1][0]=10;
//         a[1][1]=20;
//         a[1][2]=30;

//         a[2][0]=11;
//         a[2][1]=22;
//         a[2][2]=33;

//         int i,j;
//         for(i=0;i<3;i++)
//         {
//             for(j=0;j<3;j++)
//             {
//                 System.out.print(i +" "+j+"\t");
//             }
//             System.out.println();
//         }

//         System.out.println(a[0][0]);
//         System.out.println(a[0][1]);
//         System.out.println(a[0][2]);        

//         System.out.println(a[1][0]);
//         System.out.println(a[1][1]);
//         System.out.println(a[1][2]);        

//         System.out.println(a[2][0]);
//         System.out.println(a[2][1]);
//         System.out.println(a[2][2]);        
//     }
// }





























// /**
//  * CJ9_C_2D_array
//  */
// public class CJ9_C_2D_array {
//     public static void main(String[] args) {
//         // int a[][]=new int[3][3];
//         int a[][]={ {1,2,3} ,   {10,20,30} ,   {11,22,33}};
//         int i,j;
//         for(i=0;i<3;i++)
//         {
//             for(j=0;j<3;j++)
//             {
//                 System.out.print(a[i][j]+"\t");
//             }
//             System.out.println();
//         }        
//     }
// }










// /**
//  * CJ9_C_2D_array
//  */
// public class CJ9_C_2D_array {
//     public static void main(String[] args) {
//         // int a[][]=new int[3][3];
//         int a[][]={ {1,2,3} ,   {10,20,30} ,   {11,22,33}};
//         int i,j;
//         for(i=0;i<3;i++)
//         {
//             for(j=0;j<=i;j++)
//             {
//                 System.out.print(a[i][j]+"\t");
//             }
//             System.out.println();
//         }        
//     }
// }






















// /**
//  * CJ9_C_2D_array
//  */
// public class CJ9_C_2D_array {
//     public static void main(String[] args) {
//         // int a[][]=new int[3][3];
//         int a[][][]={
//             { {1,2,3} ,   {10,20,30} ,   {11,22,33}   },
//             { {1,2,3} ,   {10,20,30} ,   {11,22,33}   },
//             { {1,2,3} ,   {10,20,30} ,   {11,22,33}   }
//         };
//         int i,j,k;
//         for(i=0;i<3;i++)
//         {
//             for(j=0;j<3;j++)
//             {
//                 // System.out.print(a[i][j]+"\t");
//                 for(k=0;k<3;k++)
//                 {
//                     // System.out.print(i+" "+j+" "+k+"\t");
//                     System.out.print(a[i][j][k]+"\t");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }        
//     }
// }






















/**
 * CJ9_C_2D_array
 */
public class CJ9_C_2D_array {
    public static void main(String[] args) {
        // int a[][]=new int[3][3];
        String a[][][]={
            { {"1","2","3"} ,   {"ten","two","III"} ,   {"hello","hi","h r u"}   },
            { {"i","am","fine"} ,   {"okay","bye","tata"} ,   {"salam","namste","kemcho"}   },
            { {"x","y","z"} ,   {"one","twoKa","four"} ,   {"four","twoKa","one"}   }
        };
        int i,j,k;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                // System.out.print(a[i][j]+"\t");
                for(k=0;k<3;k++)
                {
                    // System.out.print(i+" "+j+" "+k+"\t");
                    System.out.print(a[i][j][k]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }        
    }
}
