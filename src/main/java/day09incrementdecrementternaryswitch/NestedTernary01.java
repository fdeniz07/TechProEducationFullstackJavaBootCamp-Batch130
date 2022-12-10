package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

        /* Interwiew Sorusu : Leap Year
           Example 1: Verilen yilin "Artik Yil" (Leap Year) olup olmadigini kontrol eden kodu yaziniz
           1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600 ==> Leap  1800 ==> Leap Degil
           2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004 ==> Leap  2004 ==> Leap Degil

        */

        int year = 2022;

        String message = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not leap") : (year % 4 == 0 ? "Leap" : "Not leap");
        System.out.println(message);


    }
}
