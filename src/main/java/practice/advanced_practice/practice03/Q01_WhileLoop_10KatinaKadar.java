package practice.advanced_practice.practice03;

import java.util.Scanner;

public class Q01_WhileLoop_10KatinaKadar {

    //Kullanıcıdan alınan bir sayıdan başlayarak ardışık sayıları 10'un katına gelene kadar yazdıran bir kod yazınız.
    //Örn: Sayı: 46 Çıktı: 46, 47, 48, 49

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz: ");
        int sayi = input.nextInt();

        while (sayi % 10 != 0) {

            System.out.print(sayi + ",");
            sayi++;
        }
        System.out.println("Girdiginiz sayi 10'un katidir");
    }
}
