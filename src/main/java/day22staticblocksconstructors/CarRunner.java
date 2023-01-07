package day22staticblocksconstructors;

public class CarRunner {

    public static void main(String[] args) {
        Car c1 = new Car("BMW", "M4", 2023, false);
        Car c2 = new Car("Audi", "R8", 2022, true);
        Car c3 = new Car("Honda", "Civic", 1999, false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Car c4 = new Car("Mercedes", "C300");
        System.out.println(c4);
    }
}
