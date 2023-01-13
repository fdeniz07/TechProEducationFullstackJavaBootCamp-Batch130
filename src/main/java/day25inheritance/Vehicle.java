package day25inheritance;

public class Vehicle {

    /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          parent class'dan baslatilarak alta dogru calistirilir.

     */
    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: " + price);
    }
}
