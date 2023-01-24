package ssg.ssg19arraylists;

import java.util.ArrayList;
import java.util.List;

public class C01_arrayList {
    public static void main(String[] args) {
        /*
             soru 1) bir list olusturup eleman ekleyin ve yazdirin
         */

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList);
        myList.add(0, 0);
        System.out.println(myList);
        myList.set(0, 5);
        System.out.println(myList);
    }
}