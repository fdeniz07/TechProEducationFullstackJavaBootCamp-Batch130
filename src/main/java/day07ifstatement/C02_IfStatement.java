package day07ifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    //Kullanici gün numarasini girsin, kod gün ismini yazsin

    //1 ==> Pazar, 2==> Pazartesi

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün numarasini giriniz..\n1: Pazar\t2: Pazartesi\t3: Sali\t4: Carsamba\t5: Persembe\t6: Cuma\t7: Cumartesi ");

        byte dayNummber = input.nextByte();

        if (dayNummber == 1) {
            System.out.println("Pazar");
        } else if (dayNummber == 2) {
            System.out.println("Pazartesi");
        } else if (dayNummber == 3) {
            System.out.println("Sali");
        } else if (dayNummber == 4) {
            System.out.println("Carsamba");
        } else if (dayNummber == 5) {
            System.out.println("Persembe");
        } else if (dayNummber == 6) {
            System.out.println("Cuma");
        } else if (dayNummber == 7) {
            System.out.println("Cumartesi");
        } else
            System.out.println("Lütfen Gecerli Bir Gün Numarasi Giriniz!");


    }
}
