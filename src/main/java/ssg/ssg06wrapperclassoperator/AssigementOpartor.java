package ssg.ssg06wrapperclassoperator;

public class AssigementOpartor {

    public static void main(String[] args) {

        int x = 5;
        int y = 4;

        x = x + 4;

        System.out.println(x);//9
        x = x / 2;

        System.out.println(x);//4

        x = x % y;

        System.out.println(x);//0

        y = x;

        System.out.println(y);//0

        x = x * y;
        System.out.println(x - y);//0


    }
}
