package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lists02 {

    public static void main(String[] args) {

        /*
            Rastgele kullanici adi olusturan JAVA kodu yaziniz.
               1. Kullanicidan ismini isteyelim
               2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
               3. Kullanici adinin alinabilir olup olmadigina bakalim.
               4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
               5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
    */


        List<String> databaseIsim = new ArrayList<>();
        databaseIsim.add("OKAN23");
        databaseIsim.add("OKAN44");
        databaseIsim.add("OKAN51");
        databaseIsim.add("OKAN22");
        databaseIsim.add("OKAN");

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kullanici adinizi giriniz: ");
        String userName = input.nextLine().toUpperCase().trim();

        //1.Yol: Random tamsayi bulmak icin
        //int random = (int) (Math.random() * 100);

        //2.Yol:
        int random = new Random().nextInt(100);

        while (databaseIsim.contains(userName + random)) {
            random = (int) (Math.random() * 100);
        }

        if (databaseIsim.contains(userName)) {
            System.out.println("Bu kullanici adi database'de var, tekrar kullanilamaz");
            databaseIsim.add(userName + random);

            //Math.random()==> 0 ile 1 arasinda rastgele sayi verir, mesela==>0.2
            //Math.random()==> 0'da dahil tum sayilari verir, fakat "1" haric
            //Math.random()*100==> bununla ise verilen o sayisi yuz ile carpiyor
            // rastegele sayilar hep double geliyor, onu integer'a cevirmek icin "int" koydu

        } else {
            System.out.println("Bu kullanici adi kullanilabilir");
            databaseIsim.add(userName);
        }
        System.out.println(databaseIsim);
    }
}
