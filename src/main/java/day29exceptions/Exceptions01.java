package day29exceptions;

import java.util.Objects;

public class Exceptions01 {

    public static void main(String[] args) {

        Object obj = 70;
        String str = "";

        try {
            //explicit narrowing
            str = (String) obj; // Birbirine dönüstürülemeyecek data type'larini dönüstürmekte israr ederseniz, Java ClassCastException atar.
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("Her data type'i her data type'ina cevrilmez");
        }
    }
}
