package practice.advanced_practice.practice08;

public class Kutuphane {

    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNumarasi;
    static int kitapSayisi;

    public Kutuphane(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        kitapSayisi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNumarasi = kitapAdi.substring(0, 2) + yazarAdi.substring(0, 2) + kitapSayisi;
        kitapBilgileri();
    }

    public void kitapBilgileri() {
        System.out.println("Kitap Adı: " + kitapAdi + "\nYazar Adı: " + yazarAdi + "\nSayfa Sayısı: " + sayfaSayisi + "\nSeri No: " + seriNumarasi);
        System.out.println("============");
    }
}
