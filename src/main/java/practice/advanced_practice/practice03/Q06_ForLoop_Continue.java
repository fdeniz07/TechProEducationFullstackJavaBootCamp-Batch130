package practice.advanced_practice.practice03;

import java.nio.file.OpenOption;
import java.util.Scanner;

public class Q06_ForLoop_Continue {

    /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.
      */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int toplam = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("Bir tam sayi giriniz:");
            int sayi = input.nextInt();

            if (sayi > 5 && sayi < 10) {
                System.out.println("Girdiginiz sayi 5 ile 10 arasindadir. Toplama dahil olmayacaktir");
                continue; //Java, continue kodu calisirsa loop basa döner, bir alt satira gecmes
            }
            toplam += sayi;
        }
        System.out.println(toplam);


    }
}
