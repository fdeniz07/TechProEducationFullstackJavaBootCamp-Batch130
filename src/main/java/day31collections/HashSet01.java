package day31collections;

import java.util.HashSet;

public class HashSet01 {

    /*
        "Hash" bir tekniktir, Java bu tekniği kullanarak benzersiz datalar üretir.
        "Set" tekrarsız data depolamak icin kullanilan bir Collection'dur.
        Set tekrar kabul etmez. Yani tekrarsız verileri depolamak için kullanılır.

        "Set" ler 3 e ayrilir:
            i)HashSet: Süper hizlidir, cünkü HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez.
                a)Yani HashSet'lere eklenen elemanlar rastgele siralanir.
                b)HashSet'ler tekrarli elemana müsade etmez
                c)HashSet'ler sadece 1 tane "null"i eleman olarak kabul ederler.

            ii)LinkedHashSet:
                a)LinkedHashSet elemanlari "insertion order(girilen siraya)"a göre dizer
                b)LinkedHashSet eleamanlari siralamakta zaman kaybettigi icin HashSet'e göre yavastir.

            iii)TreeSet:
                a)TreeSet elemanlari "natural order (A-Z, 0-9)" a göre dizer.
                b)TreeSet "natural order" yaparken cok zaman harcar. O yüzden en yavas "Set"dir.
    */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs); //[5, 234, 12, 78] ==> Gördügünüz gibi elemanlar rastgele siralandi
        int hc =hs.hashCode();
        System.out.println(hc);//329

    }
}
