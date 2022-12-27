package practice.advanced_practice.practice03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q02_List_EkleCikar {

    //Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen, list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<>();


        while (true) {

            System.out.println("Ekleme tapmak için: 'add'\n" +
                    "Güncellemek için: 'set'\n" +
                    "Silmek için: 'remove'\n" +
                    "Çıkmak için: 'break' komutunu giriniz."
            );
            String komut = input.next();

            if (komut.equalsIgnoreCase("add")) {

                System.out.println("Eklemek istediğiniz tamsayıyı giriniz");
                int eklenecekSayi = input.nextInt();
                list.add(eklenecekSayi);

            } else if (komut.equalsIgnoreCase("set")) {

                System.out.println("Güncellemek istediğiniz sayıyı giriniz");
                Integer guncellenecekSayi = input.nextInt();
                int guncellenecekIndex = list.indexOf(guncellenecekSayi);
                System.out.println("Yerine eklemek istediğiniz sayıyı giriniz");
                int yeniSayi = input.nextInt();
                list.set(guncellenecekIndex, yeniSayi);

            } else if (komut.equalsIgnoreCase("remove")) {

                System.out.println("Silmek istediğiniz sayıyı giriniz");
                Integer silinecekSayi = input.nextInt();
                list.remove(silinecekSayi);

            } else if (komut.equalsIgnoreCase("break")) {

                break;
            } else {
                System.out.println("Geçerli bir komut giriniz");
            }
            System.out.println(list);
        }

        System.out.println("Güle Güle");

    }
}
