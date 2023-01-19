package ssg.ssg18arraylists;

import java.util.ArrayList;
import java.util.List;

public class C01_arrayList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println(myList);
        myList.add(1, 15);
        System.out.println(myList);
    }
}
