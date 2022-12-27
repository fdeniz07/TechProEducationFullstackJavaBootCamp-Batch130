package exercises;

public class MultiDimnesioanalArray02 {


        /*
        Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */

    public static void main(String[] args) {

            int[][] mj = {{1, 2, 3}, {3, 4}};
            sonEleman(mj);

    }

    static void sonEleman(int ks[][]) {

        int multy = 1;

        for (int i = 0; i < ks.length; i++) {

            multy = multy * ks[i][ks[i].length - 1];

        }

        System.out.println(multy);

    }

}
