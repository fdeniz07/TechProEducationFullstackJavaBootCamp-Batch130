package day02datatypesmethodcreation;

public class Variables01 {

    public static void main(String[] args) {

        //primitive data types --> char - boolean - byte - short - int - long - float - double

        //Note: primitive data type'larini Java olusturmustur, biz olusturamayiz.
        //Note: primitive data type'larinin isimlerinde sadece kücük harf kullanilir.
        //Note: primitive data'lar type'lara göre farkli farkli yerler kaplar.
        //Note: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.

        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;

        // System.out.println() yazdirmanin kisayolu: sout yaz enter
        System.out.println(shirtPrice + shoesPrice);

        //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin

        double weightCell = 0.000000000254;
        double weightAmip = 0.000000000023;

        System.out.println(weightCell-weightAmip); //2.31E-10  ==> 0.0000000000231 ==>2.31 x 10 üzeri -10 dir. E: Exponent
    }
}
