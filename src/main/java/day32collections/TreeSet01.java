package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {

    public static void main(String[] args) {

        long one = System.nanoTime();

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println("ts = " + ts);//[3, 8, 12, 25, 32]
        long two = System.nanoTime();

        //Ekleme yaparken HashSet kullaniriz, yazdirirken TreeSet'in hizindan yararlaniriz
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println("hts = " + hts);//[3, 8, 12, 25, 32]

        long three = System.nanoTime();

        System.out.println("TreeSet in uygulama süresi" + (two - one));
        System.out.println("HashSet in uygulama süresi" + (three - two));

        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
        //      TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler, ve sonra HashSet'i TreeSet'e ceviririz.

        int first = ts.first();
        System.out.println(first); //3

        int last = ts.last();
        System.out.println(first); //32

        int floor1 = ts.floor(15);
        System.out.println(floor1); //12 ==>15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirildi

        //floor() method'unda kullanabileceginiz sayi en kucuk elemandan az olamaz
        int floor2 = ts.floor(12);
        System.out.println(floor2); //12 ==> 12 elemanlardan biri o yuzden 12 direkt yazdirildi

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1);//25==>15 elemanlardan biri degil o yuzden 15 den bir sonraki eleman yazdirildi

        //"ceiling()" method'unda kullanabilceginiz sayi en buyuk elemandan fazla olamaz.
        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2);//25==> 12 elemanlardan biri o yuzden 25 direkt yazdirildi

        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]==>12 elemanlardan biri o yuzden 12 ve sonraki elemanlar bir Set icinde yazdirildi

        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32]==>15 elemanlardan biri degil o yuzden 15 den  sonraki elemanlar bir Set icinde yazdirildi

        NavigableSet<Integer> tailset3 = ts.tailSet(12, false);
        System.out.println(tailset3); //[25,32] ==> 12 elemanlardan biri normalde "12 ve sonraki elemanlar" bir Set icinde yazdirildi.
        // ama ikinci parametre'de "false" kullandigim icin 12 haric tutuldu

        SortedSet<Integer> headSet1 = ts.headSet(12);
        System.out.println(headSet1); //[3, 8] ==> 12 elemanlardan biri "önceki elemanlar" bir Set icinde yazdirildi. 12 yazdirilmadi.

        SortedSet<Integer> headSet2 = ts.headSet(12, true);
        System.out.println(headSet2);//[3, 8, 12]

        //Generic Method:Normal method'lar parametrelerde belirtilen data type'lari ile calisirlar.
        //               Generic Method'lar ise verilen her turlu data type ile calisma becerisine sahiptirler.
        Integer higher1 = ts.higher(12);
        System.out.println(higher1);//25 ==> 12 den bir sonraki elemani verir

        Integer lower1 = ts.lower(12);
        System.out.println(lower1);// 8 ==> 12 den bir onceki elemani verir.
    }
}
