package day34mapsiterators;

import java.util.HashMap;

public class HashMapMEchanism {

    public static void main(String[] args) {

        /*
          1)Siz HashMap olusturmak icin "HashMap<String,Integer> hm = new HashMap<>();" kodunuz yazdiginizda Java
            16 tane "bucket(kova)" olusturur ve bu "bucket" lari 0 dan 15 e kadar index'ler.
          2)Siz eleman eklemek icin " hm.put("Istanbul",17000000);" kodunuz yazdiginizda Java;
           i)"key" icin "hashCode" uretir.
           ii)"hashCode" u 16 ya boler.
           iii)Kalani index olarak kullanip, index'i kalana esit olan bucket'a bu "entry" i yerlestirir.
           IV)Bucket' a "entry" eklenirken, Java o bucket icinde "LinkedList" yapisini kullanir.
     */


        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Istanbul",17000000);
        hm.put("Miami",5000000);
        hm.put("Moscow",18000000);
        hm.put("New Delhi",31000000);

        System.out.println(hm);
    }
}
