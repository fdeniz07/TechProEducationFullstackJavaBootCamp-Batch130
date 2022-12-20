package advanced_practice.practice01;

import java.util.Arrays;

public class Q05_ForEach_EuroDolar {

    /*
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
        Ornek:
         String str ="$1 $12 €34 €56 $45 €78";
          dolarToplami: 58
          euroToplami: 168
     */

    public static void main(String[] args) {

        String str = "$1 $12 €34 €56 $45 €78";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr)); //[$1, $12, €34, €56, $45, €78]

        int dolarToplam = 0;
        int euroToplam = 0;

        for (String w : arr) {

            if (w.contains("$")) {  //(w.startsWith("$")) da kullanilabilir
                dolarToplam += Integer.parseInt(w.replaceAll("\\D", "")); //parseInt yerine valueOf da kullanabiliriz

            } else {
                euroToplam += Integer.valueOf(w.replaceAll("\\D", ""));
            }
        }
        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("euroToplam = " + euroToplam);
    }
}
