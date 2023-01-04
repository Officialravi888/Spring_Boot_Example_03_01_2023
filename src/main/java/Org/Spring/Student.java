package Org.Spring;

public class Student {
    private int studentid;
    private String studentName;
    private String studentSAddreas;

    public Student(int studentid, String studentName, String studentSAddreas) {
        this.studentid = studentid;
        this.studentName = studentName;
        this.studentSAddreas = studentSAddreas;
    }


    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSAddreas() {
        return studentSAddreas;
    }

    public void setStudentSAddreas(String studentSAddreas) {
        this.studentSAddreas = studentSAddreas;
    }


    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentName='" + studentName + '\'' +
                ", studentSAddreas='" + studentSAddreas + '\'' +
                '}';
    }
}