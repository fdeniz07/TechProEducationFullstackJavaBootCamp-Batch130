package ssg.ssg16multidimensionalarray;

public class C09_mda {

    public static void main(String[] args) {
    /*
         9.soru Verilen bir multi dimensional array'in tum elemanlarini toplayan bir method yazalim,
    */

        int sayilar[][] = {{3, 2, 1}, {4, 5, 1, 9, 5}, {6, 7, 8}};
        toplamYazdir(sayilar);
    }

    public static void toplamYazdir(int[][] sayilar) {
        int sum = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                sum += sayilar[i][j];

            }

        }
        System.out.println(sum);
    }
}
