package practice.advanced_practice.practice09;

import java.util.Arrays;

public class Q01_Arrays_TekrarlilariSil {

    //Bir array içerisindeki elementleri tekrarsız yazdıran bir kod yazınız.

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 30, 30, 40, 50, 50, 60, 20, 10, 40};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int idx = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[idx] = arr[i];
                idx++;
            }
        }

        arr[idx] = arr[arr.length - 1];
        idx++;

        System.out.println(Arrays.toString(arr));

        int[] arrTekrarsiz = new int[idx];

        for (int i = 0; i < idx; i++) {
            arrTekrarsiz[i] = arr[i];
        }
        System.out.println(Arrays.toString(arrTekrarsiz));
    }
}
