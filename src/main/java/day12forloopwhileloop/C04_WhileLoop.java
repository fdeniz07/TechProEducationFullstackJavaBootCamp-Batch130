package day12forloopwhileloop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        // 3'den 10'a kadar tamsayilari ayni satira yazdiran kodu yaziniz

        //1.yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");

        }
        //2.yol
        System.out.println();

        int i = 3;//baslangic degeri

        while (i < 11) { //bitis degeri
            System.out.print(i + " ");
            i++;//artirma while loop'un {}icinde

        }

        // 17'den 4'e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int k = 17;

        while (k > 3) {//bitis degeri
            if (k % 2 == 0) {//ciftse

                System.out.println(k + " ");

            }
            k--;
        }
    }
}
