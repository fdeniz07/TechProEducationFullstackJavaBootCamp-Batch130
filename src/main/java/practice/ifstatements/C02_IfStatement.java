package practice.ifstatements;

import java.util.Scanner;

public class C02_IfStatement {

    //Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyupyazdiriniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        System.out.println("Lütfen isleminizi seciniz \nToplama icin: 1\nCikarma icin: 2\nBölme icin: 3\nCarpma icin: 4");
        double islem = input.nextDouble();

        if (islem == 1) {
            topla(sayi1, sayi2);
        } else if (islem == 2) {
            cikar(sayi1, sayi2);
        } else if (islem == 3) {
            bol(sayi1, sayi2);
        } else if (islem == 4) {
            carp(sayi1, sayi2);
        } else
            System.out.println("Yanlis bir secim yaptiniz!");
    }

    public static void topla(int x, int y) {
        System.out.println(x + y);
    }

    public static void cikar(int x, int y) {
        System.out.println(x - y);
    }

    public static void bol(int x, int y) {
        System.out.println(x / y);
    }

    public static void carp(int x, int y) {
        System.out.println(x * y);
    }

}
