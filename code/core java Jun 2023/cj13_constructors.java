// /**
//  * cj13_constructors
//  */
// public class cj13_constructors {
//     public cj13_constructors()
//     {
//         System.out.println("hello world");
//     }
//     public static void main(String[] args) {
//         new cj13_constructors();
//     }
// }





































/**
 * cj13_constructors
 */
public class cj13_constructors {
    public cj13_constructors()
    {
        System.out.println("hello world");
    }
    public cj13_constructors( int x)
    {
        System.out.println("the value of x is"+x);
    }
    
    public static void main(String[] args) {
        new cj13_constructors();
        new cj13_constructors(10);
        
    }
}