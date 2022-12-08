package day07ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

    /* Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya göre yazdiran kodu olusturunuz
        0-4 : Bebek
        5-12 : Cocuk
        13-20 : Genc
        21-30 : Yetiskin
        Tanimlanmamis Evre
        Hata mesaji olarak "Gecerli bir yas giriniz" yazdiriniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");

        int age = input.nextInt();

        age = Math.abs(age);

        if (age <= 4) {
            System.out.println("Bebek");
        } else if (age > 4 && age < 13) {
            System.out.println("Cocuk");
        } else if (age > 12 && age < 21) {
            System.out.println("Genc");
        } else if (age > 20 && age < 31) {
            System.out.println("Yetiskin");
        } else if (age > 30) {
            System.out.println("Tanimlanmamis Evre");
        } else System.out.println("Gecerli bir yas giriniz");

        //Note: Ne kadar az if blogu ve ne kadar az mantiksal operatör o kadar hizli calismayi saglar. O nedenle negatif degerler mutlak deger ile egale edildi. Esitlik durumlari <> ile üst deger verilerek atlandi
    }
}
