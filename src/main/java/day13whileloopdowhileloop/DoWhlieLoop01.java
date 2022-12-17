package day13whileloopdowhileloop;

public class DoWhlieLoop01 {
    public static void main(String[] args) {

        //1) While-loop
        int i = 1;

        while (i < 1) {
            System.out.println(); //while body hic calismadi (While-loop'da Zero Execution mümkündür.
            i++;
        }

        //2)do-while-loop
        int k = 1;

        do {
            System.out.println("Sen bir do while loop'sun");
            k++;
        } while (k < 1);

        //Note 1: do-while body calisti
        //Note 2: do-while kullandiginizda loop body en ay bir kere calisir
        //Note 3: do-while da "Zero execution" mümkün degildir

        /*
            Not

        While-->once sartı sagladıgını kontrol eder sonra calısır
        DoWhile--> once calıs sonra sartı kontrol eder

         */
    }
}
