package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {
        /*    Array ile ArrayList'in farki nedir?

            1) ArrayList'ler çoklu data depolamak için kullanılır.
            2) ArrayList'ler non- primitive data type'indeki çoklu dataları depolamak için kullanılır.
               List'ler non-primitive data kabul ederler, "Array"ler ise primitive data veya reference kabul ederler. (Fark)
            3) ArrayList'leri(List) oluştururken içine koyacağınız eleman sayısını başta söylemeye gerek yoktur.
               List'ler eleman sayısında "flexible" dırlar ama Array'ler "flexible" değildirler (Fark)
            4) Madem "Array"ler eleman sayisinda flexible degil, nicin Java "Array" leri iptal etmedi.
                i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
                ii) Arry'ler cok hizli calisir
                iii) Array'ler memory'de cok az yer kaplar.
         */


    public static void main(String[] args) {

        //Array-List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages); //[]

        //Array-List'lere nasil eleman eklenir?
        //List'e eleman eklemek icin add() methodunu kullaniriz.
        //add() methodu elemanlari sizin verdiginiz sirada "list" 'e ekler.(Insertion Order)
        ages.add(12);
        ages.add(9);
        ages.add(10);
        System.out.println(ages); //[12, 9, 10]

        //Eger bir degeri, istedigimiz indexe eklemek istersek; add metodu icinde önce index numarasi sonra da deger verilir.
        ages.add(1, 656);
        System.out.println(ages); //[12,656, 9, 10]

        ages.add(3, 777);
        System.out.println(ages); //[12, 656, 9, 777, 10]

        ages.add(888);
        System.out.println(ages); //[12, 656, 9, 777, 10]

        //Array-List'lere nasil coklu eleman eklenir? veya List'e baska bir List nasil eklenir?
        //Bir "List"e coklu eleman eklemek, o elemanlari önce bir List'in icine koymalisiniz
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);//[9, 656, 12, 777, 10, 888, 8, 9, 10]
        //Eger bir list'i, istedigimiz indexe eklemek istersek; addAll metodu icinde önce index numarasi sonra da List verilir.
        ages.addAll(2, newAges);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        //Bir List'teki tum elemanlari nasil silebilirim?
        //ages.clear();
        System.out.println(ages);

        //toArray() metodu: eleman sayisini degitirmeyecegimizden eminsek array' ye cevirip memory kullnimini azaltabiliriz

        //contains() metodu ilgili eleman list icinde var mi diye kontrol eder
        boolean r = ages.contains(656);
        System.out.println(r);

        //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        //Note: Iki List'in esit olabilmesi icin ayni indexte ayni elemanlar olmalidir.
        boolean s = names1.equals(names2);
        System.out.println(s); //false

        //Example 1: Verilen iki integer List'te tamamiyle ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(7);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);

    }
}
