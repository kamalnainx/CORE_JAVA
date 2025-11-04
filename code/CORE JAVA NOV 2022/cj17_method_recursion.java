/**
 * cj17_method_recursion
 */
public class cj17_method_recursion {

    public static int fun1(int k) {
        if(k>0)
            return k+fun1(k-1);
        else
            return 0;
    }
    public static void main(String[] args) {
        System.out.println(fun1(5));
    }
}