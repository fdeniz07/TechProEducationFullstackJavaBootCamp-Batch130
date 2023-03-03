package ssg.ssg30exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = 0;
        int sayi1 = 20;
        try {
            System.out.println("Try bloguna hosgeldiniz");
            sayi = scan.nextInt();
            System.out.println("Try blogu sonlandi degerimiz basarili bir sekilde variable'a atandi : " + sayi);
            System.out.println(sayi1 / sayi);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Deger atamasinda sorun var");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("bolme isleminde sorun var");

        }
        //System.out.println(sayi1/sayi);
        System.out.println(sayi1 + sayi);
    }
}
