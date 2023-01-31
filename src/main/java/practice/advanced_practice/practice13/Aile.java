package practice.advanced_practice.practice13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aile {

    private Map<String, String> adSoyad = new HashMap<>();
    private List<String> kardeslerList = new ArrayList<>();
    private Map<Integer, List<String>> yasKardesler = new HashMap<>();
    private Map<Map<String, String>, Map<Integer, List<String>>> aileMap = new HashMap<>();
    //         Ad    Soyad      Yas         Kardesler


    public Aile(String ad, String soyad, int yas, String... kardesler) {

        adSoyad.put(ad, soyad);

        for (String w : kardesler) {
            kardeslerList.add(w);
        }
        yasKardesler.put(yas, kardeslerList);
        aileMap.put(adSoyad, yasKardesler);

    }
}
