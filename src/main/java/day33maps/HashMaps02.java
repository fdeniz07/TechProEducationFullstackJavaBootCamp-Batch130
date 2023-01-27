package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir cümledeki herbir kelimenin kacar kere kullanildigini gösteren kodu yaziniz
        //             "Java is easy. Java is OOP. OOP makes Java easy." ==> Java=3, is=2, easy=2,OOP=2,makes=1

        HashMap<String, Integer> wordsMap = new HashMap<>();

        /*
              Meshur Regex'ler
        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
           x, q, w harfleri ==> [xqw]

        8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
        9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

         */


        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";
        sentence = sentence.replaceAll("\\p{Punct}", ""); //String degerler immutable dir. Bu yüzden üstüne yazilmaz.  O yüzden bir degiskene atanir.
        System.out.println(sentence); //Java is easy Java is OOP OOP makes Java easy

        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray)); //[Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

        for (String w : wordsArray) {
            Integer numOfOccurence = wordsMap.get(w);

            if (numOfOccurence==null){
                wordsMap.put(w,1);
            }else{
                wordsMap.put(w,numOfOccurence+1);
            }
        }
        System.out.println(wordsMap); //{Java=3, OOP=2, makes=1, is=2, easy=2}
    }
}
