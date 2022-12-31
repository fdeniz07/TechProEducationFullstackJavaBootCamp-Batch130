package ssg.ssg10forloop;

public class C12_ForLoops {

     /*
        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
    */


    public static void main(String[] args) {
        int sayi = 6;

        for (int i = 1; i <= sayi; i++) {
            for (int j = sayi; j >= i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
