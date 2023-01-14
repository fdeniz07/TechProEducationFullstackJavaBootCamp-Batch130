package day25inheritance.workers;

public class C02_Isci extends C03_Muhasebe{

    protected String isciStatu="Sürekli Isci";

    protected String mesai(){

        System.out.println("Isciler her cagrildiklarinda haftada 5 gün calisirlar");

        String str = "Fazla mesai";
        return  str;
    }

    @Override
    public String toString() {
        return "C02_Isci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", calismaSaati=" + calismaSaati +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", Mesai='" + mesai() + '\'' +
                ", personelNo=" + personelNo +
                '}';
    }

    public static void main(String[] args) {


        C02_Isci isci1 = new C02_Isci();

        isci1.isim = "Ahmet";
        isci1.soyIsim = "Korkmaz";
        isci1.adres = "Istanbul";
        isci1.telNo = "761247124";
        isci1.personelNo = 2000;


        isci1.calismaSaati = 7;
        isci1.saatUcreti = 30;
        isci1.statu = "Data Analyst";

        System.out.println(isci1);

    }

}
