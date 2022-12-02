package day04memoryusingwrapperclassascii;

public class C03_LogicalOperators {

    // 10< sayi MantikOperatoru sayi<20;
    // == Esittir icin cift == kullanilir. = esittir atama(assigment) yapar

    /*
        Java üclü karsilastirma kabul etmez.
        Ikili karsilastirmalar yapip, mantik operatörleriyle birlestirmeliyiz

        &&  ve (and) Operatörü

        &&'de boolean sonucta bir tane false bulunca durur
        &'de ise tüm satiri tarar ve durur.
        bu da &&'nin &'Den daha hili calismasini saglar.

        || : veya (or) Operatörü


     */

    public static void main(String[] args) {
        System.out.println(5 + 2 == 8); //false

        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc1); //true

        boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2==8;
        System.out.println("sonuc2 = " + sonuc2); //false

        int sayi1=15;
        System.out.println(10<sayi1 && sayi1<20); //true

        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20); //true
    }
}
