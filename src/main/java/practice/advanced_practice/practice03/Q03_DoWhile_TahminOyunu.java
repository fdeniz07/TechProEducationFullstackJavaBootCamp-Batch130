package practice.advanced_practice.practice03;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {

    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

    public static void main(String[] args) {

        int rastgeleSayi = (int) (Math.random() * 101); //101 almaminizin nedeni 100'ü de dahil etmesini istedigimi
        Scanner input = new Scanner(System.in);

        int sayi;
        int sayac = 10;
        System.out.print("0-100 arasi(dahil) bir tam sayi giriniz: ");

        do {
            sayac--;
            sayi = input.nextInt();

            if (sayi < rastgeleSayi) {
                System.out.println(sayac + " hakkiniz kaldi.");
                System.out.print("Daha büyük bir sayi giriniz:");
            } else if (sayi > rastgeleSayi) {
                System.out.println(sayac + " hakkiniz kaldi.");
                System.out.print("Daha kücük bir sayi giriniz");
            } else {
                System.out.print("Tebrikler!!! " + (10 - sayac) + ". hakkinizda bildidiniz.");
                System.out.println("Puaniniz: "+(sayac+1)*10);
            }

            if (sayac == 0) {
                System.out.println("Hakkiniz bitti.");
                break;
                //ödev: yeniden oynama hakki
            }

        }
        while (sayi != rastgeleSayi);
    }

}

