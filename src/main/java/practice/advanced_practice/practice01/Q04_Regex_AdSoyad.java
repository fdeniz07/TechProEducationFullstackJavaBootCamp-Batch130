package practice.advanced_practice.practice01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {
    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ad ve Soyad bilginizi arada bir bosluk olacak sekilde giriniz :");
        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);
        String ad = adSoyad.split(" ")[0];
        String soyAd = adSoyad.split(" ")[1];
        String adIlkHarf = ad.substring(0, 1).toUpperCase();
        String soyadIlkHarf = soyAd.substring(0, 1).toUpperCase();

        String adFormat = adIlkHarf + ad.substring(1);
        String soyadFormat = soyadIlkHarf + soyAd.substring(1);

        System.out.println("Ad = " + adFormat);
        System.out.println("Soyad = " + soyadFormat);


    }
}
