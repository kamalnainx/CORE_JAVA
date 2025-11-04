public class cj1_variables
{
    public static void main(String[] args) {
        String s1="Hello World!";
        System.out.println(s1);

        int i1=10;
        System.out.println(i1);

        float f1=10.10f;
        System.out.print("float is :-");
        System.out.println(f1);

        char c1='A';
        System.out.println("char is " + c1);

        boolean b1=true;
        System.out.println("boolean is :- "+b1);

        boolean b2=false;
        System.out.println("boolean is :-"+b2);

        boolean b3=2>1;
        System.out.println("2>1 :-"+b3);

        // byte = -128 to 127 

        byte bt1=103;
        System.out.println(bt1);

        // short = -327668 to 327667
        short st1=1000;
        System.out.println(st1);

        // int = -2147483648 to 2147483647 
        int i2=20;
        System.out.println("int is :- "+i2);

        // long = -9223372036854775808L to (9223372036854775807L)
        long l1=10000000L;
        System.out.println(l1);

        // float = -3.4e-038 to (3.4e-038)-1
        float f2=20.2f;
        System.out.println("float is :-"+f2);

        // double = -1.7e-308 to (1.7e-308)-1
        double d1=40.4d;
        System.out.println("double is :-"+d1);

        //scientific numbers
        float   f3= 35e3f;
        double  d3=  35E4d;
        System.out.println("float f3 is:- "+f3);
        System.out.println("double d3 is:- "+d3);
        
    }
}
