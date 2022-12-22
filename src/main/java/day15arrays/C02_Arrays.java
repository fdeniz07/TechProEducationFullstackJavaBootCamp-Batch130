package day15arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //Bir stringdeki sesli harflerin sayisini bulan kodu yaziniz

        String str = "Java ögrenince para kazanmak ne kolay, ögrenmeyince ne kadar zor.";

        str = str.toLowerCase();
        String words[] = str.split("");
        System.out.println(Arrays.toString(words));
        //[j, a, v, a,  , ö, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , n, e,  , k, o, l, a, y, ,,
        // , ö, g, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, a, d, a, r,  , z, o, r, .]

        int counter = 0;

        //Note : iter ==> for each loop kisayolu

        for (String w : words) {

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
