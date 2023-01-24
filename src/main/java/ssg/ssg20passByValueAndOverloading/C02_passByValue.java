package ssg.ssg20passByValueAndOverloading;

import java.util.Arrays;
import java.util.Random;

public class C02_passByValue {

    public static void main(String[] args) {
      /*
          4 elemanli bir array olusturalim, bu array'in 2. ve 4. elemanlarini 100'den kucuk rastgele bir sayi ile degistirelim
          sonra ayri bir method'da ve yeni halini yazdiralim
       */

        int arr[] = {3, 5, 7, 9};
        arrayDegistir01(arr);
        System.out.println("arraydegistir methodundan sonra : " + Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));

        elemanDegistir(arr);
        System.out.println("main method icinde : " + Arrays.toString(arr));
    }

    public static void arrayDegistir01(int[] arr) {
        /*
            verilen 4 elemanli bir array'i method'a gonderelim method'da yeni 3 elemanli bir array atayip bu yeni array'e rastgele
            100'den kucuk 3 sayi atayalim method da arrray'i yazdiralim. main method'da da method call'dan sonra yeniden method'u yazdiralim
        */

        arr = new int[3];
        Random rnd = new Random();
        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("method icinde" + Arrays.toString(arr));
    }

    public static void elemanDegistir(int[] arr) {
        Random rnd = new Random();
        arr[1] = rnd.nextInt(100);
        arr[3] = rnd.nextInt(100);

        System.out.println("method icinde : " + Arrays.toString(arr));
    }
}
