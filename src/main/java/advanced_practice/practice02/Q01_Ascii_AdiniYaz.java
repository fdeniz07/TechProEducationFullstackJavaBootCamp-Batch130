package advanced_practice.practice02;

public class Q01_Ascii_AdiniYaz {

    public static void main(String[] args) {

        //Adınızın içerdiği harfleri ve ascii table kullanmadan, adınızı yazdıran bir kod yazınız.

        char ch1='B'-1; //A
        char ch2='m'-1; //l
        char ch3='h'+1; //i

        //Not: Char'lari matematik islemine tabii tutarsak ascii degerlerinden matematik islemi yapmis olur
        System.out.println(ch1+ch2+ch3); //278
        System.out.println('Z'+1); //91

        System.out.println("/////////////////");

        //Not: Char'lari eger string (concatation) islemine tabii tutarsak sonuc asagidaki gibi olur
        System.out.println(""+ch1+ch2+ch3); //Ali

        System.out.println("/////////////////");

        //Not: Char bir degiskene deger atarsak bize ascii karsiligini verir
        char ch4 = 65;
        System.out.println(ch4);
    }
}
