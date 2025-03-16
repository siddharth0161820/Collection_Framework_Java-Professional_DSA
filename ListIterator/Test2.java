package ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test2 {
    public static void main(String[] args) {
        //1> Implement LinkedList...
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //2>Creating a ListIterator
        ListIterator<Integer> iterator =list.listIterator(2);

        //3> print the very first element of the ArrayList
        System.out.println("ArrayList elements are: "+list);
        //using next()
        System.out.println("Forward iteration : "+iterator.next());

        //4>print all the next elements
        while (iterator.hasNext()){
            System.out.print(iterator.next() +" ");
        }

        //5> print all the previous elements of the arraylist...
        System.out.println();
        System.out.println("Printing  backwards iteration");
        System.out.println(iterator.previous());


        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() +" ");
        }
    }
}
