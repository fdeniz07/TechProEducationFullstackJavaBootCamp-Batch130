package ssg.ssg21localdates;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        /*
            soru 2)
            -suanin saatini dakikasini ve saniyesini bize dondurun
            -suanin saniyesini bize dondurun
            -10000 saniye sonrasini bize dondurun
            -200 dakika onceki saati bize dondurun
            -bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
         */
        LocalTime saat = LocalTime.now();
        System.out.println(saat);
        System.out.println(saat.getSecond());
        System.out.println(saat.plusSeconds(10000));
        System.out.println(saat.minusMinutes(200));
        System.out.println(saat.minusHours(17));
        System.out.println(saat.withMinute(9));
        System.out.println(saat.withHour(15));

    }
}
