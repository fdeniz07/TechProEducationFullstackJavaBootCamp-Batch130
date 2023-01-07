package day22staticblocksconstructors;

public class Student {

    String name;
    int age;
    int grade;
    String studentId;
    String address;

    public Student(String name, int age, int grade, String studentId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentId = studentId;
        this.address = address;
    }

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", studentId='" + studentId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
