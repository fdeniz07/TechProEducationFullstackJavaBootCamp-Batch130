package ssg.ssg12whileloopdowhileloop;

import java.util.Scanner;

public class SayiBulmaca24 {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        //        Random rnd=new Random();
        //        int sayi=rnd.nextInt(50);  // burasi 100'den kucuk rastgele bir sayi olusturur

        int sayi = 10;
        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        while (sayi != tahmin) {
            System.out.println("Lutfen bir sayi giriniz");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("Daha kucuk bir sayi soylemelisin");

            } else if (tahmin < sayi) {
                System.out.println("Daha buyuk bir sayi soylemelisin");

            }
            sayac++;
        }
        System.out.println("Tuttugum sayiyi " + (sayac - 1) + " tahminde buldunuz");


    }
}
