package day15arrays;

public class C04_Arrays {
    // Bir Arrayin icinde herhangi bir elemanin olup olmadigini
    // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz

    public static void main(String[] args) {
        int arr[] = {5, 1, 5, -3};
        int eleman = -90;
        int sayac = 0;

        for (int w : arr) {
            if (w == eleman) {
                sayac++;
            }//if
        }//for

        if (sayac > 0) {
            System.out.println(eleman + " Array'de " + sayac + " defa var");
        } else
            System.out.println(eleman + " Array'de yok");
    }
}
