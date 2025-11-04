// /**
//  * CJ13_class_attributes
//  */
// public class CJ13_class_attributes {
//     int x=5;
//     public static void main(String[] args) {
//         CJ13_class_attributes cj13=new CJ13_class_attributes();
//         System.out.println(cj13.x);
//     }
// }










// /**
//  * CJ13_class_attributes
//  */
// public class CJ13_class_attributes {
//     int x=5;
//     public static void main(String[] args) {
//         CJ13_class_attributes cj13=new CJ13_class_attributes();
//         System.out.println(cj13.x);
//         cj13.x=10;
//         System.out.println(cj13.x);
//     }
// }













// /**
//  * CJ13_class_attributes
//  */
// public class CJ13_class_attributes {
//     final int x=5;
//     public static void main(String[] args) {
//         CJ13_class_attributes cj13=new CJ13_class_attributes();
//         System.out.println(cj13.x);
//         cj13.x=10; //error
//         System.out.println(cj13.x);
//     }
// }













/**
 * CJ13_class_attributes
 */
public class CJ13_class_attributes {
    int x=5;
    public static void main(String[] args) {
        CJ13_class_attributes cj13_1=new CJ13_class_attributes();
        System.out.println(cj13_1.x);
        CJ13_class_attributes cj13_2=new CJ13_class_attributes();
        System.out.println(cj13_2.x);
        cj13_1.x=10;
        System.out.println(cj13_1.x);
        System.out.println(cj13_2.x);
        
    }
}
