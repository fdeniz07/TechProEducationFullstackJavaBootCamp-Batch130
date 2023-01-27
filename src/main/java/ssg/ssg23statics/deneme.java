package ssg.ssg23statics;

public class deneme {
    static int y;
    static int x;

    deneme(int i) {
        x += i;
        y += i;
    }

    public static void main(String[] args) {
        new deneme(2);
        deneme dnm = new deneme(3);
        System.out.println(dnm.x + "," + dnm.y);

    }
}
