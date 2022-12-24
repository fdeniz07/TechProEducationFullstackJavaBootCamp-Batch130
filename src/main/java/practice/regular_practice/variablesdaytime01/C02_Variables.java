package practice.regular_practice.variablesdaytime01;

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
        String fullName = input.nextLine();

        System.out.println("Lütfen yasinizi giriniz : ");
        byte age = input.nextByte();

        System.out.println("Lütfen kilonuzu giriniz : ");
        double weight = input.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz : ");
        double height = input.nextDouble();

        int salary = 20;
        System.out.println("Aylik ücret = " + salary);

        System.out.println("Lütfen devam etmek istediginiz ay sayisini giriniz : ");
        int period = input.nextInt();

        int total = salary * period;
        System.out.println("\nIsminiz : " + fullName + "\t" + "Yasiniz : " + age +"\t" + "Kilonuz : " + weight + "\t" +"Boyunuz : " +height + "\n" +"Ödemeniz gereken toplam tutar : "+
                total+"$");

    }

}
