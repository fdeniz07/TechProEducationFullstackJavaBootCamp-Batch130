package ssg.ssg18arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C05_ArrayList {
      /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
      */
    public static void main(String[] args) {
        Random randomSayilar = new Random();
        int sayi = 0;

        List<Integer> sayiListesi = new ArrayList<>();
        while (sayiListesi.size() < 200) {
            sayi = randomSayilar.nextInt(1000);

            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }

        }
        System.out.println(sayiListesi);
        Scanner scan = new Scanner(System.in);

        int kalanTahmin = 3;
        int dogruTahmin = 0;
        while (kalanTahmin > 0) {
            System.out.println("lutfen 1000'den kucuk bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                dogruTahmin++;
                System.out.println("dogru tahminde bulundunuz dogru tahmin sayiniz : " + dogruTahmin);
                break;
            } else {
                kalanTahmin--;
                System.out.println("yanliş tahminde bulundunuz kalan tahmin sayiniz : " + kalanTahmin + " dogru tahmin sayiniz : " + dogruTahmin);
                System.out.println();
            }
        }
    }
}
