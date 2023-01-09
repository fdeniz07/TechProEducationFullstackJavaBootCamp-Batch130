package ssg.ssg15lists;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println(sayilar);//[1, 3, 5, 3, 5, 6, 1, 7]
        System.out.println(tekrarsizListeOlustur(sayilar));//[1, 3, 5, 6, 7]

    }

    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsisList = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsisList.contains(sayilar.get(i))) {
                tekrarsisList.add(sayilar.get(i));
            }
        }
//        for (int i = 0; i < sayilar.size(); i++) {
//            if (sayilar.indexOf(i) != sayilar.lastIndexOf(i)){
//                sayilar.remove(sayilar.lastIndexOf(i));
//            }
//        }

        return tekrarsisList;
    }
}
