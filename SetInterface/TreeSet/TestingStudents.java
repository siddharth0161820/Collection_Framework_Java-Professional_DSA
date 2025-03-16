package SetInterface.TreeSet;

import java.util.*;

public class TestingStudents {
    public static void main(String[] args) {

        //1>Implement Treeset
//        Set<Student>set=new TreeSet<>();
//
//        //2> Add data/elements to the Treeset...
//        set.add(new Student("Mahadev ",70,80));
//        set.add(new Student("Shiv ",38,10));
//        set.add(new Student("Bhole ",100,38));
//        set.add(new Student("Nilkanth ",40,88));
//        set.add(new Student("UmapatiShambhoo ",97,19));
//
//        //3>Iterate through the TreeSet one by one....
//        System.out.println("Sorting done on the basis of maths marks");
//        for (Student s:set){
//            System.out.print(s + ",");
//        }

        //4> do sorting on the basis of physics marks...

        Set<Student>set1=new TreeSet<>((p1,p2)->p2.getPhysicsMarks()- p1.getPhysicsMarks());
        //2> Add data/elements to the Treeset...
        set1.add(new Student("Mahadev ",70,80));
        set1.add(new Student("Shiv ",38,10));
        set1.add(new Student("Bhole ",100,38));
        set1.add(new Student("Nilkanth ",40,88));
        set1.add(new Student("UmapatiShambhoo ",97,19));


        //3>Iterate through the TreeSet one by one....
       System.out.println("Sorting done on the basis of top physics marks");
      for (Student s:set1){
           System.out.print(s + ",");
      }

      //4> Understanding different methods() i.e. ceiling(),floor(),higher(),lower()
          NavigableSet<Integer>sett=new TreeSet<>();
      sett.add(8);
        sett.add(3);
        sett.add(1);
        sett.add(0);
        System.out.println("\n");
        System.out.println(" NavigableSetInterface returns descending view of the set ");
        //Iterate
        for (int p:sett){
            System.out.print(p +",");
        }

        //4>Methods()
           //4.1>floor()--find floor for a particular number
        System.out.println("\n");
        System.out.println("floor()");
        System.out.println(sett.floor(1));
        System.out.println(sett.floor(3));

        //4.2>higher()--number just greater than the respective number else return null if not exists

        System.out.println("higher()");
        System.out.println(sett.higher(3));
        System.out.println(sett.higher(8));


        //4.3>lower()--number just lesss than the respective number else return null if not exists

        System.out.println("lower()");
        System.out.println(sett.lower(3));
        System.out.println(sett.lower(0));


        //4.4>ceiling()-- least element greater than or equal to a particular element

        System.out.println("ceiling()");
        System.out.println(sett.ceiling(3));
        System.out.println(sett.ceiling(4));
        System.out.println(sett.ceiling(-1));


    }

    }

