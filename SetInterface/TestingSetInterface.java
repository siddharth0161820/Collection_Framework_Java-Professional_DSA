package SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestingSetInterface {
    public static void main(String[] args) {
        //1> Implementation SET INTERFACE...
        Set<Integer>set=new HashSet<>();


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
        List<Integer>list=new ArrayList<>();
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
        System.out.println("Elements in the set1 Interface: "+set1);

      //2.3>remove()
        System.out.println(set1.remove(7));
        System.out.println("Elements in the set1 Interface: "+set1);

      //2.4> contains()-set stores particular element or not...
        System.out.println(set.contains(211));
        System.out.println(set1.contains(211));


        //2.5> size()--check the number of elements in the set
        System.out.println("set: "+set);
        System.out.println("Number of elements in set: "+set.size());
        System.out.println("set1: "+set1);
        System.out.println("Number of elements in set1: "+set.size());

        //2.6>clear()--empty the set
        Set<String>sc=new HashSet<>();
        sc.add("Burai khatam");
        sc.add("Acchai ki Jeet");
        System.out.println("sc: "+sc);
        System.out.println(sc.size());
        sc.clear();
        System.out.println("sc: "+sc);

        //2.7>isEmpty()--check if et is empty or not...
        System.out.println("set empty: "+set.isEmpty());
        System.out.println("set1 empty: "+set1.isEmpty());
        System.out.println("sc empty: "+sc.isEmpty());

        //2.7>retainAll()
        System.out.println("Understanding retainAll()");
        System.out.println("SET: "+set);
        System.out.println("SET1: "+set1);
        System.out.println("After retaining");
        set.retainAll(set1);
        System.out.println("SET: "+set);
        System.out.println("SET1: "+set1);

        //2.8>removeAll()
        System.out.println("Understanding removeAll()");
        System.out.println("SET: "+set);
        System.out.println("SET1: "+set1);
        System.out.println("After applying removeAll()");
        set.removeAll(set1);
        System.out.println("SET: "+set);
        System.out.println("SET1: "+set1);

        //2.9> for union apply addAll()
        System.out.println("Understanding Union");
        System.out.println("SET: "+set);
        System.out.println("SET1: "+set1);
        System.out.println("After applying addAll()");
        set.addAll(set1);
        System.out.println("SET: "+set);
        System.out.println("SET1: "+set1);

    }
}
