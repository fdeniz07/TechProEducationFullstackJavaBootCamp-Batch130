package ssg.ssg04scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı girmesini iste ve ardından
        // tamsayı çift ise "Çift" yazsin
        // tamsayı tek ise "Tek" yazsin
        Scanner scan = new Scanner(System.in);
        System.out.println("ÇİFT veya TEK'i kontrol etmek için bir tamsayı girin:");

        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("CIFT");
        }
        if (num % 2 != 0) {
            System.out.println("TEK");
        }
    }
}
