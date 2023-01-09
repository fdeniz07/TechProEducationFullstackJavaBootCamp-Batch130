package day23datetimestringbuilder;

public class StringBuffer01 {
    /*
        String olusturmak icin String Class, StringBuilder Class, ve StringBuffer kullanilabilir.
                1)StringBuffer Java'nin String uretmek icin olusturdugu ile Class'dir. Java 5 de uretilmistir.
                2)StringBuffer "synchronized" dir, StringBuilder "synchronized" degildir.
            3)StringBuffer "thread-safe"(multi-thread'e uygun) dir, StringBuilder "thread-safe" degildir.
                4)StringBuffer ve StringBuilder ikisi de mutable dir.

        Note 1: Immutable String lazim oldugunda String Class kullaniriz.
                Note 2: Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
        Note 3: StringBuffer "Multithread" ve "Synchronization" lazim oldugunda tercih edilir.
        StringBuilder "Multithread" ve "Synchronization" gerekmezse tercih edilir.
     */

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

        System.out.println(sbf.capacity());//20
    }
}
