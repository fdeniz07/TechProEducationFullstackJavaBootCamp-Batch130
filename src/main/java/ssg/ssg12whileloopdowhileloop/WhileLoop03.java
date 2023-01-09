package ssg.ssg12whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop03 {
    public static void main(String[] args) {


        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        // int sayiAdedi=3;

        Scanner scan = new Scanner(System.in);


        // while ile yapalim
        System.out.println("kaca tane sayi kadar   toplamk istiyorsunuz .");
        int sayiAdedi = scan.nextInt();
        int sayi = 0;
        int toplam = 0;
        int sayac = 1;

        while (sayac <= sayiAdedi) {
            System.out.println(sayac + " : lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println("girilen " + sayiAdedi + " sayinin toplami : " + toplam);


        /*
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen "+ sayiAdedi + " sayinin toplami : " + toplam);


         */
    }
}
