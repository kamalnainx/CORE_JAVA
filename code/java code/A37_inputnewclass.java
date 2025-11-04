// import java.io.*;

// public class A37_inputnewclass
// {
//     public static void main(String[] args) throws Exception
//     {
//         InputStream a37_is =null;
//         try
//         {
//             a37_is= new FileInputStrem("demo1.txt");
//             System.out.println("char :" + (char)a37_is.read());
//             System.out.println("char :" + (char)a37_is.read());
//             System.out.println("char :" + (char)a37_is.read());
            
//             a37_is.skip(1);
//             System.out.println("skip() method comes to play");
//             System.out.println("mark() method comes to play");
//             System.out.println("char :" + (char)a37_is.read());
//             System.out.println("char :" + (char)a37_is.read());
//             System.out.println("char :" + (char)a37_is.read());
            
//             boolean check=a37_is.marksupperted();
//             if(a37_is.marksupperted())
//             {
//                 a37_is.reset();
//                 System.out.println("reset() invoked");
//                 System.out.println("char :" + (char)a37_is.read());
//                 System.out.println("char :" + (char)a37_is.read());
//             }
//             else
//             {
//                 System.out.println("a37_is.marksupported() not supported  ");
//             }
//             System.out.println("a37_is.marksupported() supported reset() "+ check);
//         }
//         catch (Exception e)
//         {
//             e.printStackTrace();
//             //TODO: handle exception
//         }
//         finally
//         {
//             if(a37_is!=null)
//             {
//                 a37_is.close();
//             }
//         }
//     }
// }