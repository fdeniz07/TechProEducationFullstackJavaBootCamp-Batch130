package day08nestedif;

import java.util.Scanner;
public class C04_Ternary {

    //Kullanicidan iki sayi aliniz buyuk olmayan sayiyi yazdiriniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        //1.Yol
        if (sayi1 < sayi2) {
            System.out.println("Buyuk Olmayan Sayi : " + sayi1);
        } else if (sayi1 > sayi2) {
            System.out.println("Buyuk Olmayan Sayi : " + sayi2);
        } else {
            System.out.println("Sayilar Birbirine Esit");
        }

        //2.Yol
        //Condition    ?  True            :  False
        //Sart
        System.out.println(sayi1 == sayi2 ? "Sayilar Esit " : sayi1 > sayi2 ? sayi2 : sayi1);
    }
}