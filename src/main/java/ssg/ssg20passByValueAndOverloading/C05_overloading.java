package ssg.ssg20passByValueAndOverloading;

public class C05_overloading {
    public static void main(String[] args) {
    /*
        3 tane carpim isimli method olusturalim 1. methdodda 2 tane int deger carpalim
        2. methodda 1 tane double 1 tane int deger carpalim
        3. methodda 2 tane double deger carpalim
     */
        carpim(5, 9);
        carpim(5.2, 3);
        carpim(5.6, 9.8);

    }

    public static void carpim(double a, double b) {
        System.out.println(a * b);
    }

    public static void carpim(double a, int b) {
        System.out.println(a * b);
    }

    public static void carpim(int a, int b) {
        System.out.println(a * b);

    }
}

