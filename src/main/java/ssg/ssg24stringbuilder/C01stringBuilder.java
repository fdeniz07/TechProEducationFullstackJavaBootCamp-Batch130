package ssg.ssg24stringbuilder;

public class C01stringBuilder {
    public static void main(String[] args) {
        //soru 1) StringBuilder olusturma yontemlerine bakiniz.

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());//0
        sb1.append("animal");
        System.out.println(sb1.capacity());//16

        StringBuilder sb2 = new StringBuilder("animal");
        System.out.println(sb2.length());//6
        System.out.println(sb2.capacity());//22

        StringBuilder sb3 = new StringBuilder(3);
        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//4
        sb3.append("123456789");
        System.out.println(sb3.length());//11
        System.out.println(sb3.capacity());//22
        sb3.append("123");
        System.out.println(sb3.capacity());
    }
}
