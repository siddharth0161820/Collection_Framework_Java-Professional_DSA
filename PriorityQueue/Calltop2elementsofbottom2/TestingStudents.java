package PriorityQueue.Calltop2elementsofbottom2;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestingStudents {
    public static void main(String[] args) {

        //1>Implement List Interface to store marks...
        List<Student>l1=new ArrayList<>();

        //2> Add elements/data to the list
        l1.add(new Student("Mahadev",70,80));
        l1.add(new Student("Shiv",38,10));
        l1.add(new Student("Bhole",100,38));
        l1.add(new Student("Nilkanth",40,88));
        l1.add(new Student("UmapatiShambhoo",97,19));

        //3>Implement PriorityQueue for Student class & add elements frm list to priority queue
        Queue<Student>q1 = new PriorityQueue<>(l1);

        //4> Get the Top K=3 students according to their Mathematics Marks...

        //to get top 3 elements we need list implementation...
        List<Student>top3=new ArrayList<>();
        int index=0;
        while (!q1.isEmpty()){
            if(index==3) {
                break;
            }
            top3.add(q1.poll());//poll()--get & remove elements frm the HEAD of Queue
            index++;
        }

        System.out.println(top3);
        System.out.println(q1);
    }

    }

