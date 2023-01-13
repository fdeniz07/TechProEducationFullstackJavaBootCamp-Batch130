package exercises;

import java.util.Scanner;

public class AsalSayi {

    //Prime Numbers - Asal Sayilar

    public static void main(String[] args) {
        // Prime Numbers - Asal Sayilar
        Scanner input = new Scanner(System.in);
        System.out.print("Asal olup olmadigini kontrol etmeniz gereken sayiyi giriniz : ");

        int number = input.nextInt();
        //int remainder = number % 2;
        // System.out.println(remainder);

        boolean isPrime = true;

        //Bug
        if (number == 1) {
            System.out.println("The Number isn't prime");
            return;
        }

        if (number < 2) {
            System.out.println("Invalid number");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("The Number is prime");
        } else {
            System.out.println("The Number isn't prime");
        }
    }
}
