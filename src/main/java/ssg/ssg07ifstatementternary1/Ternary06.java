package ssg.ssg07ifstatementternary1;

public class Ternary06 {
    public static void main(String[] args) {

        int sayi = 1400;
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun

        String sonuc = sayi >= 100 ? "Sayi 3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";


        // Ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun bir variable'a  atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);
    }
}
