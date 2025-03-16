package PriorityQueue.Calltop3studentswithmathsmarksusing2options;

public class Student implements Comparable<Student>{

    //Implement compareTo()
       //here conditions are
    //1> current object<other object;return any -ve value
    //2> current object>other object;return any +ve value
    //3> current object==other object;return any 0 value

    @Override
    public int compareTo(Student o) {
//        if (this.mathematicsMarks<o.mathematicsMarks){
//            return -1;
//        }
//        if (this.mathematicsMarks>o.mathematicsMarks){
//            return 1;
//        }
//        if (this.mathematicsMarks==o.mathematicsMarks){
//            return 0;
//        }
        System.out.println("compareTo() called");
        return o.mathematicsMarks-this.mathematicsMarks;
    }


    //1> Attributes
    private String studentName;
    private int mathematicsMarks;
    private int physicsMarks;

    //2> Parameterized constructor
    public Student(String studentName, int mathematicsMarks, int physicsMarks) {
        this.studentName=studentName;
        this.mathematicsMarks = mathematicsMarks;
        this.physicsMarks = physicsMarks;

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

    //4>toString()
    public String toString() {
        return  "[StudentsName: "+studentName + "Maths: " + mathematicsMarks + " Pysics: " + physicsMarks+"]";

    }
}
