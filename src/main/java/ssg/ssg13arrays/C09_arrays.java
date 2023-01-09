package ssg.ssg13arrays;

import java.util.Arrays;

public class C09_arrays {
    /*
    9.soru-Verilen bir array'e yeni bir element ekleyin
    */
    public static void main(String[] args) {
        String arr[] = {"bolu", "koceli", "istanbul", "yozgat"};
        String eklenecek = "rize";
        String eklenmisArr[] = new String[arr.length + 1];
        for (int i = 0; i < eklenmisArr.length - 1; i++) {
            eklenmisArr[i] = arr[i];
        }
        eklenmisArr[eklenmisArr.length - 1] = eklenecek;
        System.out.println(Arrays.toString(eklenmisArr));
    }
}
