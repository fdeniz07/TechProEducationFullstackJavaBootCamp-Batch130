package ssg.ssg12whileloopdowhileloop;

import java.util.Random;
import java.util.Scanner;

public class SayiBulmaca {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin


        Random rnd = new Random();

        int sayi = rnd.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi girniz");
        int tahmin = 0;
        int sayac = 1;

        do {
            tahmin = input.nextInt();

            if (tahmin > sayi) {
                System.out.println("daha kucuk bir sayi Girniz");
            } else if (tahmin < sayi) {
                System.out.println("daha buyuk bir sayi giriniz");
            }
            sayac++;
        } while (sayi != tahmin);
        System.out.println("Tutugunuz sayi " + (sayac - 1) + " tahmin de  bulundunuz");

    }
}
