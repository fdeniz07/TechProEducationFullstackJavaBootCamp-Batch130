package practice.advanced_practice.practice09.overriding;

public class Q02_Kredi {

    //Bir bankadan kredi alan müşterileri kredi türlerine göre objeler oluşturarak kaydeden bir kod yazınız.
    //Emekli: %12 standart faiz, İşçi: %15 işçi oranı, Memur: %10 memur oranı

    public static void main(String[] args) {

        Emekli emekliHasanAmca = new Emekli();
        System.out.println(emekliHasanAmca.faizHesapla(100));

        Memur memur1 = new Memur();
        System.out.println(memur1.faizHesapla(200));

        Isci isci1 = new Isci();
        System.out.println(isci1.faizHesapla(125));
    }
}
