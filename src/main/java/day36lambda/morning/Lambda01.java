package day36lambda.morning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ebubekir", "Ayse", "Zeynep", "Ada", "Okan", "Semih",
                "Gulsen", "Ali", "Semih", "bilal"));

        /*

          anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
          allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
          noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
         */

        alfBykTkrsz(isimler);
        System.out.println();
        chrctrTrsTkrsz(isimler);
        System.out.println();
        chrctrKckByg(isimler);
        System.out.println();
        harfSays7dnAz(isimler);
        System.out.println();
        wIleBslynlr(isimler);
        System.out.println();
        xIleBtn(isimler);
        System.out.println();
        krktrSysEnBykElmn(isimler);
        System.out.println();
        snHrfIlkHrfHrc(isimler);
        System.out.println();
        krktrSysCftKrTkrszBykKck(isimler);//64 36 16
        System.out.println();

    }

    // Yazdir Method Method Referance
    public static void yazdir(String a) {
        System.out.println(a + " ");
    }

    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfBykTkrsz(List<String> isimler) {
        isimler.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t -> System.out.print(t + " "));

    }

    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chrctrTrsTkrsz(List<String> isimler) {
        isimler.
                stream().//akisa alindi
                map(String::length).
                distinct().//benzersiz yapildi
                sorted(Comparator.reverseOrder()).//ters sirali
                forEach(t -> System.out.print(t + " "));

    }


    // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..

    public static void chrctrKckByg(List<String> isimler) {
        isimler.
                stream().//akisa alindi
                sorted(Comparator.comparing(String::length)).//String Datalari karsilastirdi
                forEach(t -> System.out.print(t + " "));

    }

    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void harfSays7dnAz(List<String> isimler) {
        System.out.println(isimler.
                stream().//akisa alindi
                        allMatch(t -> t.length() <= 7) ? "list elemanlari 7 ve 7 den daha az harften olusuyor "
                : "list elemanlari 7 harften buyuk");

    }

    // Task-5 : List elemanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.

    public static void wIleBslynlr(List<String> isimler) {
        System.out.println(isimler.
                stream().//akisa alindi
                        noneMatch(t -> t.startsWith("w")) ? "  w ile baslayan isim bizde olmaz "
                : "w ile baslayan isimler");

    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.

    public static void xIleBtn(List<String> isimler) {
        System.out.println(isimler.
                stream().//akisa alindi
                        anyMatch(t -> t.endsWith("x")) ? "  x ile biten isimler var "
                : " x ile biten isim yok");

    }

    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.

    public static void krktrSysEnBykElmn(List<String> isimler) {
        Stream<String> sonIsim = isimler.
                stream().//akisa alindi
                        sorted(Comparator.comparing(t -> t.toString().
                                length()).
                        reversed()).
                limit(1);// limit() icerisine hangi rakami yazarsaniz o kadar data getirir
        // Stream <String> classindan gelir
        //limit(5)-->en fazla karaktere sahip ilk 5 elemani getir
        System.out.println(Arrays.toString(sonIsim.toArray())); //sonIsim.toArray() stream olan akisi Array'e cevirdim
        //Arrays.toString(sonIsim.toArray()) ==>Array'i Stringe cevirir
        //son isim Stream olduğu için önce arraye sonra yazdırabilmek için Stringe çevirdik

    }


    // Task-8 : list elemanlarini son harfine göre siralayıp ilk
    // eleman hariç kalan elemanlari print ediniz.
    public static void snHrfIlkHrfHrc(List<String> isimler) {
        isimler.
                stream().//akisa alindi
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                skip(1).
                forEach(t -> System.out.print(t + " "));

    }

    // Task-9 : Karakter sayilari cift olan elemanlarin karakter sayilarinin karelerini hesaplayan;
    // tekrarli olanlari sadece bir kere buyukten kucuge  yazdiran programi yaziniz

    public static void krktrSysCftKrTkrszBykKck(List<String> isimler) {

        //("Ebubekir","Ayse","Zeynep","Ada","Okan","Semih","Gulsen","Ali","Semih","bilal"));
        isimler.
                stream().//akisa alindi
                filter(t -> t.length() % 2 == 0).
                map(t -> t.length() * t.length()).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));

    }
}
