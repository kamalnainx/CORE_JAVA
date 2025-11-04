// public class Attributes
// {
//     int x=5;
//     public static void main(String[] agrs)
//     {
//         Attributes at=new Attributes();
//         System.out.println(at.x);
//     }
// }

// public class Attributes
// {
//     int x=5;
//     public static void main(String[] agrs)
//     {
//         Attributes at=new Attributes();
//         System.out.println(at.x);
//         at.x=10;// override x value
//         System.out.println(at.x);
//     }
// }

// public class Attributes
// {
//     final int x=5;// fixed value
//     public static void main(String[] agrs)
//     {
//         Attributes at=new Attributes();
//         System.out.println(at.x);
//         at.x=10;// override x value then you will get error
//         System.out.println(at.x);
//     }
// }

// public class Attributes
// {
//     int x=5;// fixed value
//     public static void main(String[] agrs)
//     {
//         Attributes atb1=new Attributes();
//         Attributes atb2=new Attributes();
        
//         System.out.println(atb1.x);
//         System.out.println(atb2.x);
        
//         atb2.x=10;// override x value
//         System.out.println();
        
//         System.out.println(atb1.x);
//         System.out.println(atb2.x);
        
//     }
// }

// public class Attributes
// {
//     int number=510;// fixed value
//     String fname="kamal", lname="nain";
//     public static void main(String[] agrs)
//     {
//         Attributes atb1=new Attributes();
//         Attributes atb2=new Attributes();
        
//         System.out.println(" the user full name is "+atb1.fname+" "+atb1.lname+" number is "+atb1.number);
//         System.out.println(" the user full name is "+atb2.fname+" "+atb2.lname+" number is "+atb2.number);
        
//         atb2.number=1020;// override x value
//         atb2.fname="ravi";// override x value
//         atb2.lname="kumar";// override x value
        
//         System.out.println();
        
//         System.out.println(" the user full name is "+atb1.fname+" "+atb1.lname+" number is "+atb1.number);
//         System.out.println(" the user full name is "+atb2.fname+" "+atb2.lname+" number is "+atb2.number);
//     }
// }

