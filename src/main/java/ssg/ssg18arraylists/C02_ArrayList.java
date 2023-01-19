package ssg.ssg18arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {
        /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */
        List<String> myList = new ArrayList<>();
        myList.add("Mehmet");
        myList.add("Bilal");
        myList.add("Batuhan");
        myList.add("Ahmet");
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
    }
}
