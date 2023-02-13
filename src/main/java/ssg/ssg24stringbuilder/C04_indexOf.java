package ssg.ssg24stringbuilder;

public class C04_indexOf {
    public static void main(String[] args) {

        /*
        soru 4) bir StringBuilder olusturun ve icinde bulunan karakterleri arayin

        soru 5) bir StringBuilder olusturun ve icinde bulunan bazi karakterleri degistirin

         */
        String str = "java cok guzeldir";
        StringBuilder sb1 = new StringBuilder("java cok guzeldir a");
        System.out.println(sb1.indexOf("a", 5));//
        sb1.replace(5, 17, str);
        System.out.println(sb1.lastIndexOf("a"));
        System.out.println(sb1);
        sb1.setCharAt(23, '!');
        System.out.println(sb1);

    }
}
