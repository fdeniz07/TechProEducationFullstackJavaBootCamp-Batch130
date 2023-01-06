package day21statickeyword;

public class Student {

    /*
          1)Static variable veya static method'lar (class member) tum objeler icin ortak elemandir.
          2)Static class member'lar uzerinde yapilan tum degisiklikler tum object'leri etkiler.
          3)Static class member'lar Class'a, non-static class member'lar object'lere monte edilir.
            Mesela bir class'dan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur,
            ama static olanlar object sayisindan bagimsiz olarak 1 kez olusturulur.
          4)Static class member;lara ulasmak icin object olusturmaya gerek duyulmaz, ama non-tstaic member'lara ulasmak icin object olusturmak sarttir.
          5)Static variable'larin diger adi "Instance Variable" (Görünüm) veya "Object Variable" dir.
    */

    static String stdName = "Tom Hanks";

    public int age = 13;

    //Ögrenci isminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name) {
        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0, 1);
        return first + second;
    }

    //Ögrenci ismindeki sesli harfleri(a,e,i,o,u) sayan bir program olusturunuz
    public int countVowels(String name) {
        int counter = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(i);

            switch (ch) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}
