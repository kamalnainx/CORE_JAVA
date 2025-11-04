// what is NIO in java.
// NIO is new input output system in java.
// NIO give different way of working in java with i/o system then standeard io or
// its an alternate io api for java.

// NIO's components is:-
// 1.  Channels        - Datagram, Socket, File, ServerSocket Channel 
// 2.  Selectors       - Thread, object
// 3.  Non-blocking io - recvfrom(), 1. input 2 output java block
// 4.  Buffers         - char, Double, int, Float, Long, Short, Byte Buffer




// import java.io.*;
// import java.nio.*;
// import java.nio.channels.ReadableByteChannel;
// import java.nio.channels.WritableByteChannel;
// /**
//  * ACJ14_nio
//  */
// public class ACJ14_nio
// {
//     public static void main(String[] args) throws IOException
//     {
//         FileInputStream input1   = new FileInputStream("file/demo1.txt");
//         ReadableByteChannel rbc1 = input1.getChannel();
//         FileOutputStream output1 = new FileOutputStream("file/demo10.txt");
//         WritableByteChannel wbc1 = output1.getChannel();
//         copyData(rbc1,wbc1);
//         rbc1.close();
//         wbc1.close();
//     }
//     private static void copyData(ReadableByteChannel src, WritableByteChannel dest)throws IOException
//     {
//         ByteBuffer buffer = ByteBuffer.allocateDirect(20*1024);
//         while(src.read(buffer)!=-1)
//         {
//             buffer.flip();
//             while(buffer.hasRemaining())
//             {
//                 dest.write(buffer);
//             }
//             buffer.clear();
//         }
//     }
// }

















// import java.io.*;
// import java.nio.*;
// import java.nio.channels.ReadableByteChannel;
// import java.nio.channels.WritableByteChannel;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// /**
//  * ACJ14_nio
//  */
// public class ACJ14_nio
// {
//     public static void main(String[] args) 
//     {
//         Path file=null;
//         BufferedReader br1=null;
//         try
//         {
//             file=Paths.get("file/demo1.txt");
//             InputStream input1   = Files.newInputStream(file);
//             br1 new BufferedReader(new InputStreamReader(input1));
//             System.out.println("read text file:- "+br1.readLine());
//         }
//         catch(IOException e)
//         {
//             e.printStackTrace();
//         }
//         finally
//         {
//             try{
//                 br1.close();
//             }
//             catch(IOException ioe)
//             {
//                 ioe.printStackTrace();
//             }
//         }
//     }
// }







// data transfer between channels 



// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.nio.channels.FileChannel;
// import java.nio.channels.WritableByteChannel;
// /**
//  * ACJ15_nio1
//  */
// public class ACJ15_nio1
// {
//     public static void main(String[] argv) throws Exception
//     {
//         String[] if1= new String[]
//         {
//             "file/demo1.txt","file/demo2.txt"
//         };
//         String of1="file/outputdemo2.txt";
//         FileOutputStream output1= new FileOutputStream(new File(of1));
//         WritableByteChannel wbc1=output1.getChannel();
//         for(int j=0; j<if1.length;j++)
//         {
//             FileInputStream input10 = new FileInputStream(if1[j]);
//             FileChannel ic1=input10.getChannel();
//             ic1.transferTo(0, ic1.size(), wbc1);
//             ic1.close();
//             input10.close();
//         }
//         wbc1.close();
//         output1.close();
//     }
    
// }













// import java.nio.ByteBuffer;
// import java.nio.CharBuffer;
// import java.nio.charset.Charset;
// /**
//  * ACJ15_nio1
//  */
// public class ACJ15_nio1
// {
//     public static void main(String[] args)
//     {
//         Charset cs1=Charset.forName("UTF-8");
//         System.out.println(cs1.displayName(locale));
//         System.out.println(cs1.canEncode());
//         String s1="this is char string value";

//         ByteBuffer bb1=ByteBuffer.wrap(s1.getBytes());
//         CharBuffer cb1=cs1.decode(bb1);
//         ByteBuffer newbb=cs1.encode(cb1);
//         while(newbb.hasRemaining())
//         {
//             char c1=(char) newbb.get();
//             System.out.println(c1);
//         }
//         newbb.clear();
//     }
// }
