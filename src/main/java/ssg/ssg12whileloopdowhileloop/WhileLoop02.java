package ssg.ssg12whileloopdowhileloop;

public class WhileLoop02 {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun

        // ayni soruyu while loop ile yapalim
        int baslangic = 40;
        int bitis = 60;
        while (baslangic <= bitis) {

            System.out.print(baslangic + " ");
            baslangic++;
        }
        System.out.println("");

        /*
           int baslangic=40;
        int bitis=60;
          for (int i = baslangic; i <=bitis ; i++) {
          System.out.print(i + " ");
        }
        System.out.println("");
         */

    }
}
