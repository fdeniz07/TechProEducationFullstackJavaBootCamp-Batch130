package day11loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        //Interview Question

        //Example1 : Size verilen bir String'i ters ceviren kodu yaziniz

        String str = "Mustafa"; //afatsuM
        String reverseStr = "";

        for (int i = str.length() - 1; i > -1; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);

        //Example2 : 5'den 10'a kadar tamsayilarin toplamini bulan kodu yaziniz

        int sum = 0;

        for (int i = 5; i < 11; i++) {
            sum += i;
        }
        System.out.println("5'den 10'a kadar sayilarin toplami : " + sum);

        System.out.println("**********************************************");

        //Example3 : 6'dan 3'e kadar tamsayilarin carpimini bulan kodu yaziniz
        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply *= i;
        }
        System.out.println("6'dan 3'e kadar sayilarin carpimi : " + multiply);

        System.out.println("**********************************************");

        //Example4 : Bir tamsayinin rakmalarinin toplamini bulan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayi giriniz :");
        int num = input.nextInt();

        num = Math.abs(num);
        int result = 0;

        for (int i = num; i > 0; i = i / 10) {
            result = result + i % 10;
        }
        System.out.println(result);

    }
}
