// /**
//  * cj8_loop_while
//  */
// public class cj8_loop_while {

//     public static void main(String[] args)
//     {
//         int w=1;
//         while (w<=10)
//         {
//             System.out.println("this is while loop "+w);  
//             w++; // w=w+1  
//         }    
//     }
// }


































// /**
//  * cj8_loop_while
//  */
// public class cj8_loop_while {

//     public static void main(String[] args)
//     {
//         int w=1;
//         while (w>=-10)
//         {
//             System.out.println("this is while loop "+w);  
//             w--; // w=w-1  
//         }    
//     }
// }



































// /**
//  * cj8_loop_while
//  */
// public class cj8_loop_while {

//     public static void main(String[] args)
//     {
//         int w=1;
//         while (w<=10)
//         {   
//             if(w==5)
//             {
//                 w++;
//                 continue;
//             }
//             System.out.println("this is while loop "+w); 
//             w++; // w=w-1  
//         }    
//     }
// }






























// /**
//  * cj8_loop_while
//  */
// public class cj8_loop_while {

//     public static void main(String[] args)
//     {
//         int w=1;
//         while (w<=10)
//         {   
//             if(w==5)
//             {
//                 w++;
//                 break;
//             }
//             System.out.println("this is while loop "+w); 
//             w++; // w=w-1  
//         }    
//     }
// }






























// /**
//  * cj8_loop_while
//  */
// public class cj8_loop_while {

//     public static void main(String[] args)
//     {
//         int w=1;
//         while (w<=10)
//         {   
//             if(w==10)
//             {
//                 break;
//             }
//             if(w%3==0)
//             {
//                 w++;
//                 continue;
//             }
//             System.out.println("this is while loop "+w); 
//             w++; // w=w-1  
//         }    
//     }
// }


























/**
 * cj8_loop_while
 */
public class cj8_loop_while {

    public static void main(String[] args)
    {
        int w=1;
        while (w<=10)
        {   
            if(w==10)
            {
                System.out.println("this is break");
                break;
            }
            if(w%3==0)
            {
                w++;
                System.out.println("this is continue");
                continue;
            }
            System.out.println("this is while loop "+w); 
            w++; // w=w-1  
        }    
    }
}
