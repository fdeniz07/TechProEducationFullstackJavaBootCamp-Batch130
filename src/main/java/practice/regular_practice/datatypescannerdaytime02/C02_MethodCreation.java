package practice.regular_practice.datatypescannerdaytime02;

import java.util.Scanner;

public class C02_MethodCreation {

    //1)Dikdörtgenin alanini ve cevresini hesaplayan methodu olusturunuz ve kullaniniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen dikdortgenin kısa kenarını giriniz...");
        int en = input.nextInt();

        System.out.println("lütfen dikdortgenin uzun kenarını giriniz...");
        int boy = input.nextInt();

        int alan = AlanHesapla(en, boy);
        System.out.println("dikdortgenin alanı=" + alan);

        int cevre = CevreHesapla(en, boy);
        System.out.println("dikdortgenin cevresi=" + cevre);
    }

    public static int AlanHesapla(int kisaKenar, int uzunKenar) {
        int alan = kisaKenar * uzunKenar;
        return alan;
    }

    public static int CevreHesapla(int kisaKenar, int uzunKenar) {
        int cevre = 2 * (kisaKenar + uzunKenar);
        return cevre;
    }

}
