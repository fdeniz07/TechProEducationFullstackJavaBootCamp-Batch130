package ssg.ssg21localdates;

import java.time.LocalDate;
import java.util.Scanner;

public class C01_LocalDate {
    /*
        -bugunun tarihini obje olusturarak yazdirin
        -bugun yilin kacinci gunu oldugunu yazdirin
        -hangi gunde oldugumuzu yazdirin
        -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
        sout(tarih.plusYears(3).plus.Months(5).plusDays(7))
        -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
        -bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
        -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
    */
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);
        System.out.println(bugun.getDayOfYear());
        System.out.println(bugun.getDayOfWeek());
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7));
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7).getDayOfMonth());
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7).getDayOfWeek());

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yil ay ve günü giriniz");
        int yil = scan.nextInt();
        int ay = scan.nextInt();
        int gun = scan.nextInt();

        LocalDate tarih = LocalDate.of(yil, ay, gun);
        System.out.println(tarih);
        if (bugun.isBefore(tarih)) {
            System.out.println(bugun);
        } else if (tarih.isBefore(bugun)) {
            System.out.println(tarih);

        } else System.out.println("iki tarih birbirine esit");

    }
}
