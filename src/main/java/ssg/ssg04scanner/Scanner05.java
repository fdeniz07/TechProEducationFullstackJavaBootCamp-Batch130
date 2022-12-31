package ssg.ssg04scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        // cember = 2*pi*yaricap
        // daire : p*yaricap*yaricap

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap = scan.nextDouble();

        System.out.println("girdiginiz yaricap : " + yaricap);
        System.out.println("cemberin cevresi : " + 2 * (Math.floor(Math.PI)) * yaricap);
        System.out.println("dairenin alani : " + Math.floor(Math.PI) * yaricap * yaricap);

    }
}
