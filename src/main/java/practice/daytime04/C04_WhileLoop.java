package practice.daytime04;

import java.util.Scanner;

public class C04_WhileLoop {
      /*
    Interwiew Questions
     Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".... adet sayi girdiniz , toplami..." yazdirin
     */

    public static void main(String[] args) {
        //sayi adedi= sayac
        //toplam

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;  // 2+0=0   2+1=3      *==> 1   2*1=2  ""  true


        while (sayac < 11 && toplam < 501) {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz..");
            sayi = input.nextInt();//her adimda gozuksun diye loop icinde yazdik
            toplam += sayi;
            sayac++;

        }
        if (toplam > 500) {
            System.out.println(sayac + " adet sayi girdiniz . Toplami " + toplam);
        } else
            System.out.println("Bu kadar sayi yeter. " + sayac + " adet sayi girdiniz Toplam " + toplam);

    }
}
