// /**
//  * hello
//  */
// public class hello
// {
//     public static void main(String[] args)
//     {
//         // System.out.println("hello everyone");
//         // 1,2,3,4,5,6,7,8,9,10  
        
//         for (int i=1;i<=10;i++)
//         {
//             System.out.println(i);    
//         }
//     }    
// }








// /**
//  * hello
//  */
// public class hello
// {
//     public static void main(String[] args)
//     {
//         for (int i=1;i<=10;i++)        // 1,2,3,4,5,6,7,8,9,10
//         {
//             System.out.print(i);
//             System.out.print(",");
                
//         }
//     }    
// }










// /**
//  * hello
//  */
// public class hello
// {
//     public static void main(String[] args)
//     {
//         for (int i=1;i<=10;i++)       
//         {
//             for(int j=1;j<=10;j++)
//             {
//                 System.out.print(j+",");
//             }                
//             System.out.println();
//         }
//     }    
// }
// output
// 1,2,3,4,5,6,7,8,9,10
// 1,2,3,4,5,6,7,8,9,10
// 1,2,3,4,5,6,7,8,9,10
// 1,2,3,4,5,6,7,8,9,10
// 1,2,3,4,5,6,7,8,9,10
// 1,2,3,4,5,6,7,8,9,10
// 1,2,3,4,5,6,7,8,9,10
// 1,2,3,4,5,6,7,8,9,10

/**
 * hello
 */
public class hello
{
    public static void main(String[] args)
    {
        for (int i=1;i<=10;i++)       
        {
            for(int j=i;j<=10;j++)
            {
                System.out.print(" ");
            }                
            for(int k=1;k<=i;k++)
            {
                System.out.print("k  ");
            }                
            System.out.println();
        }
    }    
}