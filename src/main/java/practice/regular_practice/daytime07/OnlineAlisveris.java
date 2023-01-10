package practice.regular_practice.daytime07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisveris {
    /*
     * Basit bir online alisveris programi yaziniz.
     *
     * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

     * */

    static List<String> urunListesi = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static double toplamOdeme;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        urunListesi.add("saat :urun kodu 1 ");
        urunListesi.add("monitor :urun kodu 2 ");
        urunListesi.add("canta:urun kodu 3 ");
        urunListesi.add("kitap :urun kodu 4 ");
        urunListesi.add("top :urun kodu 5 ");
        urunFiyatlari.add(15.0);
        urunFiyatlari.add(200.0);
        urunFiyatlari.add(50.0);
        urunFiyatlari.add(10.0);
        urunFiyatlari.add(500.0);
        System.out.println(urunListesi);

        musteriSecim();
    }

    private static void musteriSecim() {

        System.out.println("Lutfen sectiginiz urunun kodunu giriniz");
        int secim=input.nextInt();
        System.out.println("Lutfen sectiginiz urunden kac adet istediginizi giriniz");
        int adet=input.nextInt();

        double urunTutari=adet*urunFiyatlari.get(secim-1);
        toplamOdeme+=urunTutari;
        System.out.println("Devam ise 1 \nOdeme icin 2 seciniz");
        int devamMi=input.nextInt();

        if(devamMi==1){
            musteriSecim();//recursive Method
        }else
            odeme();

    }

    private static void odeme() {
        LocalDate kurulusGunumuz= LocalDate.of(2023,02,10);

        LocalDate date=LocalDate.now();

        if(date.isEqual(kurulusGunumuz)){
            System.out.println("Bugun bizim kurulus gunumuz.Borcunuz yoktur****");
        }else
            System.out.println("Yine bekleriz Odemeniz: "+toplamOdeme+"$");


    }
}
