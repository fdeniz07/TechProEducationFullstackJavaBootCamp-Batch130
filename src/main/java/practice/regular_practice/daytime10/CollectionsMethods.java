package practice.regular_practice.daytime10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMethods {
    // Kullanıcıdan 5 sayıdan olusan
    // bir liste isteyin.
    // listeyi sirala ve tersten yazdir
    // listeyi karıştırin ve yazdırin
    // 3'er sağa kaydirin ve yazdırin

    //maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıların yerine minimum sayıyi yazdir

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen sayi giriniz");
            arrList.add(input.nextInt());
        }

        System.out.println(arrList);//[5, 6, 7, 8, 3]
        //listeyi sirala  tersten yazdir

        arrList.sort(Collections.reverseOrder());
        System.out.println(" tersten arrList = " + arrList);//arrList = [8, 7, 6, 5, 3]

        // listeyi karıştırin ve yazdırin
        Collections.shuffle(arrList);//  shuffle(arrList) rastgele karistir
        System.out.println("karistirdiktan sonra arrList = " + arrList);

        // 3'er sağa kaydirin ve yazdırin
        Collections.rotate(arrList, 3);// rotate(arrList,3) = verilen listeyi distance mesafe kadar saga kaydirir.
        System.out.println(" 3er saga kaydirdiktan sonra arrList = " + arrList);

        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        // tüm maksimum sayıların yerine minimum sayıyi yazdir

        Collections.replaceAll(arrList, max, min);
        System.out.println("arrList = " + arrList);

    }
}
