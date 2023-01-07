package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date myDate = new Date();

        System.out.println(myDate); //Sat Jan 07 21:30:03 CET 2023

        System.out.println(myDate.getTime()); //1673123514828 --> 1 Ocak 1970 den su ana kadar ki mili saniye miktari

        //Icinde bulundugunumuz an nasil alinir?

        System.out.println(LocalDate.now()); //2023-01-07
        System.out.println(LocalTime.now()); //21:35:13.030893
        System.out.println(LocalDateTime.now()); //2023-01-07T21:37:10.862869

        //Dünyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Berlin")));//2023-01-07T21:40:33.018436+01:00[Europe/Berlin]
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo")));//2023-01-07T21:40:33.018436+01:00[Europe/Berlin]
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Moscow")));//2023-01-07T21:40:33.018436+01:00[Europe/Berlin]

        //Ilerideki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35)); //2030-07-12

        //Geriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)); //2018-10-05

        //Ilerideki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3)); //00:57:30.730649

        //Geriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45)); //21:13:38.322706

        //Zaman'da belli bir bölümü nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute()); //22:0

        //Tarih'de belli bir bölümü nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:7
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());//1:7

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007

        boolean result = LocalDate.of(2005, 02, 13).isBefore(LocalDate.of(2007, 03, 01));
        System.out.println(result); //true

        //Tarih'lerin formatlari nasil degistirilir
        //M--> Tek rakamla ay no'sunu yazar, - MM-->iki rakamla ay no'sunu yazar
        //MMM--> Ay isminin ilk üc harfini yazar - MMMMM--> Ay isminin tamamini yazar
        //d-->Tek rakamla gun no'sunu yazar   -   dd-->Iki rakamla gun no'sunu yazar
        //yy-->Yilin son iki rakamini yazar   -   yyyy--> Yilin tamamini yazar
        DateTimeFormatter dtf1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 =  DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter dtf3 =  DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        DateTimeFormatter dtf4 =  DateTimeFormatter.ofPattern("dd/M/yyyy");

        System.out.println(dtf1.format(LocalDate.now())); //08/01/2023
        System.out.println(dtf2.format(LocalDate.now())); //08/Jan/2023
        System.out.println(dtf3.format(LocalDate.now())); //08/January/2023
        System.out.println(dtf4.format(LocalDate.now())); //08/1/2023
    }
}
