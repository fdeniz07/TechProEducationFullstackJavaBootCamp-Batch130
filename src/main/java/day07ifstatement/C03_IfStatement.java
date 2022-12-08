package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        /*
            Iki tane String datanin birbirine esit olmadigini anlamak icin "==" degil; equals() methodu kullaniriz

            i) equals() ==> Büyük kücük harf önemser
            ii) equalsIgnoreCase() ==> Büyük kück harf önermez

         */

        //Ex 1: Kullanicidan gün isimlerini aliniz, hafta ici mi hatfa sonu mu oldugunu yazdiran kodu yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir gün ismi giriniz");

        String gunIsmi = scan.next();

        //I. Yol
        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta Sonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta Ici");
        } else System.out.println("Lütffen Gecerli Bir Gün Giriniz...! ");

        //2. Yol
        //Genelde degerler boolean icerisine tanimlanir ve if bloklarinda sadece kontrol isleminin yapilmasi tercih edilir.

        boolean haftaIci = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");
        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar");

        if (haftaIci) {
            System.out.println("Hafta Ici");
        } else if (haftaSonu) {
            System.out.println("Hafta Sonu");
        } else System.out.println("Lütffen Gecerli Bir Gün Giriniz...! ");
    }
}
