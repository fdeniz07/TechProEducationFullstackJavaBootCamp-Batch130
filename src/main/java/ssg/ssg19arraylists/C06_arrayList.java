package ssg.ssg19arraylists;

import java.util.ArrayList;
import java.util.List;

public class C06_arrayList {
    /*
        soru 6)bir liste olusturun ve listede kac tane farkli elemanin oldugunu yazdirin
     */
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(6);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(8);
        sayilar.add(8);
        sayilar.add(10);
        System.out.println(sayilar);

        int counter = 0;

        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.indexOf(sayilar.get(i)) != sayilar.lastIndexOf(sayilar.get(i))) {
                sayilar.remove(i);
                System.out.println(sayilar);
            }
        }
        System.out.println(sayilar.size());
    }
}
