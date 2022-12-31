package ssg.ssg02methodCreation;

public class MethodCreation02 {


    // string'i yazdiran method olusturalim
    // hosgeldiniz diyen bir method olusturun
    // kapanma mesaji yazn bir method olustur

    //degerli arkadaslar SSG dersimizde Hosgeldiniz
    //Ali can Bey
    // Iki saynini Bolma yapiniz
    //2
    //Bizi tercih ettiginiz icin tesekkur ederiz


    public static void hosgeldinYazdir() {
        // System.out.println("degerli arkadaslar SSG dersimizde Hosgeldiniz");
        hosgeldinizSsgDersleri();
        stringYazdir("Iki saynini Bolma yapiniz");
    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);

        //   IsimVeSoyIsim("Ali Can  ","Can Bey");
        // Calcualator.Bolme(12,5);
        kapanmaMethodu();

    }


    //
    public static void hosgeldinizSsgDersleri() {
        System.out.println("degerli arkadaslar SSG dersimizde Hosgeldiniz");
    }


    // main method
    public static void main(String[] args) {
        hosgeldinYazdir();
    }

}
