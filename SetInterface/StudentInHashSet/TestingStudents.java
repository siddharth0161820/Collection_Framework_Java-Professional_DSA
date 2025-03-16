package SetInterface.StudentInHashSet;

import java.util.*;

public class TestingStudents {
    public static void main(String[] args) {

        //1>Implement List Interface to store marks...
        List<Student> l1 = new ArrayList<>();

        //2> Add elements/data to the list
        l1.add(new Student("Mahadev ", 70, 80));
        l1.add(new Student("Shiv ", 38, 10));
        l1.add(new Student("Bhole ", 100, 38));
        l1.add(new Student("Nilkanth ", 40, 88));
        l1.add(new Student("UmapatiShambhoo ", 97, 19));


        //3> Add elements of list toHashSet
        Set<Student>s1=new HashSet<>(l1);

        //4> now iterate...
        for (Student a:s1){
            System.out.print(a+ " , ");
        }
        //5> check particular element in the set or not
          //using contains()
        System.out.println("\n");
        System.out.println( s1.contains(new Student("Nilkanth ", 40, 88)));
    }

    }


