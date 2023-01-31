package practice.advanced_practice.practice13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.
public class Q02_Map_Aile {
    public static void main(String[] args) {
       /*

        Map<String, String> adSoyad = new HashMap<>();
        Map<Map<String, String>, Integer> adSoyadYas = new HashMap<>();

        adSoyad.put("Ali", "Can");
        adSoyadYas.put(adSoyad,15);

        System.out.println("adSoyadYas = " + adSoyadYas); //adSoyadYas = {{Ali=Can}=15}

        Map<String, Integer> adSoyadYas2 = new HashMap<>();
        adSoyadYas2.put("Ali Can",15);
        System.out.println("adSoyadYas2 = " + adSoyadYas2); //adSoyadYas2 = {Ali Can=15}

        */

        Aile ali = new Aile("Ali","Can",15,"Ahmet","Hayriye");
        System.out.println("ali.getAileMap() = " + ali.getAileMap());

        Aile veli = new Aile("Veli","Han",25,"Mehmet","Hatice","Hasan","Hüseyin");
        System.out.println("veli.getAileMap() = " + veli.getAileMap());

        Aile ayse = new Aile("Ayşe","Tan", 35, "Fatma");
        System.out.println("ayse.getAileMap() = " + ayse.getAileMap());

    }
}
