package practice.variablesdatetime01;

import java.util.Scanner;

public class C02_Variables {

            /*
               TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
               salona devam edeceği ay süresi
              bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
          */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TechProEd Spor Salonuna Hosgeldiniz");

        System.out.println("Lütfen isim soyisim giriniz : ");
        String isim = input.nextLine();

        System.out.println("Lütfen yasinizi giriniz : ");
        byte yas = input.nextByte();

        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz : ");
        double boy = input.nextDouble();

        int aylikUcret = 20;
        System.out.println("Aylik ücret = " + aylikUcret);

        System.out.println("Lütfen devam etmek istediginiz ay sayisini giriniz : ");
        int ay = input.nextInt();

        int toplamTutar = aylikUcret * ay;
        System.out.println("\nIsminiz : " + isim + "\t" + "Yasiniz : " + yas +"\t" + "Kilonuz : " + kilo + "\t" +"Boyunuz : " +boy + "\n" +"Ödemeniz gereken toplam tutar : "+
                toplamTutar+"$");


    }

}
