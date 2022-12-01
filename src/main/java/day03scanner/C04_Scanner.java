package day03scanner;

import java.util.Scanner;

public class C04_Scanner {


    public static void main(String[] args) {

        //Ex: Kullanicidan alinan 5 basamakli bir sayinin, ilk iki ve son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bes basamakli bir sayi giriniz");
        int num = input.nextInt(); //12345

        int firstTwoNum = num / 1000;
        System.out.println("Ilk iki rakam : " + firstTwoNum);

        int firstTwoSum = (firstTwoNum % 10) + (firstTwoNum / 10);
        System.out.println("Ilk iki rakam toplami : " + firstTwoSum);


        int lastTwoNum = num % 100;
        System.out.println("Son iki rakam : " + lastTwoNum);

        int lastTwoSum = (lastTwoNum % 10) + (lastTwoNum / 10);
        System.out.println("Son iki rakam toplami : " + lastTwoSum);

        System.out.println("Rakamlarin Toplami :" + (firstTwoSum+lastTwoSum));

    }

}
