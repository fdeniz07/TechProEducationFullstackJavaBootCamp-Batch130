package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1: String array olusturun icine 5 tane eleman ekleyin sonrada
        // ilk eleman ile son elemanın icerdigi karakter sayiları toplamını ekrana yazdırın

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length - 1].length());

        //Example 2: String array olusturun icine 5 tane eleman ekleyin sonrada
        // TÜm elemanlarin icerdigi karakter sayiları toplamını ekrana yazdırın

        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        //1.Yol : for-loop

        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {
            totalChar += brr[i].length();
        }
        System.out.println("Toplam karakter sayisi : " + totalChar); //33

        //2.Yol : for-each-loop (enhanced loop) ==> baslangic degeri,loop'un calisma sarti ve increment/decrement kismini halleder
        //        for-each-loop "Array" lerde ve "Collection" larda kullanilir.
        //         Index kullanmaniz gerektiginde bazen for-each-loop caresiz kalir. Mecburen diger loop'lari kullaniriz.

        int sum = 0;

        for (String w : brr) {
            sum += w.length();
        }
        System.out.println("Toplam karakter sayisi : " + sum);

    }
}
