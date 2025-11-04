// what is array?
// array is an object which contains elements of a similar data type.
// the elements of an array are stored in a contiguous memory location.
// it is a data structure where we store similar elements.





// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
//         int i[]={10,20,30,40,50};
//         int i1=10;
//         int i2=20;
//         int i3=30;
//         int i4=40;
//         int i5=50;
//         System.out.println(i1);    
//         System.out.println(i1+i2+i3+i4+i5);    
//         System.out.println((i1+i2+i3+i4+i5)/5);    
//         System.out.println(i[0]);
//     }
    
// }




















// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
//         int i[]={10,20,30,40,50};
//         System.out.println(i[0]);
//         System.out.println(i[1]);
//         System.out.println(i[2]);
//         System.out.println(i[3]);
//         System.out.println(i[4]);
//     }
    
// }


































// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
//         int i[]={10,20,30,40,50};
//         i[0]=100;
//         i[1]=100;
//         i[2]=100;
//         i[3]=100;
//         i[4]=100;
        
//         System.out.println(i[0]);
//         System.out.println(i[1]);
//         System.out.println(i[2]);
//         System.out.println(i[3]);
//         System.out.println(i[4]);
//     }
    
// }




























// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
//         int i1=1,i2=2,i3=3,i4=4,i5=5;
//         int i[]=new int[5];
//         i[0]=100;
//         i[1]=i2;
//         i[2]=100;
//         i[3]=i4;
//         i[4]=100;
        
//         System.out.println(i[0]);
//         System.out.println(i[1]);
//         System.out.println(i[2]);
//         System.out.println(i[3]);
//         System.out.println(i[4]);
//     }
    
// }



























// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
//         int i1=1,i2=2,i3=3,i4=4,i5=5;
//         int i[]=new int[3];
//         i[0]=100;
//         i[1]=i2;
//         i[2]=100;
//         i[3]=i4;
//         i[4]=100;
        
//         System.out.println(i[0]);
//         System.out.println(i[1]);
//         System.out.println(i[2]);
//         System.out.println(i[3]);
//         System.out.println(i[4]);
//     }   
// }




























// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
//         int i1=1,i2=2,i3=3,i4=4,i5=5;
//         int i[]=new int[5];
//         i[0]=100;
//         i[1]=i2;
//         i[2]=100;
//         i[3]=i4;
//         i[4]=100;
        
//         for(int x=0;x<5;x++)
//             System.out.println(i[x]);
        
//     }   
// }






























// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
   
//         int i[]={100,150,100,250,100};
        
//         for(int x=0;x<5;x++)
//             System.out.print(i[x]+"\t");
//         System.out.println();    

//         for (int j : i)
//             System.out.print(j+"\t");    
        
//     }   
// }































// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
   
//         int i[][]={{100,150,100,250,100},{100,150,300,250,100},{100,500,100,250,100}};
//         System.out.println(i[1][2]);
//         System.out.println(i[2][1]);
//     }   
// }





































// /**
//  * cj13_array
//  */
// public class cj13_array
// {
//     public static void main(String[] args)
//     {
   
//         int i[][]={{100,150,100,250,100},{100,150,300,250,10},{100,500,100,250,100}};
//         for(int x=0;x<3;x++)
//         {
//             for(int y=0;y<5;y++)
//             {
//                 System.out.print(i[x][y]+"\t");
//             }
//             System.out.println();
//         }
//     }   
// }































// import java.util.Scanner;
// /**
//  * cj13_array
//  */
// public class cj13_array
// {

//     public static void main(String[] args)
//     {
//         int t,r,c;
        
//         Scanner sc=new Scanner(System.in);
        
//         System.out.println("Please enter number of table for 3D ARRAY");
//         t=sc.nextInt();

//         System.out.println("Please enter number of row for 3D ARRAY");
//         r=sc.nextInt();

//         System.out.println("Please enter number of column for 3D ARRAY");
//         c=sc.nextInt();

//         int a[][][]=new int[t][r][c];
//         int i,j,k;

        
//         for(i=0;i<t;i++)
//         {
//             System.out.println();
//             for(j=0;j<r;j++)
//             {
//                 for(k=0;k<c;k++)
//                 {
//                     System.out.print("please enter "+(i+1)+" table "+(j+1)+" row "+(k+1)+" column value");
//                     a[i][j][k]=sc.nextInt();
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }





//         for(i=0;i<t;i++)
//         {
//             System.out.println();
//             for(j=0;j<r;j++)
//             {
//                 for(k=0;k<c;k++)
//                 {
//                     System.out.print(a[i][j][k]+"\t");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
// }
