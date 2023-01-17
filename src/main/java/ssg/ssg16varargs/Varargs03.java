package ssg.ssg16varargs;

public class Varargs03 {
    public static void main(String[] args) {

        // Kac tane ill ismi verilirse verilsin
        // iclerinden en Uzun olani yazdiran bir method olusturun
        String ill1 = "Adana";//5
        String ill2 = "ankara";//6
        String ill3 = "Istanbul";
        String ill4 = "Bursa";
        String ill5 = "Van";

        enUzunillIsmi(ill1, ill2, ill3, ill4, ill5);
        enUzunillIsmi("van", "san orfa", "igne gole", "kara deniz", "eski shehir yeni ismi ne dir");

        System.out.println(iller(ill1, ill2, ill3, ill4, ill5));
    }

    public static void enUzunillIsmi(String... str) {

        String enUzunIllIsim = "";//0

        for (String w : str) {
            if (w.length() > enUzunIllIsim.length()) {
                enUzunIllIsim = w;
            }
        }
        System.out.println("enUzunIsimi : " + enUzunIllIsim);
    }

    // 2 . yol

    public static String iller(String... sehirler) {
        String sehirismi = "";
        for (String city : sehirler) {
            if (city.length() > sehirismi.length()) {
                sehirismi = city;
            }
        }
        return sehirismi; // istanbul
    }
}
