package day24accessmodifiersinheritance;

public class HondaAccord {

    /*
       1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir
        constructor verir, cunku Java, Class'in bir kalip oldugunu
        ve Object olusturmak icin yaratildigini ve
         Object olusturmak icin constructor'in sart oldugunu bilir.
       2)Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a
        "default constructor" denir.
       3)Siz kendiniz herhangi bir constructor olusturdugunuzda
        Java "default constructor" i siler.
       4)Bir Class'da birden fazla constructor olabilir.
        Fakat bu constructor'larin parametre'leri farkli olmalidir.
       5)"this" keyword "Bu Class" anlamindadir. "this.price" demek bu
       Class'daki "price" isimli variable demektir.
         "this.price" syntax'i constructor'larin icinde kullanilir.
       6)Conctructor kullanarak variable'lar uzerinde yaptiginiz degisimler
       sadece Object uzerindeki variable'larin degerlerini degistirir.
         Class daki variable degerlerini degistiremez...
    */
    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(int price) {
        this.price = price;
    }

    public HondaAccord(int price, int year) {
        this.price = price;
        this.year = year;
    }

    public HondaAccord(int price, int year, String make, String model) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "HondaAccord{" +
                "price=" + price +
                ", year=" + year +
                '}';
    }
}
