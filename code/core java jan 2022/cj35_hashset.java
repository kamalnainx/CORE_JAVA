import java.util.HashSet;

public class cj35_hashset
{
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("name_raj");
        hs1.add("age_20");
        hs1.add("height_5.0");
        hs1.add("car_BMW");
        
        System.out.println(hs1);
        
        System.out.println(hs1.contains("age_20"));
        
        hs1.remove("car_BMW");
        System.out.println(hs1);
        
        System.out.println(hs1.size());
        
        for(String i : hs1)
        {
           System.out.println(i);
        }
        
        hs1.clear();
        System.out.println(hs1);        
    }
}
