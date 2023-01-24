package ssg.ssg20passByValueAndOverloading;

import java.util.ArrayList;
import java.util.List;

public class C04_passByValue {
    public static void main(String[] args) {
        /*
            bir list olusturalim iki ayri method'dan birinde sadece elemanlari degistirelim digerinde yeni bir list atayip,
            ayni sayida yeni eleman ekleyelim ve her iki method call'dan sonra  kendi listemizi main method icerisinde kontrol edelim
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(8);
        System.out.println("methoddan once : " + myList);

        elemanDegistir(myList);
        System.out.println("methoddan sonra : " + myList);
        System.out.println("list degistir methodundan once : " + myList);

        listDegistir(myList);
        System.out.println("list degistir methodundan sonra : " + myList);

        /*
            birden fazla eleman iceren array ve arraylist gibi yapilarda passByValue gecerli eger method'da array veya arrayList'in kendisi degistirilirse
            passByValue ozelligi sebebiyle java degisen degeri degil array ve list'teki orjinal degeri alioydu array ve list degistirilmeden icindeki degerler degistilirse java obje degismedigi icin (referans ayni)
            ayni array ve listteki elemanlari bize dondurur ancak elemanlar degismis olur.
         */

    }

    public static void listDegistir(List<Integer> myList) {
        List<Integer> newList = new ArrayList<>();
        newList.add(9);
        newList.add(4);
        newList.add(18);
        System.out.println("list degistir methodunun icinde : " + newList);

    }

    public static void elemanDegistir(List<Integer> myList) {
        myList.set(0, 1);
        myList.set(1, 10);
        myList.set(2, 20);
        System.out.println("method icinde" + myList);

    }
}
