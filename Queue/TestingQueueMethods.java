package Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestingQueueMethods {
    public static void main(String[] args) {

        //1>Implementation/Declare Queue--FIFO
        Queue<Integer>queue=new LinkedList<>();

        //2> Queue Methods()
          //2.1> add()-->Add elements into the queue in TAIL.
             //If not able to add elements throws exception.
           queue.add(21);
        System.out.println(queue);

        //2.2> offer()-->Add elements into the queue in TAIL.
           //If not able to add elements it gives false as output.
        queue.offer(11);
        queue.offer(31);
        queue.offer(41);
        queue.offer(51);
        System.out.println("Elements in the queue is "+queue);

        //2.3>remove()--> removes element from HEAD
                 //gives exception if queue is empty
        System.out.println(queue);
        System.out.println("Elements at HEAD OF QUEUE: "+ queue.remove());
        System.out.println(queue);

        //2.4> poll()-->retrieves and removes elements frm the HEAD of queue
                //returns null if queue is empty.
        System.out.println(queue.poll());
        System.out.println(queue);

        //2.5> element()-->check elements at HEAD but don't remove it
                //gives exception if the queue is empty
        System.out.println(queue.element());

         //2.6> peek()--> check elements at HEAD but don't remove it
        //                //gives null if the queue is empty

        System.out.println(queue);
        System.out.println(queue.peek());
////////////////////////////////
        //2.7>collection framework methods()isEmpty()
        System.out.println(queue.isEmpty());
        System.out.println(!queue.isEmpty());
    }
}

//NOTE:---> Whenever we need normal queue/queue Interface
// we will use LinkedList class.
