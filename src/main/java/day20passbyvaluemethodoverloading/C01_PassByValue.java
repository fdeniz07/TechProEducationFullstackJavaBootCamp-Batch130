package day20passbyvaluemethodoverloading;

public class C01_PassByValue {

    public static void main(String[] args) {


        /*
        Pass By Value : Method'a Value'nun bir kopyasini gonder demektir.
        Bu nedenle Pass by Valuda orjinal parametre degismez.

        Java Pass By Value kullanir.
        1) Java variable'in orjinal degerini korumak ister
        2) Java variable'in icindeki degeri kopyalar ve methodun icine kopya degeri gonderir.
        Deger uzerinde yapilan degisiklikler orjinal parametreyi etkilemez.

        Pass By Referance'da ise referans kopyalanir ve methodda kullanilir.
        Yapilan degisiklik orjinal parametreyi etkiler.
        Bu tarz programlar degeri korumak istiyorsa isi developer'a birakmistir.
        Kendisi degeri degistirir.

         */

        int gomlek=100;

        System.out.println("gomlek = " + gomlek);//100

        // ogrenciIndirimi(gomlek);
        // System.out.println("gomlek = " + gomlek);//gomlek = 100
        gomlek= ogrenciIndirimi(gomlek);
        System.out.println("atamadan sonra maindeki gomlek = " + gomlek);

    }

    private static int ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi=gomlek-10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);//ogrenciGomlegi = 90
        return  ogrenciGomlegi;
    }
}
