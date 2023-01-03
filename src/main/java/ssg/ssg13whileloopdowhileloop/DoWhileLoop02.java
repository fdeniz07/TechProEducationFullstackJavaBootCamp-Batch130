package ssg.ssg13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan = new Scanner(System.in);

        int sayi=0;
        int toplam=0;

        do{
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }  while (toplam<=500);

        System.out.println("artik yeter cok sayi girdin, toplam : " +toplam+ " oldu");
    }
}
