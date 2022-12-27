package practice.advanced_practice.practice03;

import java.util.Scanner;

public class Q05_NestedForLoop_Carpim {

    /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen birinci dizinin boyutunu giriniz:");
        int arr1 = input.nextInt();

        System.out.print("Lütfen ikinci dizinin boyutunu giriniz:");
        int arr2 = input.nextInt();

        for (int i = 1; i <= arr1; i++) {

            for (int j = 1; j <= arr2; j++) {

                System.out.print(String.format("%2d", i * j) + "  ");
            }
            System.out.println();

        }

    }
}
