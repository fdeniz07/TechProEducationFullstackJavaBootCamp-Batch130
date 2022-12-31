package ssg.ssg06wrapperclassoperator;

import java.util.Scanner;

public class ArithmeaticOperator {

    public static void main(String[] args) {
        // kullanicadan iki sayi isteyin artimatic iselemi gerceklsetiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("1. sayi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("2. sayi giriniz");
        int say2 = input.nextInt();

        System.out.println(sayi1 + say2 * 3);// 2 3==11

        System.out.println(sayi1 - say2);

        System.out.println(sayi1 * say2);
        System.out.println(sayi1 / say2);
        System.out.println(sayi1 % say2);

    }
}
