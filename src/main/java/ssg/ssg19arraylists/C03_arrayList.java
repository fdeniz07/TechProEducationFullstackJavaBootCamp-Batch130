package ssg.ssg19arraylists;

import java.util.ArrayList;
import java.util.List;

public class C03_arrayList {

    public static void main(String[] args) {
         /*
            soru 3)bir dogal sayi listesi olusturun ve olusturdugunuz listedeki tum ogeleri toplayın
         */
        List<Integer> dogalSayilar = new ArrayList<>();
        dogalSayilar.add(5);
        dogalSayilar.add(6);
        dogalSayilar.add(7);
        dogalSayilar.add(8);

        int sum = 0;
        for (Integer w : dogalSayilar
        ) {
            if (w % 2 == 0) {
                sum += w;
            }
        }
        System.out.println(sum);
    }
}
