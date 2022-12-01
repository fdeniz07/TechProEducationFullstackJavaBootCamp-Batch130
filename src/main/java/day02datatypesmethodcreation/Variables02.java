package day02datatypesmethodcreation;

public class Variables02 {

    /*
        Non-Primitive Data Types: String bir non-primitive data type'dir.
                                  Üretilen her bir class ayni zamanda bir non-primitive data type'dir.
                                  Bu yüzden non-primitive data type'lar sinirsiz sayidadir denilebilir.
                                  Non-primitive data type'larin isimleri büyük harfle baslar
                                  Non-primitive data type'larin tamami icin Java memory'de ayni miktarda yer ayirir.


        Interview Sorusu: "Primitive" ve "Non-Primitive" data type'lari arasindaki farklar nelerdir?
                           1)"Primitive" ler sadece bizim atadigimiz degeri icerir, "Non-Primitive" ler bizim atadigimiz deger ve metotlari icerir.
                           2)"Primitive" ler kücük harfle baslar,  "Non-Primitive" ler büyük harfle baslar
                           3)"Primitive" leri java üretmistir ve 8 adettir, "Non-Primitive" leri Java Developer üretebilir ve sinirsizdir.
                           4)"Primitive" memory'de data type'ina göre yer kaplar, "Non-Primitive" ler icin Java memory'de hep ayni büyüklükte yer ayirir.
     */
    public static void main(String[] args) {

        //Ornek 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin
        String cityName = "Miami";
        System.out.println(cityName);

    }


}
