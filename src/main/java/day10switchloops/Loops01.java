package day10switchloops;

public class Loops01 {

     /*

     Code Standarts
     i)Tekrar (Repetition) olmamalıdır.
     ii)Dynamic olmalıdır.
     iii)Tamir(Fix) ve update kolay yapilabilmelidir.

     */

    public static void main(String[] args) {


        //Example 1: Ekrana 5 kere "Hi!" yazdırınız.

        //1.Yol: Tavsiye edilmez.
        System.out.println("****** Example1 - 1.Yol *******");

        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.Yol:
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "Loop" lar kullanılır
        //Dort tane Loop var ; i)for-loop  ii)while-loop  iii)do-while-loop  iv)for-each-loop

        //i)for-loop
        // Baslangıç degeri    Loop'un calısma sartı  Increment/Decrement
        System.out.println("****** Example1 - 2.Yol *******");
        for (int i = 1; i < 6; i++) {

            System.out.println("Hi");
        }

        //Example 2: 11'den 44'e kadar tüm tamsayilarin ekrana yazdiran kodu yaziniz

        System.out.println("****** Example2 *******");
        for (int i = 11; i < 45; i++) {
            System.out.println(i);
        }


        //Example 3: 11'den 14'e kadar tüm tamsayilari ekrana yazdiran kodu yaziniz

        System.out.println("****** Example3 *******");
        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }


        //Example 4: 40'dan 23'e kadar tüm cift tamsayilari ekrana yazdiran kodu yaziniz

        System.out.println("****** Example4 *******");
        for (int j = 40; j > 22; j -= 2) {
            System.out.println(j);
        }

        //Example 5: 18'den 56'ya kadar tüm tek tamsayilari ekrana yazdiran kodu yaziniz

        System.out.println("****** Example5 *******");
        for (int i = 18; i < 57; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
