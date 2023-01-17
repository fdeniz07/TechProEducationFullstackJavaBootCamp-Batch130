package practice.advanced_practice.practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Manav {

    /*
     Basit bir 5 ürünlü manav alışveriş programı yazınız.

     * 1. Adim : Ürün ve fiyat listesi oluştur.
     * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
     * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
     * 4. Adim : Alisveris bitince ödemesi gereken tutari göster.
     * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
     *            istemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün sectir.
     *            Bu işlemi alışveriş bitene kadar tekrarla.

 */

    //Ürün ve fiyat listesi oluştur.
    static List<String> urunListesi = new ArrayList<>();
    static double toplamOdeme;

    public static void main(String[] args) {
        urunListesi.add("Domates - Ürün Kodu: 1 - Fiyati: 20");
        urunListesi.add("Biber - Ürün Kodu: 2 - Fiyati: 25");
        urunListesi.add("Patates - Ürün Kodu: 3 - Fiyati: 9");
        urunListesi.add("Elma - Ürün Kodu: 4 - Fiyati: 15");
        urunListesi.add("Muz - Ürün Kodu: 5 - Fiyati: 30");

        System.out.println("urunListesi = " + urunListesi);
        System.out.println("toplamOdeme = " + toplamOdeme);
        musteriSecimi();
    }

    public static void musteriSecimi() {
        Scanner input = new Scanner(System.in);

        //Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
        System.out.println("Ürün kodunuz giriniz: ");
        int kod = input.nextInt();

        System.out.println("Kiloyu giriniz");
        double kilo = input.nextDouble();

        System.out.println(kilo + " kilo " + urunListesi.get(kod - 1).substring(0, urunListesi.get(kod - 1).indexOf(" ")) + ":" + Double.parseDouble(urunListesi.get(kod - 1).substring(urunListesi.get(kod - 1).lastIndexOf(" ") + 1)) * kilo);

        //Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
        //toplamOdeme +=Double.parseDouble(urunListesi.get(kod - 1).split(" ")[urunListesi.get(kod - 1).split(" ").length-1]);
        toplamOdeme += Double.parseDouble(urunListesi.get(kod - 1).substring(urunListesi.get(kod - 1).lastIndexOf(" ") + 1)) * kilo;

        System.out.println("toplamOdeme = " + toplamOdeme);

        System.out.println("Devam etmek icin D, kasa icin herhangi bir karakter giriniz");

        String karar = input.next();

        if (karar.equalsIgnoreCase("d")) {
            musteriSecimi(); //Recursive Method --> Loop olmadan metodu devamli cagirma islemine denir
        } else {
            System.out.println("Toplam ödeme = " + toplamOdeme);
            System.out.println("Güle güle, yine bekleriz...");
        }

    }
}
