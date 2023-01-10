package practice.advanced_practice.practice06;

import java.util.Arrays;

public class Q06_MultiDimArray_Toplam {
    /*
        Multi dimensional arrayin ic arraylerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir arrayin elemani yapan ve yeni arrayi ekrana yazdiran bir program yaziniz.
        input {{10,20,30},{4},{6,7,20}} ==> output ={60,4,33}
     */

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {4}, {6, 7, 20}};
        int[] brr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                brr[i] = brr[i] + arr[i][j];

            }
        }

        System.out.println(Arrays.toString(brr));

    }
}
