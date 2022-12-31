package practice.advanced_practice.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q02_Arrays_OrtakElemanlar {
    /*
        * İki Array'de ortak bulunan elementleri ayrı bir List içerisine ekleyen bir kod yazınız.
        * (case sensitivity olmadan)

        * Input1 :      String[] arr = {"John","Brad","Angel","Sofia","Emily"};
                       String[] brr = {"sofia","brad","grace","emily","hazel"};

        * Output : [brad,sofia,emily]
    */
    public static void main(String[] args) {
        String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String[] brr = {"sofia", "brad", "grace", "emily", "hazel"};
        List<String> list = new ArrayList<>();

        for (String w : arr) {
            for (String u : brr) {
                if (w.equalsIgnoreCase(u)) {

                    list.add(w);

                }
            }
        }
        System.out.println("list = " + list);
    }
}
