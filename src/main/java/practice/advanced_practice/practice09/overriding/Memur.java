package practice.advanced_practice.practice09.overriding;

public class Memur extends Banka {

    @Override
    public double faizHesapla(double alinanKredi) {
        return alinanKredi * 0.1;
    }
}
