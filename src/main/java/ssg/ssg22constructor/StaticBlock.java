package ssg.ssg22constructor;

public class StaticBlock {
    static int sayi;

    static {
        sayi=7;
        System.out.println(sayi);//7
        System.out.println("mainden onceki static block calisti");
    }
    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);//5
    }
    static {
        System.out.println("mainden sonraki static block calisti");
        sayi=5;
    }
}
