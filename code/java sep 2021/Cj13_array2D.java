// import java.util.Scanner;
// /**
//  * Cj13_array2D
//  */
// public class Cj13_array2D
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter any number");
//         int i=sc.nextInt();
//         System.out.println("the i value is "+i);
//     }
    
// }


































// import java.util.Scanner;
// /**
//  * Cj13_array2D
//  */
// public class Cj13_array2D
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int i[]= new int[10];
//         for ( int x=0;x<10;x++)
//         {
//             System.out.println("Please enter "+x+" value");
//             i[x]=sc.nextInt();    
//         }
//         for(int y=0;y<=9;y++)
//         {
//             System.out.println("the i value is "+i[y]);
//         }
//     }
    
// }




























// /**
//  * Cj13_array2D
//  */
// public class Cj13_array2D
// {
//     public static void main(String[] args)
//     {
//         int i[][]={
//                     {10,20,30,},
//                     {3,2,1,},
//                     {11,22,33}
//                 };
//         System.out.println(i[0][1]);

//     }
    
// }

































// /**
//  * Cj13_array2D
//  */
// public class Cj13_array2D
// {
//     public static void main(String[] args)
//     {
//         int i[][]={
//                     {10,20,30,},
//                     {3,2,1,},
//                     {11,22,33}
//                 };
//         System.out.println(i[0][0]);
//         System.out.println(i[0][1]);
//         System.out.println(i[0][2]);
        
//         System.out.println(i[1][0]);
//         System.out.println(i[1][1]);
//         System.out.println(i[1][2]);
        
//         System.out.println(i[2][0]);
//         System.out.println(i[2][1]);
//         System.out.println(i[2][2]);                      
//     }
    
// }
























// /**
//  * Cj13_array2D
//  */
// public class Cj13_array2D
// {
//     public static void main(String[] args)
//     {
//         int i[][]={
//                     {10,20,30,},
//                     {3,2,1,},
//                     {11,22,33}
//                 };
//         System.out.print(i[0][0]+"\t");
//         System.out.print(i[0][1]+"\t");
//         System.out.print(i[0][2]+"\t");
        
//         System.out.println();

//         System.out.print(i[1][0]+"\t");
//         System.out.print(i[1][1]+"\t");
//         System.out.print(i[1][2]+"\t");
        
//         System.out.println();
        
//         System.out.print(i[2][0]+"\t");
//         System.out.print(i[2][1]+"\t");
//         System.out.print(i[2][2]+"\t");                      
//     }
    
// }




















// /**
//  * Cj13_array2D
//  */
// public class Cj13_array2D
// {
//     public static void main(String[] args)
//     {
//         int i[][]=new int[3][3];
        
//         i[0][0]=10;
//         i[0][1]=20;
//         i[0][2]=30;
        
//         i[1][0]=3;
//         i[1][1]=2;
//         i[1][2]=1;
        
//         i[2][0]=11;
//         i[2][1]=22;
//         i[2][2]=33;

//         System.out.print(i[0][0]+"\t");
//         System.out.print(i[0][1]+"\t");
//         System.out.print(i[0][2]+"\t");
        
//         System.out.println();

//         System.out.print(i[1][0]+"\t");
//         System.out.print(i[1][1]+"\t");
//         System.out.print(i[1][2]+"\t");
        
//         System.out.println();
        
//         System.out.print(i[2][0]+"\t");
//         System.out.print(i[2][1]+"\t");
//         System.out.print(i[2][2]+"\t");                      
//     }
    
// }





























































// /**
//  * Cj13_array2D
//  */
// public class Cj13_array2D
// {
//     public static void main(String[] args)
//     {
//         int i[][]=new int[3][3];
        
//         i[0][0]=10;
//         i[0][1]=20;
//         i[0][2]=30;
        
//         i[1][0]=3;
//         i[1][1]=2;
//         i[1][2]=1;
        
//         i[2][0]=11;
//         i[2][1]=22;
//         i[2][2]=33;

//         for (int j = 0; j < i.length; j++) {
//             System.out.print( j+"* ");
//             for (int j2 = 0; j2 < i.length; j2++)
//             {
//                 System.out.print(j2+"#\t");    
//             }
//             System.out.println();
//         }

//         System.out.print(i[0][0]+"\t");
//         System.out.print(i[0][1]+"\t");
//         System.out.print(i[0][2]+"\t");
        
//         System.out.println();

//         System.out.print(i[1][0]+"\t");
//         System.out.print(i[1][1]+"\t");
//         System.out.print(i[1][2]+"\t");
        
//         System.out.println();
        
//         System.out.print(i[2][0]+"\t");
//         System.out.print(i[2][1]+"\t");
//         System.out.print(i[2][2]+"\t");                      
//     }
    
// }







































































































// /**
//  * Cj13_array2D
//  */
// public class Cj13_array2D
// {
//     public static void main(String[] args)
//     {
//         int i[][]=new int[3][3];
        
//         i[0][0]=10;
//         i[0][1]=20;
//         i[0][2]=30;
        
//         i[1][0]=3;
//         i[1][1]=2;
//         i[1][2]=1;
        
//         i[2][0]=11;
//         i[2][1]=22;
//         i[2][2]=33;

//         for (int j = 0; j < i.length; j++) {
            
//             for (int j2 = 0; j2 < i.length; j2++)
//             {
//                 System.out.print(i[j][j2]+"\t");    
//             }
//             System.out.println();
//         }

//             }
    
// }
























































// wap to print student name with subject show by term.
// student=3   subject=3   term=3


// wap to print person name with 6month sale of 5 item.
// saler=5, month=6, item=5
