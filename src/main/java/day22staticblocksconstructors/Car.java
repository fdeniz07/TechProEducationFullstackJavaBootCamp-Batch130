package day22staticblocksconstructors;

    /*
        Constructor nedir?
        Class'Dan object üretmemize yarayan code block'laridir.

        Class olusturdugumuzda JAva bize otomatik olarak bir condtructor verir. Ama bu construtor gözle  görülmez, gözle görülmeyen otomatik olak Java tarafindan
        verilen bu constructor'lara "defaut constructor" denir

        "default constructor'lar "Car(){}" seklindedir.

        Siz kendi constructor'inizi olusturdugunuzda Java default constructor'i siler.

        Bir Class'da farkli parametreler kullanarak istediginiz kadar Constructor olusturabilirsiniz.

        Farkli constractor'lar sayesinde bir class'dan farkli farkli object'ler olusturabiliriz.

        Interview Sorusu: Method ile Constructor'un farki var midir? Varsa nedir?
        Cevap : Method ile Constructor farkli yapilardir.
                i) Methodlarda return type vardir ama constructor'larda return type yoktur
                ii) Method'larin isimleri yaptiklari ise göre developerlar tarafindan belirlenir.
                    Constructor'larin isimleri ise her zaman Class ismi ile ayni olmalidir.

     */


public class Car {
    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;

        if (year == 2023) {
            this.year = 0;

        }
        if (hybrid == true) {
            this.hybrid = false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}


