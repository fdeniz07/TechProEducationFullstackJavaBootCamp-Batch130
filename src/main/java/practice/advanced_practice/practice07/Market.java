package practice.advanced_practice.practice07;

import java.time.LocalDate;

public class Market {
    String urunAdi;
    Double urunFiyati;
    String sonKullanmaTarihi;

    public Market(String urunAdi, double urunFiyati, int aySonra) {
        this.urunAdi = urunAdi;

        if(urunFiyati>99){
            urunFiyati=urunFiyati*0.9;
        }
        this.urunFiyati = urunFiyati;
        this.sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }

    public Market(String urunAdi, double urunFiyati) {
        this.urunAdi = urunAdi;

        if(urunFiyati>99){
            urunFiyati=urunFiyati*0.9;
        }
        this.urunFiyati = urunFiyati;
    }

    public Market() {

    }

    @Override
    public String toString() {
        return "Market{" +
                "ürünAdı='" + urunAdi + '\'' +
                ", ürünFiyati=" + urunFiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}
