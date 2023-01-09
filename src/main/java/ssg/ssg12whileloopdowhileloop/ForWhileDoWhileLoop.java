package ssg.ssg12whileloopdowhileloop;

public class ForWhileDoWhileLoop {
    public static void main(String[] args) {

        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin

        // 1 . yol
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        // 2.yol
        int k = 1;
        while (k <= 5) {
            System.out.print(k + " "); // zero execution
            k++;
        }

        System.out.println();
        // arkadas secme oyunu
        //3 .yol
        int j = 1;
        do {
            System.out.print(j + " ");// zero yok en az bir kare calisir .
            j++;

        } while (j <= 5);
    }
}
