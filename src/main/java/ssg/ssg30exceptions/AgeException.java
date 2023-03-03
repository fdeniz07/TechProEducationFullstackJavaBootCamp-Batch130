package ssg.ssg30exceptions;

public class AgeException extends Throwable {

    public AgeException(String msg) {
        super(msg);
        System.out.println("yas kontrol uygulamasi sonu erdi hata aldiniz tekrar bekleriz");

    }

        /*
            AritmeticException : sifira bolme basta olmak uzere matematiksel hatalari belirtir
            NullpointerException : Henüz deger atamasi yapmadigmiz degiskenler uzerinde islem yapmaya calisirsak dondurur
            IndexOutOfBoundsException: Hatalı indeks erişimlerinde fırlatılır.
            ClassCastException: Geçersiz tür dönüşümü işlemlerinde fırlatılır.
            IllegalArgumentException: Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.
            NumberFormatException: Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.
            ArrayIndexOutOfBoundsException: Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.
            StringIndexOutOfBoundsException: Bir String index'inin disina cikarsak aldigimiz hata
            UnsupportedOperationException: Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır.
            AgeException : eger Java checkAge methodundan yas kontrolu yaparsak ve 18 yasindan kucuk ise bu hatayi aliriz.

        */

}
