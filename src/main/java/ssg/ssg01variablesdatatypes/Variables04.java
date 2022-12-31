package ssg.ssg01variablesdatatypes;

public class Variables04 {

    public static void main(String[] args) {


        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        String okulIsmi = "Yildiz Koleji";
        System.out.println(okulIsmi); // Yildiz Koleji

        char ilkHarf;
        ilkHarf = 'H';
        System.out.println(ilkHarf); // H

        int sayi1 = 10, sayi2 = 20;
        System.out.println(sayi1 + sayi2); // 30

        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //	isminiz : Muhmmad
        //	soyisminiz : Frotan
        //	seklinde yazdirin

        String isim = "Elif";
        String soyIsim = "Disiacik";

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz: " + soyIsim);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        short sayi3 = 20;
        double sayi4 = 30;

        System.out.println("iki sayinin toplami : " + (sayi3 + sayi4)); // 50.0
        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        int sayi6 = 20;
        double sayi7 = 12.6;
        System.out.println(sayi6 + sayi7);
        //        double toplam = sayi6+sayi7;
        // System.out.println(toplam);

        //5 – char data turunde bir variable olusturun ve yazdirin
        char ozelKarakter = '#';
        System.out.println(ozelKarakter); // #
        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi5 = 20;
        char harf = 'a';

        System.out.println(sayi5 + harf); // 117
        // char data turundeki degiskenler matematetiksel islemlerde kullanilirsa
        // o char degerinin ASCII karsiligi ileme alinir

        int sayi8 = 'a';
        System.out.println(sayi8); // 97
    }
}
