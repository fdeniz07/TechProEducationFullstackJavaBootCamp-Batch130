package ssg.forloops;

import java.util.Scanner;

public class C11_ForLoops {

    public static void main(String[] args) {
        /*
            soru 11)1 den girilen sayiya kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
            Beklenen çıltı:

             1
             12
             123
             1234
             12345
             123456
             1234567
             12345678
             123456789
             12345678910
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1'den buyuk bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();

        }
    }
}
