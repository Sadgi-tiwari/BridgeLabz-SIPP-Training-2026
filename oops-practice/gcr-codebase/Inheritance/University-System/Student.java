public class Student extends Person {
    private final int studentId;   // final variable
    protected double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);          // calls Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}
