package chapter07;
import java.io.*;

public class FileWriteOperation {
    public static void main(String args[]){
        String input=null,file=null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Enter the file name you wish to write the data:");
            file = br.readLine();
            System.out.println("Enter the text to write into the file.");
            System.out.println("Enter the end to terminate the write operation.");
            do{
                
                input= br.readLine();
                if(input.equals("end")){
                    
                    break;
                }
                else
                {
                    
                    
                    
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                        
                        bw.write(input);
                      bw.newLine();
                    }catch(Exception e){
                        System.out.println(e);
                    } 
                }
            }while(input!=null);
        }
        catch(Exception e){
            System.out.println(e);
        }
                
    }
}
