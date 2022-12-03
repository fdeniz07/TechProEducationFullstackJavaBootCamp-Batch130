package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data type'dir ve ayni zamanda bir class'dir.

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'indeki tüm karakterleri büyük harf yapiniz.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper); //JAVA IS EASY

        //Example 2 : "s" String'indeki tüm karakterleri kücük harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower); //java is easy

        //Example 3 : "s" String'indeki ilk karakterleri aliniz
        char sFirst = s.charAt(0);
        System.out.println(sFirst);

        //Example 4 : "s" String'indeki ilk karakterleri aliniz
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);

        //1.Yol : Ayni satirda yazdirmak icin
        System.out.print(secondChar);//a
        System.out.println(secondLastChar);//s

        //2.Yol
        System.out.println("" + secondChar + secondLastChar); //as

        //Example 5 : "s" String'inde kullanilan karakter sayisini bulunuz
        int sLenght = s.length();
        System.out.println(sLenght);//12

        //Example 6 : "s" String'indeki ilk 4 karakteri bulunuz

        //Substring(0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir.
        String sFirstFour = s.substring(0,4);
        System.out.println(sFirstFour);

        //Example 7 : "s" String'indeki "is" kelimesini aliniz
        String sIs = s.substring(5,7);
        System.out.println(sIs);

        //Example 8 : "s" String'indeki "easy" kelimesini aliniz
        String sEasy = s.substring(8,12);
        System.out.println(sEasy);

        //Note : Bir karakterden baslayip String'in sonuna kadar almak isterseniz, ikinci index'i yazmayiniz
        //s.substring(8,12) yerine s.substring(8) yaziniz

        //Example 9 : "s" String'inde "money" kelimesinin varolup olmadigini kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        /*
            Bir method'u ögrenirken 3 sey mutlaka ögrenin
             1) Bu method ne is yapar?
             2) Bu methodun farkli kullanimlari nasildir?
             3) Bu method size ne return eder?
         */

        // Note: String'ler her zaman büyük kücük harf duyarlidir.

        //Example 10 : "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Example 11 : "s" String'inin 6.karakterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
        boolean is = s.startsWith("i",5);
        System.out.println(is);


    }
}
