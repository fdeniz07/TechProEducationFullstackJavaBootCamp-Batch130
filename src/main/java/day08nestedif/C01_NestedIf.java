package day08nestedif;

import java.util.Scanner;

public class C01_NestedIf {


            /*
            Kullanicidan 3 tane pozitif tam sayi aliniz.
            Bu üc sayinin ücgen olusturma durumunu kontrol ediniz.
            Eger ücgen ise; "eskenar ücgen" olma durumunu kontrol ediniz.


            INFO :

            Ücgen olma sarti : Herhangi iki kenar toplami ücüncü kenardan büyük olmaki
                               Herhangi iki kenar farki ücüncü kenardan farkli olmali

                               a + b > c > a - b
                               a + c > b > a - c
                               b + c > a > b - c

                               a = b = c ise eskenar ücgen
         */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ücgenin üc kenar uzunlugunu giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) { //Ücgen olma durumu

            if (a == b && b == c) { //Eskenar ücgen olma sarti
                System.out.println("Bu bir eskenar ücgendir");
            } else {
                System.out.println("Bu bir ücgendir ama eskenar ücgen degildir.");
            }
        } else {
            System.out.println("Bu bir ücgen degildir.");
        }

        /*
            NOTE: Java nested kodlari calistirirken cok zaman harcar.
                  Buna "Time Complexity" deniyor
Bu yuzden mumkunse nested kod yazilmamali
         */


        /* EXAMPLE 2 : Kullanicidan bir ücgenin kenar uzunluklarini aliniz

                        Üc kenari birbirine esit ise "Eskenar Ücgen" yazdiriniz

                        Iki kenari birbirine esit ise "Ikizkenar Ücgen" yazdiriniz

                        Tüm kenarlari birbirinden farkli ise "Cesitkenar Ücgen" yazdiriniz

         */


        System.out.println("Lütfen ücgenin üc kenar uzunlugunu giriniz");

        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        if (kenar1 + kenar2 > kenar3 && kenar1 - kenar2 < kenar3 && kenar1 + kenar3 > kenar2 && kenar1 - kenar3 < kenar2 && kenar2 + kenar3 > kenar1 && kenar2 - kenar3 < kenar1) {
            if (kenar1 == kenar2 && kenar2 == kenar2) {
                System.out.println("Bu bir eskenar ücgendir");
            }
           else if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
                System.out.println("Bu bir ikizkenar ücgendir");
            }
           else {
                System.out.println("Bu bir cesitkenar ücgendir");
            }
        }
        else {
            System.out.println("Bu bir ücgen degildir.");
        }

    }
}
