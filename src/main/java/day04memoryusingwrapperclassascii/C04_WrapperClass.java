package day04memoryusingwrapperclassascii;

public class C04_WrapperClass {
    /*
        Non - Primitive Data type'lar sadece data barindirmak icin degil ayni zamanda methodlarda bulundurur.
        Primitive Data Type'lar ise sadece deger saklar
        Java bu duruma bir cözüm üretmistir.
        Her primitive data türünü Non-Primitive olarak kullanabilmek icin özel Class'lar olusturmustur.
        Oracle firmasinin ürünü olan java primitive'lere method ekleyerek olusturduklari bu yeni yapiya Wrapper Class (sarmallanmis) adini vermistir.


        Primitive       Wrapper(Non-Primitive)
          byte            Byte
          short           Short
          int             Integer *****
          long            Long
          float           Float
          double          Double
          boolean        Boolean
          char            Character *****
     */

    public static void main(String[] args) {

        byte primitiveByte = 12; // Primitive Data type'larda sonuna nokta koydugumuzda hicbir metot gelmez
        Byte wrapperByte = 12; // Wrapper class'larda sonuna nokta koydugumuzda bircok metot kullanabiliriz.


        //Ex: byte  data type'inin en kücük ve en büyük degerini ekrana yazdirin

        System.out.println(Byte.MIN_VALUE + " | "+ Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " | "+ Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + " | "+ Long.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " | "+ Integer.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + " | "+ Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " | "+ Double.MAX_VALUE);
        System.out.println(Character.MIN_VALUE + " | "+ Character.MAX_VALUE);
        System.out.println(Boolean.TRUE + " | "+ Boolean.FALSE);


        ///******** Primitive Data Type'lar nasil Wrapper Class'lara cevrilir (Autoboxing) *****\\\\

        float f1 = 13.91F;
        Float wrapperF1 = f1;


        ///******** Wrapper Class'lar nasil Primitive Data Type'lar  cevrilir (Unboxing) *****\\\\

        Character w1 = 's';
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing Java tarafindan otomatik yapilir. Ektra kod yazmaya gerek yok

        //Ex: Verilen iki String dataninin toplamini veren kodu yaziniz
        String str1 ="12345";
        String str2 = "6789";

        System.out.println(str1+str2); //123456789 yan yana yazdirdi - ConCat islemi

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2)); //19134

    }
}
