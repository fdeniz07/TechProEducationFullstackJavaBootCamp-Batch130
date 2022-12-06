package day03scanner;

import java.util.Scanner;

public class C05_Scanner {

    //1)Dikdörtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    //2)Dikdörtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen dikdortgenin kısa kenarını giriniz...");
        int en = input.nextInt();

        System.out.println("lütfen dikdortgenin uzun kenarını giriniz...");
        int boy = input.nextInt();

        System.out.println("dikdortgenin alanı=" + (en * boy));

        System.out.println("dikdortgenin cevresi=" + (2 * (en + boy)));

    }

}
