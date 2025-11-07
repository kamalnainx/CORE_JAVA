package chapter02;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean Myboolean,Myboolean1,Myboolean2;
        String name,mobilenumber;
        do{
        
        System.out.println("Enter the name: ");
        name = input.nextLine();
        Pattern Mypattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher Mymatcher = Mypattern.matcher(name);
        Myboolean = Mymatcher.matches();
        if(Myboolean==false){
            System.out.println("Please enter the correct name");
            Myboolean=true;
        }
        else{
            Myboolean=false;
        }
        }
        while(Myboolean==true);
        do{
        
        System.out.println("Enter the mobile number: ");
        mobilenumber = input.nextLine();
        
        Pattern Mypattern1 = Pattern.compile("(\\d-)?(\\d{3}-)?\\d{4}-\\d{4}");
        Matcher Mymatcher1 = Mypattern1.matcher(mobilenumber);
        Myboolean1 = Mymatcher1.matches();
        if(Myboolean1==false){
            System.out.println("Please enter the correct mobile number");
            Myboolean1=true;
        }
        else{
            Myboolean1=false;
        }
        }
        while(Myboolean1==true);
        
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Name and Mobile Number are correct");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Mobile Number: "+mobilenumber);
        
        
        
        

    }
}
