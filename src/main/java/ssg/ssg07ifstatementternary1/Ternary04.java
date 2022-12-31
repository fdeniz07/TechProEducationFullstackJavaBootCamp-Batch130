package ssg.ssg07ifstatementternary1;

public class Ternary04 {
    public static void main(String[] args) {

        /*
        2 tam sayınız var;
        Her iki tamsayı da pozitifse çarpma işlemi yapın
        Biri negatifse diğeri pozitif ise "çarpma nasıl yapılır bilmiyorum"
         */
        int a = 12;
        int b = -5;
        //Note: If your ternary returns different data types for different scenarios,
        // do not create reserved area for the result, put it directly inside System.out.println().

        System.out.println(a > 0 && b > 0 ? a * b : "I do not to multiply");

    }
}
