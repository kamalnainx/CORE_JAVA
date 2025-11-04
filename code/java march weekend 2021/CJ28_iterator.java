// import java.util.ArrayList;
// import java.util.Iterator;

// /**
//  * CJ28_iterator
//  */
// public class CJ28_iterator {

//     public static void main(String[] args) {
        
//         ArrayList<String> al1 = new ArrayList<String>();
        
//         al1.add("red");
//         al1.add("Green");
//         al1.add("Blue");

//         System.out.println(al1);

//         Iterator<String> it1= al1.iterator()
//         System.out.println(it1.next());

//     }
// }


























// import java.util.ArrayList;
// import java.util.Iterator;

// /**
//  * CJ28_iterator
//  */
// public class CJ28_iterator {

//     public static void main(String[] args) {
        
//         ArrayList<String> al1 = new ArrayList<String>();
        
//         al1.add("red");
//         al1.add("Green");
//         al1.add("Blue");

//         System.out.println(al1);

//         // get the iterator
//         Iterator<String> it1= al1.iterator();
//         System.out.println(it1.next());

//         // loop iterator collection
//         while (it1.hasNext()) {
//             System.out.println(it1.next());
//         }

//     }
// }







































































// import java.util.ArrayList;
// import java.util.Iterator;

// /**
//  * CJ28_iterator
//  */
// public class CJ28_iterator {

//     public static void main(String[] args) {
        
//         ArrayList<String> al1 = new ArrayList<String>();
        
//         al1.add("red");
//         al1.add("Green");
//         al1.add("Blue");
//         al1.add("yellow");
//         al1.add("pink");

//         System.out.println(al1);

//         // get the iterator
//         Iterator<String> it1= al1.iterator();
//         System.out.println(it1.next());

//         // loop iterator collection
//         while (it1.hasNext()) {
//             System.out.println(it1.next());
//         }

//         // remove iterator value
//         it1.remove();
//         while (it1.hasNext()) {
//             System.out.println("after remove value"+it1.next());
//         }


//     }
// }






























































// import java.util.ArrayList;
// import java.util.Iterator;

// /**
//  * CJ28_iterator
//  */
// public class CJ28_iterator {

//     public static void main(String[] args) {
        
//         ArrayList<String> al1 = new ArrayList<String>();
        
//         al1.add("red");
//         al1.add("Green");
//         al1.add("Blue");
//         al1.add("yellow");
//         al1.add("pink");

//         System.out.println(al1);

//         // get the iterator
//         Iterator<String> it1= al1.iterator();
//         System.out.println(it1.next());

//         // loop iterator collection
//         while (it1.hasNext()) {
//             System.out.println(it1.next());
//         }

//         if(it1=="Blue")
//         {
//             it1.remove();
//         }
//         System.out.println(it1);

//         // remove iterator value
//         // it1.remove();
//         // while (it1.hasNext()) {
//         //     System.out.println("after remove value"+it1.next());
//         // }


//     }
// }
























































import java.util.ArrayList;
import java.util.Iterator;

/**
 * CJ28_iterator
 */
public class CJ28_iterator {

    public static void main(String[] args) {
        
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);

        System.out.println(al1);

        // get the iterator
        Iterator<Integer> it1= al1.iterator();
        System.out.println(it1.next());

        // loop iterator collection
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        while (it1.hasNext()) {
            Integer i=it1.next();
            if(i<3)
                {
                    it1.remove();
                }
        }
        System.out.println(it1);
        
        System.out.println("after remove"+it1);

        // remove iterator value
        // it1.remove();
        // while (it1.hasNext()) {
        //     System.out.println("after remove value"+it1.next());
        // }


    }
}




