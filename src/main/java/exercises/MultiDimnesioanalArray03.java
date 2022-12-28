package exercises;

public class MultiDimnesioanalArray03 {
    public static void main(String[] args) {


    /*
        Asagidaki multi dimensional array'lerin ic array'lerinde ayni index’e sahip
        elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) arrl = { {1,2},
        {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
    */

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int limit;
        int toplam;


        //1.Yol

        for (int i = 0; i < arr1.length; i++) {

            limit = arr1[i].length;
            if (limit > arr2[i].length) {
                limit = arr2[i].length;

            }

            for (int j = 0; j < limit; j++) {

                toplam = arr1[i][j] + arr2[i][j];

                System.out.println("arr1[" + i + "][" + j + "] + arr2[" + i + "][" + j + "]= " + toplam);

            }
        }

        //2.Yol
        int outerLengt = Math.min(arr1.length, arr2.length);

        for (int i = 0; i < outerLengt; i++) {

            int innerLeng = Math.min(arr1[i].length, arr2[i].length);

            for (int k = 0; k < innerLeng; k++) {

                System.out.println("arr1[" + i + "][" + k + "] + " + "arr2[" + i + "][" + k + "]  = " + (arr1[i][k] + arr2[i][k]));
            }
        }

    }
}
