package day11loops;

public class C03_ForLoop {

    //INTERVIEW QUESTIONS

    public static void main(String[] args) {

        /*  String karakterleri teker teker yazdiran;
            Eger 'a' karakterini görürse yazdirmayi durduran kodu yaziniz
         */

        String word = "Ögrenmek yasamin tek kanitidir";

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                break;
            }
            System.out.print(word.charAt(i) + "-");
        }
    }
}
