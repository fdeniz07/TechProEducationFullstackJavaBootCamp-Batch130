package ssg.switchcase;

import java.util.Scanner;

public class Switch07 {

    public static void main(String[] args) {
        // kullanicidan ayiIsmini     alip
        // istenen ay kacinic  ay oldugnuz  yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        String ayIsmi=scan.next();

        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi guc olabilir
        // bunun yerine switch - case yapisini kullanabiliriz


        if (ayIsmi.equals("Ocak")) {
            System.out.println(1);
        } else if (ayIsmi.equals("Subat")) {
            System.out.println(2);
        }else if (ayIsmi.equals("Mart")) {
            System.out.println(3);
        }else if (ayIsmi.equals("Nisan")) {
            System.out.println(4);
        }else if (ayIsmi.equals("Mayis")) {
            System.out.println(5);
        }else if (ayIsmi.equals("Haziran")) {
            System.out.println(6);
        }else if (ayIsmi.equals("Temmuz")) {
            System.out.println(7);
        }else if (ayIsmi.equals("Augstos")) {
            System.out.println(8);
        }else if (ayIsmi.equals("Eylul")) {
            System.out.println(9);
        }else if (ayIsmi.equals("Ekim")) {
            System.out.println(10);
        }else if (ayIsmi.equals("Kasim")) {
            System.out.println(11);
        }else if (ayIsmi.equals("Aralik")) {
            System.out.println(12);
        }else {
            System.out.println("Lutfen gecerli bir ay isminize giriniz");
        }

        switch (ayIsmi){

            case "Ocak":
                System.out.println(1);
                break;
            case "Subat":
                System.out.println(2);
                break;
            case "Mart":
                System.out.println(3);
                break;
            case "Nisan":
                System.out.println(4);
                break;
            case "Mayis":
                System.out.println(5);
                break;
            case "Haziran":
                System.out.println(6);
                break;
            case "Temmuz":
                System.out.println(7);
                break;
            case "Agustos":
                System.out.println(8);
                break;
            case "Eylul":
                System.out.println(9);
                break;
            case "Ekim":
                System.out.println(10);
                break;
            case "Kasim":
                System.out.println(11);
                break;
            case "Aralik":
                System.out.println(12);
                break;
            default:
                System.out.println("Lutfen gecerli bir ay isminize giriniz");
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
