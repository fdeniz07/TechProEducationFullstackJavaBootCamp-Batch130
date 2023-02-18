package practice.advanced_practice.practice15;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {

        System.out.println(birdenXeKadarDegerlerToplami(5));
        System.out.println(birdenXeKadarTekSayilarinToplami(10));
        System.out.println(birdenSonsuzaKadarGidenTekSayilardanIlkXTanesiniTopla(6));
    }

    //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    public static int birdenXeKadarDegerlerToplami(int x) {

        int sonuc = IntStream.range(1, x + 1).sum();
        return sonuc;

    }

    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static int birdenXeKadarTekSayilarinToplami(int x) {

        int sonuc = IntStream.rangeClosed(1, x).filter(t -> t % 2 != 0).sum();
        return sonuc;

    }

    //SORU3: 1'den sonsuza kadar giden Tek sayılardan, ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int birdenSonsuzaKadarGidenTekSayilardanIlkXTanesiniTopla(int x){

    int sonuc = IntStream.iterate(1,t->t+2).limit(x).sum()  ;

    return sonuc;

    }
}
