package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz, character sayisi 5 den cok olan elemanlari siliniz.
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));// [Red, Orange, Blue, Yellow, Green, Brown]

        //Logic: Yeni bir array olusturup, character sayisi 5 ve 5'den kucuk olan
        //       elemanlari yeni array'e tranfer edecegiz. Boylelikle yeni array'de
        //       character sayisi 5'den buyuk olan hicbir eleman olmayacak.

        //Soru: Hocam, array olusturmak icin iki sey belirlenmelidir;
        //      1)Elemanlarin data type'i
        //      2)Yeni array'de kac tane eleman olacak.

        //Verilen array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var bulmaliyiz.
        int counter = 0;
        // Red, Orange, Blue, Yellow, Green, Brown
        for(String w : colors){


            if(w.length()<=5){
                counter++;
            }
        }

        //Yeni array olustur
        String newColors[] = new String[counter];

        //Character sayisi 5 ve 5'den kucuk olanlari yeni array'e transfer et
        int idx = 0;
        // Red, Orange, Blue, Yellow, Green, Brown
        for(String w : colors){

            if(w.length()<=5){
                newColors[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));// [Red, Blue, Green, Brown]

        //arrayler collectionlara gore ilkel yapidadir, collectionlarda biz istedigimiz elemani silebiliyoruz
        //fakat arraylerde elemanlari silmemiz icin yeni array olusturmamiz gerekiyor
        // arrayler ilkel ama hizli, ilkel datalar hiz yonunden avantaj sagladigi icin kullanilir
    }
}
