package ssg.ssg09switchcase;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        //Toplama, Çıkarma, Çarpma, Bölme ve yüzde Hesaplama yapan basit bir Hesap Makinesi oluşturun:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day First Number");
        Double firstNumber = scan.nextDouble();

        System.out.println("Enter day Second  Number");
        double secondNumber = scan.nextDouble();

        System.out.println("Select Operations: +,-,*,/,%");

        char operation = scan.next().charAt(0);
        //Noe:to get a single character from usr we type that code:====>scan.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;

            case '%':
                System.out.println(firstNumber * secondNumber / 100);
                break;
            default:
                System.out.println("inValid operator :");

        }
    }
}
