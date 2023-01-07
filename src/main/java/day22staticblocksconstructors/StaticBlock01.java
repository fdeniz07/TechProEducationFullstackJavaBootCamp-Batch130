package day22staticblocksconstructors;

public class StaticBlock01 {

    //Bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initialize" etmediniz demektir.
    //Static variable'lar static block'lar icinde initialize edilirse, o class'in icinde herseyden önce hazir hale getirilmis olur.
    //Bazen main method calistirilmadan önce variable'larin hazir hale getirilmesi gerekir. Bu yüzden static block'la kullanilir.

    //Not 1: "static block" lar static variable'lari initialize etmek icin kullanilirlar
    //Not 2: "static block" lar class icinde herseyden önce calistirilirlar.


    static double pi;
    static String shape;

    static {
        pi = 3.14;
        System.out.println("Static Block 1");
    }

    static {
        shape="Circle";
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
