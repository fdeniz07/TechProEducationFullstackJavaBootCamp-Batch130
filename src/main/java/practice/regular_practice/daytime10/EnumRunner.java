package practice.regular_practice.daytime10;

public class EnumRunner {
    public static void main(String[] args) {

        Level oyun = Level.High;

        switch (oyun){
            case Low:
                System.out.println("Kolay Oyun");
                break;
            case Medium:
                System.out.println("Orta seviye");
                break;
            case High:
                System.out.println("Zor seviye");
                break;
        }
    }
}
