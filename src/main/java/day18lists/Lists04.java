package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

        //"names.containsAll(females)" "names" listinde "females" listindeki "tum elemanlarin" var olup olmadigini kontrol eder
        //Tamami varsa size "true" verir, herhangi biri yoksa size false verir.
        boolean r = names.containsAll(females);
        System.out.println(r);

        //names.subList(1, 4) "names" listindeki index'i 1, 2, ve 3 olan elemanlari bir List'in icinde size verir.
        //Ikinci index olan 4, dahil olmaz.
        List<String> subList = names.subList(1, 4);
        System.out.println(subList);//[Cuneyt, Mahsun, Muslum]

        names.retainAll(females);

        System.out.println(names);// [Ajda]
        System.out.println(females);// [Ajda, Emel]

        //Example 1: Elektronik aletler ve ev aletleri listleriniz var.
        //           Elektronik ev aletlerini listeleyiniz.
        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        //homeGoods.retainAll(electronics) homeGoods ile electronics list'lerinin ortak elemanlarini homeGoods listi icinde verir.
        //Baska bir deyisle(In other words) homeGoods listindeki ortak olmayan elemanlari siler.
        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);// [Radio, TV]

        //isEmpty() list'te hic eleman yoksa size "true" verir, 1 veya daha fazla eleman varsa size false verir.
        //"isEmpty()" esasinda "names.size()==0" demektir.
        names.isEmpty();

        System.out.println(names.hashCode());// 2041509
    }

}
