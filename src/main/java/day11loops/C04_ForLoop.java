package day11loops;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        // Example :  1'den 100'e kadar 6 ile bölünenler haric tüm tamsayilari ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen baslangic ve bitis degerlerini giriniz...");
        int start = input.nextInt();
        int end = input.nextInt();

        altiyaBolunmeyen(start,end);
    }

    public static void altiyaBolunmeyen(int a, int b) {
        for (int i = a; i < b + 1; i++) {
            if (i % 6 == 0) {
                continue; //devam et
            }
            System.out.println(i + " ");
        }
    }

}
