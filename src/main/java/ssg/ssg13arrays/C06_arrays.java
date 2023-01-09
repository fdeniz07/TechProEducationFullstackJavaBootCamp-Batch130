package ssg.ssg13arrays;

public class C06_arrays {
    public static void main(String[] args) {
        /*
        6.Soru -Verilen String bir array'de en uzun ve en kisa String'leri yazdıran bir method
        */
        String arr[] = {"bolu", "koceli", "istanbul", "yozgat"};

        enUzunVeEnKisa(arr);
    }

    public static void enUzunVeEnKisa(String[] arr) {
        String min = arr[0];
        String max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > max.length()) {
                max = arr[i];
            }
            if (arr[i].length() < min.length()) {
                min = arr[i];
            }
        }
        System.out.println("Array'deki en kısa kelime : " + min);
        System.out.println("Array'deki en uzun kelime : " + max);
    }
}
