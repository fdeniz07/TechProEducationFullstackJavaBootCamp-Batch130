package day20passbyvaluemethodoverloading;

public class PassByValue01 {

    /*
        1) Java "pas-by-value" sayesinde variable'lerin orjinal degerini koruma latina alir.



     */
    public static void main(String[] args) {

        double shirt = 100;

        double studentShirtPrice = discount("student", shirt);
        double veteranShirtPrice = discount("veteran", shirt);
        double seniorShirtPrice = discount("senior", shirt);
        System.out.println(shirt);//100
        System.out.println(studentShirtPrice);//90
        System.out.println(veteranShirtPrice);//80
        System.out.println(seniorShirtPrice);//95

    }

    public static double discount(String state, double price) {

        switch (state) {
            case "student":
                price = price * 0.90;
                break;
            case "veteran":
                price = price * 0.80;
                break;
            case "senior":
                price = price * 0.95;
                break;
            default:
                price = price;

        }
        return price;
    }
}
