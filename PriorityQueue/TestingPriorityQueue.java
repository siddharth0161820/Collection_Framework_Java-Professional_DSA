package PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestingPriorityQueue {
    public static void main(String[] args) {
        //1>Implementation PriorityQueue
        Queue<Integer>queue=new PriorityQueue<>();

        //2> Add elements to priority queue
         //use offer()
        queue.offer(1);
        queue.offer(2);
        queue.offer(0);
        queue.offer(100);

        //3>Traverse priorityQueue
        //QUESTION--Get top 2 elements frm the priorityQueue...

           //to get top 2 elements we need list implementation...
        List<Integer>top2=new ArrayList<>();
        int index=0;
        while (!queue.isEmpty()){
            if(index==2) {
                break;
            }
            top2.add(queue.poll());//poll()--get & remove elements frm the HEAD of Queue
              index++;
        }

        System.out.println(top2);
        System.out.println(queue);
    }
}
