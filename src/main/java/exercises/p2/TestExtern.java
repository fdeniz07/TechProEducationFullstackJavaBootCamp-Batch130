package exercises.p2;


import exercises.p1.Acc;
import exercises.p1.TestIntern;

public class TestExtern extends Acc {
    public static void main(String[] args) {
        Acc obj = new TestExtern();
       // obj.p = 1;
        obj.s = 2;
       // obj.r = 3;

    }

    public void testMethod() {
        Acc obj = new TestIntern();
        obj.s = 5;

    }
}
