package SSG;

public class StringManipulation {
    public static void main(String[] args) {

        /*
            1.replaceAll() : Bir grup datayi degistirmek icin
            2.replace() : Grup olmadan tek bir harf ya da kelimeyi degistirmeyi saglar
            3.toLowerCase() - toUpperCase(): Kücük büyük harfe cevirmeyi saglar
            4.contains(): Icerme durumunu kontrol eder
            5.charAt() : Stringdeki indexi alir. Indexler 0'dan baslar
            6.startWith() : Cümlenin hangi kelime ya da harfle sonlandigini kontrol eder
            7.endWidth() : Cümlenin hangi kelime ya da harfle sonlandigini kontrol eder
            8.trim() : Basta ve sondaki bosluklari siler
            9.lenght() : Karakter sayisi
            10.valueOf() : String'i double ya da int'e cevirmek icin kullanilir
            11.substring() : Ilk index'ten 2. index'e kadar karakter almamizi saglar. 2. index dahil degildir.
            12.indexOf() : Girilen harf ya da kelimenin kacinci indexte oldugunu verir
            13.lastIndexOf() : Girilen harf ya da kelimenin sondan baslayarak bastan kacinci indexte oldugunu verir
            14.isEmpty() : Bos mu diye kontrol eder
            15.split() : Bir string'i ikiye böler
            16.isBlank() : Bosluk var mi diye kontrol eder.
            17.
            18.
            19.
            ASCII Table
         */

        // soru 1)Girilen iki String veriyi karşılaştıran Java kodu yazınız

        String str1 = "fotograf";
        String str2 = "kamera";

        System.out.println(str1.equals(str2));
    }
}
