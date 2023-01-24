package practice.advanced_practice.practice11.abstraction_alan_hesaplama;

public class Ucgen extends Alan{

    @Override
    public double alanHesapla(double taban, double yukseklik) {
        return taban*yukseklik/2;
    }
}
