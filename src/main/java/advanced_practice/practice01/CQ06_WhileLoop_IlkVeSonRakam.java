package advanced_practice.practice01;

import java.util.Scanner;

public class CQ06_WhileLoop_IlkVeSonRakam {
    //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayi giriniz :");
        int sayi = input.nextInt();

        //I.YOL
        int sonRakam = sayi % 10;
        //System.out.println(sonRakam);
        int ilkRakam = sayi;


        while (ilkRakam > 9) {
            ilkRakam /= 10;
        }
        System.out.println("ilkRakam = " + ilkRakam);
        System.out.println("Toplam = " + (ilkRakam + sonRakam));

        System.out.println("*******************************");

        //2.YOL
        String sayiString = String.valueOf(sayi);
        int strIlkRakam = Integer.parseInt(sayiString.substring(0, 1));
        int strSonRakam = Integer.valueOf(sayiString.substring(sayiString.length() - 1));
        System.out.println("Toplam = " + (strSonRakam + strIlkRakam));

    }
}
