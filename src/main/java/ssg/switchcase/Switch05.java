package ssg.switchcase;

import java.util.Scanner;

public class Switch05 {

    public static void main(String[] args) {
        //ingilizce de Ünlü veya Ünsüz harflerini kontrol etmek için bit program yaziniz:

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir ingilizce harfi yaziniz");
        char ch=input.next().toLowerCase().charAt(0);
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("=="  + ch + "=="  + " vowela bir harf dir : ");
                break;

                /*
                    case 'A':ß
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                System.out.println("=="  + ch + "=="  + " vowela bir harf dir : ");
                break;
                 */

            default:
                System.out.println("-"  + ch + "-"  + " Consonant bir harf dir : ");
        }
    }
}
