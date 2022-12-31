package ssg.ssg01variablesdatatypes;

public class Variable03 {

    public static void main(String[] args) {

        String ogrenciIsmi = "Melih";

        ogrenciIsmi = "Furkan";

        // bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        // Ancak declare edilen bir variable tekrar declare edilemez

        // String ogrenciIsmi="Abdullah";

        String isim, soyisim, dogumYeri;

        isim = "Nihad";
        soyisim = "ozel";
        dogumYeri = "Ankara";

        System.out.println(dogumYeri);
        System.out.println(soyisim);

        String tcNo = "12345678901";
        String hiclik = "";

        // String non-primitive oldugu icin biz sadece data saklamak degil
        // ekstra bazi ozellikleri de kullanabiliyoruz
        // Eger Tc No, okul numarasi veya Tel numarasi gibi
        // kendisi sayisal olan ancak matematiksel bir islemde kullanilmayan
        // degerler icin de String kullanilabilir


        String harf = "A";
        char harf2 = 'A';

        // bu ikisi icin de ayni durum gecerli
        // ben A harfi icin bir variable'i char olarak da olusturabilirim String olarak da olusturabilirim
        // Eger sadece saklayacaksak char kullanilabilir ama
        // String'in ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli olabilir

    }
}
