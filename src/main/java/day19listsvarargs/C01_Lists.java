package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Hakan");
        names.add("Yunus");
        names.add("Ayse");
        names.add("Zisan");
        names.add("Sevcan");
        names.add("Omer");

        List<String> males = new ArrayList<>();
        males.add("Hakan");
        males.add("Yunus");
        males.add("Ali");

        names.retainAll(males);
        System.out.println("names = " + names);//names = [Hakan, Yunus] ortak olmayanlar siliniyor
        System.out.println("males = " + males);//males = [Hakan, Yunus, Ali] degismez aynen kalir

        // Listeden belirli bir araliktaki datalari getirme
        List<String> sanatci = new ArrayList<>();
        sanatci.add("Ajda");
        sanatci.add("Cuneyt");
        sanatci.add("Mahsun");
        sanatci.add("Muslum");
        sanatci.add("Orhan");
        System.out.println("sanatci = " + sanatci);
        sanatci.subList(1, 3);
        System.out.println(sanatci.subList(1, 3));
        //subList sout'un icinde yazdirilabilir ya da atama yapip conteyner'in adi yazdirilabilir

    }
}
