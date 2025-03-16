package MapInterfce.TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;


public class TestingTreeMap {
    public static void main(String[] args) {
        //Implement Treeset
        NavigableMap<Integer, String> tmap = new TreeMap<>();

        //2>Methods()
         //2.1> put()
        tmap.put(0,"Siddharth");//key-values
        tmap.put(1,"Shankar");
        tmap.put(2,"Shiva");
        tmap.put(3,"Bhola");
        tmap.put(4,"dee");

        //2.2>remove()
        System.out.println(tmap.remove(4));

        System.out.println(tmap);

        //2.4> we need to sort elements in descending order use compartor
        NavigableMap<Integer, String> tmap1 = new TreeMap<>((s1,s2)->s2-s1);
        tmap1.put(0,"Siddharth");//key-values
        tmap1.put(1,"Shankar");
        tmap1.put(2,"Shiva");
        tmap1.put(3,"Bhola");

        System.out.println(tmap1);
    }
}
