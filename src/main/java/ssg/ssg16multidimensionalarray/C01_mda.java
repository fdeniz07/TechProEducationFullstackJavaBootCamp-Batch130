package ssg.ssg16multidimensionalarray;

import java.util.Arrays;

public class C01_mda {
    public static void main(String[] args) {
        /*
        soru 1)  bir multi-dimensional array olusturun
        ve olusturdugunuz arrayin elemanlarini yazdırınız
         */
        int sayilar[][] = {{1, 2, 3}, {11, 22, 33}, {1, 5, 9}};
        System.out.println(Arrays.deepToString(sayilar));
    }
}
