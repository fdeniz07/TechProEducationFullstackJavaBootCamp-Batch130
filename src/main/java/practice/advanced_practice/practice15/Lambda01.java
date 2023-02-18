package practice.advanced_practice.practice15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda01 {

    public static void main(String[] args) {

        Apartman daire01 = new Apartman("dogu", 1, 7000);
        Apartman daire02 = new Apartman("bati", 2, 10000);
        Apartman daire03 = new Apartman("güney", 3, 12000);
        Apartman daire04 = new Apartman("dogu", 5, 15000);

        List<Apartman> daireler = new ArrayList<>(Arrays.asList(daire01, daire02, daire03, daire04));

        System.out.println();
        System.out.println("************************************************************");
        System.out.println(" tumDaireKira5000denBuyukIseTrue = " + tumDaireKira5000denBuyukIseTrue(daireler));
        System.out.println("************************************************************");
        System.out.println(" dairelerdenEnAzBirininKatSayisiIkiIseTrue = " + dairelerdenEnAzBirininKatSayisiIkiIseTrue(daireler));
        System.out.println("************************************************************");
        System.out.println(" cephesiDoguOlanlarinSayisi = " + cephesiDoguOlanlarinSayisi(daireler));
        System.out.println("************************************************************");
        System.out.println(" katSayisinaGoreBuyuktenKucugeSirala = " + katSayisinaGoreBuyuktenKucugeSirala(daireler));
        System.out.println("************************************************************");
        System.out.println(" katSayisiIkidenBuyukOlanlariKirayaGoreBuyuktenKucugeSirala = " + katSayisiIkidenBuyukOlanlariKirayaGoreBuyuktenKucugeSirala1YOL(daireler));
        System.out.println("************************************************************");
        katSayisiIkidenBuyukOlanlariKirayaGoreBuyuktenKucugeSirala2YOL(daireler);
        System.out.println("************************************************************");
        System.out.println(" katSayisi3DenAzOlanKirayaGoreKucuktenBuyugeSiralaEnKucukKiraListesiniYazdir = " + katSayisi3DenAzOlanKirayaGoreKucuktenBuyugeSiralaEnKucukKiraListesiniYazdir(daireler));
        System.out.println("************************************************************");
    }

    // SORU1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın
    public static boolean tumDaireKira5000denBuyukIseTrue(List<Apartman> daireler) {

        boolean sonuc = daireler.
                stream().
                allMatch(t -> t.getKira() > 5000);
        return sonuc;
    }

    // SORU2: Dairelerden En Az Birinin katSayisi 2 ise return ederek True yazdırın
    public static boolean dairelerdenEnAzBirininKatSayisiIkiIseTrue(List<Apartman> daireler) {

        boolean sonuc = daireler.
                stream().
                anyMatch(t -> t.getKatSayi() == 2);
        return sonuc;
    }

    //SORU3: Dairelerden cephesi 'dogu' olanların, sayısını return ederek yazdırınız.
    public static long cephesiDoguOlanlarinSayisi(List<Apartman> daireler) {

        long sonuc = daireler.
                stream().
                filter(t -> t.getCephe().contains("dogu")).
                count();

        return sonuc;
    }

    //SORU4: Daireleri, katSayisina göre buyukten kucuge sıralayınız.List halinde return ederek yazdırınız.
    public static List<Apartman> katSayisinaGoreBuyuktenKucugeSirala(List<Apartman> daireler) {

        List<Apartman> sonuc = daireler.
                stream().
                sorted(Comparator.comparing(Apartman::getKatSayi).reversed()).
                collect(Collectors.toList());

        return sonuc;

    }

    //SORU5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız, en buyuk kira'sını list halinde return ederek yazdırınız.
    public static List<Integer> katSayisiIkidenBuyukOlanlariKirayaGoreBuyuktenKucugeSirala1YOL(List<Apartman> daireler) {

        List<Integer> sonuc = daireler.
                stream().
                filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).
                map(t -> t.getKira()).
                collect(Collectors.toList());

        return sonuc;

    }

    //SORU5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız, en buyuk kira'sını list halinde return ederek yazdırınız.
    public static void katSayisiIkidenBuyukOlanlariKirayaGoreBuyuktenKucugeSirala2YOL(List<Apartman> daireler) {

        Stream<Integer> sonuc = daireler.
                stream().
                filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).
                map(t -> t.getKira());

        System.out.println(Arrays.asList(sonuc.toArray()));
    }

    //SORU6: katSayisi 3'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız, en kucuk kira'sini list halinde return ederek yazdırınız.
    public static  List<Integer> katSayisi3DenAzOlanKirayaGoreKucuktenBuyugeSiralaEnKucukKiraListesiniYazdir(List<Apartman> daireler){

        List<Integer> sonuc =  daireler.
                stream().
                filter(t->t.getKatSayi()<3).
                sorted(Comparator.comparing(Apartman::getKira)).
                limit(1).
                map(t->t.getKira()).
                collect(Collectors.toList());

        return sonuc;
    }

}
