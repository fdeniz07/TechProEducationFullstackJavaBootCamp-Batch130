package ssg.ssg18arraylists;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList {
    public static void main(String[] args) {
        /*
     elimizde urunlerin bulundugu bir liste var
     urun listesindeki istenen siradaki urunu istegimiz
     yeni urunle degistirip eski urunu
     var olan eski urunler listesine ekleyelim
     */
        List<String> urunler = new ArrayList<>();
        List<String> eskiUrunler = new ArrayList<>();

        urunler.add("cay");
        urunler.add("seker");
        urunler.add("peynir");
        urunler.add("zeytin");
        System.out.println(urunler);
        String silinecek = urunler.get(1);
        urunler.remove(silinecek);
        eskiUrunler.add(silinecek);
        urunler.add(1, "ekmek");
        System.out.println(urunler);
        System.out.println(eskiUrunler);
    }
}
