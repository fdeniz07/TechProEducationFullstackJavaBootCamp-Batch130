package practice.advanced_practice.practice08;

import java.util.Scanner;

public class Q01_NestedLoop_AtbashCode {

    /*
   Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.

   Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
   Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
   Örn: A-->Z, B-->Y ...

   "abcdefghijklmnopqrstuvwxyz";
   "zyxwvutsrqponmlkjihgfedcba";

  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Yol
        System.out.println("Bir kelime giriniz");
        String kelime = input.nextLine();
        String alfabe = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < kelime.length(); i++) {//kelime indeksi
            for (int j = 0; j < alfabe.length(); j++) {//alfabe indeksi

                if (kelime.charAt(i) == alfabe.charAt(j)) {
                    System.out.print(alfabe.charAt(alfabe.length() - 1 - j));
                }
            }
        }

        //2. Yol:
        System.out.println("\n===2. Yol===");

        for (int i = 0; i < kelime.length(); i++) {

            int idx = 'z' - kelime.charAt(i);
            System.out.print((char) ('a' + idx));

        }
    }
}
