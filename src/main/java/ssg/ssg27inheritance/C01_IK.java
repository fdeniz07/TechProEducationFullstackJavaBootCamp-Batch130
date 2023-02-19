package ssg.ssg27inheritance;

public class C01_IK {

    public static int sayac=1000;
    protected String isim;
    protected String soyIsim;
    protected String adres;
    protected int telefon;
    public int id;

    public int idAtama(){
        this.id=sayac;
        sayac++;
        return id;
    }
    public void insanDondur(){

        System.out.println(isim);
        System.out.println(soyIsim);
        System.out.println(adres);
        System.out.println(telefon);
        System.out.println(id);

    }
    C01_IK(){

    }
}
