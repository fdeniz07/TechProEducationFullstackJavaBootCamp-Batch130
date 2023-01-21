package practice.advanced_practice.practice10;

public class Q01_Recursive_100den1e {

    //100'den 1'e kadar sayilari loop ve sayi kullanmadan yazdiran bir method olusturun

    public static void main(String[] args) {

        sayilariYazdir('d');

    }

    public static void sayilariYazdir(char ch) {
        if (ch >= 'a' / 'a') {
            System.out.print((int) ch + " ");
            ch--;
            sayilariYazdir(ch);
        }
    }
}
