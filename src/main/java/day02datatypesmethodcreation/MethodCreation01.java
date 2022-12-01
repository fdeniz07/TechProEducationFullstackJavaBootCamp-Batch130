package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
        Java'da method nasil olusturulur?

        1) Main method'un disinda olusturulur.
        2) Access Modifier + Return Type + Method Ismi + () + {}

        Olusturulan method'lar nasil kullanilir?
        1)Main metodunun icinden kullanilir
        2)method'un ismini + () yazin
        3)Islem yapacaginiz sayilari parantezin icine koyun

     */

    public static void main(String[] args) {
        int sum = add(3, 5);
        System.out.println(sum);

        long result = multiply(20, 30);
        System.out.println(result);

        test();

        long sonuc = firstTwoMultiplyThirdAdd(5, 6, 10);
        System.out.println(sonuc);

        double kup = getCube(10);
        System.out.println(kup);

        int dikdortgenAlan = areaOfRectangle(10, 30);
        System.out.println("Dikdörtgenin Alani: " + dikdortgenAlan);

        int dikdortgenCevre = perimeterOfRectangle(10, 30);
        System.out.println("Dikdörtgenin Cevresi: " + dikdortgenCevre);

        double daireAlan = areaOfTheCircle(10);
        System.out.println("Dairenin Alani: " + daireAlan);

        double daireCevre = circumferenceOfTheCircle(10);
        System.out.println("Dairenin Cevresi: " + daireCevre);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    protected static long multiply(int a, int b) {
        return a * b;
    }

    public static void test() {
        System.out.println("Bu bir test mesajidir");
    }

    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu toplayan method'u olusturunuz ve kullaniniz.
    private static long firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }

    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Access Modifier'i default yapmak icin access modifier yazmayiniz
    static double getCube(double a) {
        return a * a * a;
    }

    //1)Dikdörtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    //2)Dikdörtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //4)Dairenin alaninio hesaplayan methodu olusturunuz ve kullaniniz

    public static int areaOfRectangle(int a, int b) {
        return a * b;
    }

    public static int perimeterOfRectangle(int a, int b) {
        return 2 * (a + b);
    }

    public static double pi = 3.14;

    public static double areaOfTheCircle(int r) {
        return pi * (r * r);
    }

    public static double circumferenceOfTheCircle(int r) {
        return 2 * pi * r;
    }
}
