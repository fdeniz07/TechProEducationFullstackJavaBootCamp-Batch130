package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {

    public static void main(String[] args) {

        //Bir ögretmenin okulundaki ögrencilerin isimlerini application'a yükleyebilecegi kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ögrenci ismi gireceksiniz : ");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];

        System.out.println("Sonlandirmak istiyorsaniz lütfen Q harfine basiniz");

        for (int i = 1; i <= numOfStd; i++) {
            System.out.println("Lütfen " + i + ". ögrencinin ismini giriniz");
            String stdNames = input.next();

            if (stdNames.equalsIgnoreCase("Q")){
                break;
            }

            names[i-1] = stdNames;
        }
        System.out.println(Arrays.toString(names));
    }
}
