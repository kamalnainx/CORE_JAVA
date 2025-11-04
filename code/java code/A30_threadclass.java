// /**
//  * A30_threadclass
//  */
// class A30_threadclass extends Thread
// {
//     public void run()
//     {
//         System.out.println("thread is running");
//     } 
//     public static void main(String[] args)
//     {
//         A30_threadclass a30_tc=new A30_threadclass();
//         a30_tc.start();
//     }

    
// }







// /**
//  * A30_threadclass
//  */
// class A30_threadclass implements Runnable
// {
//     public void run()
//     {
//         System.out.println("thread is Runnable");
//     } 
//     public static void main(String[] args)
//     {
//         A30_threadclass a30_tc=new A30_threadclass();
//         Thread tc=new Thread(a30_tc);
        
//         tc.start();

//     }

    
// }





/**
 * A30_threadclass
 */
class A30_threadclass extends Thread
{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            try
            {
                Thread.sleep(500);    
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
                //TODO: handle exception
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        A30_threadclass a30_th1=new A30_threadclass();
        A30_threadclass a30_th2=new A30_threadclass();
        
        a30_th1.start();
        a30_th2.start();
        
    }
}