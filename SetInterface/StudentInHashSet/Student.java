package SetInterface.StudentInHashSet;

import java.util.Objects;

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
    private int physicsMarks;
    private int mathematicsMarks;

    //2> Parameterized constructor
    public Student(String studentName, int physicsMarks, int mathematicsMarks) {
        this.studentName=studentName;
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

    //4>toString()
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentName='").append(studentName).append('\'');
        sb.append(", physicsMarks=").append(physicsMarks);
        sb.append(", mathematicsMarks=").append(mathematicsMarks);
        sb.append('}');
        return sb.toString();
    }

    //5> generate hashcode() and equals()...


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return physicsMarks == student.physicsMarks && mathematicsMarks == student.mathematicsMarks && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, physicsMarks, mathematicsMarks);
    }
}
