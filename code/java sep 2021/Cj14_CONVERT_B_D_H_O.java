// import org.graalvm.compiler.graph.spi.Canonicalizable.Binary;

// /**
//  * Cj14_CONVERT_B_D_H_O
//  */
// public class Cj14_CONVERT_B_D_H_O
// {
//     public static void main(String[] args)
//     {
//         String bs="1010";
//         int d=Integer.parseInt(bs,2);    
//         System.out.println(d);
    
//     }
    
// }

































// import org.graalvm.compiler.graph.spi.Canonicalizable.Binary;

// /**
//  * Cj14_CONVERT_B_D_H_O
//  */
// public class Cj14_CONVERT_B_D_H_O
// {
//     public static void main(String[] args)
//     {
//         System.out.println(Integer.parseInt("1",2));
//         System.out.println(Integer.parseInt("10",2));
//         System.out.println(Integer.parseInt("100",2));
//     }
// }




































// /**
//  * Cj14_CONVERT_B_D_H_O
//  */
// public class Cj14_CONVERT_B_D_H_O
// {
//     public static int getDecimal(int binary)
//     {
//         int decimal=0;
//         int n=0;
//         while (true)
//         {
//             if(binary==0)
//             {
//                 break;
//             }
//             else
//             {
//                 int temp=binary%10;
//                 decimal+=temp*Math.pow(2, n);
//                 binary=binary/10;
//                 n++;
//             }    
//         }
//         return decimal;
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("decimal of 1010 is "+getDecimal(1010));        
//         System.out.println("decimal of 1010 is "+getDecimal(1));        
//         System.out.println("decimal of 1010 is "+getDecimal(10));        
//         System.out.println("decimal of 1010 is "+getDecimal(100));        
        
        
//     }
    
// }














// /**
//  * Cj14_CONVERT_B_D_H_O
//  */
// public class Cj14_CONVERT_B_D_H_O {

//     public static void main(String[] args) {
//         int x=5,y=3;
//         int z=x+y;
//         int year=1600;
//         // System.out.println((z>5)?"okay"+z:"not okay");
//         // System.out.println((z<5)?"okay":"not okay");
//         System.out.println(((year%4==0 && year%100!=0) || (year%400==0 && year%100!=0) )?"leep":"not ");
//         // System.out.println(((year%4==0 || year%400==0) && year%100==0 )?"leep":"not ");
        
//     }
// }


