package ssg.ssg04scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz

        // İpucu: dikdörtgenin hacmi= width*height*length;

        Scanner scan = new Scanner(System.in);
        System.out.println("Uzunluğu giriniz :");
        double length = scan.nextDouble();
        System.out.println("Genişliği giriniz:");
        double width = scan.nextDouble();
        System.out.println("Yüksekliği giriniz:");
        double height = scan.nextDouble();
        System.out.println("Dikdörtgenin hacmi:" + length * width * height);


        System.out.println("Dikdörtgenin hacmi:" + dikdotrgenHacmi(width, height, length));

    }

    public static double dikdotrgenHacmi(double length, double width, double height) {
        return length * height * width;
    }
}
