package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {
    public static void main(String[] args) {

        //Example 1: String Array elemanlarini character sayisina gore kucukten buyuge siralayiniz.
        //          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]

        String arr[]={"Michael","Ajda","Thomas","Tom"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        //Note: :: ==> bir class'in methodunu ulasmak icin kullanilir. Bunun adina Method Reference denir.
        System.out.println(Arrays.toString(arr));


        System.out.println("/////////////////////////");

        //Example 2: String Array elemanlarini character sayisina gore  buyukten kücüge siralayiniz.
        //          ["Michael", "Ajda", "Thomas", "Tom","Cüneyt"] ==> ["Michael","Thomas", "Cüneyt","Ajda","Tom"]

        String brr[] = {"Michael", "Ajda", "Thomas", "Tom","Cüneyt"};
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr)); //[Michael, Thomas, Cüneyt, Ajda, Tom]


        //Example 3: String Array elemanlarini character sayisina gore  buyukten kücüge siralayiniz.
        //            Ayni karakter sayisinda olanlari da alfabetik  siraya koyunuz
        //            ["Michael", "Ajda", "Reyhane", "Thomas" ,"Gabriel", "Tom","Ali","Cin","Cüneyt","Cem"]
        //            ["Gabriel","Michael","Reyhane", "Thomas","Cüneyt", "Ajda", "Ali", "Cem", "Cin", "Tom" ]

        String crr[] = {"Michael", "Ajda", "Reyhane", "Thomas" ,"Gabriel", "Tom","Ali","Cin","Cüneyt","Cem"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        //Note : Arrays.sort(crr,Comparator.comparingInt(String::length).reversed() burada java karakter sayisina göre kücükten büyüge dogru siralarken
        //       Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder())) hem yukaridaki isi yapar, hem de kendi icerisinde
        //       alfabetik siralamaya göre islem yapar.
        //       reversed==> buyukten kucuge diz
        //       thencomparing==> iceri gir iceriyi de duzenle
        //       Comparator.naturelorder==> iceride dogal siralama yap; yani alfebetik siralama yap

        //Note 2 : Java'daki  varolan methodlari kullanmak Functional Programming(Lambda) denilir.
    }
}
