package practice.regular_practice.nighttime06;

public class Varargs02 {

    // Verilen sayilardan ilki haric tum sayilari
    // toplayip ilk sayi ile carpan bir method olusturunuz
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 4;
        int sayi5 = 9;

        sonuc(sayi1, sayi2, sayi3, sayi4, sayi5);

    }

    private static void sonuc(int carpilacakSayi, int... toplanacakSayi) {

        int toplam = 0;

        for (int w : toplanacakSayi) {
            toplam += w;

        }
        System.out.println("toplam = " + toplam);//22

        int sonuc = toplam * carpilacakSayi;
        System.out.println("sonuc = " + sonuc);//110

    }
}
