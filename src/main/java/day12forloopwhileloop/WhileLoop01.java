package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: 3'den 10'a kadar tamsayilari console'a yazdiriniz

        //I.Yol : For-Loop
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //II.Yol : While-Loop
        int i = 3;

        while (i < 11) {

            System.out.print(i + " ");

            i++;
        }

        System.out.println();

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz
        int j = 23;
        while (j > 11) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j--;
        }

        System.out.println(" ");


        System.out.println();
        //Interview Question *****
        //Example 3: Verilen bir amsayinin rakamlari toplamini console'a yazdiriniz

        //Note: Sayi %10 herzaman sayinin son rakamini verir


        //1.Yol - while - loop
        int num = 5711;
        int sum = 0;

        num = Math.abs(num);

        while (num > 0) {

            sum += num % 10;

            num /= 10;
        }
        System.out.println(sum);

        //2.Yol - For -loop
        int a = 684;
        int toplam = 0;

        for (int k = a; k > 0; k /= 10) {

            toplam += k % 10;
        }
        System.out.println(toplam); //18


    }
}
