package day17arraylists;

import java.util.ArrayList;

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
        ages.add(1,656);
        System.out.println(ages); //[12,656, 9, 10]

        ages.add(3,777);
        System.out.println(ages); //[12, 656, 9, 777, 10]

        ages.add(888);
        System.out.println(ages); //[12, 656, 9, 777, 10]
    }



}
