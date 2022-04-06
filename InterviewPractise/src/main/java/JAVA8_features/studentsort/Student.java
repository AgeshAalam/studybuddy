package JAVA8_features.studentsort;

public class Student {
    private String Sname;
    private int marks;

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String sname, int marks) {
        Sname = sname;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sname='" + Sname + '\'' +
                ", marks=" + marks +
                '}';
    }
}
