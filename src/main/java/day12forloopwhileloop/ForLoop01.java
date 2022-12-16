package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {

    /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Satir(row) sayisini giriniz...");
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz...");
        int column = input.nextInt();


        for (int i=1; i<=row; i++){

            for (int j=1; j<=column; j++){
                System.out.print("X ");
            }
            System.out.println();
        }

    }
}