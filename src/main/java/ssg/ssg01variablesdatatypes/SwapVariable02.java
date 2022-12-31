package ssg.ssg01variablesdatatypes;

public class SwapVariable02 {

     /*
           1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
           ucuncu bir variable kullanmadan degistiren (SWAP)
           bir program yaziniz
                Orn 	: sayi1=10 ve sayi2=20;
                 kod calistiktan sonra
                sayi1=20 ve sayi2=10
     */

    public static void main(String[] args) {

        int sayi1 = 30;
        int sayi2 = 20;

        System.out.println("Swaptan önce sayı1 : " + sayi1 + " " + "sayi2 : " + sayi2);
        sayi1 = sayi1 + sayi2;//sayı1=30
        sayi2 = sayi1 - sayi2;//sayı2=10
        sayi1 = sayi1 - sayi2;//sayı1=20
        System.out.println("Swaptan sonra sayı1 : " + sayi1 + " " + "sayı2 " + sayi2);
    }
}
