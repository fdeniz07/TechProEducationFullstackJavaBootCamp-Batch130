package ssg.ssg07ifstatementternary1;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("girilen sayi cift sayidir");
        }

        if (sayi % 2 != 0) {
            System.out.println("Girilen sayi tek sayi");
        }

        // normalde bir tamsayi ya tektir veya cifttir, ucuncu bir durum yoktur
        // o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        // if else ile tek statement'da yapmak daha guzel olur
        // ======== if else ile cozum=======

        if (sayi % 2 == 0) {
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }
    }
}
