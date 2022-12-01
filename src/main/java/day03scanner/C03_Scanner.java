package day03scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //EX 1) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        System.out.println("Toplam : " + (sayi1 + sayi2));

    }
}
