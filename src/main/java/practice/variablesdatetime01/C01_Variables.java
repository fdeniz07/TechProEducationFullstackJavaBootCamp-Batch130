package practice.variablesdatetime01;

public class C01_Variables {

    public static void main(String[] args) {

        // byte; short; integer ; long ; double; float Data Type'larinin max ve min degerlerini yazdiran kodu yaziniz

        byte byteMax = Byte.MAX_VALUE; //-128
        byte byteMin = Byte.MIN_VALUE; //127
        System.out.println("byteMin = " + byteMin + "\n" + "byteMax = " + byteMax);

        short shortMin = Short.MIN_VALUE; //-32768
        short shortMax = Short.MAX_VALUE; //32767
        System.out.println("shortMin = " + shortMin + "\n" + "shortMax = " + shortMax);

        int intMin = Integer.MIN_VALUE; //-2147483648
        int intMax = Integer.MAX_VALUE; //2147483647
        System.out.println("intMin = " + intMin + "\n" + "intMax = " + intMax);

        long longMin = Long.MIN_VALUE; //-9223372036854775808
        long longMax = Long.MAX_VALUE; //9223372036854775807
        System.out.println("longMin = " + longMin + "\n" + "longMax = " + longMax);

        double doubleMin = Double.MIN_VALUE; //4.9E-324
        double doubleMax = Double.MAX_VALUE; //1.7976931348623157E308
        System.out.println("doubleMin = " + doubleMin + "\n" + "doubleMax = " + doubleMax);

        float floatMin = Float.MIN_VALUE; //1.4E-45
        float floatMax = Float.MAX_VALUE; //3.4028235E38
        System.out.println("floatMin = " + floatMin + "\n" + "floatMax = " + floatMax);

        /*
            TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
            salona devam edeceği ay süresi bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
        */

        String firstName = "Fatih";
        String lastName = "Deniz";
        byte age = 36;
        short weight = 86;
        short height = 178;
        byte period = 6;
        double salary = 20;

        System.out.println("The total fee is calculated as :" + period * salary + "$");



        //1)TECHPRO EDUCATION ==> her bir harf alt alta gelecek sekilde yazdiran kodu olusturunuz.

        System.out.println("*************1. YOL**********");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println("");//HICLIKTE OLUR
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");
        /*
        \n ==> alt satira gecirir
        \t ==> bir tab bosluk birakir
        \b ==> gerisindeki ilk harfi siler
        ctrl+ alt +l ==> windows icin sayfayi duzenler
        cmd + alt +l ==> mac icin sayfayi duzenler
         */

        //2)yukaridaki ornegi tek sout ile her harf alt alta gelecek sekilde yazdirin
        System.out.println("************2.Yol******************");
        System.out.println("\nT\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        //3) JAVA ILE GUZEL DUNYA her bir kelimeyi alt satira yazdiracak sekilde kodu create ediniz

        System.out.println("\nJAVA\nILE\nGUZEL\nDUNYA");
        System.out.println("JAVA");
        System.out.println("ILE");
        System.out.println("GUZEL");
        System.out.println("DUNYA");

        //4) JAVA ILE GUZEL DUNYA seklinde kelimeler arasinda 1 tab bosluk birakan kodu yaziniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        //5) pazartesi kelimesinin her bir harfini alt satirda yazdiracak sekilde tek sout ile kodu create ediniz
        System.out.println("\np\na\nz\na\nr\nt\ne\ns\ni");
        //Soru-6 : "Techpro" ile java cok 'kolay'
        // yazdiran bir kod yaziniz

        System.out.println("\"Techpro\"\tile\tjava\tcok\t'kolay'");
        //Soru-7 : "MAHARET" hic 'DUSMEMEK'  degil;

        // "Her dustugunde kalkabilmektir" ==>ifadesini

        //      seklinde noktali virgulden
        //      sonra 3 satir asagidan ve satir basi yaparak
        //      yazdiran bir kod yaziniz.
       System.out.println("\"MAHARET\" hic\t'DUSMEMEK'\tdegil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

    }
}
