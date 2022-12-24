package advanced_practice.practice02;

import java.util.Arrays;

public class Q03_Arrays_IkinciMax {

    public static void main(String[] args) {

        /*
            Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
            input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
            output: min:-90, max:10001, secMax: 8787
       */

        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1};

        //I.YOL : Sort ile siralar ilk ve son indexdeki degerleri aliriz

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("Min :" + min + "\nMax :" + max);

        System.out.println("///////////////");

        //II.YOL: For-Each Loop ile karsilastirarak en büyük ve en kücük degeri bulacagiz

        int min2 = arr[0];
        int max2 = arr[0];
        int secMax = arr[0];

        for (int w : arr) {
            if (w < min2) {
                min2 = w;
            } else if (w > max2) {
                secMax = max2;
                max2 = w;
            } else if (w > secMax) {
                secMax = w;
            }
        }
        System.out.println("min:" + min + "\nmax:" + max + "\nsecMax:" + secMax);
    }
}
