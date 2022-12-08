package day07ifstatement;

import java.util.Scanner;

public class IfStatement05 {

    public static void main(String[] args) {

//Example 1:ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen ay ismi giriniz:");
        String ayIsmi = scn.next();
        if (ayIsmi.equals("Ocak")) {
            System.out.println("1");
        } else if (ayIsmi.equals("Subat")) {
            System.out.println("2");
        } else if (ayIsmi.equals("Mart")) {
            System.out.println("3");
        } else if (ayIsmi.equals("Nisan")) {
            System.out.println("4");
        } else if (ayIsmi.equals("Mayis")) {
            System.out.println("5");
        } else if (ayIsmi.equals("Haziran")) {
            System.out.println("6");
        } else if (ayIsmi.equals("Temmuz")) {
            System.out.println("7");
        } else if (ayIsmi.equals("Agustos")) {
            System.out.println("8");
        } else if (ayIsmi.equals("Eylül")) {
            System.out.println("9");
        } else if (ayIsmi.equals("Ekim")) {
            System.out.println("10");
        } else if (ayIsmi.equals("Kasim")) {
            System.out.println("11");
        } else if (ayIsmi.equals("Aralik")) {
            System.out.println("12");
        } else {
            System.out.println("Gecersiz bir sayi girdiniz.Lütfen 1 ile 12 arasinda bir sayi giriniz.");
        }

        //Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz

       /*
            Javanin kullandigi ve urettigi hersey datadir.
            Javada iki turlu Memory vardir
            1) Stack Memory ==> small gibi
                i) Kucuk Memory'dir
                ii )Primitiveleri ve Non-Primitivelerin Referance (adreslerini ) tutar
            2) Heap Memory ==> Huge gibi
                i) Buyuk Memory'dir
                ii)Non-Primitive datalari icerir

                Java Heap Memory'e yerlestirilen tum Non-Primitive datalar icin
                bir adres (Referance) olusturur.
                Bu adreside Stack Memory'de saklar.
                Herhangi bir sebeple adress (Referance) silinirse Heapdeki Non-Primitive
                datayi Memory'nin temizligini saglayan "Garbage Collector" temizler.


                String s = "Tom";
                String t ="Terry";
                String r = "Tom";
                1) s==t ==> i) Adres ===> farkli
                            ii)Deger ===>farkli

                2) s.equals(t) ==> i) Deger ==>farkli
                   s.equals(r) ==>  i) Deger ==> Ayni


        */




        /*
            Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
              Niye ?
              Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
              ikisi de ayni ise siz String'ler esittir der ama biz code yazarken genellikle String'lerin
              adres'leri ile degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.

              "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
              bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
              ihtiyac duydugumuz seydir.

         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t);// false cunku; adres'ler ve degerler farkli
        System.out.println(s.equals(t));// false cunku; degerler farkli

        System.out.println(s==r);// false cunku adres'ler farkli
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar. "s" ve "r" nin degerleri ayni oldugundan true verir.

        System.out.println(s==m);//
        System.out.println(s.equals(m));//true
    }
}
