package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
        Numeric primitive data type'larin birbirine dönüstürülmesine "Type Casting" denir.
        Numeric Data Type'lar byte - short - int - long - float - double

        Note 1 : Kücük data type'larini büyük data type'lara cevirmeyi Java otomatik olarak yapabilir.
                 Bu isleme "Autowidening"(otomatik genisletme) denir.

        Note 2 : Büyük data type'larini kücük data type'larina cevirmek riskli bir istir, Java bu riskli isi otomatik olarak yapmaz. Bu islemi kod yazan'lar yapar.
                 Bu isleme "Explicit Narrowing" (aciktan daraltma) denir.

     */
    public static void main(String[] args) {

        //byte data type'ini int data type'ina ceviriniz.

        byte age = 13;
        int ageInt = age;

        //long data type'ini short data type'ina ceviriniz.

        long weight = 234;
        short weigthInt = (short) weight;

        //int data type'ini float data type'ina ceviriniz

        int population = 1212;
        float populationFloat = population;

        //double data type'ini short data type'ina ceviriniz

        double average = 1500.10;
        short averageShort = (short) average;
        System.out.print(averageShort);

        //Dikkat!
        //Dönüsüm yaptiginiz sayi(260), dönüstüreceginiz data type'in sinirlari disinda ise, JAva kullandiginiz sayi ile "mod" ielemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur.

        //Example 1:
        short num = 260;
        System.out.println(num); //260

        byte numByte = (byte)num;
        System.out.println(numByte); //4

        //Example 2:
        short n =1023;
        System.out.println(n); //1023

        byte nByte=(byte)n;
        System.out.println(nByte); //-1
    }
}
