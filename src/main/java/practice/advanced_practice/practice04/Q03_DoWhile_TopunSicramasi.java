package practice.advanced_practice.practice04;

import java.util.Scanner;

public class Q03_DoWhile_TopunSicramasi {
    /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bırakılan yüksekliği giriniz");
        double yukseklik = input.nextDouble();
        int sicramaSayisi = 0;
        double toplamYol = 0;

        do {
            sicramaSayisi++;
            toplamYol += yukseklik;
            yukseklik = yukseklik * 0.75;
            toplamYol += yukseklik;

        } while (yukseklik >= 1);
        System.out.println("sicramaSayisi = " + sicramaSayisi);
        System.out.printf("toplamYol = " + "%.2f", toplamYol);

    }
}
