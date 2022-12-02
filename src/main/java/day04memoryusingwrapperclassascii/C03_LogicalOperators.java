package day04memoryusingwrapperclassascii;

public class C03_LogicalOperators {

    /*
        1) +,-,*,/ işlemleri Java'da matematikte kullanıldığı gibi kullanılır.
        Note1: int/int ==> int olur
        Note2: double/int ==> double olur çünkü Java'da matematiksel işlemlerde farklı data type'ları kullanılırsa sonuç büyük data type'ında olur

         10< sayi MantikOperatoru sayi<20;
         == Esittir icin cift == kullanilir. = esittir atama(assigment) yapar


        Java üclü karsilastirma kabul etmez.
        Ikili karsilastirmalar yapip, mantik operatörleriyle birlestirmeliyiz


        2)Java'da "logical operator" lar vardır.
          AND ve OR işlemleri "logical operator" lardır.

        &&  ve (and) Operatörü
        AND işleminden true alabilmek için her şey true olmalıdır.(& symbol)
        AND işlemi "perfectionist" tir.
        AND işleminde bir tane false sonucu false yapar.


        &&'de boolean sonucta bir tane false bulunca durur
        &'de ise tüm satiri tarar ve durur.
        bu da &&'nin &'Den daha hili calismasini saglar.

        || : veya (or) Operatörü
        OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
        OR işleminde sonucun false olması için her şey false olmalıdır.
        OR işlemi "polyanna" gibidir.

        NOT Operatörü true olanı false, false olanı true yapar. (! symbol)
        !true = false
        !false = true
        !!true = true

        3)Karşılaştırma Operatörleri(Comparison Operators)
          <, >, >=, <=, ==, !=
          Note:Karşılaştırma Operatörlerini kullandığınız kesinlikle "boolean (true/false)" alırsınız

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

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5 >= 19;
        System.out.println(first + " - " + second + " - " + third);
        System.out.println(first && second);
        System.out.println(first || second || third);
    }
}
