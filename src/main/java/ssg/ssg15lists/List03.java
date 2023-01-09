package ssg.ssg15lists;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {

        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0); // 3.5

        Double toplam = 0.0;
        Double ortalama = 0.0;
        for (Double w : sayilar) {
            toplam += w;

        }
        ortalama = toplam / (sayilar.size());
        System.out.println(ortalama);//3.875

        List<Double> ortalamaUstundekilerList = new ArrayList<>();

        // 1 yol
//        for (int i = 0; i <sayilar.size() ; i++) {
//
//            if (sayilar.get(i) > ortalama){
//                ortalamaUstundekilerList.add(sayilar.get(i));
//            }
//
//        }

        // 2 .yol
        for (double sayi : sayilar) {
            if (sayi > ortalama) {
                ortalamaUstundekilerList.add(sayi);
            }
        }

        System.out.println(ortalamaUstundekilerList);//[5.0, 5.0, 6.0, 7.0]
    }
}
