package ssg.ssg03memorykullanimiasiitable;

public class AsciiValue02 {

    public static void main(String[] args) {

        //soru=2:  kucuk a dan kucuk z kadar ascci degerli toplyan bir program yziniz

        int toplam = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
            toplam = toplam + i;
        }

        System.out.println("A dan z kadar Toplami : " + toplam); //  2847

             /*
            a
            a b
            a b c
            a b c d
            a b c d e
       şeklini yazdırınız.
       */


    }
}
