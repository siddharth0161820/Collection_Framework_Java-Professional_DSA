package CreatingArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestingWithRidhi {
    public static void main(String[] args) {

        //1>Implement/Create an ArrayList...
        List<Integer> list = new ArrayList<>();

        //2>Methods() for ArrayList...

        //2.1>add()--> As we add elements it gets adding into the ArrayList.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        //Print elements using for-each loop
        System.out.println("Printing elements using arrayList");
        for (int i:list){
            System.out.print(i+ " ");
        }

        //Printing elements directly...
        System.out.println();
        System.out.println("Printing elements directly");
        System.out.println(list);

        //2.2>get()--> returns the elements at the specified position/index.
        System.out.println(list.get(3));

        //2.3>add(int index, E element)-->Add elements at any specified index...
        System.out.println("Before adding elements:"+list);
        list.add(0,21);
        System.out.println("After adding eleemnts at specified position: "+list);

        //2.4>remove(Object o)--> remove the first occurrence of the specified element

        System.out.println(list.remove(2));
        System.out.println(list);

        //2.5>set(int index,E element)-->replace the element at the specified position..

        System.out.println(list.set(3,31));
        System.out.println(list);

        //2.6>size()--returns the number of elements in the arraylist/size of arraylist...
        System.out.println("Size of the arraylist: "+list.size());

        //2.7>>clear()-->removes all of the elements
        List<Integer>list1=new ArrayList<>();
        list1.add(21);
        list1.add(31);
        list1.add(11);
        list1.add(41);
        System.out.println("Array 2 is: "+list1);
        list1.clear();
        System.out.println(list1.size());
        System.out.println(list1);

        //2.8> contains(Object o)-->Returns true if the list contains the specified elements
        System.out.println(list.contains(321));
        System.out.println(list.contains(7));

        //2.9>indexOf(object o)--> Returns the index of the elements if exists else returns -1.

        System.out.println(list.indexOf(7));

        System.out.println(list1.indexOf(21));
       /////////////////////////////////////////////////////////////
       //Extra Ridhi
        //2.10>If we want to create a new arrayList using the old/previous arrayList
         //copy of previous arrayList
        List<Integer>list3 = new ArrayList<>(list);//use collections as arguments
        list3.add(1001);
        list3.add(2001);
        list3.add(3001);
        list3.add(4001);
        list3.add(5001);
        System.out.println(list);
        System.out.println(list3);

        //2.11>addAll()
        List<Integer>list4 = new ArrayList<>();
        list4.add(1001);
        list4.add(2001);
        list4.add(3001);
        list4.add(4001);
        list4.add(5001);
        //If we want to add elements of arraylist1 after current arraylist use addAll()

        list4.addAll(list);
        System.out.println(list);
        System.out.println(list4);

        //2.12>sublist()
       list4.subList(0,3); //last index not included(exclusive)
        System.out.println(list4.subList(0,3));





    }
}
