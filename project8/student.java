package project8;

public class student {
    private int rollno;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    private String Stu_name;
    public student(int rollno, String stu_name) {
        this.rollno = rollno;
        Stu_name = stu_name;
    }
    public String getStu_name() {
        return Stu_name;
    }
    public void setStu_name(String stu_name) {
        Stu_name = stu_name;
    }
}
