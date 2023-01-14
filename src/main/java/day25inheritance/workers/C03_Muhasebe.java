package day25inheritance.workers;

public class C03_Muhasebe extends C04_Personel { //baba parent = Super Class

    protected int saatUcreti;
    protected String statu;
    protected int calismaSaati = 8;

    protected int maasHesapla() {
        int maas = saatUcreti * calismaSaati * 30;

        return maas;
    }
}
