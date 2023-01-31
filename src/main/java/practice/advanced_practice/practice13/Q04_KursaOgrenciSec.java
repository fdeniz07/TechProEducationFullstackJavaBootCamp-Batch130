package practice.advanced_practice.practice13;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_KursaOgrenciSec {

    /*
        Spor kursu için seçilecek öğrencileri belirleyen bir kod yazınız.
       kurs gereklilikleri:
            erkekler: boy: 1.60 ve üstü
                      kilo:70-90 kg
            kızlar: boy: 1.50 ve üstü
                    kilo:50-70 kg
       kullanıcıdan öğrenci sayısı ve herbir öğrenci
       için isim , cinsiyet, kilo ve boy bilgilerini girmesini
       isteyiniz.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci sayısını giriniz");
        int ogrSayisi = scanner.nextInt();

        String[] isimArr = new String[ogrSayisi];
        String[] cinsiyetArr = new String[ogrSayisi];
        double[] kiloArr = new double[ogrSayisi];
        double[] boyArr = new double[ogrSayisi];


        for (int i = 0; i < ogrSayisi; i++) {

            System.out.println(i + 1 + ". İsmi giriniz:");
            scanner.nextLine();//dummy
            isimArr[i] = scanner.nextLine();
            System.out.println("Cinsiyeti giriniz(E, K)");
            String cinsiyet = scanner.next().toLowerCase().trim().substring(0, 1);
            if (cinsiyet.equals("k") || cinsiyet.equals("e")) {
                cinsiyetArr[i] = cinsiyet;
            } else {
                System.out.println("Hatalı giriş! Yeniden giriniz");
                i--;
                continue;
            }

            System.out.println("Kilo giriniz(kg):");
            kiloArr[i] = scanner.nextDouble();

            System.out.println("Boy giriniz(m):");
            boyArr[i] = scanner.nextDouble();

        }

        System.out.println(Arrays.toString(isimArr));
        System.out.println(Arrays.toString(cinsiyetArr));
        System.out.println(Arrays.toString(kiloArr));
        System.out.println(Arrays.toString(boyArr));


        System.out.println("Kursa seçilen öğrenciler:");
        int sayac = 0;
        for (int i = 0; i < ogrSayisi; i++) {

            if (cinsiyetArr[i].equals("k") && kiloArr[i] >= 50 && kiloArr[i] <= 70 && boyArr[i] >= 1.5) {
                System.out.println(isimArr[i]);
                sayac++;
            } else if (cinsiyetArr[i].equals("e") && kiloArr[i] >= 70 && kiloArr[i] <= 90 && boyArr[i] >= 1.6) {
                System.out.println(isimArr[i]);
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Kursa seçilen öğremci yoktur!!!");
        }

        //Ödev: Exception ve seçilemeyen öğrenci isimleri

    }
}
