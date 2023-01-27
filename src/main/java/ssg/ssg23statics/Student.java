package ssg.ssg23statics;

public class Student {
    int number;
    String name;
    static String college = "ITS";

    Student(int r, String n, String college) {
        this.name = n;
        this.number = r;
        this.college = college;
    }

    public static void main(String args[]) {
        Student s1 = new Student(111, "Karan", "MIT");
        Student s2 = new Student(222, "Aryan", "Harvard");
        System.out.println(s1.number);
        System.out.println(s2.number);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.college);
        System.out.println(s2.college);

    }
}
