package practice.mentoring;

import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {
//soru 1
        String text = "Deneme";
        //cözüm1
//        StringBuilder str2 = new StringBuilder();
//        str2.append(text);
//        str2.reverse(); //used string builder reverse
//        System.out.println(str2);

        String newText = "";
        //cözüm 2
        for (int i = text.length() - 1; i >= 0; i--) {
            newText = newText + text.charAt(i);
        }
        System.out.println(newText);

        //cözüm 3
        char chars[] = text.toCharArray();
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

        //cözüm 4
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your String");
//        String str = in.nextLine();
//        String[] token = str.split("");
//        for (int i = token.length - 1; i >= 0; i--) {
//            System.out.print(token[i]);
//        }
        System.out.println();
        //soru 3: karakter yer degistirme
        int a = 8;
        int b = 5;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a degeri : " + a + "  b degeri : " + b);


        int x = 5, y = 7;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x degeri : " + x + "  y degeri : " + y);

        //soru 4: kelime sayilarini yazdiran program

        String word = "I and You and We yes we";



    }
}
