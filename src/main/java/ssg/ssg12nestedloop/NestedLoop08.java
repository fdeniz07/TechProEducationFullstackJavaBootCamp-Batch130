package ssg.ssg12nestedloop;

        /*
         soru :  Asagidaki sekil cizen kodu yaziniz

                 * * * *1
                 * * * 2
                 * * 3
                 * 4
                 5
         */

public class NestedLoop08 {

    public static void main(String[] args) {

        for (int symbol = 1; symbol <= 5; symbol++) {

            for (int i = 1; i <= (-1 * symbol + 5); i++) { //-1*1+5=4
                System.out.print(". ");

            }

            System.out.println(symbol);
        }
    }
}
