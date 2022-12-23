package day16multidimensionalarrays;

public class Md06 {

    public static void main(String[] args) {

        //Example 1: Bir multi dimensional array'deki en buyuk ve en kucuk sayinin toplamini ekrana yazdiriniz.

        int a[][] = {{21, 5}, {14, 70, 11}};
        int small = a[0][0];
        int big = a[0][0];

        for (int[] w : a) {

            for (int k : w) {

                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small + big);
    }
}
