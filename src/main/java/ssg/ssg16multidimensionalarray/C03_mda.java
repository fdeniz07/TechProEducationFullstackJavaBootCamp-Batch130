package ssg.ssg16multidimensionalarray;

public class C03_mda {

    public static void main(String[] args) {

         /*
            soru 3) Verilen 2 katli bir multi-dimensional array'de outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */

        int sayilar[][] = {{19, 21, 30}, {67, 41, 55}, {1, 2, 4}};
        int sum = 0;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {
                if (i == j) {
                    sum += sayilar[i][j];

                }

            }
            System.out.println(sum);
        }
        //System.out.println(sum);
    }
}
