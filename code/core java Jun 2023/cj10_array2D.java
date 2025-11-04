// /**
//  * cj10_array2D
//  */
// public class cj10_array2D {

//     public static void main(String[] args) {
//         int[][] array =new int[3][3];
        
//         array[0][0] = 1;
//         array[0][1] = 2;
//         array[0][2] = 3;
        
//         array[1][0] = 1;
//         array[1][1] = 2;
//         array[1][2] = 3;
        
//         array[2][0] = 1;
//         array[2][1] = 2;
//         array[2][2] = 3;
        
//         System.out.println(array[0][0]);
//         System.out.println(array[0][1]);
//         System.out.println(array[0][2]);
        
//         System.out.println(array[1][0]);
//         System.out.println(array[1][1]);
//         System.out.println(array[1][2]);
        
//         System.out.println(array[2][0]);
//         System.out.println(array[2][1]);
//         System.out.println(array[2][2]);
        
//     }
// }















// /**
//  * cj10_array2D
//  */
// public class cj10_array2D {

//     public static void main(String[] args) {
//         int[][] array =new int[3][3];
        
//         array[0][0] = 1;
//         array[0][1] = 2;
//         array[0][2] = 3;
        
//         array[1][0] = 1;
//         array[1][1] = 2;
//         array[1][2] = 3;
        
//         array[2][0] = 1;
//         array[2][1] = 2;
//         array[2][2] = 3;
        
//         System.out.print(array[0][0]+"\t");
//         System.out.print(array[0][1]+"\t");
//         System.out.println(array[0][2]);
        
//         System.out.print(array[1][0]+"\t");
//         System.out.print(array[1][1]+"\t");
//         System.out.println(array[1][2]);
        
//         System.out.print(array[2][0]+"\t");
//         System.out.print(array[2][1]+"\t");
//         System.out.println(array[2][2]);
        
//     }
// }
















// /**
//  * cj10_array2D
//  */
// public class cj10_array2D {

//     public static void main(String[] args) {
//         int[][] array =new int[3][3];
        
//         array[0][0] = 1;
//         array[0][1] = 2;
//         array[0][2] = 3;
        
//         array[1][0] = 1;
//         array[1][1] = 2;
//         array[1][2] = 3;
        
//         array[2][0] = 1;
//         array[2][1] = 2;
//         array[2][2] = 3;
        
//         for (int[] x : array) {
//             for (int y : x) {
//                 System.out.print(y+"\t");    
//             }
//             System.out.println();
//         }                 
//     }
// }






















/**
 * cj10_array2D
 */
public class cj10_array2D {

    public static void main(String[] args) {
        int[][] array =new int[3][3];
        
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        
        array[1][0] = 1;
        array[1][1] = 2;
        array[1][2] = 3;
        
        array[2][0] = 1;
        array[2][1] = 2;
        array[2][2] = 3;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+"\t");    
            }
            System.out.println();
        }                 
    }
}
