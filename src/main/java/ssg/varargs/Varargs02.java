package ssg.varargs;

public class Varargs02 {
    public static void main(String[] args) {

        // bir ogrencinin ismi ,Soyismi , sinif ,adress ve yas icin yazidran bir method olsutrun.

        ogrencinBilgiYazdir("Hakan", "Kara", "kadi koy istanbul ", "A", 1954);

        ogrenciBilgileriYazdir(23, "sibel", "bilen", "class10", "mersin 20 123");

    }

    public static void ogrenciBilgileriYazdir(int yas, String... str) {

        for (String w : str) {
            System.out.print(w + " ");
        }
        System.out.println(yas);
    }

    public static void ogrencinBilgiYazdir(String isim, String soyIsim, String adress, String sinif, int yas) {
        System.out.println(isim + " " + soyIsim + " " + adress + " " + sinif + " " + yas);
    }
}
