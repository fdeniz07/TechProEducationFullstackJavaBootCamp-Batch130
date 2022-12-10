package day09incrementdecrementternaryswitch;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1:

        int a = 10;
        int b = 20;

        int r1 = a < b ? a++ : ++b;

        System.out.println(r1); //10
        System.out.println(a); //11
        System.out.println(b); //20

        //Example 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //             -4 ==> -1*-4        4 ==> 4            0 ==> 0

        int c = 4;
        int r2 = c < 0 ? -1 * c : c;

        System.out.println(r2); //4

        //Example 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n = -6;


        // "Object" Java da butun "Data Type"larinin ortak "Parent"(Baba) idir
        // "Object" in "Parent" i yoktur
        // Farkli data type'lari icin ortak bir variable olusturmak istediginizde, data type olarak object kullanabilirsiniz.
        // Java da "Object", insanlik aleminde "Hz.Adem" e benzer.
        Object durum = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(durum);

        //Example 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int j = -678;
        int i= Math.abs(j);
        String state = (i>99 && i<1000) ? j + " 3 basamakli sayidir"  : j + " 3 basamakli sayidir" ;
        System.out.println(state);

    }
}
