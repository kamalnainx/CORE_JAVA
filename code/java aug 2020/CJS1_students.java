// class CJS1_students
// {
//     public static void main(String[] args) {
//     int i, j;
//         for(i=1; i<=5; i++)
//         {
//             for(j=i; j<=5; j++)
//             {
//                 System.out.print(" ");
//             }
//             System.out.print(" ");
//             for(j=1; j<=i; j++)
//             {
//                 System.out.print(" *");
//                 if(j==5)
//                 {
//                     System.out.println();
//                     for(i=1; i<=5; i++)
//                     {
//                         System.out.print("  ");
//                         for(j=1; j<=5; j++)
//                         {
//                             System.out.print(" *");
//                         }
//                         System.out.println();
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }






/**
 * CJS1_students
 */
public class CJS1_students
{
    public static void main(String[] args) {
        
    
    int x,y;
    for(x=1;x<6;x++)
    {
        System.out.print(x);
        for(y=1;y<10;y++)
        {
            System.out.print(y);
        }
        System.out.println();
    }
}
}