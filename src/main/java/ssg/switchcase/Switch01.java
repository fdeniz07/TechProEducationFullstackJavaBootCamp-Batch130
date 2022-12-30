package ssg.switchcase;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {
        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi guc olabilir
        // bunun yerine switch - case yapisini kullanabiliriz

        if (ayNo == 1) {
            System.out.println("Ocak");
        } else if (ayNo==2){
            System.out.println("Subat");
        }else if (ayNo==3){
            System.out.println("Mart");
        }else if (ayNo==4){
            System.out.println("Nisan");
        }else if (ayNo==5){
            System.out.println("Mayis");
        }else if (ayNo==6){
            System.out.println("Haziran");
        }else if (ayNo==7){
            System.out.println("Temmuz");
        }else if (ayNo==8){
            System.out.println("Agustos");
        }else if (ayNo==9){
            System.out.println("Eylul");
        }else if (ayNo==10){
            System.out.println("Ekim");
        }else if (ayNo==11){
            System.out.println("Kasim");
        }else if (ayNo==12){
            System.out.println("Aralik");
        }else {
            System.out.println("Lutfen gecerli bir ay numarasi giriniz");
        }

        switch (ayNo){

            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");
        }
        // switch icine yazilan variable'in degerine gore
        // ilgili case'i bulur ve break gorene kadar kodu calistirir
        // eger break yoksa ilgili case'den asagi dogru tum case'ler calisir
        // if else'deki son else gibi, geriye kalan durumlari tamamen
        // kapsayacak bir satir daha ekleyebiliriz

         /*

        Note: In Switch method  parenthesis you can use Just the following data types
        a)int  b)byte   c)short  d)String
        Note: In Switch method  parenthesis you can not use Just the following data types
        a)long  b)double   c)float  d)boolean
         */
    }
}
