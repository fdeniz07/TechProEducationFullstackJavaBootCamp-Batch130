package practice.advanced_practice.practice13;

import java.util.Arrays;

public class Q03_Enum_BeslenmeEgzersiz {

    //Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
    //20 ssat üstü egzersiz yapılacak ayları ekrana yazdırınız.

    public static void main(String[] args) {

        /*
        System.out.println(BeslenmeEgzersiz.Ocak.toplamEgzersizSaati);
        System.out.println(BeslenmeEgzersiz.Nisan.toplamEgzersizSaati);

        System.out.println("BeslenmeEgzersiz.valueOf(\"Mart\").ayinMeyvesi = " + BeslenmeEgzersiz.valueOf("Mart").ayinMeyvesi);
        System.out.println(BeslenmeEgzersiz.Haziran);
        System.out.println("BeslenmeEgzersiz.values() = " + Arrays.toString(BeslenmeEgzersiz.values()));

         */

        for (BeslenmeEgzersiz w : BeslenmeEgzersiz.values()){

            if (w.toplamEgzersizSaati>20){
                System.out.println(w);
            }
        }
    }
}
