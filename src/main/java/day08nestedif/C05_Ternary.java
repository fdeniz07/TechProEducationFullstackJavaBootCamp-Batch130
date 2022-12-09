package day08nestedif;

import java.util.Scanner;
public class C05_Ternary {

    //Kullanicidan bir sayi alin ve mutlak degerini yazdirin

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int sayi=input.nextInt();

        System.out.println(sayi<=0  ?  -1*sayi : sayi );

        //Kullanicidan bir sayi aliniz Pozitifse Pozitif Negatifse Negatif yazdirin
        System.out.println("Lutfen bir sayi giriniz");
        int number= input.nextInt();

        String sonuc= number>=0 ? "Sayi Pozitif"   : "Sayi negatif";
        System.out.println(sonuc);

        ////Kullanicidan bir sayi aliniz Pozitifse Pozitif Negatifse sayinin karesini yazdirin

    }
}
