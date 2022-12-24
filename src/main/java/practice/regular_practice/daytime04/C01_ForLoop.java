package practice.regular_practice.daytime04;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Kullanıcıdan şifre girdisini alıyoruz
        System.out.print("Lütfen bir şifre girin: ");
        String pwd = input.nextLine().trim();

        // Şifrenin uyumluluk kriterlerini kontrol ediyoruz
        boolean buyukHarf = (pwd.replaceAll("[^A-Z]", "").length() > 0);
        boolean kucukHarf = (pwd.replaceAll("[^a-z]", "").length() > 0);
        boolean rakam = (pwd.replaceAll("[^0-9]", "").length() > 0);
        boolean sembol = (pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0);
        boolean karakter=pwd.length()>7;
        boolean gecerliMi = true;

        if (!karakter) {
            System.out.println("Şifre en az 8 karakter olmalıdır.");
            gecerliMi = false;
        }
        if (!buyukHarf) {
            System.out.println("Şifre en az bir büyük harf içermelidir.");
            gecerliMi = false;
        }
        if (!kucukHarf) {
            System.out.println("Şifre en az bir kucuk harf içermelidir.");
            gecerliMi = false;
        }
        if (!rakam) {
            System.out.println("Şifre en az bir rakam içermelidir.");
            gecerliMi = false;
        }
        if (pwd.contains(" ")) {
            System.out.println("Şifre bosluk içermemelidir.");
            gecerliMi = false;
        }

        if (!sembol) {
            System.out.println("Şifre en az bir sembol olmali.");
            gecerliMi = false;
        }
        if (gecerliMi) {
            System.out.println("Geçerli şifre.");
        }
    }
}
