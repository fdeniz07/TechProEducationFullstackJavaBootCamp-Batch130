package ssg.ssg21localdates;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class C04_Period {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yil ay ve gun degerleri giriniz");
        int yil = scan.nextInt();
        int ay = scan.nextInt();
        int gun = scan.nextInt();
        LocalDate tarih = LocalDate.of(yil, ay, gun);

        Period period = Period.between(bugun, tarih);
        System.out.println(period);
    }
}
