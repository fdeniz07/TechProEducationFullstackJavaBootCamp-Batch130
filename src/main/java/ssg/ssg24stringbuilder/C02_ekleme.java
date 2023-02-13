package ssg.ssg24stringbuilder;

public class C02_ekleme {
    //soru 2)StringBuilder Classindaki ekleme methodlarina bakiniz
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("sehirlerdeki ");
        System.out.println(sb);
        sb.append(" guzeldir");
        System.out.println(sb);
        //sb.append("hava cok guzeldir ",0,4);
        // System.out.println(sb);
        sb.insert(13, "hava", 1, 2);
        System.out.println(sb);
    }
}
