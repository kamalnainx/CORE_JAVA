// import java.util.HashSet;

// /**
//  * CJ25_hashset
//  */
// public class CJ27_hashset {

//     public static void main(String[] args) {
//         HashSet<String> hs1 = new HashSet<String>();
//         hs1.add("1st");
//         System.out.println(hs1);
//     }
// }




































// import java.util.HashSet;

// /**
//  * CJ25_hashset
//  */
// public class CJ27_hashset {

//     public static void main(String[] args) {

//         HashSet<String> hs1 = new HashSet<String>();

//         hs1.add("1st");
//         hs1.add("2nd");
//         hs1.add("3rd");
//         hs1.add("4th");
//         hs1.add("5th");

//         System.out.println(hs1);
//     }
// }






























// import java.util.HashSet;

// /**
//  * CJ25_hashset
//  */
// public class CJ27_hashset {

//     public static void main(String[] args) {

//         HashSet<String> hs1 = new HashSet<String>();

//         hs1.add("1st");
//         hs1.add("2nd");
//         hs1.add("3rd");
//         hs1.add("4th");
//         hs1.add("5th");

//         // print hashset
//         System.out.println(hs1);

//         // check true or false
//         System.out.println(hs1.contains("3rd"));//true
//         System.out.println(hs1.contains("33rd"));//false

//     }
// }

























// import java.util.HashSet;

// /**
//  * CJ25_hashset
//  */
// public class CJ27_hashset {

//     public static void main(String[] args) {

//         HashSet<String> hs1 = new HashSet<String>();

//         hs1.add("1st");
//         hs1.add("2nd");
//         hs1.add("3rd");
//         hs1.add("4th");
//         hs1.add("5th");

//         // print hashset
//         System.out.println(hs1);

//         // check true or false
//         System.out.println(hs1.contains("3rd"));//true
//         System.out.println(hs1.contains("33rd"));//false

//         // size of hashset
//         System.out.println(hs1.size());
//     }
// }






















// import java.util.HashSet;

// /**
//  * CJ25_hashset
//  */
// public class CJ27_hashset {

//     public static void main(String[] args) {

//         HashSet<String> hs1 = new HashSet<String>();

//         hs1.add("1st");
//         hs1.add("2nd");
//         hs1.add("3rd");
//         hs1.add("4th");
//         hs1.add("5th");

//         // print hashset
//         System.out.println(hs1);

//         // check true or false
//         System.out.println(hs1.contains("3rd"));//true
//         System.out.println(hs1.contains("33rd"));//false

//         // size of hashset
//         System.out.println(hs1.size());

//         // hashset loop
//         for (String string : hs1) {
//             System.out.println(string);
//         }
//     }
// }


































































import java.util.HashSet;

/**
 * CJ25_hashset
 */
public class CJ27_hashset {

    public static void main(String[] args) {

        HashSet<String> hs1 = new HashSet<String>();

        hs1.add("1st");
        hs1.add("2nd");
        hs1.add("3rd");
        hs1.add("4th");
        hs1.add("5th");

        // print hashset
        System.out.println(hs1);

        // check true or false
        System.out.println(hs1.contains("3rd"));//true
        System.out.println(hs1.contains("33rd"));//false

        // size of hashset
        System.out.println(hs1.size());

        // hashset loop
        for (String string : hs1) {
            System.out.println(string);
        }


        // remove hashset
        hs1.remove("2nd");
        System.out.println("after remove");

        for (String string : hs1) {
            System.out.println(string);
        }

    }
}
