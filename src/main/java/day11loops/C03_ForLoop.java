package day11loops;

public class C03_ForLoop {

    //INTERVIEW QUESTIONS

    public static void main(String[] args) {

        /* Example 1: String karakterleri teker teker yazdiran;
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


        //Example 2: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"
        String s = "Tramvay";

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }

        System.out.println();

        //Example 3: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
        //           "Germany" ==> yn
        String t = "Germany";

        for(int i=t.length()-1; i>=0; i--){
            char ch = t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }



    }
}
