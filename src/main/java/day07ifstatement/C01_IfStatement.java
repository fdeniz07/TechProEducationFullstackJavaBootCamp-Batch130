package day07ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        //if it rains, I will cancel the picnic
        //Eger yagmur yagarsa, piknigi iptal edecegim


        //Ex 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        char ch = 'S';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Büyük Harf");
        }


        //Ex 2) Verilen bir sayi cift sayi ise ekrana cift sayi yazdiran kodu olusturunuz

        int num = 2;

        if (num % 2 == 0) {
            System.out.println(num + "Cift Sayidir");
        }

        //Ex 3) Verilen bir sayi 300 den küyük veya 1200 den büyük ise ekrana Harika sayi yazdiran kodu olusturunuz

        int value = 250;

        if (value < 300 || value > 1200) {
            System.out.println("Harika Sayi");
        }

        //Ex 4) Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        short value1 = scan.nextShort();

        /*
            ? : Ternary Islemi

            String message =  value1 % 2 == 0 ? "Sayi Ciftir"  : "Sayi Tektir";
            System.out.println(message);
        */

        if (value1 % 2 == 0) {
            System.out.println("Sayi Ciftir"); //Even number
        }

        if (value1 % 2 == 1) {
            System.out.println("Sayi Tektir"); //Odd number
        }

        //Ex 5) Verilen bir sayinin negatif, pozitif ya da notr oldugunu soyleyen kodu yaziniz

        int number = 105;

        if (number < 0) {
            System.out.println("Negatif Sayi");
        } else if (number == 0) {
            System.out.println("Nötr Sayi");
        } else {
            System.out.println("Pozitif Sayi");
        }

    }
}
