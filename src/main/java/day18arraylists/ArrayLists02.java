package day18arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

        //INTERVIEW Sorusu

        //Verilen bir Listteki elemanlari tekrasiz olarak yazdirma

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        System.out.println("a = " + a); //a = [2, 3, 2, 2, 5]

        List<Integer> newList = new ArrayList<>();

        for (Integer w : a) {
            if (!newList.contains(w)) {
                newList.add(w);
            }
        }
        System.out.println("newList = " + newList); //newList = [2, 3, 5]
    }
}
