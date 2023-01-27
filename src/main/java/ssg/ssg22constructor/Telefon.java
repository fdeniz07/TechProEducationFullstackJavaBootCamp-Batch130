package ssg.ssg22constructor;

public class Telefon {
    String marka="yok";
    String model="yok";
    String fiyat="belirlenmedi";

    Telefon(String marka,String model,String fiyat){
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;

    }

    public Telefon(String marka, String model) {
        this.marka=marka;
        this.model=model;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }

    public Telefon(String marka) {
        this.marka=marka;
    }

    /*
    telefon adli bir constructer olusturun ve
    olusturdugunuz constructer'a marka model ve fiyat parametreleri ekleyin
    ve main classi olusturup o class icinden cagirip birkac tane telefon ekleyin
    */
}
