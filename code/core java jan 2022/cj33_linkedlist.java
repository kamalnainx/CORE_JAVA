// linked list
// linked list is class of java from java collection which contain may objects of the same type 
// just like:- arraylist

// linked list methods 
// 1 addfirst()
// 2 addlast()
// 3 removefirst()
// 4 removelast()
// 5 getfirst()
// 6 getlast()








// create linkedlist
// import java.util.LinkedList;
// /**
//  * cj33_linkedlist
//  */
// public class cj33_linkedlist
// {
//     public static void main(String[] args)
//     {
//         LinkedList<String> ll1=new LinkedList<String>();    
//         ll1.add("linkedlist 1");
//         ll1.add("linkedlist 2");
//         ll1.add("linkedlist 3");
//         ll1.add("linkedlist 4");
//         ll1.add("linkedlist 5");
        
//         System.out.println(ll1);
//     }
    
// }




























































// import java.util.LinkedList;
// /**
//  * cj33_linkedlist
//  */
// public class cj33_linkedlist
// {
//     public static void main(String[] args)
//     {
//         LinkedList<String> ll1=new LinkedList<String>();    
//         ll1.add("linkedlist 1");
//         ll1.add("linkedlist 2");
//         ll1.add("linkedlist 3");
//         ll1.add("linkedlist 4");
//         ll1.add("linkedlist 5");
        
//         System.out.println(ll1);

//         ll1.addFirst("linkedlist 0");

//         System.out.println(ll1);
//     }    
// }














































































// add item in first index and last index
import java.util.LinkedList;
/**
 * cj33_linkedlist
 */
public class cj33_linkedlist
{
    public static void main(String[] args)
    {
        LinkedList<String> ll1=new LinkedList<String>();    
        ll1.add("linkedlist 1");
        ll1.add("linkedlist 2");
        ll1.add("linkedlist 3");
        ll1.add("linkedlist 4");
        ll1.add("linkedlist 5");
        
        System.out.println(ll1);

        //add item in first index
        ll1.addFirst("linkedlist 0");

        System.out.println(ll1);


        //add item in first index
        ll1.addLast("linkedlist 6");

        System.out.println(ll1);
        

        //get itme first value
        System.out.println(ll1.getFirst());

        //get last itme value
        System.out.println(ll1.getLast());

        
    }    
}





























































// // add, display, delete item from first index and last  index
// import java.util.LinkedList;
// /**
//  * cj33_linkedlist
//  */
// public class cj33_linkedlist
// {
//     public static void main(String[] args)
//     {
//         LinkedList<String> ll1=new LinkedList<String>();    
//         ll1.add("linkedlist 1");
//         ll1.add("linkedlist 2");
//         ll1.add("linkedlist 3");
//         ll1.add("linkedlist 4");
//         ll1.add("linkedlist 5");
        
//         System.out.println(ll1);

//         //add item in first index
//         ll1.addFirst("linkedlist 0");

//         System.out.println(ll1);


//         //add item in first index
//         ll1.addLast("linkedlist 6");

//         System.out.println(ll1);
        

//         //get itme first value
//         System.out.println(ll1.getFirst());

//         //get last itme value
//         System.out.println(ll1.getLast());

//         //remove itme first value
//         System.out.println("remove "+ ll1.removeFirst());

//         //get first itme value
//         System.out.println(ll1.getFirst());

        
//     }    
// }























































// // add, display, delete item from first index and last  index
// import java.util.LinkedList;
// /**
//  * cj33_linkedlist
//  */
// public class cj33_linkedlist
// {
//     public static void main(String[] args)
//     {
//         LinkedList<String> ll1=new LinkedList<String>();    
//         ll1.add("linkedlist 1");
//         ll1.add("linkedlist 2");
//         ll1.add("linkedlist 3");
//         ll1.add("linkedlist 4");
//         ll1.add("linkedlist 5");
        
//         System.out.println(ll1);

//         //add item in first index
//         ll1.addFirst("linkedlist 0");

//         System.out.println(ll1);


//         //add item in first index
//         ll1.addLast("linkedlist 6");

//         System.out.println(ll1);
        

//         //get itme first value
//         System.out.println(ll1.getFirst());

//         //get last itme value
//         System.out.println(ll1.getLast());

//         //remove itme first value
//         System.out.println("remove "+ ll1.removeFirst());

//         //get first itme value
//         System.out.println(ll1.getFirst());


//         //remove itme last value
//         System.out.println("last "+ ll1.removeLast());

//         //get last itme value
//         System.out.println(ll1.getLast());
//     }    
// }
