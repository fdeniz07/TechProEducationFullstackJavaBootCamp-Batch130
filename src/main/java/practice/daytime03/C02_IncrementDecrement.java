package practice.daytime03;

public class C02_IncrementDecrement {

    public static void main(String[] args) {
        int a = 12;
        int b = a++;
        System.out.println("b = " + b);//12
        System.out.println("a = " + a);//13

        int x = 15;
        int y = x--;  //PostDecrement
        System.out.println("x = " + x);//14
        System.out.println("y = " + y);//15

        int m = 21;
        int n = ++m;//Pre Increment
        System.out.println("m = " + m);//22  21    21
        System.out.println("n = " + n);//22   21   22

        int t = 32;
        int u = --t;
        System.out.println("t = " + t);//31  33
        System.out.println("u = " + u);//31  33

    }
}
