package day27encapsulationabstraction;

public class SixthGraders extends Courses{

    @Override
    public void math() {
        System.out.println("Sixth greaders math....");
    }


    @Override
    public void art() {
        super.art();
    }
}
