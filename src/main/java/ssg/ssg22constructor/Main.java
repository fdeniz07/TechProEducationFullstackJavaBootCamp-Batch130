package ssg.ssg22constructor;

public class Main {
    public static void main(String[] args) {
        Telefon telefon1 = new Telefon("Iphone", "14 pro", "45000");
        System.out.println(telefon1.marka + "," + telefon1.model + "," + telefon1.fiyat);
        Telefon telefon2 = new Telefon("Samsung", "S20");
        System.out.println(telefon2.marka + "," + telefon2.model + "," + telefon2.fiyat);
        Telefon telefon3 = new Telefon("Casper");
        System.out.println(telefon3.marka + "," + telefon3.model + "," + telefon3.fiyat);
        System.out.println(telefon1);
        System.out.println(telefon3);
        System.out.println(telefon2);
    }
}
