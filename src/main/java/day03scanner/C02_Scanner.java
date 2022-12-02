package day03scanner;

import java.util.Scanner;

public class C02_Scanner {
    //Scanner class'i kullanici ile etkilesim kurmamizi saglar
    //Scanner bir class'tir. Java util kütüphanesinden getirildigi icin import ister

    public static void main(String[] args) {

        //Kullanicidan Data almak
        //1.Adim Scanner class'indan bir Object olustur
        Scanner input = new Scanner(System.in);


        //2.Adim Kullanicinin ne yapacagini söyle
        System.out.println("Lütfen yasinizi giriniz");

        //3.Adim Kullanicidan aldiginiz datayi variable icine koyun
        byte age = input.nextByte();


        //Note: String'lerde disaridan veri almak icin Next ve NextLine kullanilir. Next sadece ilk kelimeyi alirken, NextLine cümlenin tamamini alir.

        //Kullanici ad,memleket, yas, boy, yasadigi yeri sevip sevmedigini soran program
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz ...:");
        String isim = scan.nextLine();

        System.out.println("Lütfen memleketinizi giriniz ...: ");
        String memleket = scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz ...:");
        byte yas = scan.nextByte();

        System.out.println("Lütfen boyunuzu giriniz ...:");
        short boy=scan.nextShort();

        System.out.println("Lütfen yasadiginiz yeri sevip sevmediginizi yaziniz ...:");
        boolean seviyorMu = scan.nextBoolean();

        System.out.println("****************************");

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);


    }
}
