package ssg.ssg03memorykullanimiasiitable;

public class AsciiValue01 {

    public static void main(String[] args) {


        char ch = 'A';
        //  System.out.println(ch);

        // 1yol
        System.out.println(ch + 0);//65

        System.out.println('a' + 'b');//195   == 97+65==


        //2 yol
        int ch1 = 'a';
        System.out.println(ch1);//97
        int soruIserti = '?';

        System.out.println(soruIserti);//63

        //soru=1:  Buyuk A dan Buyuk Z kadar Tum ascci degerli  bir program yziniz

        for (int i = 'A'; i <= 'Z'; i++) {  // A : 65
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        // A :65
        // B:66
        System.out.println();
        for (int i = 'A'; i <= 'Z'; i++) {  // A : 65
            System.out.println("ASCII Value : " + (char) i + "  " + i + " ");
        }

        System.out.println();
        for (int i = 'a'; i <= 'z'; i++) {  // A : 65
            System.out.println("ASCII Value : " + (char) i + "  " + i + " ");
        }
    }
}
