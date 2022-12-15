package day11loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        //Interview Question

        //Example1 : Size verilen bir String'i ters ceviren kodu yaziniz

        String str = "Mustafa"; //afatsuM
        String reverseStr = "";

        for (int i = str.length() - 1; i > -1; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);

        //Example2 : 5'den 10'a kadar tamsayilarin toplamini bulan kodu yaziniz

        int sum = 0;

        for (int i = 5; i < 11; i++) {
            sum += i;
        }
        System.out.println("5'den 10'a kadar sayilarin toplami : " + sum);

        System.out.println("**********************************************");

        //Example3 : 6'dan 3'e kadar tamsayilarin carpimini bulan kodu yaziniz
        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply *= i;
        }
        System.out.println("6'dan 3'e kadar sayilarin carpimi : " + multiply);

        System.out.println("**********************************************");

        //Example4 : Bir tamsayinin rakmalarinin toplamini bulan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayi giriniz :");
        int num = input.nextInt();

        num = Math.abs(num);
        int result = 0;

        for (int i = num; i > 0; i = i / 10) {
            result = result + i % 10;
        }
        System.out.println(result);


        //Example 5: Verilen bir String'de 'a' character'i haric tum character'leri yazdiriniz.
        //           "Madagaskar" ==> Mdgskr
        String s = "Madagaskar";

        //1.Yol:
        String t = s.replace("a", "");
        System.out.println(t);// Mdgskr

        //2.Yol:
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!='a'){
                System.out.print(ch);
            }
        }

        System.out.println();

        //3.Yol: Madagaskar
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                continue;//continue keyword'u bazi sartlar icin loop'un adimlarini atlamamizi saglar
            }
            System.out.print(ch);
        }


        //Example 6: Size verilen bir String'i tersten yazdiriniz
        //           "Germany" ==> ynamreG
        String s1 = "Java";
        String t1 = "";

        for(int i=s1.length()-1; i>=0; i--){
            t1 = t1 + s1.charAt(i);
        }
        System.out.println(t1);

        //Example 7: Size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //           civic, nalan, kucuk, 11211 ==> Palindrome

        //Logic: String'i ters cevir sonra da duz hali ile ters halini karsilatir, ayni ise "Palindrome" de.
        String duz = "Civic";

        String ters = "";

        for(int i=duz.length()-1; i>=0; i--){

            ters = ters + duz.charAt(i);

        }

        if(duz.equalsIgnoreCase(ters)){
            System.out.println(duz + " : Palindrome'dur");
        }else{
            System.out.println(duz + " : Palindrome degildir");
        }


    }
}
