package ssg.ssg16varargs;

public class NoVarargs01 {
    public static void main(String[] args) {

        // iki sayinin toplyan bir method olustrun .

        dortSayiTopla(3, 5, 6, 6);// 4 Arguments
        ikiSayiTopla(45, 60);// 2 arguments
        display();// zero arguments

    }

    public static void ikiSayiTopla(int a, int b) {// 2 paremterli

        System.out.println(a + b);
    }

    public static void display() {// zero paramter
        System.out.println();
    }

    public static void dortSayiTopla(int a, int b, int c, int d) {// 4 paremterli

        System.out.println(a + b);
    }
}
