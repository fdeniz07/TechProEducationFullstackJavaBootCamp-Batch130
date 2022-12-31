package ssg.ssg04scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1.adim: Scanner Class'dan object olustur
        Scanner input = new Scanner(System.in);

        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");

        //3.adim: Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz
        byte age = input.nextByte();
        System.out.println(age);


    }
}
