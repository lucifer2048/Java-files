package project8;

public class javaapplication166 {
    public static void main(String[] args) {
        student s1 = new student(1001, "rohith");
        System.out.println(s1.getRollno());
        System.out.println(s1.getStu_name());
        s1.setRollno(1002);
        System.out.println(s1.getRollno());
        s1.setStu_name("rohith manjunath");
        System.out.println("new student name "+s1.getStu_name());
    }
}
