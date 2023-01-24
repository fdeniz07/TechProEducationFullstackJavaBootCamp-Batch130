package practice.advanced_practice.practice10.okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkulMain {

    /* POJO Class


         1- Değişkenleri ad, soyad, yaş olan bir Ogrenci pojo class'ı oluşturunuz.
         2- Değişkenleri okulAd, maxOgrenciSayisi, ArrayList cinsinden Öğrencileri olan bir Okul pojo class oluşturunuz
         3- Main metodunun olduğu OkulMain isimli bir class oluşturunuz.
         4- Bir okul objesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci ekleyiniz.
            Fakat oluşturacağınız öğrencilerin yaşı 15'i geçmemeli, 8'den küçük olmamalı.
            Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */

    public static void main(String[] args) {

//        Ogrenci ogrenci1 = new Ogrenci("Ali", "Can", 12);
//        Ogrenci ogrenci2 = new Ogrenci("Veli", "Can", 14);
//        List<Ogrenci> ogrenciList = new ArrayList<>();
//
//        ogrenciList.add(ogrenci1);
//        ogrenciList.add(ogrenci2);
//
//        Okul okul = new Okul("Ata", 50, ogrenciList);
//
//        System.out.println(okul);

        Scanner scanner = new Scanner(System.in);
        Okul okul = new Okul();
        System.out.println("Okul adini giriniz:");
        okul.setOkulAdi(scanner.nextLine());
        System.out.println("Maksimum ögrenci sayisini giriniz:");
        okul.setMaxOgrenciSayisi(scanner.nextInt());

        //  List<Ogrenci> ogrenciListesi = new ArrayList<>();

        for (int i = 1; i <= okul.getMaxOgrenciSayisi(); i++) {
            scanner.nextLine(); //dummy scanner

            // ogrenciList.add(i,new Ogrenci());
            Ogrenci ogrenci = new Ogrenci();
            System.out.println(i + ". ögrenci ad: ");
            ogrenci.setAd(scanner.nextLine());

            System.out.println(i + ". ögrenci soyad: ");
            ogrenci.setSoyAd(scanner.nextLine());

            System.out.println(i + ". ögrenci yas: ");

            try {
                ogrenci.setYas(scanner.nextInt());
                if (ogrenci.getYas() < 8 || ogrenci.getYas() > 15) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Ögrenci yasi 8-15 araliginda olmalidir");
                i--;
                continue; //döngüyü kirmadan, hata alindiginda tekrardan giris yapilmasini saglar
            } catch (Exception exception) {
                System.out.println("8-15 araliginda bir SAYI giriniz");
                i--;
                continue;
            }
//            ogrenciListesi.add(ogrenci);
//            okul.setOgrenciListesi(ogrenciListesi);

            okul.addOgrenciToList(ogrenci);
        }

        System.out.println(okul);
    }
}
