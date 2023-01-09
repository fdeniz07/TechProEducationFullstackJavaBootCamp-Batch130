package ssg.ssg12whileloopdowhileloop;

public class ForWhileDoWhileLoop1 {
    public static void main(String[] args) {

        //Soru 1) 3 ile 8 arasindaki(3 ve  8 dahil) sayilari  ayni satirda yazdirin

        for (int i = 3; i < 9; i++) {
            System.out.print(i + " ");//3 4 5 6 7 8

        }
        System.out.println();
        int j = 3;

        while (j < 9) {
            System.out.print(j + " ");//3 4 5 6 7 8
            j++;
        }

        System.out.println();
        int k = 3;

        do {
            System.out.print(k + " ");//3 4 5 6 7 8
            k++;
        } while (k <= 8);
    }
}
