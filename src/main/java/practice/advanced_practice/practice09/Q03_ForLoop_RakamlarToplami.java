package practice.advanced_practice.practice09;

import java.util.Scanner;

public class Q03_ForLoop_RakamlarToplami {

    /*
         Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
         Örn:
         input : J4\/4 1$ 34$¥
         output : 16
         İpucu:
         Character.isDigit()
         Integer.valueOf()
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir deger giriniz");
        String deger = input.nextLine();

        System.out.println(rakamlarToplami(deger));
    }

    static double rakamlarToplami(String str) {
        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                toplam += Integer.parseInt("" + str.charAt(i)); //Char i önce stringe daha sonrada Integer e ceviriyoruz
            }
        }
        System.out.println("toplam = " + toplam);

        return toplam;
    }

}
