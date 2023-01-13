package day25inheritance;

public class Honda extends Car {

    public Honda(){
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        System.out.println("Honda 2: " + model + " - " + year);
    }
}
