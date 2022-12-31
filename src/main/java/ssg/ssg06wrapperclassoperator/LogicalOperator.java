package ssg.ssg06wrapperclassoperator;

public class LogicalOperator {

    public static void main(String[] args) {

        int mark1 = 40;
        int mark2 = 60;
        int mark3 = 30;


        System.out.println(mark1 > 30 && mark1 < 70);//

        System.out.println(mark2 >= 60 && mark3 != 70);//

        System.out.println(mark3 < 100 || mark2 > 80);//

        System.out.println(mark3 != mark2 && mark2 > mark1); //

        System.out.println(mark2 < 30 || mark2 > 50 && mark2 == 70);//

    }
}
