package ssg.ssg14scopes;

public class Scope02 {
    static int x = 15;// class level

    public static void main(String[] args) {

        int i; // method level

        for (i = 1; i <= 5; i++) {

            System.out.println(i);

        }

        {
            System.out.println(i);
            int z = 12;  // block level
        }
        //    System.out.println(x);

        Scope02 scope02 = new Scope02();
        System.out.println(scope02.x);

        System.out.println(x);

    }
}
