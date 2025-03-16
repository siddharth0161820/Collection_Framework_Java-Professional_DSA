package SetInterface.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestingLinkedHashSet {
    public static void main(String[] args) {
        //1>Implementation of LinkedHashSet...
        Set<Integer>set = new LinkedHashSet<>();

        //2> Methods()
           //2.1> add()
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(0);

        //traverse LinkedHashSet--insertion order is maintained...
        System.out.println(" LinkedHashSet--insertion order is maintained...");
        for (int INFINITY:set){
            System.out.println(INFINITY);
        }

        System.out.println("HashSet insertion order is not maintained...");
        Set<Integer>inte = new HashSet<>();
        // add()
        inte.add(2);
        inte.add(3);
        inte.add(4);
        inte.add(2);
        inte.add(0);

        //traverse LHashSet--insertion order is not maintained...
        System.out.println(" HashSet--insertion order is not maintained...");
        for (int INFINITY:inte){
            System.out.println(INFINITY);
        }
    }
}
