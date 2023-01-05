package day20passbyvaluemethodoverloading;

public class C06_PassByValue {

    public static void main(String[] args) {


        // 100 tl ye satılan bir ürün için 2 farklı indirim uygulayan iki method oluşturalım.

        int fiyat=100;

        indirimYap25(fiyat);
        System.out.println("main icinde methoddan sonra fiyat = " + fiyat);//100

        fiyat=indirimYap10(fiyat);
        System.out.println("Main icinde methoddan sonra "+fiyat);//90

    }

    private static int indirimYap10(int fiyat) {

        fiyat*=0.90;
        return fiyat;
    }

    private static void indirimYap25(int fiyat) {
        fiyat*=0.75;
        System.out.println("%25 indirimli fiyat "+fiyat);//75

    }
}
