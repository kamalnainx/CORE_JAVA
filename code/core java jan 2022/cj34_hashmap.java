import java.util.HashMap;

public class cj34_hashmap
{
    public static void main(String[] args) {
        HashMap<String, String> hp1 = new HashMap<String, String>();
        hp1.put("name","raj");
        hp1.put("age","20");
        hp1.put("height","5.0");
        hp1.put("car","BMW");
        
        System.out.println(hp1);
        System.out.println(hp1.get("name"));
        
        hp1.remove("car");
        System.out.println(hp1);
        
        System.out.println(hp1.size());
        
        for(String i:hp1.keySet())
        {
           System.out.println(i);
        }
        
        for(String i:hp1.values())
        {
           System.out.println(i);
        }
        
        for(String i:hp1.keySet())
        {
           System.out.println("key : "+i+" value: "+ hp1.get(i));
        }
        
    }
}
