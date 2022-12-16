package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {

        /*
             Example 1: Hic sayi kullanmadan 1 den 100'e kadar olan sayilari console'a yazdiriniz
         */

        for (int i = 'e' / 'e'; i < 'e'; i++) {//e 'nin Ascci degeri 101 'd'=100
            System.out.print(i + " ");
        }

        //Note: Bazi loop'lar hic calismayabilir
        for (int i=0; i<0; i--){
            System.out.println("Hi...");
        }

        //Note 2: Bazi loop'lar sonsuz defa calisabilir.
        //        Bu tarz loop'lara "Infinite (Sonsuz) Loop" denir.
        //        "Infinit (Sonsuz) Loop" genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir.

        //Note : Topluca secili satirlari yorum satiri yapmak icin ctrl + / ya da cmd + /  kisayollari kullanilir

        for (int i=1; i<10; i--){
            System.out.println("Java is money...");
        }

        //Note 3: Baska bir "Infinite(Sonsuz) Loop"
        //        Lloop olusturdugunuzda "ikinci kismi" yazmazsaniz "Infinite(Sonsuz) Loop" olur
        //        for(int i=1;      ;i++){
        //            System.out.println("Hi!");
        //        }
    }
}
