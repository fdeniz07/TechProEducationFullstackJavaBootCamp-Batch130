package day03scanner;

public class Car {

    //Class ==> Variable (Pasif özellikler)
    //Method (Aktif özellikler)


    public String model = "Corolla"; //Pasif özellikler
    public int fiyat = 200000;

    public static void main(String[] args) {
        //Class_adi   Obje_Adi  = new keywordu  Class_Adi(); --> Constructor
        Car myCorolla = new Car();
        System.out.println("Fiyati: " + myCorolla.fiyat +"TL");
        System.out.println("Modeli: " + myCorolla.model);

        myCorolla.hareket();
        myCorolla.dur();

    }//Main body'si

    //Note: "return type" void oldugunda method icinde "return" kelimesi kullanilmaz.
    public void hareket() { //Aktif özellikler
        System.out.println("Toyota hizli hareket eder...");
    }

    public void dur() {
        System.out.println("Toyota güvenli durur...");
    }
} //Class body'si
