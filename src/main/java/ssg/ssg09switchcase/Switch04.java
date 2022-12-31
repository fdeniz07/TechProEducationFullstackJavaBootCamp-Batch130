package ssg.ssg09switchcase;

import java.util.Scanner;

public class Switch04 {

    public static void main(String[] args) {

        // Ayakkabi Boyutu kontrol etmek için Java Programı
        // switch...case ifadesini kullanarak
        //Boyyutu icin size ler: small -Medium- Large- Extra -Large-unKnown-
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ayyakabi numarsi giriniz");
        int ayakkabiNumarsi = input.nextInt();
        //String size = null;
        // switch statement to check size
        String size = null;
        switch (ayakkabiNumarsi) {

            case 36:
            case 38:
            case 40:
                size = "Small";
                break;
            case 42:
            case 43:
                size = "Medium";
                break;

            // match the value of week
            case 44:
            case 45:
                size = "Large";
                break;
            case 46:
            case 48:
            case 50:
                size = "Extra Large";
                break;
            case 52:
                size = "Unknown";
                break;
            default:
                System.out.println("lutfen gecerli bir ayakkabi numarasi Giriniz");

        }
        System.out.println("Size: " + size);
    }
}
