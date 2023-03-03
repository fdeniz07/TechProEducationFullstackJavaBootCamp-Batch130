package ssg.ssg30exceptions;

import java.util.Scanner;

public class C02_exception {
    public static void main(String[] args) throws AgeException {
        System.out.println("Yas kontrol uygulamasina hosgeldiniz");
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int age = scan.nextInt();
        chechAge(age);
        System.out.println("uygulama sonu erdi tekrar bekleriz");

    }

    public static void chechAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Yasiniz 18'den kucuk oldugu icin Hata aldiniz");
        }
    }
}
