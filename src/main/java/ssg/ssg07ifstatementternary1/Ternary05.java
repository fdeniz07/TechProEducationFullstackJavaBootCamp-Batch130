package ssg.ssg07ifstatementternary1;

import java.util.Scanner;

public class Ternary05 {
    public static void main(String[] args) {

        //Bir tamsayı pozitifse "Tamsayı pozitiftir" yazdırın, aksi takdirde "Tamsayı pozitif değil" yazdırın
        //1.yol if-else sistemlerini kullanarak çözme
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check its sign:");
        int num=scan.nextInt();

        if (num>0){
            System.out.println("positive");
        }else{
            System.out.println("not positive");
        }
        //2.way Ternary
        // 1-Condition 2-Question mark 3-:Result for happy scenario 4-colon:  5-negative scenario;
        String result=num>0       ?     "Positive"      :   "Negative";

        System.out.println(result);
    }
}
