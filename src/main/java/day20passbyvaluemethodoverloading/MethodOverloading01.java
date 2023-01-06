package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    /*
        1) Method Overloading yaparken method ismi degistirilmez
        2) Method Overloading yaparken parametreler degistirilir
            i) Parametre degistirirken, parametrelerin data type'leri degistirilebilir
            ii) Parametre degistirirken, parametrelerin data type'leri farkli ise yerleri degistirilebilir
            iii) Parametre degistirirken, parametrelerin sayisi degistirilebilir

        3) Java icin ismi ve parametreleri ayni olan iki method tamamiyle aynidir.
        4)Method Overloading olustururken "return type"'i degistirmenin hicbir etkisi yoktur.
            Method Overloading olustururken "access modifier"'i degistirmenin hicbir etkisi yoktur.
            Method Overloading olustururken method'u "static" ya da "non-static" yapmanin hicbir etkisi yoktur.
            Method Overloading olustururken "method body"'i degistirmenin hicbir etkisi yoktur.

        5)"private" method'lar overload edilebilir. Cunku method overloading sadece bir class'in icinde olur.
        "private" olmak ise baska class'lara gidildiginde problem olusturur.

        6)"static" metholar overload edilebilirler
     */


    public static void main(String[] args) {


    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}


