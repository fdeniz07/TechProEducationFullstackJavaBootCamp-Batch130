package day11loops;

import java.util.Scanner;

public class C07_NestedLoop {
    public static void main(String[] args) {

        /*
           Type code to print the following image on the console
                X X X X X
                X X X X X
                X X X X X
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen satir bilgisini giriniz: ");
        int row = input.nextInt();
        System.out.print("Lütfen sütun bilgisini giriniz: ");
        int column = input.nextInt();
        System.out.print("Lütfen cizilmesini istediginiz karakteri giriniz: ");
        char character = input.next().charAt(0);

        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < column + 1; j++) {
                System.out.print(" " + character + " ");
            }
            System.out.println();
        }


    }
}
