package ssg.ssg13arrays;

import java.util.Scanner;

public class C07_arrays {
    public static void main(String[] args) {
        /*
        7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip,
        bize true veya false sonucu donen bir method olusturun.
        */

        String arr[] = {"bolu", "koceli", "istanbul", "yozgat"};

        contains(arr);
    }

    public static boolean contains(String[] arr) {
        boolean sonucdeger = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen aranan sehir ismini giriniz");
        String arananSehir = scan.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(arananSehir)) {
                sonucdeger = true;
            }

        }
        if (sonucdeger) {
            System.out.println("aradiginiz sehir bulunmakta");
        } else
            System.out.println("aradiginiz sehir bulunmamaktadir");

        return sonucdeger;
    }
}
