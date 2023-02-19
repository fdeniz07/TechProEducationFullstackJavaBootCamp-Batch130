package ssg.ssg27inheritance;

public class C02_muhasebe extends C01_IK{

    protected int saatUcreti;
    protected int calismaSaati;
    protected int mesaiSaati;

    protected int calistigiGun;
    protected int maas;

    protected int maasHesapla(){
        maas=saatUcreti*calismaSaati*calistigiGun;
        return maas;
    }
    protected int mesaiHesapla(){
        maas=saatUcreti*2*mesaiSaati;
        return maas;
    }
    C02_muhasebe(){

    }
}
