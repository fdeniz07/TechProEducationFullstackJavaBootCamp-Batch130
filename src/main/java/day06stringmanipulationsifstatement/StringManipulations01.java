package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space karakteri varsa siliniz
        //            "    Ali Can   " ==> "Ali Can"

        String s = "   Ali Can   ";
        System.out.println(s);

        //trim() method'u bir String'deki bastaki ve sondaki space karakterlerini siler, aradaki space'lere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);


        //Example 2: Asagida fiyatlari verilen ürünlerin toplam fiyatlarini bulunuz
        //           String tv = "$456.99";   String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98

        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2); //456.99

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2); //875.99

        double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("$" + totalPrice);


        //Example 3 : Verilen ismin ilk isminin ve soyisminin ilk harfini ekran yazdiriniz
        //            "Ali Can" ==> AC

        String name = "  aLi CAN  ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); //A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last); //C

        System.out.println("" + first + last);

        //Example 4 : Bir String'in hic karakter icermedigini(Bos String) kontrol eden kodu yaziniz

        String str = "";

        //1.Yol
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? : " + result1);


        //2.Yol --> isEmpty()  kullan. Java bir konuda method üretmisse, o method'u kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu? : " + result2);

        //Example 5 : Bir Strin'in space haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String t = "       ";

        //1.Yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("Sadece space mi var? : " + result3);

        //2.Yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var? : " + result4);

        //3.YOL:
        //isBlank() methodu sadece space iceren String'ler icin true verir, space disinda bir character icerirse false verir
        //isBlank() methodu bos String'ler icin de true verir.
        //isBlank() ==> space + hicbirsey icin true                isEmpty ==> hicbirsey icin true
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var? " + result5);

        //Example 6 :Bir String'de a,e,i karakterlerinin ilk görünümlerinin indexlero toplamini ekrana yazdiriniz
        //          "Java is easy learn" ==> 1 + 5 + 8 = 14

        String word1 = "Java is easy to learn";
        int a = word1.indexOf('a');
        int e = word1.indexOf('e');
        int i = word1.indexOf('i');
        System.out.println("Toplam index : " + (a + e + i));


        //Example 7 :Bir String'de "java" kelimesinin ilk kacinci index'de kullanildigini gösteren kodu yaziniz.
        //          "Ah Java vah Java sensiz olmuyor Java." ==> 3

        String java = "Ah Java vah Java sensiz olmuyor Java.";

        //Note: indexOf("Java") kullaniminda siz "Java" kelimesinin ilk görünümndeki ilk harfin(yani "J" nin indexini almis olursunuz.
        int indexJava = java.indexOf("Java");
        System.out.println(indexJava); //3

        //Note: indexOf() method'u olmayan karakterler icin kullanilirsa her zaman "-1" sonucunu verir.
        int idOfXyz = java.indexOf("xyz");
        System.out.println(idOfXyz);

        //Example 8 :Bir String'de a,i,e karakterlerinin son görünümlerinin index'lerinin toplamini ekrana yazdiriniz
        //          "Java is easy learn" ==> 18 + 5 + 17 = 40

        String word2 = "Java is easy to learn";
        int a2 = word2.lastIndexOf('a'); //18
        System.out.println(a2);
        int e2 = word2.lastIndexOf('e'); //17
        System.out.println(e2);
        int i2 = word2.lastIndexOf('i'); //5
        System.out.println(i2);

        System.out.println("Toplam index : " + (a2 + e2 + i2)); //40

        //Note: lastIndexOf() method'u olmayan karakterler icin kullanilirsa her zaman "-1" sonucunu verir.

        //Example 9 :Bir String'deki tekrarsiz karakterlerin ekrana yazdiriniz (interview sorusu)
        //             abbccdc ==> ad

        String y = "abb";

        char ch1 = y.charAt(0);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 = y.charAt(2);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3) == y.lastIndexOf(ch3)) {
            System.out.println(ch3);
        }


        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //      Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        //      if you study hard, you will learn Java.

        //Example 10: Sayi pozitif ise ekrana pozitif yazdirin
        int num = 12;

        if (num > 0) {
            System.out.println("Pozitif");//Pozitif
        }


        //Example 11: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin
        int number = 30;

        if (number > -1 && number < 10) {
            System.out.println("Rakam");
        }


        //Example 12: Sayi üc basamakli ise ekrana "Wooow!" yazdirin
        int num2 = -456;

        num2 = Math.abs(num2); // Math kkütüphanesinden abs() "mutlak deger" method'u kullanilir

        if (num2 > 99 && num2 < 1000) {
            System.out.println("Wooow!");
        }

    }
}
