// what is loop?
// loop is a programming structure that repeats a sequence of instruction / block of code until a specific condition is met/found.
// its a cycle through value, numbers, and other code.
// its have 3 main step
// 1. initialization           start
// 2. condition                stop
// 3. increment/ decrement     step



// public class CJ7_c_loop_while {
//     public static void main(String[] args) {
    
//         int i=1;
//         while (i<10) {
//             System.out.print(i);
//             i++; //i=i+1 i=9+1=10 i=10
//         }
//         System.out.println("\n");
//         i=1;
//         while (i<10) {
//             System.out.println(i);
//             i++; //i=i+1 i=9+1=10 i=10
//         }
        
//     }
    
// }






// public class CJ7_c_loop_while {
//     public static void main(String[] args) {
    
//         int i=10;
//         while (i>1) {
//             System.out.print(i);
//             i--; //i=i-1 i=2+1=1 i=1
//         }

//         System.out.println("\n");
//         i=1;
//         while (i>-10) {
//             System.out.println(i);
//             i--; 
//         }
        
//     }
    
// }











// public class CJ7_c_loop_while {
//     public static void main(String[] args) {
//         int i=10;
//         System.out.println(i);
//         i++; //i=i+1 i=10+1 i=11
//         System.out.println(i);
//         i++;
//         System.out.println(i);
//         i++;
//         System.out.println(i);
//         i++;
//         System.out.println(i);
        
//         int x=10;
//         while (x<=20) {
//         System.out.println(x);
//         x++;    
//         }
//     }
// }





// 1   1   2   5   1   1   1     1
// 2   3   4   10  3   4   8     2
// 3   5   6   15  6   9   27    6
// 4   7   8   20  10  16  64    24
// 5   9   10  25  15  25  125   125


/**
 * CJ7_c_loop_while
 */
public class CJ7_c_loop_while {

    public static void main(String[] args) {
        int i=1,j=1;
        while(i<=5)
        {
            j=j*i; //j=j+i j=24*5 j=120;        1,2,6,24,120
            System.out.println(j);
            i++;
        }
    }
}
