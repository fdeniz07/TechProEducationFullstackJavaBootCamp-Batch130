package ssg.ssg28exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = 0;
        int sayi2 = 15;
        try {
            System.out.println("Hosgeldiniz");
            sayi = scan.nextInt();
            System.out.println("try blogu calisti ve kod duzgun bir sekilde calisiyor");
            System.out.println(sayi2 / sayi);
        } catch (InputMismatchException e) {
            System.out.println("try blogu calisti ve kod hatali!!!");
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("bolme islemi ile ilgili bir hata var");
        }
        //if (sayi!=0) {
        //    System.out.println(sayi2 / sayi);
        //}
        System.out.println("lutfen 0dan farkli bir sayi giriniz cunku payda 0 olamaz");
        // System.out.println(sayi);
    }
}
