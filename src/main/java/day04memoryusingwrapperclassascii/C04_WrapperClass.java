package day04memoryusingwrapperclassascii;

public class C04_WrapperClass {
    /*
        Non-Primitive Data type'lar sadece data barindirmak icin degil ayni zamanda methodlarda bulundurur.
        Primitive Data Type'lar ise sadece deger saklar
        Java bu duruma bir cözüm üretmistir.
        Her primitive data türünü Non-Primitive olarak kullanabilmek icin özel Class'lar olusturmustur.
        Oracle firmasinin ürünü olan java primitive'lere method ekleyerek olusturduklari bu yeni yapiya Wrapper Class (sarmallanmis) adini vermistir.


        Primitive   -    Wrapper(Non-Primitive)
          byte      -     Byte
          short     -      Short
          int       -      Integer *****
          long      -      Long
          float     -      Float
          double    -      Double
          boolean   -     Boolean
          char      -      Character *****

       Note: Wrapper Class'lar non-primitive'dir o yuzden memory'de cok yer kaplarlar, o yuzden sart degilse Wrapper Class kullanmayi tercih etmeyiz.

     */

    public static void main(String[] args) {

        byte primitiveByte = 12; // Primitive Data type'larda sonuna nokta koydugumuzda hicbir metot gelmez
        Byte wrapperByte = 12; // Wrapper class'larda sonuna nokta koydugumuzda bircok metot kullanabiliriz.


        //Ex: byte  data type'inin en kücük ve en büyük degerini ekrana yazdirin

        System.out.println(Byte.MIN_VALUE + " | " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " | " + Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + " | " + Long.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " | " + Integer.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + " | " + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " | " + Double.MAX_VALUE);
        System.out.println(Character.MIN_VALUE + " | " + Character.MAX_VALUE);
        System.out.println(Boolean.TRUE + " | " + Boolean.FALSE);


        ///******** Primitive Data Type'lar nasil Wrapper Class'lara cevrilir (Autoboxing) *****\\\\

        float f1 = 13.91F;
        Float wrapperF1 = f1;


        ///******** Wrapper Class'lar nasil Primitive Data Type'lar  cevrilir (Unboxing) *****\\\\

        Character w1 = 's';
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing Java tarafindan otomatik yapilir. Ektra kod yazmaya gerek yok

        //Ex1: Verilen iki String dataninin toplamini veren kodu yaziniz
        String str1 = "12345";
        String str2 = "6789";

        System.out.println(str1 + str2); //123456789 yan yana yazdirdi - ConCat islemi

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //19134

        //Example 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Toplam: " + (intMin + byteMax));// -2147483521

        //Example 3: i)Primitive int'i Wrapper Integer'a ceviriniz.(Autoboxing)
        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22
        //           ii)Wrapper Byte'i primitive byte'a ceviriniz.(Unboxing)
        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);//43

        //Example 4: i)Primitive char'i Wrapper Character'e ceviriniz.(Autoboxing)
        char initial = 'T';
        Character initialWrapper = initial;
        //           ii)Wrapper Boolean'i primitive boolean'a ceviriniz.(Unboxing)
        Boolean isOld = true;
        boolean isOldWrapper = isOld;

        //Example 5: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        String shirt = "2300";
        String shoes = "5200";

        //Java'da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
        //Java'da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa "concatenation islemi" olur.
        //"concatenation islemi" birlestirme yapar.
        //Note: Concatenation islemlerinde Java matematikteki islem onceligi kurallarini kullanir.
        //Islem onceligi kurallari: i)Once uslu sayilar ii)Parantez ici islemler yapilir iii)Carpma ve bolme iv)Toplama ve cikarma
        System.out.println(shirt + shoes);// 23005200
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Example 6: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        //Note: valueOf() methodu tum karakterleri rakam olan String'leri sayilara cevirir.
        //      Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //      Bu hatayi duzeltmeyi ileride ogrenecegiz.
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);//$11000$3000
        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);

        /*
            1) +, -, *, / islemleri Java'da matematikte kullanildigi gibi kullanilir.
            Note 1: int/int ==> int olur
            Note 2: double + int ==> double olur. Cunku; Java'da matematiksel islemlerde farkli data type'lari kullanilirsa sonuc buyuk data type'inde olur.

            2)Java'da "logical operator" lar vardir.
            ADN ve OR islemleri "logical operator" lardir.
        */

    }
}
