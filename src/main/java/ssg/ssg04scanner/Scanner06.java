package ssg.ssg04scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan ismini ve soyIsmini  alip isminin  ve SoyIsminin bas harfini yazdirin.
        //output :Girdiginiz ismin ve soyIsminin ilk harfi : A C

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        char isimIlkHarf = scan.next().charAt(0);

        System.out.println("Lutfen Soyisminizi giriniz...");
        char soyIsimIlkHarf = scan.next().charAt(0);
        // charAt(index) method'u parametre olarak yazdigimiz index'deki char'i bize getirir
        // String'de index 0'dan baslar
        // E r s i n

        System.out.println("Girdiginiz ismin ve soyIsminin ilk harfi : " + isimIlkHarf + " " + soyIsimIlkHarf);
    }
}
