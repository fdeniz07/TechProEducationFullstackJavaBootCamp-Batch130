package practice.regular_practice.nighttime11;

/*
    Project:
    Mesafeye ve şartlara göre otobüs bileti fiyatı
    hesaplayan uygulama
    Kullanıcıdan Mesafe (KM),
    yaşı ,
    yolculuk tipi (Tek Yön, Gidiş-Dönüş)

    Mesafe başına ücret 0.1 TL / km olarak alın.
    (Gidiş-Dönüş için *2)
    İlk olarak yolculugun toplam fiyatını hesaplayın
    ve sonrasında ki koşullara göre müşteriye
    aşağıdaki kuralları uygulayın ;

    Kullanıcıdan alınan değerler geçerli
    (mesafe ve yaş değerleri pozitif sayı,
    yolculuk tipi ise 1 veya 2) olmalıdır.
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
    şeklinde bir uyarı verilmelidir.

    1- Kişi "Yolculuk Tipini" gidiş dönüş
    seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

    2-Yaş indirimi:
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden
    %50 indirim uygulanır.

    Kişi 12-24 yaşları arasında ise bilet fiyatı
    üzerinden %10 indirim uygulanır.

    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden
    %30 indirim uygulanır.


    km=1500   100
    yas=20     12
    type=2      1
    tutar=216   9
 */

import java.util.Scanner;

public class Bilet {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int km = 0;
        int yas = 0;
        int yolculukTipi = 1;
        String plakaNumarasi = "78 MB 78";
        System.out.println("Lutfen gideceginiz mesafeyi km olarak veriniz");
        km = input.nextInt();
        System.out.println("Lutfen yasinizi giriniz");
        yas = input.nextInt();
        System.out.println("Lutfen yolculuk tipini giriniz " +
                "Sadece Gidis ise 1\nGidis-Donus ise 2");
        yolculukTipi = input.nextInt();
        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double biletUcreti = km * 0.10;
            System.out.println("Indirimsiz Bilet Ucreti " + biletUcreti);
            double yasIndirimOrani = 0;
            if (yas < 12) {
                yasIndirimOrani = 0.5;
            } else if (yas < 24) {
                yasIndirimOrani = 0.1;
            } else if (yas > 65) {
                yasIndirimOrani = 0.3;
            }

          /*  double dusulecekDeger=0;
            dusulecekDeger =biletUcreti * yasIndirimOrani;  /// 100*0.1=10TL
            biletUcreti=biletUcreti-dusulecekDeger;
            NOT :Asagida tek satirda yapildi
            */

            biletUcreti -= biletUcreti * yasIndirimOrani;

            if (yolculukTipi == 2) {
                biletUcreti -= biletUcreti * 0.2;
                biletUcreti *= 2;
            }
            biletDokum(plakaNumarasi, km, yolculukTipi, biletUcreti, yasIndirimOrani);
            //  System.out.println("Bilet Ucreti "+biletUcreti);

        } else
            System.out.println("Hatali Veri Girdiniz......");
    }//main

    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi, double biletUcreti, double yasIndirimOrani) {
        System.out.println("======================= Bilet Dokum =============================");
        System.out.println("Otobusun Plakasi " + plakaNumarasi);
        System.out.println("Mesafe " + km);
        System.out.println("Yolculuk Tipi " + (yolculukTipi == 1 ? "Tek Yon" : "Gidis Donus "));
        System.out.println("Bilet Ucreti " + biletUcreti);


        slowPrint("KEYIFLI YOLCULUKLAR DILERIZ.....", 50);
        System.out.println();
    }

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
