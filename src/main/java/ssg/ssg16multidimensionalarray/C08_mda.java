package ssg.ssg16multidimensionalarray;

import java.util.Arrays;

public class C08_mda {

    public static void main(String[] args) {

         /*
            soru 8) Verilen multi dimensional array in outer indexini, inner indexindeki elementleri

                a)bir soldaki konuma tasiyacak bir program yazin.
                b)bir sagdaki konuma tasiyacak bir program yazin.
         */


        //a) Sola Kaydirma

        int[][] sayilar1 = {{3, 2, 1}, {4, 5, 1, 9, 5}, {6, 7, 8}};

        System.out.println("Baslangic : " + Arrays.deepToString(sayilar1));

        for (int i = 0; i < sayilar1.length; i++) {

            int temp = sayilar1[i][0];

            for (int j = 0; j < sayilar1[i].length - 1; j++) {

                sayilar1[i][j] = sayilar1[i][j + 1];
               // System.out.println(Arrays.deepToString(sayilar1));
            }

            sayilar1[i][sayilar1[i].length - 1] = temp;
        }
        System.out.println("Sola kaydirilmis : " + Arrays.deepToString(sayilar1));



        //b) Saga kaydirma

        int[][] sayilar2 = {{3, 2, 1}, {4, 5, 1, 9, 5}, {6, 7, 8}};

        for (int i = 0; i < sayilar2.length; i++) {

            int temp = sayilar2[i][sayilar2[i].length - 1];


            for (int j = sayilar2[i].length - 1; j > 0; j--) {

                sayilar2[i][j] = sayilar2[i][j-1];

            }
            sayilar2[i][0] = temp;
        }

        System.out.println("Saga kaydirilmis : " + Arrays.deepToString(sayilar2));

    }
}
