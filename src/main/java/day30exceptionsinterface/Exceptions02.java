package day30exceptionsinterface;

public class Exceptions02 {

    /*
        Java'da "Throwable" diye bir Class var.
        Object Class, Throwable'in parent'idir.

        "Throwable" ikiye ayrilir.
            1)  "Error" (Geri donusu olmayan unexpected issues'dur. Error'lar "Handle" edilemezdir.)
                    1.1) OutOfMemoryError
                    1.2) StackOverFlowError
                    1.3) VirtualMachineError

            2)  "Exceptions"
                    1.1) RunTimeExceptions (UncheckedExceptions)
                        1.1.1) AritmeticExceptions
                        1.1.2) NullPointerException
                        1.1.3) StringOutOfBoundException
                        1.1.4) NumberFormatException
                        1.1.5) ArrayIndexOutOfBoundException
                        1.1.6) ClassCastException
                        1.1.7) IllegalArgumentException

                    1.2) CompileTimeExceptions (CheckedExceptions)
                        1.1.1) FileNotFoundException
                        1.1.2) IOException


*/


    public static void main(String[] args) {

    }

    public static  void m(int[] c,int a,int b){

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
