package ssg.ssg20passByValueAndOverloading;

public class C06_overloading {
    public static void main(String[] args) {

        /*
            3 tane toplam isimli method olusturalim 1. methdodda 2 tane int deger toplayalim
            2. methodda 1 tane double 1 tane int deger toplayalim
            3. methodda 2 tane double deger toplayalim
         */

        toplam(5,6);
        toplam(5.6,7);
        toplam(5.7,9.8);

        /*
            overLoading ayni classta birkac tane ayni isimli method varsa o methodlarin data typelarina
            bakarak en uygun olani secer biz buna autoWiding deriz yani bilgisayari rahatlatmak adina
            en uygun olani secmesi deriz
         */

    }

    public static void toplam(double a, double b) {
        System.out.println(a+b);

    }
    public static void toplam(int a, int b){
        System.out.println(a+b);
    }
}
