package ssg.ssg23statics;

public class C01_staticKeyword {
    /*
         soru 1)bir static birde non-static(instance) variable olusturun ve arasindaki farklari inceleyin
   */
    static int sayi;
    int rakam;

    public static void main(String[] args) {

        C01_staticKeyword obj1 = new C01_staticKeyword();
        sayi = 15;
        System.out.println(sayi);
        obj1.rakam = 5;
        System.out.println(obj1.rakam);
        C01_staticKeyword obj2 = new C01_staticKeyword();
        obj2.rakam = 9;
        System.out.println(obj1.rakam);//5
    }
}
