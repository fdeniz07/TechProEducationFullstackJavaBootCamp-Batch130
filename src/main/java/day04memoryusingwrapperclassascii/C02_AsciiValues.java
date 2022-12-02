package day04memoryusingwrapperclassascii;

public class C02_AsciiValues {

    /*
        ASCII : Amerikan Standart Kodlama Sistemi uluslararasi kabul görmüs degerlerdir.

        Java da her karakterin sayısal bir değeri vardır.
        Bu değerler ASCII Değer'ler olarak adlandırılır.
        Bu değerlerin tamamının bulunduğu tabloya ASCII Table denir.

        Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi, Char data türünde isleme alinirsa; o char degerinin ASCII tablosundaki karsiligini isleme alir.

        Harf ve sembollere deger atar

        Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cunku bilgisayarda hersey 1001001 den olusur. bu yapiya cevirebilmek icin Ascii Table olusturulmustur.

        Buyuk harflerin Ascii degeri kucuk harflerin Ascii degerinden daha kucuktur.

     */

    public static void main(String[] args) {

        //Bir tamsayi ile bir harfi toplayiniz

        int value = 20;
        char letter = 'a';

        //1.Yol
        int sum = value + letter;
        System.out.println("Bir tam sayi ile bir harfin ascii degerleri toplami = " + sum);

        //2.Yol
        System.out.println("Bir tam sayi ile bir harfin ascii degerleri toplami = " + (value + letter));

        char num1 = '1';
        System.out.println("num1 = " + num1);

        char num2 = '2';
        System.out.println("num2 = " + num2);

        char num3 = '3';
        System.out.println("num3 = " + num3);

        char num4 = '4';
        System.out.println("num4 = " + num4);

        System.out.println("Sayi1 + Sayi2 + Sayi3 + Sayi4 = " + num1 + num2 + num3 + num4);
        System.out.println("Sayi1 + Sayi2 + Sayi3 + Sayi4  ASCII Toplam = " + (num1 + num2 + num3 + num4));

        char smallLetter='a';
        char bigLetter='A';

        System.out.println("Kücük Harf'in Ascii Degeri = " + (smallLetter+0));
        System.out.println("Büyük Harf'in Ascii Degeri = " + (bigLetter+0));

        System.out.println("smallLetter > bigLetter : " +(smallLetter>bigLetter) );

        //Note: Char islemlerinde ekrana yazdirildiginda normal degeri cikarken, herhangi bir matematik islemine tabi tutulursa ASCII degerini hesaplar. Ayrica karsilastirma islemlerinde de boolean deger döner.

        char space=' ';
        System.out.println("space Ascii value = " + (space+0));


        //Note: char data type'larinda Java, karaktere int degerde atanabilir. Cünkü char data type'inin bir resim degeri bir de Ascii'den gelen int degeri vardir. Bu sekilde de ascii degerini bulabiliriz.
        int hrf='m';
        System.out.println("hrf = " + hrf);


        //// ********************* ASCII degerlerinden yararlanarak Karsilastirma yapabiliriz ********************* \\\\\\

        byte b = 125;
        float f = 2.456785F;
        long l= 102122102212110L;
        char ch ='h';

        System.out.println(l>ch);
        System.out.println(b<f);
        System.out.println(b<ch);
    }
}
