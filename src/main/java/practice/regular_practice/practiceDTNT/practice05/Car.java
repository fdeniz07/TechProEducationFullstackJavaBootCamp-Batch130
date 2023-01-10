package practice.regular_practice.practiceDTNT.practice05;

public class Car {
    public static String make = "Toyota";
    public String model = "Corolla";
    public int price = 20000;
    public static int counter = 0;

    public Car() {
        counter++;
        price++;
    }
}
