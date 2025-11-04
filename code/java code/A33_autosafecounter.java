/**
 * InnerA33_autosafecounter
 */
class InnerA33_autosafecounter extends Thread
{
    int count=0;
    public void run()
    {
        int max=1000000;
        for(int i=0;i<max;i++)
        {
            count++;
        }
    }
}
/**
 * A33_autosafecounter
 */
public class A33_autosafecounter
{
    public static void main(String[] args)
    throws InterruptedException
    {
        InnerA33_autosafecounter ia33asc = new InnerA33_autosafecounter();
        Thread first=new Thread(ia33asc,"first");
        Thread second=new Thread(ia33asc,"second");

        // start
        first.start();
        second.start();

        // join
        first.join();
        second.join();
        System.out.println(ia33asc.count);
        
    }
    
}