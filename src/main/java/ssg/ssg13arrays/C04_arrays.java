package ssg.ssg13arrays;

public class C04_arrays {
    public static void main(String[] args) {
        /*
        4.soru Verilen bir array'in tum elemanlarini toplayan bir program yazalim,
        */
        int sayi[] = {8, 5, 12, 11, 14};
        int sum = 0;
        for (int i = 0; i < sayi.length; i++) {
            sum += sayi[i];
        }
        System.out.println(sum);
    }
}
