package practice.advanced_practice.practice07;

import java.util.Random;
import java.util.Scanner;

public class Q02_TasKagitMakas {
    /*
        Taş-Kağıt-Makas oyunu yazınız.
		-Oyuncudan tahmin alınız.
		-Bilgisayarın tahmini ile karşılaştırınız.
		-3'e ilk ulaşan kazanır
		-3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Platin Skor ile kazanır.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int oyuncuKazanmaSayisi = 0;
        int bilgisayarKazanmaSayisi = 0;
        int sayac = 0;


        while (oyuncuKazanmaSayisi < 3 && bilgisayarKazanmaSayisi < 3) {

            sayac++;

            System.out.println(sayac + ". Seçim: \sTas \sKagit \sMakas");
            String oyunucuTahmini = input.next().toLowerCase();

            if (!(oyunucuTahmini.equals("tas") || oyunucuTahmini.equals("kagit") || oyunucuTahmini.equals("makas"))) {
                System.out.println("Geçerli bir tahmin giriniz\n");
                sayac--;
                continue;
            }

            String[] arr = {"Tas", "Kagit", "Makas"};
            String bilgisayarTahmini = arr[(int) (Math.random() * 3)].toLowerCase();


            if (oyunucuTahmini.equals(bilgisayarTahmini)) {

                System.out.println("\nBerabere! Skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);

            } else if (oyunucuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") ||
                    oyunucuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas") ||
                    oyunucuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")) {
                     oyuncuKazanmaSayisi++;

                System.out.println("\nKazandınız! Skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);

            } else {
                bilgisayarKazanmaSayisi++;

                System.out.println("\nBilgisayar Kazandı! Skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);

            }
        }
        System.out.println("===GAME OVER===");
        String skor;
        if (oyuncuKazanmaSayisi == 3) {
            if (bilgisayarKazanmaSayisi == 0) {
                skor = "Altın";
            } else if (bilgisayarKazanmaSayisi == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println(skor + " skor ile kazandınız.");

        } else {
            if (oyuncuKazanmaSayisi == 0) {
                skor = "Altın";
            } else if (oyuncuKazanmaSayisi == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println("Bilgisayar, " + skor + " skor ile kazandı.");
        }

    }
}
