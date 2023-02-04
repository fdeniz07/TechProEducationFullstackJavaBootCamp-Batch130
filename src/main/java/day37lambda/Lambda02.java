package day37lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {

    /*

        AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve herhangi bir elemanla eşleşme durumunda true dönecektir.

        AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların bu şarta uyması durumunda true dönecektir.

        NoneMatch: Şarta göre Stream içindeki hiç bir elemanın şartı sağlamaması durumunda true dönecektir.

     */


    public static void main(String[] args) throws IOException {

        //1) LambdaTextFile dosyasi icindeki metni consol'a yazdiran kodu yaziniz.

        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //lines() ==> verdiğiniz adresteki dosyaya gidip ordaki satirlari stream() olarak veriyor
        //Files.Lines() Methodu path i stream e cevirir.
        //file classina git sag tikla "copy Path reference" ile adresi alip "Paths.get()" in icine koyuyoruz ve yazdirinca textFile i consolda okuruz

        //2)LambdaTextFile dosyasi icindeki her karakteri uppercase yapiniz.
        Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //3) LambdaTextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz
        boolean result1 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                anyMatch(t -> t.contains("Java")); // Herhangi bir kelime Java ise sonuc True olur.
        System.out.println(result1);

        //split Array dondurdugu icin "Line" i alip parcalayip "array" icine yazar.Arrayden cikarmak icin  "flatmap()" ile kelimeleri duz yapariz.sonra
        //AnyMatch: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve herhangi bir elemanla eşleşme durumunda true dönecektir.


        //4) LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t -> t.contains("a")); // Her kelime a harfini iceriyorsa sonuc true  olur. Aksi halde false olur.
        System.out.println(result2);
        //anyMatch ---> || kullanır
        //AllMatch ----> && kullanır

        //5)LambdaTextFile dosyasi icindeki hicbir kelimenin "x" icermedigini gosteren kodu yaziniz.
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t -> t.contains("x"));
        System.out.println(result3);

        //6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz
        //1.Yol:
        long result4 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
                count();
        System.out.println(result4);
        //2.Yol: Tavsiye edilmez
        int result5 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                collect(Collectors.toList()).
                size();
        System.out.println(result5);
    }
}
