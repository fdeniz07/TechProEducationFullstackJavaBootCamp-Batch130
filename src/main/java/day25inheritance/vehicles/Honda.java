package day25inheritance.vehicles;

public class Honda extends Car {

    private int price = 10000;

    public void engine(){
        System.out.println("Honda engine");
    }


    public Honda() {
        //this("R8", 2023);

        System.out.println("Honda 1");
    }

    public Honda(String model, int year) {
        //super("Audi");
        System.out.println("Honda 2: " + model + " - " + year);
    }
}
