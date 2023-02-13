package ssg.ssg24stringbuilder;

public class C03_reverse {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java cok guzeldir");
        sb.reverse();
        System.out.println(sb);//
        String str = "java cok guzeldir";
        tersCevir(str);

        //soru 3) verilen bir input'u tersine cevirip,
        //        donduren bir method olusturun
    }

    private static String tersCevir(String str) {
        StringBuilder sb1 = new StringBuilder(str);
        sb1.reverse();
        System.out.println(sb1);

        return sb1.toString();
    }

}
