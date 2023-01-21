package practice.advanced_practice.practice10.okul;

public class Ogrenci {

    private String ad;
    private String soyAd;
    private int yas;

    public Ogrenci(String ad, String soyAd, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
    }

    public Ogrenci() {

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas;
    }
}
