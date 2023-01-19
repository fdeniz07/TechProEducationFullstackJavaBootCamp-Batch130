package ssg.ssg18arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C08_ArrayList {
    public static void main(String[] args) {
        /*
        Bir dogal sayi arrayListi olusturun ve o listte 13 sayisi varsa silin
         */
        Random randomSayilar = new Random();

        int sayi = 0;
        Scanner scan = new Scanner(System.in);
        int sayi13 = scan.nextInt();

        List<Integer> sayilar = new ArrayList<>();
        while (sayilar.size() < 6) {
            sayi = randomSayilar.nextInt(14);
            if (!sayilar.contains(sayi)) {
                sayilar.add(sayi);
            }
        }
        System.out.println(sayilar);
        if (sayilar.contains(sayi13)) {
            sayilar.remove((Integer) sayi13);
        }
        System.out.println(sayilar);
    }
}
