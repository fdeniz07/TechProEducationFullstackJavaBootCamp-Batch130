package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    public static void main(String[] args) {

        //LinkedHashSet olusturma
        LinkedHashSet<String> artist = new LinkedHashSet<>();

        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Bradd");
        artist.add("Angelina");
        //Set ler tekrarı kabul etmez.
        //Siz ayni elemani tekrar tekrar eklerseniz Java hata vermez, ama tekrarli eklenen elemani "Set"e sadece bir kere koyar.
        artist.add("Tom");
        System.out.println(artist); //[Ajda, Tom, Bradd, Angelina]

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist); //[Tom, Bradd]
    }
}
