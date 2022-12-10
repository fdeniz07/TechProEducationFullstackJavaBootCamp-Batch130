package practice.ifstatements;

import java.util.Scanner;

public class C01_IfStatement {

    /*
        Kullanicidan bir gün alin
        Eger gün cuma ise "Müslümanlar icin Kutsal Gün",
        Eger gün cumartesi ise "Yahudiler icin Kutsal Gün",
        Eger gün pazar ise "Hristiyanlar icin Kutsal Gün"
        yazdiran kodu olusturunuz

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen gun ismi giriniz");
        String gun = input.next().toLowerCase();//kucuk harfe cevirdik Cuma

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar Icin Kutsal Gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin Kutsal Gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristyanlar icin Kutsal Gun");
        } else
            System.out.println("Kutsal Gun Degil");
    }

}
