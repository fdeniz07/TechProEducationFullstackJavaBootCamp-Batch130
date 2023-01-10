package practice.advanced_practice.practice06;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_IstenleriSilme {
    //Bir  integer Array'de verilen bir değer dışındaki elamanları yeni bir Array olarak yazdıran bir method yazınız.
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 5, 5};

        System.out.println(Arrays.toString(istenileniSil(arr)));


    }

    public static int[] istenileniSil(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Silmek istediğiniz elemanı giriniz");
        int silinecek = input.nextInt();

        int length = 0;

        for (int w : arr) {
            if (w != silinecek) {
                length++;
            }
        }

        System.out.println("length = " + length);
        int[] arrSilinmis = new int[length];
        int idx = 0;

        for (int w : arr) {
            if (w != silinecek) {
                arrSilinmis[idx] = w;
                idx++;
            }
        }

        return arrSilinmis;
    }
}
