package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {

    public static void main(String[] args) {

        /*
            Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Satir(row) sayisini giriniz : ");
        int row = input.nextInt();

        //1.Yol - Kendim
        for (int i = row; i>-1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2.Yol - Süleyman Hoca
        for (int i=1; i<=row; i++){
            for (int k=row; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
