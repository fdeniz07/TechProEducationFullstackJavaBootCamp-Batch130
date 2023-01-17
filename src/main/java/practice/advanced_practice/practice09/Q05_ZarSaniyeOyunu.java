package practice.advanced_practice.practice09;

import java.time.LocalTime;
import java.util.Scanner;

public class Q05_ZarSaniyeOyunu {

    //İki zar atıp sonucunu atıldığı saniyeye göre 2 veya 5 ile çarpıp bilgisayarın puanıyla karşılaştıran bir method yazınız.
    //Zarın atıldığı saniye 5'in katı ise zar sayısı 5 ile çarpılıp puana eklenecek, çiftse zar sayısı iki ile çarpılıp puana kelenecek,tekse zar sayısı puana eklenecek.

    static int saniyeOyucu;
    static int puanOyuncu;
    static int sayac;
    static int puanBilgisayar;

    public static void main(String[] args) {

        zarAt();
    }

    public static void zarAt() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zar atmak için 'Z' giriniz");
        String secim = scanner.next();

        if (secim.equalsIgnoreCase("z")) {

            int zarOyuncu = (int) (Math.random() * 6) + 1; //0 dan baslayacagi ve 6 da dahil olacagi icin önce 6 ile carpiyor sonra 1 ekliyoruz. 7 yapsak 0 da gelirdi
            System.out.println("zarOyuncu = " + zarOyuncu);
            saniyeOyucu = LocalTime.now().getSecond();
            System.out.println("saniyeOyucu = " + saniyeOyucu);

            if (saniyeOyucu % 5 == 0) {

                puanOyuncu += zarOyuncu * 5;

            } else if (saniyeOyucu % 2 == 0) {
                puanOyuncu += zarOyuncu * 2;
            } else {
                puanOyuncu += zarOyuncu;
            }
            System.out.println("puanOyuncu = " + puanOyuncu);

        } else {
            zarAt();
        }
        sayac++;


        int zarBilgisayar = (int) (Math.random() * 6) + 1;
        System.out.println("zarBilgisayar = " + zarBilgisayar);
        int saniyeBilgisayar = saniyeOyucu + 1;
        System.out.println("saniyeBilgisayar = " + saniyeBilgisayar);


        if (saniyeBilgisayar % 5 == 0) {

            puanBilgisayar += zarBilgisayar * 5;

        } else if (saniyeBilgisayar % 2 == 0) {
            puanBilgisayar += zarBilgisayar * 2;
        } else {
            puanBilgisayar += zarBilgisayar;
        }
        System.out.println("puanBilgisayar = " + puanBilgisayar);

        if (sayac == 1) {
            zarAt();
        } else {
            if (puanBilgisayar < puanOyuncu) {
                System.out.println("Kazandınız: " + puanOyuncu + "<==>" + puanBilgisayar);
            } else if (puanBilgisayar == puanOyuncu) {
                System.out.println("Berabere: " + puanOyuncu + "<==>" + puanBilgisayar);
            } else {
                System.out.println("Kaybettiniz: " + puanOyuncu + "<==>" + puanBilgisayar);
            }
        }
    }
}
