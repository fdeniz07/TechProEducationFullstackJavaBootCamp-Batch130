package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer degistirmek
    public static void main(String[] args) {

        int a = 12;
        int b = 5; //Swap'den sonra ==> a=5 ve b=12
        int temp = 0;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //I.Yol
        temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("************************************");

        //II.Yol --> Interview Sorusu
        a = a + b;
        System.out.println("a: " + a);

        b = a - b;
        System.out.println("b: " + b);

        a = a - b;
        System.out.println("a: " + a);


    }
}
