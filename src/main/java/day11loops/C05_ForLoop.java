package day11loops;

public class C05_ForLoop {
    public static void main(String[] args) {

        //Interview Question

        //Example : Size verilen bir String'i ters ceviren kodu yaziniz

        String str = "Mustafa"; //afatsuM
        String reverseStr = "";

        for (int i = str.length() - 1; i > -1; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);
    }
}
