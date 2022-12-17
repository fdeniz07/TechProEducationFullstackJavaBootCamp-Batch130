package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a = 12; //Bu yapinin icerisinde sadece bir tane data depolanabilir
        //Ama biz kod yazarken, bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde coklu data depolayabilmek icin Java "Array" yapisini olusturmustur


        /*
            IT'de yeni bir sey ogrenirken;
            i) "Ne? Nedir?" oldugunu ogren
            ii) "Neden var? Nicin var?" oldugunu ogren
            iii) "Simple Implementation - Basit Uygulama"
                 "Mid-Level Implementation - Orta Duzey Uygulama"
                 "Advance-Level Implementation - Ileri Duzey Uygulama"
                 "Project-Level Implementation - Proje Duzeyinde Uygulama"
            yapmak lazim.

            Piyasadakiler simple'da takilir. Siz simple-mid arasi levelde takilirsaniz ise girersiniz, dedi

        */


        //Array nasil olusturulur?
        //Array olusturmak icin Array elemanlarinin "data type" i ve "eleman sayisi" mutlaka yazilmalidir.

        String stdNames[] = new String[5];

        //Array console'a nasil yazdirilir
        //toString() method'unu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir.

        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]
        System.out.println(stdNames[0]);

        //Array'e eleman ekleme nasil yapilir?
        stdNames[2] = "Ajda";
        stdNames[0] = "Cuneyt";
        stdNames[1] = "Kemal";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";
        System.out.println(Arrays.toString(stdNames));

        //Array'den spesifik bir elemani almak
        System.out.println(stdNames[2]);

        //Example 1: Array'deki her elemanin sonuna "!" isareti koyarak yazdiriniz.

        for (int i = 0; i < stdNames.length; i++) {
            System.out.print(stdNames[i] + "!" + " ");
        }

    }
}
