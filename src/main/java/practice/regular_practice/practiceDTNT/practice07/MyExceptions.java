package practice.regular_practice.practiceDTNT.practice07;

public class MyExceptions extends Exceptions{

    static final String str = "Sen Degerlisin";

    public MyExceptions(String str) {
        super(str);
        System.out.println("Oyun Oynadi ");
    }

    public MyExceptions() {
        super(str);
    }

}
