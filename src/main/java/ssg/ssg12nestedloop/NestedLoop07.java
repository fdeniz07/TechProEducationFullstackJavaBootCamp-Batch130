package ssg.ssg12nestedloop;

public class NestedLoop07 {
    public static void main(String[] args) {

        /*
            /*Soru 3) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
                1
                22
                333
                4444
                55555

         */

        int input = 5;

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }

        System.out.println();

        //Dörtgen yapmak icin


        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= input; j++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }
}
