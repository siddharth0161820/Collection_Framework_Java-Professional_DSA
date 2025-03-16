package PriorityQueue.Calltop2elementsofbottom2;

public class Student {
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
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentName=").append(studentName);
        sb.append("physicsMarks=").append(physicsMarks);
        sb.append(", mathematicsMarks=").append(mathematicsMarks);
        sb.append('}');
        return sb.toString();
    }


}
