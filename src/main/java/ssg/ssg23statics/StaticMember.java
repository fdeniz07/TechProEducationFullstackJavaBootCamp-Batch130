package ssg.ssg23statics;

public class StaticMember {
    static int x;
    int y;

    StaticMember() {
        x += 2;
        y++;
    }

    static int getSquare() {
        return x * x;
    }

    public static void main(String[] args) {
        StaticMember sm1 = new StaticMember();
        StaticMember sm2 = new StaticMember();
        int z = sm1.getSquare();
        System.out.println("-x" + z + "-y" + sm2.y);

    }
}
