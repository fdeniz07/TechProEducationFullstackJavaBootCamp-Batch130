package day28exceptions;

public class C02_Exceptions {

    /*
        2) StringOutOfBoundExceptions
     */

    //Bir String'in istedigimiz indexdeki datasini bize veren kodu yaziniz

    public static void main(String[] args) {

        char ch = getCharFromString("Hakan", 5);
        System.out.println("ch = " + ch);
    }

    private static char getCharFromString(String str, int i) {
        char c = ' ';
        try {
            c = str.charAt(i);
        } catch (Exception e) {
            System.out.println("Kendi ekledigim e.getMessage() calisti ==> " + e.getMessage());
        }
        return c;
    }
}
