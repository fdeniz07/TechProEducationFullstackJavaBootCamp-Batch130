package day25inheritance.lessons;

public class A01_Math extends A04_Lessons {

    public A01_Math(){
        super("str");
        System.out.println("Math Constructor");

    }
    public A01_Math(int a){
        this();//ayni class'in icindeki const.
        // calismasini saglar
        System.out.println("Parametreli Math Cons.");
    }
}
