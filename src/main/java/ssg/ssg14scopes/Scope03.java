package ssg.ssg14scopes;

public class Scope03 {

    public static void main(String[] args) {

        int x = 12;

        {
            System.out.println(x);
        }
        while (x <= 15) ;
    }
}
