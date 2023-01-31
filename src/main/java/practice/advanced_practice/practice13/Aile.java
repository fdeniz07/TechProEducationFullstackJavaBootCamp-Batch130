package practice.advanced_practice.practice13;

import java.util.*;

public class Aile {

    private Map<String, String> adSoyad = new HashMap<>();
    private List<String> kardeslerList = new ArrayList<>();
    private Map<Integer, List<String>> yasKardesler = new HashMap<>();
    private Map<Map<String, String>, Map<Integer, List<String>>> aileMap = new HashMap<>();
    //         Ad    Soyad      Yas         Kardesler


    public Aile(String ad, String soyad, int yas, String... kardesler) {

        adSoyad.put(ad, soyad);
        kardeslerList.addAll(Arrays.asList(kardesler));
        yasKardesler.put(yas, kardeslerList);
        aileMap.put(adSoyad, yasKardesler);

    }

    public Map<Map<String, String>, Map<Integer, List<String>>>  getAileMap() {
        return aileMap;
    }
}
