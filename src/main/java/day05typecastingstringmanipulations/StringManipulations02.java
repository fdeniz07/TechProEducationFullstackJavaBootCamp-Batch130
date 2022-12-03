package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz

        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);


        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        String newS1 =s.replace("money","dollar");
        System.out.println(newS1);


        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz.

        String newS2 =s.replace("earn","win");
        System.out.println(newS2);

        //Example 4: "s" String'indeki "a" harflerini "*"'a ceviriniz.

        //Note: Replace metodunda coklu karakter ile calisirsak cift tirnak kullanmaliyiz. Ama tek karakterle calirsirsak cift tirnak veya tek tirnak kullanabiliriz.

        String newS3 =s.replace('a','*');
        System.out.println(newS3);


        //Example 5: "s" String'indeki "n" harflerini "XXX"'a ceviriniz.

        //Note: Ama ya ikisi de cift tirnak olmalidir ya da ikisi de tek tirnak olmalidir.
        String newS4 =s.replace("n","XXX");
        System.out.println(newS4);


        //Example 6: "s" String'indeki bütün "e" harflerini siliniz.

        //Note: "Hicbir sey" char data type'inda yok. Bu yüzden replace() methodu'u kullnarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz.
        String sRemove = s.replace("e","");
        System.out.println(sRemove);


        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String'indeki tüm rakamlari "*" ceviriniz

        //Note: Bir grup data'yi degistirmek icin replaceAll() metodu kullanilir.
        //Note: Bir grup data'yi ifade etmek icin "Regular Expressions" (Regex) kullaniriz.
        String t1=  t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
            Meshur Regex'ler
            1) Tüm rakamlar ==> [0-9]
            2) Tüm kücük harfler ==> [a-z]
            3) Tüm büyük harfler ==> [A-Z]
            4) Tüm kücük harfler ve büyük harfler ==> [a-zA-Z]
            5) Tüm harfler ve rakamlar [a-zA-Z0-9]
            6) Tüm noktalama isaretleri ==> \\p{Punct}
            7) Tüm sesli harfler ==> [aeiouAEIOU]
               x,q,w harfleri ==> [xqw]

            8) Kücük harflerden farkli tüm karakterler ==> [^]
            9) Tüm harflerden farkli tüm karakterler [^a-zA-Z]
           10) Space disindaki tüm karakterler ==> \\S
         */

        //Example 8: "t" String'indeki tüm rakamlari ve harfleri "!" ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);

        //Example 9: "t" String'indeki tüm sesli harfleri "?" ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);

        //Example 10: "t" String'indeki kücük harfler disindaki tüm karakterleri "<>" ceviriniz
        String t4= t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        //Example 11: "t" String'indeki tüm harfler disindaki tüm karakterleri "+" ceviriniz
        String t5= t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //Example 12: "t" String'indeki space'ler disindaki tüm karakterleri "$" ceviriniz
        String t6= t.replaceAll("[^ ]","€");
        System.out.println(t6);

        //Example 13: "t" String'indeki sesli harfler'ler disindaki tüm karakterleri "&" ceviriniz
        String t7= t.replaceAll("[^aeiouAEIOU ]","&");
        System.out.println(t7);
    }
}
