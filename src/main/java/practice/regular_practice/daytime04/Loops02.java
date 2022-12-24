package practice.regular_practice.daytime04;

import java.util.Scanner;
public class Loops02 {

    public static void main(String[] args) {

        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun

    /*

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    |||
    |||
    |||
    |||
    |||


     */


            Scanner input = new Scanner(System.in);

            System.out.println("Lutfen Agacin tac uzunlugunu giriniz ");
            int tac =input.nextInt();


            String yaprak= "";
            for (int i = 0; i <tac ; i++) {//satir kontrol
                yaprak+="^";
                System.out.println(yaprak);

            }
            for (int i = 0; i <5 ; i++) {
                System.out.println("|||");
            }

        }
}
