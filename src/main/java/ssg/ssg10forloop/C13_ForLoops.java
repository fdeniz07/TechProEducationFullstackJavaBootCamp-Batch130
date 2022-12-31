package ssg.ssg10forloop;

public class C13_ForLoops {
    public static void main(String[] args) {
        /*
        Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        */

        String str = "Merhaba";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 = str.substring(i, i + 1);
            if (str.indexOf(str1) == str.lastIndexOf(str1)) {
                System.out.print(str1 + " ");
            }
        }
    }
}
