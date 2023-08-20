package day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        String s = "Java";

        getCharFromString(s, 2);
        getCharFromString(s, 4);
    }

    //String'lerde varolmayan indexler kullanildiginda java StringIndexOutOfBoundsException atar.
    public static void getCharFromString(String s, int idx) {

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmanyan index kullanma hatasi yaptiniz... " + e.getMessage()); //hata ile ilgili tek satirlik bir mesaj verir
            System.out.println(e.getCause()); //Hatanin sebebini söyler
            e.printStackTrace(); //Developer'lar bu detayli hata raporunu kullanmayi severler.

        }

    }
}
