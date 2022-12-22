package exercises;

public class MathematikQuestion91 {
    public static void main(String[] args) {

        int number = 625;

        String numStr=String.valueOf(number);
        int lenght = numStr.length();

        String digit=numStr.substring(0,lenght-1);
        String lastDigit = numStr.substring(lenght-1,lenght);

        int num1=Integer.parseInt(digit);
        int num2 =Integer.parseInt(lastDigit);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        String str1=String.valueOf(num1 * ++num1);
        String str2=String.valueOf(num2 * num2);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        boolean  isTrue = Integer.parseInt(str1 + str2) == Math.pow(number, 2);
        System.out.println(isTrue);
    }
}
