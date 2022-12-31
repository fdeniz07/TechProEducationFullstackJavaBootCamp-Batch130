package ssg.ssg08ifelsenestedif;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "\nKadin icin K \nErkek icin E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yazsinizi giriniz");
        int yas = scan.nextInt();


        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol edin");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin \nDaha " + (60 - yas) + " yil calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol edin");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin \nDaha " + (65 - yas) + " yil calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else {

            System.out.println("Lutfen Cinsiyet icin gecerli bir Harf giriniz");
        }
    }

}
