package ssg.ssg27inheritance;

public class C03_Memur extends C02_muhasebe {

    public static void main(String[] args) {

        C03_Memur memur1=new C03_Memur();
        memur1.isim="Mehmet";
        memur1.soyIsim="Aslan";
        memur1.adres="Istanbul";
        memur1.telefon=123456789;
        memur1.calismaSaati=8;
        memur1.calistigiGun=22;
        memur1.mesaiSaati=3;
        memur1.idAtama();
        System.out.println(memur1.maasHesapla());
        System.out.println(memur1.mesaiHesapla());
        System.out.println(memur1.mesaiHesapla()+ memur1.maasHesapla());
        System.out.println(memur1.id);

        C03_Memur memur2=new C03_Memur();
        memur2.isim="Mehmet";
        memur2.soyIsim="Aslan";
        memur2.adres="Istanbul";
        memur2.telefon=123456789;
        memur2.calismaSaati=8;
        memur2.calistigiGun=22;
        memur2.mesaiSaati=3;
        memur2.idAtama();
        System.out.println(memur2.maasHesapla());
        System.out.println(memur2.mesaiHesapla());
        System.out.println(memur2.mesaiHesapla()+ memur1.maasHesapla());
        System.out.println(memur2.id);
        memur2.insanDondur();

    } protected int maasHesapla(){
        saatUcreti=12;
        maas=saatUcreti*calismaSaati*calistigiGun;
        return maas;
    }protected int mesaiHesapla(){
        saatUcreti=12;
        maas=saatUcreti*2*mesaiSaati;
        return maas;
    }
}
