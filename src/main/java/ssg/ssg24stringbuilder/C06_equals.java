package ssg.ssg24stringbuilder;

public class C06_equals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb1.equals(sb2));//false ==
        System.out.println(sb1.equals(sb1));//true
        String str = "Java";
        System.out.println(str.equals(sb1.toString()));//false
        System.out.println(sb1.compareTo(sb2));//0

		/*
		compareTo() iki stringBuilder'i bastan baslayarak harf harf karsilastirir
        ilk harf ayni ise, ikincisine gecer
        ikinciler ayni ise 3.lere gecer ve ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir
		cikti 0 ise iki stringBuilder ayni degerlere sahiptir
        */
    }
}
