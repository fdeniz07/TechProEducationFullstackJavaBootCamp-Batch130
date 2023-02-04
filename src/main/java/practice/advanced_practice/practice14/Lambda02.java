package practice.advanced_practice.practice14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma", "portakal", "uzum", "cilek", "greyfurt", "nar",
                "mandalina", "armut", "elma", "keciboynuzu", "elma"));

        ilkHarfEVeyaC(meyve); //elma cilek elma elma
        System.out.println("\n******");

        basinaVeSonunaYildiz(meyve);
        System.out.println("\n******");

        System.out.println(karakterSayisinaGoreSirala(meyve));

    }

    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım
    public static void ilkHarfEVeyaC(List<String> meyve) {
        meyve.stream().filter(t -> t.startsWith("e") || t.startsWith("c")).forEach(Utils::yazdir);
    }

    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void basinaVeSonunaYildiz(List<String> meyve) {
        meyve.stream().map(t -> "*" + t + "*").forEach(Utils::yazdir);
        //*elma* *portakal* *uzum* *cilek* *greyfurt* *nar* *mandalina* *armut* *elma* *keciboynuzu* *elma*
    }

    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> karakterSayisinaGoreSirala(List<String> meyve) {
        List<String> sonuc = meyve.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).
                limit(3).
                collect(Collectors.toList());
        return sonuc; //[keciboynuzu, mandalina, portakal]
    }
}
