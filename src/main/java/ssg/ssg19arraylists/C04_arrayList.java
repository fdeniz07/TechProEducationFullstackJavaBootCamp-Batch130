package ssg.ssg19arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04_arrayList {
    public static void main(String[] args) {
        /*
            Soru 04)icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun, kullanicidan bir sayi isteyip listede var olup olmadigini kullaniciya yazin
        */

        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();
        while (sayiListesi.size() < 200) {
            sayi = rnd.nextInt(1000);

            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }

        Scanner scan = new Scanner(System.in);
        int kalantahmin = 5;
        int dogrutahmin = 0;
        while (kalantahmin > 0) {
            System.out.println("lutfen 1000'den kucuk bir sayi giriniz");
            int alinanSayi = scan.nextInt();
            if (sayiListesi.contains(alinanSayi)) {
                dogrutahmin++;
                System.out.println("dogru tahminde bulundunuz dogru tahmin sayiniz : " + dogrutahmin);

            } else {
                kalantahmin--;
                System.out.println("yanliş tahminde bulundunuz kalan tahmin hakkınız : " + kalantahmin + " yaptıgınız dogru tahmin sayisi : " + dogrutahmin);
            }

        }
    }
}
