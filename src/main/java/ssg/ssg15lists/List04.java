package ssg.ssg15lists;

import java.util.ArrayList;
import java.util.Arrays;

public class List04 {
    public static void main(String[] args) {
        // verilen bir array'i listeye cevirin
        String arr[] = {"A", "B", "C"};

        arr[0] = "F";
        System.out.println(Arrays.toString(arr));
        ArrayList<String> arraydenList = (ArrayList<String>) Arrays.asList(arr);

        arraydenList.set(0, "D");

        System.out.println(arraydenList);//[A, B, C]

    }
}
