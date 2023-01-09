package ssg.ssg13arrays;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
        /*
        3.soru Verilen 3 elemanli bir array in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
         Ornek; array (1,2,3) ise output (2, 3, 1) olacak
        */
        int arr[] = {1, 2, 3, 4, 5, 6};
        int atanacaksayi = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = atanacaksayi;
        System.out.println(Arrays.toString(arr));
    }
}
