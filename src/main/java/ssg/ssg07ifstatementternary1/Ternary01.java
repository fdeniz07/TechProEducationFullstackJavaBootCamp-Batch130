package ssg.ssg07ifstatementternary1;

public class Ternary01 {
    public static void main(String[] args) {

        // Bazen ternary'deki iki sonucun data turleri farkli olabilir

        // verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        // 100'den kucukse " sayi 100'den buyuk olmali" yazdiran
        // bir ternary olusturalim


        int sayi = 150;
        // ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        // veya bir degoiskene atamaliyiz
        // Eger sonuclar farkli data turlerinde ise
        // atama yapacagimiz variable'in data turu tek olacagindan
        // atama yapamayiz
        // SADECE direk yazdirabiliriz
        System.out.println(sayi > 100 ? sayi * sayi : "sayi 100'den buyuk olmali");


    }
}
