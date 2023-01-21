package practice.advanced_practice.practice10;

import java.util.Scanner;

public class Q03_Exception_NotOrtalama {
    /*
           Vize ve final notlarını alarak ortlama hesaplayan bir kod yazınız.
           int v = vize
           int f = final

           Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
           Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
           Diğer durumlarda ise, vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.
           Ortalama 70'in üzerinde is "Başarılı" altında ise "Başarısız" yazdırsın.
       */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vizeNotu;
        int finalNotu;


        while (true) {
            try {
                System.out.println("Vize notunu giriniz");
                vizeNotu = scanner.nextInt();
                if (vizeNotu < 0 || vizeNotu > 100) {
                    throw new ArithmeticException();
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Not 0 ile 100 arasında olmalıdır");
            } catch (Exception e) {
                System.out.println("Geçersiz bir giriş yaptınız");
                scanner.next();//dummy scanner
            }
        }

        while (true) {
            try {
                System.out.println("Final notunu giriniz");
                finalNotu = scanner.nextInt();
                if (finalNotu < 0 || finalNotu > 100) {
                    throw new ArithmeticException();
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Not 0 ile 100 arasında olmalıdır");
            } catch (Exception e) {
                System.out.println("Geçersiz bir giriş yaptınız");
                scanner.next();//dummy scanner
            }
        }


        double ortalama = vizeNotu * 40 / 100 + finalNotu * 60 / 100;

        if (ortalama >= 70) {
            System.out.println(ortalama + ": Başarılı");
        } else {
            System.out.println(ortalama + ": Başarısız");
        }


    }

}
