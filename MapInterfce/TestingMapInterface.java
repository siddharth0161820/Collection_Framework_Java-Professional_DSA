package MapInterfce;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestingMapInterface {
    public static void main(String[] args) {

        //1> Implement Map Interface...
        Map<String,Integer>map=new HashMap();

        //2>Methods()
          //2.1>put()
        map.put("Siddharth",0); //key-values
        map.put("Shankar",1);
        map.put("Shiva",2);
        map.put("Bhola",3);
        map.put("Aise",99);

        //2.2> get()
        System.out.println(map.get("Siddharth"));
        //2.3> if values doesn't exist and we don't need null values
        System.out.println(map.getOrDefault("asf",0));
        System.out.println(map.getOrDefault("Shankar",1));

        //2.3>containsKey()
        System.out.println(map.containsKey("Shankar"));

        //2.4>remove()
       map.remove("Aise");
        System.out.println(map.containsKey("Aise"));

       //2.5 keySet()
        System.out.println(map.keySet());

        //2.6>values()
        System.out.println(map.values());

        //2.7>size()
        System.out.println(map.size());

        //2.8>boolean isEmpty()
        System.out.println(map.isEmpty());

        //TWO WAYS TO TRAVERSE A MAP
          //1>USING ENTRY SET FUNCTION
        Set<Map.Entry<String,Integer>>entrySet =map.entrySet();
        for (Map.Entry<String,Integer>entry:entrySet){
            System.out.println(entry.getKey() + ","+entry.getValue());
        }

        //2>2nd method
        System.out.println("\n");
        System.out.println("2nd method");
        Set<String> keySets=map.keySet();
        for (String key:keySets){
            System.out.println(key + ","+ map.get(key));
        }
    }
}
