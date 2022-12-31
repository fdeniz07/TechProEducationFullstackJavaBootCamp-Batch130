package ssg.ssg09switchcase;

import java.util.Scanner;

public class Switch06 {

    // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
    // switch olusturun
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        String ayIsmi=scan.next();
        switch (ayIsmi){

            case "Mart":
            case "Nisan":
            case "Mayis":
                System.out.println("Ilkbahar");
                break;
            case "Haziran":
            case "Temmuz":
            case "Agustos":
                System.out.println("Yaz");
                break;
            case "Eylul":
            case "Ekim":
            case "Kasim":
                System.out.println("Sonbahar");
                break;
            case "Aralik":
            case "Ocak":
            case "Subat":
                System.out.println("Kis");
                break;

            default:
                System.out.println("Lutfen gecerli bir ay Ismi giriniz");
        }
    }

}
