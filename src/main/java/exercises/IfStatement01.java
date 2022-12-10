package exercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün kodu giriniz : \nPzt:1\tSali:2\tCarsamba:3\tPersembe:4\tCuma:5\tCumartesi:6\tPazar:7");

        int gun = input.nextInt();

        gunBul(gun);
    }

    public static void  gunBul(int gun) {

        gun = Math.abs(gun);

        if (gun > 0 && gun < 6) {
            System.out.println("Girmis oldugunuz gün hafta icine aittir");
        } else if (gun > 5 && gun < 8) {
            System.out.println("Girmis oldugunuz gün hafta sonuna aittir");
        } else {
            System.out.println("Dogru bir gün sayisi giriniz");
        }

    }
}
