package ssg.ssg22constructor;

public class Student {
    String name = "Emily";
    int age = 20;

    Student(String name, int age) {
        this.name = name;
        this.age = 22;
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student st = new Student("oliver", 21);
        System.out.print(st.name);
        System.out.print("," + st.age);
    }
}
