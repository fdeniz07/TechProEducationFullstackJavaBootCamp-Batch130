package day29exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {

    /*
        8) InputMismatchExceptions
     */

    public static void main(String[] args) {
        //Verilen bir arr'den kullanicidan index isteyin verilen indexdeki datayi yazdirin
        int arr[] = {2, 3, 5, 9, 7, 45};
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen index icin sayi giriniz");
        //
        int index = 0;
        try {
            index = input.nextInt();
            System.out.println("girilen indexdeki eleman : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz indexde eleman arrayde yok " + e.getMessage());
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Girdiginiz index sayi olmali  InputMismatchException  ===>  " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Durmak yok yola devam");
    }
}
