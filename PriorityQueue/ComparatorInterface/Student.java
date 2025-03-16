package PriorityQueue.ComparatorInterface;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    //Implement compare()
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getMathematicsMarks() - o1.getPhysicsMarks();
    }

    //1> Attributes
    private String studentName;
    private int mathematicsMarks;
    private int physicsMarks;

    //2> Parameterized constructor
    public Student(String studentName, int mathematicsMarks, int physicsMarks) {
        this.studentName = studentName;
        this.physicsMarks = physicsMarks;
        this.mathematicsMarks = mathematicsMarks;
    }

    //3> Getter-Setter methods()
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public int getMathematicsMarks() {
        return mathematicsMarks;
    }

    public void setMathematicsMarks(int mathematicsMarks) {
        this.mathematicsMarks = mathematicsMarks;
    }



    public String toString() {
        return  "[StudentsName: "+studentName + "Maths: " + mathematicsMarks + " Pysics: " + physicsMarks+"]";

    }
}
