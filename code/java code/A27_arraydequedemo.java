import java.util.*;

public class A27_arraydequedemo
{
    public static void main(String[] agrs)
    {
        Deque<Integer> de_que= new ArrayDeque<Integer>(10);

        //add() method to insert value.
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
        
        for(Integer element : de_que)
        {
            System.out.println("Element:"+element);
        }
        System.out.println("using clear() ");
        de_que.clear();
        
        // addfirst()
        de_que.addFirst(500);
        de_que.addFirst(600);
        
        //addlast() 
        de_que.addLast(15);
        de_que.addLast(25);

        System.out.println("removed above value or element now");

        // use iterator():
        System.out.println("elements of deques using iterator");

        for(Iterator<Integer> itr=de_que.iterator(); itr.hasNext();)
        {
            System.out.println(itr.next());
        }

        System.out.println("head element using element():- "+ de_que.element());

        System.out.println("head element using getfirst"+de_que.getFirst());
        System.out.println("head element using getlast"+de_que.getLast());

        // for arraywork or toarray() method:
        Object[] arr=de_que.toArray();
        System.out.println("Array SIZE: "+arr.length);

        System.out.println("element of array");
        for(int i =0; i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
        
        System.out.println("head element"+ de_que.peek());

        // poll method => to get head
        System.out.println("head element of poll :"+de_que.poll());

        de_que.push(265);
        de_que.push(984);
        de_que.push(2365);
        
        // remove from head
        System.out.println("head element remove"+ de_que.remove());
        System.out.println("the final array element or value is "+de_que);
    }
}