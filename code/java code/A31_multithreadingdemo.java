// /**
//  * mtdcreate
//  */
// class mtdcreate extends Thread
// {
//     public void run()
//     {
//         try
//         {
//             System.out.println("the thread"+Thread.currentThread().getId()+" is running");
//         }
//         catch(Exception e)
//         {
//             System.out.println("exception is caught");
//         }
//     }
    
// }

// public class A31_multithreadingdemo
// {
//     public static void main(String[] args)
//     {
//         int n=8;
//         for(int i=0;i<n;i++)
//         {
//             mtdcreate mtd= new mtdcreate();
//             mtd.start();            
//         }

//     }    
// }

/**
 * InnerA31_multithreadingdemo
 */
class InnerA31_multithreadingdemo extends Thread
{
    @Override
    public void run()
    {
        for (int i=0;i<2;i++)
        {
            try 
            {
                Thread.sleep(500);
                System.out.println("current thread:"+Thread.currentThread().getName());    
            }
            catch (Exception e)
            {
                System.out.println("exception has been caught"+e);
                //TODO: handle exception
            }
            System.out.println(i);
        }
    }
    
}


/**
 * A31_multithreadingdemo
 */
public class A31_multithreadingdemo
{
    public static void main(String[] args)
    {
        InnerA31_multithreadingdemo ia31mtd1=new InnerA31_multithreadingdemo();           
        InnerA31_multithreadingdemo ia31mtd2=new InnerA31_multithreadingdemo();           
        InnerA31_multithreadingdemo ia31mtd3=new InnerA31_multithreadingdemo();           
        
        ia31mtd1.start();

        try
        {
            System.out.println("current thread:"+Thread.currentThread().getName());
            ia31mtd1.join();    
        }
        catch (Exception e)
        {
            System.out.println("Exception beencaught"+e);
            //TODO: handle exception
        }
        ia31mtd2.start();
        try
        {
            System.out.println("current thread:"+Thread.currentThread().getName());
            ia31mtd2.join();    
        }
        catch (Exception e)
        {
            System.out.println("Exception beencaught"+e);
            //TODO: handle exception
        }

        ia31mtd3.start();
        try
        {
            System.out.println("current thread:"+Thread.currentThread().getName());
            ia31mtd3.join();    
        }
        catch (Exception e)
        {
            System.out.println("Exception beencaught"+e);
            //TODO: handle exception
        }
        

    }
    
}