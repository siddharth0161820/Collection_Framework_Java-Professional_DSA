package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTesting {
    public static void main(String[] args) {
        //1> Implementation Deque
        Deque<Integer>q = new ArrayDeque<>();

        //2>Methods()
        //ADDING ELEMENTS IN DEQUE---FIFO

          //2.1>offerFirst(E element)--> adding elements to the first...
        q.offerFirst(1);
           q.offerFirst(2);
        System.out.println(q);//act as stack as using offerFirst()

           //2.2>offerLast(E element)-->Adding elements to the last
        System.out.println(q.offerLast(21));
        System.out.println(q);

        //DELETING ELEMENTS FROM DEQUE
        System.out.println("DELETING ELEMENTS FROM DEQUE");
           //3.1> pollFirst()--remove elements frm HEAD OF THE QUEUE
        System.out.println(q);
        System.out.println(q.pollFirst());
        System.out.println(q);
        System.out.println(q.pollLast());
        System.out.println(q);
    }
}
