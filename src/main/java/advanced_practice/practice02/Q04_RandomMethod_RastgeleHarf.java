package advanced_practice.practice02;

import java.util.Random;

public class Q04_RandomMethod_RastgeleHarf {

    public static void main(String[] args) {

        /*
            Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
            ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
            ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
            ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
            ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
            Diğerleri için “Diğer Karakterleri” yazdırınız.
        */

        // System.out.println((int) (Math.random() * 101));
        //System.out.print(rastgeleHarf());

        String rastgeleHarf = rastgeleHarf().toLowerCase();
        System.out.print(rastgeleHarf+": ");

        switch (rastgeleHarf) {
            case "a":
                System.out.println("Ilk karakter");
                break;
            case "b":
                System.out.println("Ikinci karakter");
                break;
            case "c":
                System.out.println("Ücüncü karakter");
                break;
            case "d":
                System.out.println("Dördüncü karakter");
                break;
            default:
                System.out.println("Diger karakterler");
        }
    }

    public static String rastgeleHarf() {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int maxIndex = alphabet.length();
        int rndIndex = (int) (Math.random() * maxIndex);

        return alphabet.substring(rndIndex, rndIndex + 1);
    }
}
