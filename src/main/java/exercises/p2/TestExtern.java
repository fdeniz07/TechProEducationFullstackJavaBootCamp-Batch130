package exercises.p2;


import exercises.p1.Acc;
import exercises.p1.TestIntern;

public class TestExtern extends Acc {
    public static void main(String[] args) {
        Acc obj = new TestExtern();
        obj.s = 2;


    }

    public void testMethod() {
        Acc obj = new TestIntern();
        obj.s = 5;

    }
}
