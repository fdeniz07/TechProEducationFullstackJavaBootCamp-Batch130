package ssg.ssg13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int sayi = 1;
        int toplam = 0;
        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        } while (sayi != 0);
        System.out.println(toplam);

     /*
       2. yol
        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);

         */

        // baslangic,bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir
        // 3 .yol
/*
        for (int i = 1; i <1000000 ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();

            if (sayi==0){
             break;
            } else {
                toplam+=sayi;
            }

        }
         */

        // System.out.println(toplam);

    }
}
