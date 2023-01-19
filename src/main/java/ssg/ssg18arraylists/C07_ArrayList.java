package ssg.ssg18arraylists;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {
    public static void main(String[] args) {
        /*
       soru 7) bir liste olusturun ve listede
       kac tane farkli elemanin oldugunu yazdirin
       */

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(6);
        myList.add(6);
        myList.add(4);
        myList.add(4);
        myList.add(5);
        int farkli = 0;
        int farkliOlmayan = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.indexOf(myList.get(i)) == myList.lastIndexOf(myList.get(i))) {
                farkli++;
            } else {
                farkliOlmayan++;
            }


        }
        System.out.println(farkli);
        System.out.println(farkliOlmayan);
        farkliOlmayan = farkliOlmayan / 2;
        farkli = farkliOlmayan + farkli;
        System.out.println(farkli);
    }
}