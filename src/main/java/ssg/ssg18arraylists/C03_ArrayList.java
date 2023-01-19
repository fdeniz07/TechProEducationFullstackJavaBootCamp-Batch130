package ssg.ssg18arraylists;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayList {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        int sum = 0;

        for (Integer w : myList
        ) {
            sum += w;

        }
        System.out.println(sum);
    }
}
