package practice.advanced_practice.practice06;

import java.util.Scanner;

public class Q03_RastgeleSifreOlusturma {
    //Kullanıcıdan aldığınız sayı kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Karakter sayısını giriniz");
        int karakterSayisi = input.nextInt();
        int sayac = 0;
        String sifre = "";

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex = karakterler.length();


        while (sayac < karakterSayisi) {

            int rastgeleIndeks = (int) (Math.random() * maxIndex);
            sifre += karakterler.charAt(rastgeleIndeks);
            sayac++;

        }

        System.out.println("sifre = " + sifre);

    }
}
