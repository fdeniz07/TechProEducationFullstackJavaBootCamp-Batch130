package day37lambda.morning;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
        System.out.println("tumCifSyElmKup ");
        tumCifSyElmKup(list);
        System.out.println("TumElemnanlari topla ");
        tumElmnTop(list);//TumElemnanlari topla Optional[77]
        System.out.println("tumTeklerinCarpiminiYazdir");
        tumTeklerinCarpiminiYazdir(list);//Optional[1755]
        System.out.println("ucIleBln2Fzls");
        ucIleBln2Fzls(list);//Optional[64]

    }

    //Tum cift sayi olan elemanlarin kuplerini ekrana yazdiriniz
    public static void tumCifSyElmKup(List<Integer> list) {
        list.
                stream().
                filter(Utilities::ciftMi).
                map(Utilities::kupu).
                forEach(Utilities::yazInt);//t->t%2==0  1728 64 216 8 64 1728

    }
    //list'deki tum elemanlarin toplamini ekrana yazdiriniz

    public static void tumElmnTop(List<Integer> list) {
        System.out.println(list.
                stream().
                reduce(Utilities::toplam));
    }

    //list'deki tum tek sayi olan elemanlarin carpimini ekrana yazdiriniz

    public static void tumTeklerinCarpiminiYazdir(List<Integer> list) {
        System.out.println(list.
                stream().
                filter(Utilities::tekMi).
                reduce(Utilities::carpim));
    }

    //list'deki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplamini ekrana yazdiriniz
    public static void ucIleBln2Fzls(List<Integer> list) {
        System.out.println(list.
                stream().
                filter(Utilities::uceBolunebilme).
                map(t -> t + 2).
                reduce(Utilities::toplam));
    }

    //list'deki elemanlari ekrana yazdiriniz ama tekrarli olanlari 1 kere yazdiriniz
}
