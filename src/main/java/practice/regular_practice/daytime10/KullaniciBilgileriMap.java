package practice.regular_practice.daytime10;

import java.util.HashMap;
import java.util.Scanner;

public class KullaniciBilgileriMap {
    public static void main(String[] args) {
          /*
          1- Kullanıcıdan bir kişinin kimlik numarasını(4 haneli),
            tam ismini, adresini , telefonunu alın.
         2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
         3- Kimlik numarasını girerek kullanıcının bilgilerini ekrana yazdırın
         4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */

        String secim = "";
        Scanner input = new Scanner(System.in);
        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();
        do {
            HashMap<String, String> kisiBilgileri = new HashMap<>();
            System.out.println("Lutfen adinizi soyadinizi giriniz...");
            kisiBilgileri.put("Tam isim ", input.nextLine());
            System.out.println("Lutfen adresinizi giriniz...");
            kisiBilgileri.put("Adres ", input.nextLine());
            System.out.println("Lutfen telefon numaranizi giriniz...");
            kisiBilgileri.put("Telefon no ", input.nextLine());

            System.out.println("TC numarasini giriniz");
            kisiListesi.put(input.nextInt(), kisiBilgileri);
            System.out.println("KisiBilgileri " + kisiBilgileri);
            System.out.println("KisiListesi " + kisiListesi);
            System.out.println("Devam etmek istiyormusunuz E/H");
            secim = input.nextLine();
            input.nextLine();//;//dummy atildi dongunun devam edebilmesi satir atlamamsi icin

        } while (secim.equalsIgnoreCase("E"));
        System.out.println("Bilgilerini gormek istediginiz kisinin TC numarasini giriniz");
        System.out.println(kisiListesi.get(input.nextInt()));
    }
}