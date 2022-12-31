package ssg.ssg04scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //  Kullanıcıdan ad, ikinci ad, soyadı, SSN'yi alın ve ardından aşağıdaki gibi yazdırın

        //Ali Mert Can
        //kkno:123456789
        Scanner scan=new Scanner(System.in);

        System.out.println("Adinizi giriniz :");
        String ad=scan.next();

        System.out.println("ikinci isminize giriniz :");
        String ikinciIsim=scan.next();

        System.out.println("soyIsminize giriniz :");
        String soyIsim=scan.next();

        System.out.println("kimlik kart numarnize giriniz:");//nextline() takes all the strings next() takes just first word
        String kkno=scan.next();

        System.out.println(ad+" "+ikinciIsim+" "+soyIsim);
        System.out.println("Kkno:"+kkno);

    }
}
