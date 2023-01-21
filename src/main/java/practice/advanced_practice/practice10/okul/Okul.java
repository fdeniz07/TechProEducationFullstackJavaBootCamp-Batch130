package practice.advanced_practice.practice10.okul;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String okulAdi;
    private int maxOgrenciSayisi;
    private List<Ogrenci> ogrenciListesi = new ArrayList();

    public Okul(String okulAdi, int maxOgrenciSayisi, List<Ogrenci> ogrenciListesi) {
        this.okulAdi = okulAdi;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciListesi = ogrenciListesi;
    }

    public Okul() {

    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public List<Ogrenci> getOgrenciListesi() {
        return ogrenciListesi;
    }

    public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
        this.ogrenciListesi = ogrenciListesi;
    }

    @Override
    public String toString() {
        return "okulAdi='" + okulAdi + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciListesi=" + ogrenciListesi;
    }
}
