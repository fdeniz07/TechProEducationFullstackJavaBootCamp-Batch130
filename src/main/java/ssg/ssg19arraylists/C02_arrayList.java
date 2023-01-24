package ssg.ssg19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_arrayList {
    public static void main(String[] args) {
        /*
            soru 2)bir list olusturun ve bu listteki elemanlari alfabetik siraya gore siralayin
         */
        List<String> myList = new ArrayList<>();
        myList.add("Ankara");
        myList.add("Bursa");
        myList.add("Istanbul");
        myList.add("Adana");
        System.out.println(myList);//[Ankara, Bursa, Istanbul, Adana]
        Collections.sort(myList);
        System.out.println(myList);//[Adana, Ankara, Bursa, Istanbul]
    }
}