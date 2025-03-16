package SetInterface.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestingHashSet {
    public static void main(String[] args) {
        //1> Implementation SET INTERFACE...
        Set<Integer> set=new HashSet<>();

        //2>Methods()
        //2.1> add()
        System.out.println( set.add(1));
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        System.out.println("Adding duplicte elements to the set not allowed : "+set.add(3));
        System.out.println("ELEMENTS IN THE SET INTERFACE: "+set);

        //2.2> create a set interface from an ArrayList
        //bcz  set interface takes a collection as well...

        //so, create an arrayList
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(211);

        Set<Integer>set1=new HashSet<>(list);
        System.out.println( set.add(1));
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
      set1.add(120192);
        System.out.print("Elements in the set1 Interface: "+set1);


        //3>Iterate over the set can be done as set is a collection
           //& collection implements iterable...
        System.out.println(" ");
        System.out.println("HASHSET............");
        System.out.println("No ordering is followed as it's Hashset nature...");
        for(int ii:set1){
            System.out.println(ii);

        }

    }
}
