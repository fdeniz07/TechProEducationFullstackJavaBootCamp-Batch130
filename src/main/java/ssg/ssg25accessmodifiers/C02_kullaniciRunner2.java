package ssg.ssg25accessmodifiers;

public class C02_kullaniciRunner2 extends C01_kullanici {
    static int kullaniciId=98765;

    public static void main(String[] args) {
        C01_kullanici k1=new C01_kullanici();
        System.out.println(k1.kullaniciAdi);
    }
}
