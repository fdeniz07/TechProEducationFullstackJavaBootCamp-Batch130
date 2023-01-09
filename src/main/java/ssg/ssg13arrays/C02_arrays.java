package ssg.ssg13arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
/*
2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
 */
        int arr[] = {9, 8, 5, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
