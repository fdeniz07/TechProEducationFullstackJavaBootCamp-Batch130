package day21statickeyword;

public class C03_StaticDepo {

    static String okulIsmi = "Emre Okullari ";//static variable
    String ogrenciGul = "Gul Gecer";//instance variable

    public static void staticMethod() {
        System.out.println("Ben static methodum ");
    }

    public void staticOlmayanMethod() {
        System.out.println("Ben sefil static olmayan methodum ");
    }
}
