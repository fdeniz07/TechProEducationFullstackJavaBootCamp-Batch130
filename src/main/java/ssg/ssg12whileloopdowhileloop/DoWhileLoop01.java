package ssg.ssg12whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alip
        //do  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        int input = 5;

        // Ayni soruyu do-while loop ile yapalim
        int sayi = 1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi < input);
    }

        /*
            int sayi=1;

            while (sayi<input){
                System.out.println(sayi);
                sayi++;
            }

             */


}
