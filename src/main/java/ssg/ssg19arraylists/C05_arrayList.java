package ssg.ssg19arraylists;

import java.util.ArrayList;
import java.util.List;

public class C05_arrayList {

    public static void main(String[] args) {
        /*
            Soru 5)elimizde urunlerin bulundugu bir liste var. urun listesindeki istenen siradaki urunu istegimiz yeni urunle degistirip eski urunu var olan eski urunler listesine ekleyelim
       */
        List<String> urunler = new ArrayList<>();
        List<String> eskiUrunler = new ArrayList<>();
        urunler.add("gofret");
        urunler.add("cikolata");
        urunler.add("muz");
        urunler.add("kola");
        System.out.println(urunler);//[gofret, cikolata, muz, kola]

        String silinecek = urunler.get(1);
        System.out.println(silinecek);//cikolata

        urunler.set(1, "dondurma");
        System.out.println(urunler);//[gofret, dondurma, muz, kola]

        eskiUrunler.add(silinecek);
        System.out.println(eskiUrunler);//[cikolata]
    }
}
