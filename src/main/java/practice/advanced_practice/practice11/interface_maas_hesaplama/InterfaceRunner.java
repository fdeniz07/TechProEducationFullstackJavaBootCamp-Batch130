package practice.advanced_practice.practice11.interface_maas_hesaplama;

import java.util.Scanner;

public class InterfaceRunner {

    /*
        Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)
        Maaş kriterleri: Çalışanın toplam çalışma yılına göre her yıl için brüt maaşı 100 dolar  artır.
                         Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
                         10 yıl ve üstü çalışma yılı bulunan çalışanların brüt maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yillik toplam calistiginiz yili giriniz");
        int calismaYili = scan.nextInt();

        System.out.println("Lütfen aylik calistiginiz calisma saatini giriniz");
        int calismaSaati = scan.nextInt();

        System.out.println("Lütfen brüt maasinizi giriniz");
        double brutMaas = scan.nextDouble();


        MaasHesapla maasHesapla = new MaasHesapla();
        System.out.println("Net Maas = " +   maasHesapla.netMaas(brutMaas,calismaYili,calismaSaati) + "€");

    }
}
