package ssg.ssg07ifstatementternary1;

public class Ternary03 {
    public static void main(String[] args) {

        //Bir sayının mutlak değerini hesaplamak için kodu yazın
        //Pozitif sayılar için non sıfır mutlak değeri sayı ile aynıdır
        //Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarp
        double num = -1;
        double absoluteValue = num > 0 ? num : -1 * num;
        System.out.println(absoluteValue);

    }
}
