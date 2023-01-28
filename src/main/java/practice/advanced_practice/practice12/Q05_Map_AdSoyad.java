package practice.advanced_practice.practice12;

import java.util.HashMap;
import java.util.Map;

public class Q05_Map_AdSoyad {

    /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */

    public static void main(String[] args) {
        String[] ad = {"John", "Ali", "Mark",};
        String[] soyad = {"Doe", "Twain", "Can"};
        Map<String, String> adsoyad = new HashMap<>();

        for (int i = 0; i < ad.length; i++) {


            adsoyad.put(ad[i], soyad[i]);

        }
        System.out.println("adsoyad : " + adsoyad);

    }

}
