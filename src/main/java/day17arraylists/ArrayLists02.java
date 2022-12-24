package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

        //ArrayList olustururken sag tarafa(constructor) ArrayList yazmak zorundasiniz.
        // Ama sol tarafa ister "ArrayList" ister "List" yazin,ikisi de calisir.

        //ArrayList<Character>  initials = new ArrayList<>();
        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir List'te kac eleman oldugunu nasil anlariz?
        int numOfElement = initials.size();
        System.out.println(numOfElement);//4

        //Note: Array'lerden bahsederken "length" kullanin, List'lerden bahsederken "size" kullanın

        //Bir List'ten istenen bir eleman nasil alinir?
        char u = initials.get(2);
        System.out.println(u);//M

        //Example 1: Verilen bir String List'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //I.YOL: for-each-loop (recommended)
        int sum = 0;
        for (String w : cities) {

            sum += w.length();

        }
        System.out.println(sum);//26

        //II.YOL: ffor-loop
        int toplam = 0;
        for (int i = 0; i < cities.size(); i++) {
            toplam += cities.get(i).length();
        }
        System.out.println(toplam);//26

        //Bir List'deki istenen elemani nasil degistirebiliriz?
        cities.set(0, "New York");
        System.out.println(cities);//[New York, Istanbul, Kayseri, Almaty]

        //Example 2: Maas List'i olusturunuz ve maaslara %20 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);


        //1.YOL:
        int idx=0;

        for (Double w : salary) {

           salary.set(idx, w*1.20);

           idx++;
        }
        System.out.println(salary);

        //2.YOL:
        for(int i=0; i<salary.size();i++){
            salary.set(i,salary.get(i)*1.20);
        }
        System.out.println(salary);

    }
}
