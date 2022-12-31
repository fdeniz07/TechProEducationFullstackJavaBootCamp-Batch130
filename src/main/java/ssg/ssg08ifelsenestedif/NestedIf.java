package ssg.ssg08ifelsenestedif;

public class NestedIf {

    public static void main(String[] args) {
        // bir kisinin kan baginda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali

        //Yaş ve kilo için iki değişken oluşturma


        int age = 25;
        int weight = 58;
        //yaş ve kilo şartının uygulanması
        if (age >= 18) {

            if (weight > 50) {
                System.out.println("Kan bağışında bulunmaya uygunsunuz");
            } else {
                System.out.println("Kan bağışında bulunmaya uygun değilsiniz");
            }
        } else {
            System.out.println("Yaşınız 18'den Büyük Olmalıdır");
        }
    }
}
