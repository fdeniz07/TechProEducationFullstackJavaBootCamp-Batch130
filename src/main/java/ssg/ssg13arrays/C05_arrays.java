package ssg.ssg13arrays;

public class C05_arrays {
    public static void main(String[] args) {
        /*
        5.soru Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun.
        */
        int sayi[] = {8, 5, 12, 11, 14};

        maxSayiYazdir(sayi);
    }

    public static void maxSayiYazdir(int[] sayi) {
        int maxSayi = sayi[0];
        for (int i = 1; i < sayi.length; i++) {
            if (sayi[i] > maxSayi) {
                maxSayi = sayi[i];
            }
        }
        System.out.println(maxSayi);
    }
}
