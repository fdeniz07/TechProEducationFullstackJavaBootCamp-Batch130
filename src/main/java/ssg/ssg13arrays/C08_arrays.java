package ssg.ssg13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_arrays {
    /*
    8.soru Kullanicidan bir array'in boyutunu ve tum elementlerini alarak bir array olusturup,
    bu array bize donduren bir method olusturun
    */
    public static void main(String[] args) {
        arrayolustur();
    }

    public static int arrayolustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen array uzunlugu giriniz");
        int uzunluk = scan.nextInt();
        int array[] = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ". indexteki deger icin sayi giriniz");
            array[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(array));
        return arrayolustur();
    }
}
