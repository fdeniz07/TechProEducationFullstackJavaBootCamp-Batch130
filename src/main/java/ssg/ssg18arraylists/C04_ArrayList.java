package ssg.ssg18arraylists;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayList {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki cift ogeleri toplayin
         */

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(11);
        myList.add(9);
        int sum = 0;

        for (Integer w : myList
        ) {
            if (w % 2 == 1) {
                sum += w;
            }

        }
        System.out.println(sum);
    }
}
