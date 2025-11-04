class Simple{
    public static void main(String args[])
    {
        System.out.print("Hello world! \n");//output in java
        int data=50;//variable
        System.out.print(data);//var in same line print
        System.out.println(data);//var in next line println
        //    +,   -,  *,  /, %.
        // =, +=, -=, *=, /=, %=.
        data=data+data;
        System.out.println(data);//100
        data=data-data;
        System.out.println(data);//0
        // int in1=2.4;
        // System.out.println(in1);//2 error to run we can't add float value in int data type. 
        float fn1=2.4f;
        System.out.println(fn1);//2.4
        byte b=(byte)150;
        System.out.println(b);
        
        // int x=20;
        // if(x>18)
        // {
        //     System.out.println("the number is above 18");
        // }

        // int x=10;
        // if(x>18)
        // {
        //     System.out.println("the number is 19 or above ");
        // }
        // else
        // {
        //     System.out.println("this anumber is 17 or less");
        // }

        int x=10;
        if(x>18)
        {
            System.out.println("the number is 19 or above ");
        }
        else
        {
            if(x<18)
            {
            System.out.println("this anumber is 17 or less");
            }
            else
            {
                System.out.print("this numner is 18");
            }
        }

        
    }
}