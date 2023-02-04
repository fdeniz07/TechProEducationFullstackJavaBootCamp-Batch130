package day36lambda.morning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Lambda02 {

    public static void main(String[] args) {

        Universite u1 = new Universite("hacettepe", "fizik", 1200, 88);
        Universite u2 = new Universite("bogazici", "qa", 1000, 90);
        Universite u3 = new Universite("odtu", "dev", 900, 95);
        Universite u4 = new Universite("marmara", "matematik", 3000, 60);
        Universite u5 = new Universite("ege", "elektrik-elektronik", 2000, 83);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5));
        System.out.println(notOrt75tenByk(unv));
        System.out.println();
        System.out.println(mtkVrmYkm(unv));//true
        System.out.println();

    }

    // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu
    // gosteren bir program olusturunuz.
    public static boolean notOrt75tenByk(List<Universite> unv) {
        return unv.
                stream().
                allMatch(t -> t.getNotOrtalamasi() > 75);

    }

    // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden
    //  bir program olusturunuz.
    public static boolean mtkVrmYkm(List<Universite> unv) {
        return unv.
                stream().
                anyMatch(t -> t.getBolum().equalsIgnoreCase("matematik"));

    }

    // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayan
    //    bir program olusturunuz.

    //Task 04-->"matematik" bolumlerinin sayisini  print ediniz.

    //Task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

    //Task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
}
