package ssg.ssg02methodCreation;

public class MethodCreation03 {


    public static void main(String[] args) {
        // bir kullanicin ismi ve soyismi ilk harfi buyuk ve deger karakterli * ile gizleyiniz.
        // kkno varsa son 4 rakam haric deger karakterli * ile saklayan bir mehtod olustrunuz.
        String isim = "yasemin yalcin";
        String soyisim = "sari";
        String kKNo = "1234567890128795";


        // eger bir method'dan bir islem yapmasini
        // ve yaptigi islemi bize getirmesini isterseniz
        // return type void degil, bize getirecegi sonucun data turunde olmalidir

        String gizlenmisIsimSoyisim = isimSoyisimGizle(isim, soyisim);
        System.out.println(gizlenmisIsimSoyisim); //

        // 1 yol
        // String gizlenmisKKNo=krediKartiGizle(kKNo);
        //  System.out.println(gizlenmisKKNo);

        //2. yol
        System.out.println(

                krediKartiGizle(kKNo));

    }

    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");

        String yeniSoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");

        return yeniIsim + " " + yeniSoyisim;
    }

    private static String krediKartiGizle(String kKNo) {
        String yeniKKNo = "**** **** **** " + kKNo.substring(12);
        return yeniKKNo;
    }

}
