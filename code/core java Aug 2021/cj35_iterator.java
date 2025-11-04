// import java.util.Iterator;
// import java.util.ArrayList;

// /**
//  * cj35_iterator
//  */
// public class cj35_iterator
// {

//     public static void main(String[] args)
//     {
//         ArrayList<String> al1= new ArrayList<String>();

//         al1.add("A4 Apple");
//         al1.add("dusra Apple");
//         al1.add("chota Apple");
//         al1.add("dumdar Apple");
//         al1.add("ekor Apple");
//         System.out.println(al1);    
//     }
// }




























// import java.util.Iterator;
// import java.util.ArrayList;

// /**
//  * cj35_iterator
//  */
// public class cj35_iterator
// {

//     public static void main(String[] args)
//     {
//         ArrayList<String> al1= new ArrayList<String>();
        
//         al1.add("A4 Apple");
//         al1.add("dusra Apple");
//         al1.add("chota Apple");
//         al1.add("dumdar Apple");
//         al1.add("ekor Apple");
//         System.out.println(al1);    

//         Iterator<String> i1=al1.iterator();
//         System.out.println(i1.next());
//     }
// }


























// import java.util.Iterator;
// import java.util.ArrayList;

// /**
//  * cj35_iterator
//  */
// public class cj35_iterator
// {

//     public static void main(String[] args)
//     {
//         ArrayList<String> al1= new ArrayList<String>();
        
//         al1.add("A4 Apple");
//         al1.add("dusra Apple");
//         al1.add("chota Apple");
//         al1.add("dumdar Apple");
//         al1.add("ekor Apple");
//         System.out.println(al1);    

//         Iterator<String> i1=al1.iterator();
//         System.out.println(i1.next());
//         System.out.println(i1.next());
//         System.out.println(i1.next());
//         System.out.println(i1.next());
//     }
// }









































































// import java.util.Iterator;
// import java.util.ArrayList;

// /**
//  * cj35_iterator
//  */
// public class cj35_iterator
// {

//     public static void main(String[] args)
//     {
//         ArrayList<String> al1= new ArrayList<String>();
        
//         al1.add("A4 Apple");
//         al1.add("dusra Apple");
//         al1.add("chota Apple");
//         al1.add("dumdar Apple");
//         al1.add("ekor Apple");
//         System.out.println(al1);    

//         Iterator<String> i1=al1.iterator();
//         // System.out.println(i1.next());
//         // System.out.println(i1.next());
//         // System.out.println(i1.next());
//         // System.out.println(i1.next());

//         for(int i=1; i<=al1.size();i++)
//         {
//             System.out.println(i1.next());
//         }
//     }
// }




































































// import java.util.Iterator;
// import java.util.ArrayList;

// /**
//  * cj35_iterator
//  */
// public class cj35_iterator
// {

//     public static void main(String[] args)
//     {
//         ArrayList<String> al1= new ArrayList<String>();
        
//         al1.add("A4 Apple");
//         al1.add("dusra Apple");
//         al1.add("chota Apple");
//         al1.add("dumdar Apple");
//         al1.add("ekor Apple");
//         System.out.println(al1);    

//         Iterator<String> i1=al1.iterator();
//         // System.out.println(i1.next());
//         // System.out.println(i1.next());
//         // System.out.println(i1.next());
//         // System.out.println(i1.next());

//         // for(int i=1; i<=al1.size();i++)
//         // {
//         //     System.out.println(i1.next());
//         // }
//             while (i1.hasNext())
//             {
//                 System.out.println(i1.next());    
//             }
//     }
// }
































































import java.util.Iterator;
import java.util.ArrayList;

/**
 * cj35_iterator
 */
public class cj35_iterator
{

    public static void main(String[] args)
    {
        ArrayList<String> al1= new ArrayList<String>();
        
        al1.add("A4 Apple");
        al1.add("dusra Apple");
        al1.add("chota Apple");
        al1.add("dumdar Apple");
        al1.add("ekor Apple");
        System.out.println(al1);    

        Iterator<String> i1=al1.iterator();
        // System.out.println(i1.next());
        // System.out.println(i1.next());
        // System.out.println(i1.next());
        // System.out.println(i1.next());

        // for(int i=1; i<=al1.size();i++)
        // {
        //     System.out.println(i1.next());
        // }
        while (i1.hasNext())
        {
            String s=i1.next();
            if(s=="chota Apple")
            {
                i1.remove();
            }
            else
            {
                System.out.println(al1);    
            }    
        }
    }
}