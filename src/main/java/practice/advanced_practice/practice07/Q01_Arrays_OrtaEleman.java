package practice.advanced_practice.practice07;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays_OrtaEleman {

    /*
       Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
      Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
      (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Array Limitini giriniz: ");
        int[] arr = new int[input.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". elementi giriniz");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int ortaIdx = arr.length / 2;

        if (arr.length % 2 != 0) {
            System.out.println(arr[ortaIdx]);
        } else {
            System.out.println((arr[ortaIdx] + arr[ortaIdx - 1]) / 2.0);
        }
    }


}
