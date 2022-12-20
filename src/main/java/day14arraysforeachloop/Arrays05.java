package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Note 1: sort() metodu, sayisal data tiplerini kücükten büyüge siralar(ascending order).
        //Note 2: sort() metodu, String data tiplerini alfabetik olarak siralar(alphabetical order).
        //Note 3: ascending order + alphabetical order ==> Natural Order
        //Note 4: sort() method'u array elemanlarini "Natural Order" a göre siralar.

        //Note 5: binarySearch method'u bir elemanin bir array'de olup olmadigini kontrol etmek icin kullanilir.
        //        "binarySearch()" method'u kullanmadan önce "sort()" method'unu kullanmak zorundayiz.
        //        sort() method'unu kullanmazsak, buldugumuz sonuc güvenilir olmaz.

        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//[Blue, Brown, Green, Orange, Red, Yellow]

        int num1 = Arrays.binarySearch(colors,"Blue");
        System.out.println(num1); // 0 ==> Var hem de index'i 0

        int num2 = Arrays.binarySearch(colors,"Orange");
        System.out.println(num2); // 3 ==> Var hem de index'i 3

        int num3 = Arrays.binarySearch(colors,"Tarik");
        System.out.println(num3); // -6 ==> "-" bu eleman yok demek.
                                  //        "6" ise olsaydi 6. eleman olurdu demek
    }
}
