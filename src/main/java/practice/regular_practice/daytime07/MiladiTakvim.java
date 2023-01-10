package practice.regular_practice.daytime07;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MiladiTakvim {
    /*
    yerel tarih ve zamana gore; gecerli tarih ve saat
    diliminde bir Miladi Takvim olustur.
    Mevcut yilin isLeapYear olup olmadigini gosteriniz
     */

    public static void main(String[] args) {

        String aylar[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec"};
        int year;
        GregorianCalendar miladiTakvim = new GregorianCalendar();
        System.out.print("Date : ");
        System.out.print(aylar[miladiTakvim.get(Calendar.MONTH)]);
        System.out.print(" " + miladiTakvim.get(Calendar.DATE) + " ");
        System.out.println(year = miladiTakvim.get(Calendar.YEAR));


        if (miladiTakvim.isLeapYear(year)) {
            System.out.println("Bu yil artik yil");

        } else
            System.out.println("Bu yil artik yil degil");
    }
}
