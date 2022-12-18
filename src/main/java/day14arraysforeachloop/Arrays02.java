package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 2: Integer array olusturunuz. Icine 6 tane eleman yerlestiriniz. Bu elemanlarin en kücügü ile en büyügünün toplamini ekrana yazdiriniz

        // Integer[] ages = new Integer[6];
        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 92;
        ages[3] = 55;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));

        //1.YOL:
        //sort() method'u array'deki elemanlari kucukten buyuge dizer
        //  Arrays.sort(ages);
        //  System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
        //  System.out.println(ages[0] + ages[ages.length-1]);//59

        //2.YOL:
        int minimum = ages[0];
        int maximum = ages[0];

        for (int w : ages) {

            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum + maximum); //59
    }
}
