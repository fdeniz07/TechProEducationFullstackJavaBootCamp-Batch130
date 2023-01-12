package day24accessmodifiersinheritance;

public class Car extends Vehicle {
    /*
         1)Java da Object olustururken Constructor'lar Parent'dan Child'a dogru calistirilir.
         2)Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
         3)"super()" kodu her constructor'in "ilk satirinda" "gizli" olarak bulunur.
         4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, Java kizmaz.
         5)"super()" kodunu gorunur sekilde yazarsaniz sakin haaa ilk satir disinda bir satira koymayiniz, hata verir.
         6)"super()" kodu Parent Class'dan constructor cagirmaya yarar.
      */
    public String renk;
    int km;

    public Car() {
    }

    public Car(String renk, int km) {
        super("Car");
        this.renk = renk;
        this.km = km;
        System.out.println("Car constructor");
    }
}