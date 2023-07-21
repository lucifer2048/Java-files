class Student1 {
    int roll_no;
    String stu_name;
    double m1,m2,m3,m4;
    Student1()
    {
        roll_no=1001;
        stu_name="Rohith";
        m1=80.0;
        m2=81.0;
        m3=84.0;
        m4=88.0;
    }
}

class Main{
    public static void main(String[] args) {
        
        {
            Student1 s1=new Student1();
            System.out.println(s1.roll_no+" "+s1.stu_name+" "+s1.m1);
            System.out.println(s1.m2+" "+s1.m3+" "+s1.m4);
           Student1 s2=new Student1();
            System.out.println(s2.roll_no+" "+s2.stu_name+" "+s2.m1);
            System.out.println(s2.m2+" "+s2.m3+" "+s1.m4);
        }
    }
}
