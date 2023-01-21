package day30exceptionsinterface.interfaces;

public interface Ac {

    //Multiple inheritance class'lar icin mumkun degildir ama interface icin mumkundur
    // Bir interface'i parent yapmak icin impliment keyword'unu kullaniriz
    // Bir class'in birden fazla interface'i olabilir
    // Java parent'lar "Class" oldugunda "Multiple parent" a musade etmez ama biz bazen "mltiple parent' a ihtiyac duyariz
    //    Bu ihtiyaci gidermek ici java "Interface" ismini verdigi yeni bir yapi olusturdu
    //            bu yapi sayesinde bir "class" icin ceoklu "interface parent" olusturabiliriz
    //Interface larini icine "concrete method" konulamaz, cunku "concrete methodlarda" body vardir ve body o method'un isi nasil yapacagi
    //ni belirtir. Isin nasil yapilacagi bircok detay icerir ve bu Child class'larda kafa karisikligina sebep olur
    // Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini child'a birakirsaniz
    // Child Class'in kafa krisikligini engellemis olurusnuz
    // Coklu parent'ta detaylar verilmez sadece methodun ne yapmasini istedigini vermemiz gerek
    //Interface lerde methodlar abstract oldugundan abstract yazmaya gerek yoktur.
    //Interface lerde tum methodlar publictir, statictir,abstractir
    //Interface'ler "concrete" method icermezler, dolayisiyla interface'in icindeki hicbirsey istege bagli degildir
    // Interfacein icindeki hersey child class'lar icin mecburidir, bu yuzden Interface'lere "TODO list" denir
    //interface'lerdeki tum method'lar otomatik olarak "public"dir, "abstract"dir, "static" degildir.

    //interface'lerdeki variabler otomatik olarak "public" dir, "static" dir, "final" dir.

    void cool();

    void run();

    int price = 2000;
    String model = "Mitsubishi";
}
