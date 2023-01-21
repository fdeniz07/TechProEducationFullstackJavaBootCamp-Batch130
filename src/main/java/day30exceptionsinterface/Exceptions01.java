package day30exceptionsinterface;

public class Exceptions01 {

     /*
        1)Exception olsa da, olmasa da calistirmamiz gereken kod'lari "finally" blok icerisine yazariz.
        2)DB ile baglantiyi kesme isini yapan kod'lar her halukarda calistirilmalidir. Bu tarz kodlari finally blok icerisine koyariz.
        3)"try block" yalniz kullanilamaz
          "try block" + 1 "catch block" mumkundur
          "try block" + 1 "catch block" + 1 "finally block" mumkundur
          "try block" + coklu "catch block" mumkundur
          "try block" + coklu "catch block" + 1 finally block mumkundur
          "try block" + 1 "finally block" mumkundur
        4)Coklu "finally block" kullanilamaz
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int c[] = {3, 6, 9, 12};

        m(c, a, b);

    }

    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cut the connection with the DB");
        }

    }
}
