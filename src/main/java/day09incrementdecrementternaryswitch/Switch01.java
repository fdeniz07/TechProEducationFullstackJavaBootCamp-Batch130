package day09incrementdecrementternaryswitch;

public class Switch01 {
    public static void main(String[] args) {

        //Example 1: Gün isimlerini verince kacinci gün oldugunu yazdiran kodu yaziniz.
        //           Sunday==>1 . . . Saturday==>7

        String dayName = "Friday";

        //1.Yol : if - else

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Lütfen gecerli gün ismi giriniz");
        }

        //2.Yol : Switch
        switch (dayName) {
            case "Sunday":
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lütfen dogru bir gün ismi giriniz");
        }
    }
}
