package practice.regular_practice.daytime04;

public class Loops01 {
    public static void main(String[] args) {

        //Example 5: Asagidaki sorunun ciktisi nedir?

        for (int i = 1; i <= 5; i++) {

            for (int j = (5 - i); j > 1; j--) {

                System.out.print(i + j);

            }

            System.out.println();

//            543
//            54
//            5

        }

        System.out.println("*******");

        //Example 6: Asagidaki sorunun ciktisi nedir?

        for (char k = 'f'; k > 'a'; k--) {

            System.out.print(k + " "); //f d b

            k--;

        }

        System.out.println("*******");

        //Example 7: Asagidaki sorunun ciktisi nedir?
        int num = 1;

        while (num < 3) {

            System.out.print(num + " "); //1 2

            num++;

        }

        System.out.println("*******");

        //Example 8: Asagidaki sorunun ciktisi nedir?

        int num2 = 1;

        while (num2 < 1) {

            System.out.print(num2 + " "); //Program calisir ama döngüye girmediginden birsey yazdirmaz

            num2++;

        }

        System.out.println("*******");


        //Example 9: Asagidaki sorunun ciktisi nedir?
        int num3 = 1;

//        while(num3=1) { // Program hata verir (num3==1 olsaydi calisir ve 1 yazdirirdi)
//
//            System.out.print(num3 + " ");
//
//            num3++;
//
//        }

        System.out.println("*******");

        //Example 10: Asagidaki sorunun ciktisi nedir?

        int num4 = 1;

        while (num4 <= 1) {

            //System.out.print(num4+ " "); //Sonsuz döngüye girer

            num4--;

        }

        System.out.println("*******");

        //Example 11: Asagidakilerden hagisi asagidaki soru ile ayni ciktiyi verir?

        for (int i = 1; i < 10; i = i + 1) {

            if (i % 3 == 0) {

                System.out.print(i + " "); //3 6 9

            }
        }

        System.out.println("*******");

        //a)
        int num11 = 3;

        while (num11 < 10) {

            System.out.print(num11 + " "); // 3 6 9

            num11 = num11 + 3;

        }

        System.out.println("*******");

        //b)
        int num111 = 3;

        while (num111 < 10) {

            if (num111 % 3 == 0) {
                System.out.print(num111 + " "); // 3 6 9
            }
            num111 = num111 + 3;

        }

        System.out.println("*******");

        //c)
        int num1111 = 9;
        // while (num1111>1) {

        // System.out.println(num + " "); // sonsuz döngüye girer
        //num=num-3;

        //  }

        System.out.println("*******");

        //Example 12: Asagidakilerden hagisi asagidaki soru ile ayni ciktiyi verir?

        char ch = 'a';

        while (ch < 'd') {

            System.out.print(ch + " "); //a b c

            ch++;

        }

        System.out.println("*******");

        //a)
        for (char i = 'a'; i < 'd'; i++) {
            System.out.println(i + " "); // a b c
        }

        //b)
        //System.out.println('a ' + 'b ' + 'c ');
        //Not: a,b,c harflerinden sonra tek tirnagin icinde bir karakter bosluk vardir

        //c)
        System.out.println('a'+ " "+ 'b'+" "+'c'+"");
        //Not: Cift tirnaklar icerisinde bir bosluk vardir

        System.out.println("*******");


        //Example 13: Asagidaki sorunun ciktisi nedir?
        int sum = 0;
        int num5 = 1;

        while(num5<5) {

            sum = sum + num5;

            num5++;

        }

        System.out.println(sum); //10


        System.out.println("*******");


        //Example 14: Asagidaki sorunun ciktisi nedir?
        int sum2 = 5;

        int num21 = 1;

        while(num21<5) {

            sum2 = sum2 + num21;

            num21++;

        }

        System.out.println(sum2); //15

        System.out.println("*******");


        //Example 15: Asagidaki sorunun ciktisi nedir?
        int product = 1;

        int num6 = 1;

        while(num6<5) {

            product = product * num6;

            num6++;

        }

        System.out.println(product); //24


        System.out.println("*******");

        //Example 16: Asagidaki sorunun ciktisi nedir?
        int product2 = 1;

        int num7 = 1;

        while(num7<5) {

            product2 = product2 * num7;

            product2++; //num7 arttirilmiyor

        }

        System.out.println(product2); //Sonsuz loop a girer

    }
}
