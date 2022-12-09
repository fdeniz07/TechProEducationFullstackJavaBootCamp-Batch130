package day08nestedif;

import java.util.Scanner;

public class C03_NestedClass {

    /*
        Kullanicidan 0'dan kücük 120'den büyük deger giremeyicek sekilde datalari aldiktan sonra

         - Eger calisan kadinsa, 60 yasindan büyükse Emekli olabilir yazdirin

         - Eger calisan erkek ise 65 yasindan büyükse Emekli Olabilir yazdiran kodu olusturunuz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Cinsiyetinizi Giriniz \nKadin icin\tK\nErkek icin\tE");
        char cinsiyet = input.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz \n");
        int yas = input.nextInt();

        if (cinsiyet == 'K') { //auter if
            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas > 60) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Henüz emekli olamazsiniz. " + (60 - yas) + " daha yil calismaniz gereklidir.");
            }
        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas > 65) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Henüz emekli olamazsiniz. " + (65 - yas) + " daha yil calismaniz gereklidir.");
            }
        } else {

        }

    }
}
