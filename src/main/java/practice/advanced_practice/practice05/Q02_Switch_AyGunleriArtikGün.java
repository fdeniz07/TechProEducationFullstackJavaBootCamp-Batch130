package practice.advanced_practice.practice05;

import java.util.Scanner;

public class Q02_Switch_AyGunleriArtikGün {

    /*
       Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yili  giriniz: ");
        int year = input.nextInt();

        System.out.print("Ay numarasini giriniz: ");
        int month = input.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Girdiginiz ayin gün sayisi: 31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Girdiginiz ayin gün sayisi: 30");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //Artik yil her 400.yilda bir gelir ya da 4 bölünen ve 100 bölünemeyen yillar artik gün verir
                    System.out.println("Girdiginiz ayin gün sayisi: 29");
                } else {
                    System.out.println("Girdiginiz ayin gün sayisi: 28");
                }
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz");
        }


    }

}
