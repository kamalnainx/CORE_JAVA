// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int f=100;
//         for (;f>9;)
//         {
//             System.out.println("this is for loop."+f);
//             // w++;// w=w+1  
//             f-=10;    
//         }
//     }
// }














// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int f=0;
//         for (;f<5;)
//         {
//             System.out.println("this is for loop."+f);
//             f++;// w=w+1  
//             // f-=10;    
//         }
//     }
// }















// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int f;
//         for (f=0;f<5;f++) //f++ w=w+1  
//         {
//             System.out.println("this is for loop."+f);
//         }
//     }
// }







// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int f;
//         for (f=5;f>0;f--) //f++ w=w+1  
//         {
//             System.out.println("this is for loop."+f);
//         }
//     }
// }







// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int f,g;
//         for (f=0;f<10;f++) //f++ w=w+1  
//         {
//             System.out.println("f"+f);
//         }
//         for (g=10;g>0;g--) //f++ w=w+1  
//         {
//             System.out.println("g"+g);
//         }
//     }
// }













// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int f,g;
//         for (f=0,g=0;f<10;f++,g--) //f++ w=w+1  
//         {
//             System.out.println("f"+f+"\t g"+g);
//         }
//         // for (;g>0;) //f++ w=w+1  
//         // {
//         //     System.out.println();
//         // }
//     }
// }













// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int f,g;
//         for (f=0,g=10;f<=10 && g>=0;f++,g--) //f++ w=w+1  
//         {
//             System.out.println("f"+f+"\t g"+g);
//         }
//     }
// }







// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int f,g;
//         for (f=0,g=10;f<100 || g>=0;f++,g--) //f++ w=w+1  
//         {
//             System.out.println("f"+f+"\t g"+g);
//         }
//     }
// }







// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int i,j;
//         for (i = 0; i < 10; i++) 
//         {
//             System.out.print(i+" ");
//             for(j=0;j<10;j++)
//             {
//                 System.out.print(" "+j);
//             }
//             System.out.println();
//         }
//     }
// }












// /**
//  * CJ6_C_LOOP2_for
//  */
// public class CJ6_C_LOOP2_for {

//     public static void main(String[] args) {
//         int i,j;
//         for (i = 0; i < 10; i++) 
//         {
//             System.out.print(i+" ");
//             for(j=0;j<i;j++)
//             {
//                 System.out.print(" "+j);
//             }
//             System.out.println();
//         }
//     }
// }












/**
 * CJ6_C_LOOP2_for
 */
public class CJ6_C_LOOP2_for {

    public static void main(String[] args) {
        int i,j;
        for (i = 0; i < 10; i++) 
        {
            System.out.print(" "+" ");

            for(j=0;j<i;j++)
            {
                System.out.print(" "+" ");
            }

            for(j=i;j<10;j++)
            {
                System.out.print(" "+j);
            }

            System.out.println();
        }
    }
}
