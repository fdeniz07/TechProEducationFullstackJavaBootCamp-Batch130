package ssg.ssg25accessModifiers;

public class C01_kullanici {
    public String kullaniciAdi="AFK";//Herkes gorebilir

    String ePosta="ahmetfurkan@gmail.com";//oyunun kurucusu ve yonetim uyeleri ve ben
    protected static String kullaniciId="678543";
    private static String sifre="1234567asdfg";

    protected int sayi=1234567;

    public static void main(String[] args) {
        System.out.println(sifre);

    }

}
