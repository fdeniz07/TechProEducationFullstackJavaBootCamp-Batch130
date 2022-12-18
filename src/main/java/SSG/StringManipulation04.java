package SSG;

public class StringManipulation04 {
    /*soru 4)Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
    karakter sayısının toplamını yazdırınız.
    */
    public static void main(String[] args) {

        String isim1 = "ahmet furkan     ";
        String isim2 = "utku can";
        String isim3 = "mehmet ali";

        int a1 = isim1.replaceAll("\\s", "").length();
        int a2 = isim2.replaceAll("\\s", "").length();
        int a3 = isim3.replaceAll("\\s", "").length();
        System.out.println("karakterlerin toplamı : " + (a1 + a2 + a3));
    }
}
