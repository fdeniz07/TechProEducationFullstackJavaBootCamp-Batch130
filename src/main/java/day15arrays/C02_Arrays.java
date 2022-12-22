package day15arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //Bir stringdeki sesli harflerin sayisini bulan kodu yaziniz

        String str = "Java ögrenince para kazanmak ne kolay, ögrenmeyince ne kadar zor.";

        
        //I.YOL : use replaceAll()
        int vowels = str.replaceAll("[^aeioöuüAEIOÖUÜ]","").length();
        System.out.println("vowels = " + vowels);

        System.out.println("//////////////////////////");
        
        //II.YOL : use Array - Loop

        str = str.toLowerCase();
        String letters[] = str.split("");
        System.out.println(Arrays.toString(letters));
        //[j, a, v, a,  , ö, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , n, e,  , k, o, l, a, y, ,,
        // , ö, g, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, a, d, a, r,  , z, o, r, .]

        int counter = 0;

        //Note : iter ==> for each loop kisayolu

        for (String w : letters) {

            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "ö":
                case "u":
                case "ü":
                    counter++;
            }
        }
        System.out.println("counter = " + counter);

    }
}
