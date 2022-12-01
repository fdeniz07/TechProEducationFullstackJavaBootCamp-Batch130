package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Otomatik hizalama kisayolu : ctrl + alt + L


        //Variable(Field) olusturmak

        //Java cümlesi = Statement
        //Java'da esittir demek "==". Yani matematik'de "=", Java'da "=="
        //Access Modifier yazilmazsa, access modifier "default" demektir.
        //Data Type = Variable Name ==> Variable Declaration
        //Assigment Operator(Atama Operatörü) + Variable Degeri ==> Assigment
        //Eger Variable Declaration yapar, Assigment yapmazsaniz Java kendi degerlerini(default) koyar. Default degerler sayilar icin sifirdir.
        //Datatype'ni yaziniz. Variable ismini yaziniz. Assignment Operator (Atama Operatörü(=))
        int age = 13;

        //Örnek1: Ögrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        //String'lere verilen degerler cift tirnak icinde olmalidir.
        //String'ler icin "default value" "null" dir.
        String studentName = "Ali Can";

        /*
        Java'da temelde iki tip data vardir.
        A)Primitive data type

          1) Int: Integer in kisaltmasi/ Integer tam sayi demektir. Int 32 bit kullanır. (4 byte kullanır )

            matematikte tam sayilarin başi ve sonu yoktur. Fakat Java da tam sayılaın başı ve sonu vardır
            En küçük int = -2,147,483,648
            En büyük int = -2,147,483,647

          2) byte: Tam sayılar için kullanılır. Byte 8 bit kullanır.
            En küçük byte = -128
            En büyük byte = 127

          3) short : Tam sayılar içindir. Short 16 bit kullanır.
             en küçük short: -32768
             en büyük short: 32767

          4) long : Tam sayılar içindir. 64 bit kullanır.
            sonuna l veya L konur (tercihen büyük L)
            en küçük long : -9,223,372,036,854,755,808
            en büyük lonh : 9,223,372,036,854,755,807

          5) float: Ondalılıklı sayılar içindir. Memory de 32 bit yer kaplar
            "float" virgüleden sonra 7 basamak içerebilir
             sonuna f veya F konur
             Fiyatlandirmalar(12.99)

          6) double: ondalıklı sayılar içindir Memory de 64 bit kullanır
               virgülden sonra 16 basamak içerir.
               (hassas bilimsel veriler için)
               ondalıklı sayılar için genelde double kullanılır
               Hücre agirligi (0.000000000012) gibi. Hassasiyeti yüksektir.

           7) boolean: "true" ve ya "false" değerleri için kullanılır. 1 bit kullanılır

           8) char: tek karakterler için kllanılır. 16 bit kullanır
              A, c, 2, ?, _, =,
              Note: char'lara değer verirken değeri tek tırnak arasına koyunuz yoksa hata verir.

              Note: java büyük ve küçük harflere duyarlıdır. java için TRUE ile true tamamen farklıdır

              Note: Numeric data types: Byte < short < int < long < float < double

              Note: Numeric olmayan data types: boolen - char


        B)Non-Primitive data type


         */

        //Örnek2:Char datatype'inda ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminIlkHarfi = 'A';

        //Örnek3: Boolean datatype'inda ememkliMisin icin bir variable olusturun ve false degerlerini atayin.
        boolean emekliMisin = false;

        //Örnek4: Byte datatype'inda ögrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi = 22;

        //Örnek5: Site nüfusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 3200;

        //Örnek6: Ülke nüfuslari icin bir variable olusturup deger atamasi yapiniz.
        int ulkeNufus = 1500000;

        //Örnek7: Insan vücundaki hücre sayisi icin deger atamasi yapiniz.
        long cellNumberInHumanBody = 450000000000L;

        long weightOfSun = 1234567;

    }
}
