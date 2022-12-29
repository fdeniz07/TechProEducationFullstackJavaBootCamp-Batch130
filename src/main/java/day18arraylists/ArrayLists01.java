package day18arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        // 1)ArrayList nasil olusturulur?

        List<Integer> nums = new ArrayList<>();

        // 2)ArrayListler nasil yazdirilir?

        System.out.println(nums); //[]

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        nums.add(52);
        nums.add(36);
        nums.add(52);

        System.out.println("nums = " + nums); //nums = [37, 38, 39, 40, 41, 42]

        // 3)ArrayList'in bos olup olmadigini nasil anlariz?

        boolean isEmpty1 = nums.isEmpty();
        System.out.println("isEmpty1 = " + isEmpty1); //isEmpty1 = false

        List<Integer> ages = new ArrayList<>();
        boolean isEmpty2 = ages.isEmpty();
        System.out.println("isEmpty2 = " + isEmpty2); //isEmpty2 = true


        //Example 1: numbers ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz

        List<Integer> numbers = new ArrayList<>();

        numbers.add(9);
        numbers.add(8);
        numbers.add(12);
        numbers.add(15);
        numbers.add(19);
        numbers.add(20);

        System.out.println(numbers);

        //1.Yol

        int idx = 0;

        for (Integer w : numbers) {
            if (w % 2 == 1) {
                numbers.set(idx, w + 11);
            }
            idx++;
        }
        System.out.println(numbers);

        //2.Yol : indexOf
        for (Integer w : numbers) {
            if (w % 2 == 1) {
                numbers.set(numbers.indexOf(w), w + 11);
            }
        }
        System.out.println(numbers);

        // 4)List'lerden eleman nasil silinir?


        //Example 2: nums ArrayList'inden 52 rakaminin görünümünü siliniz

        System.out.println("nums = " + nums);

//        nums.remove(52);
//        System.out.println("nums = " + nums);

        /*
            remove() methodunun icerisine tamsayi yazarsaniz Java bunu index kabul eder.
            Silinecek eleman olarak algilanmaz.

            Tüm tamsayilar aksi belirtilmedikce primitive int'dir.
            Primitive Data Type'lari da ArrayList'lerin elemani olamazlar
            Primitive Data Type'larini Wrapper class'a cevirmeliyiz

         */

        Integer sayi = 52;
        nums.remove(sayi);

        System.out.println("nums = " + nums);

        System.out.println("///////////////////////////////////////");

        //Example 3:

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println("names = " + names); //names = [Tom, Thomas, Tahsin, Trump, Taceddin]
        List<String> emekliOlacaklar = new ArrayList<>();
        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");
        names.removeAll(emekliOlacaklar);

        System.out.println("emekliOlacaklar = " + emekliOlacaklar);//emekliOlacaklar = [Thomas, Tahsin, Trump]
        System.out.println("names = " + names);  //names = [Tom, Taceddin]

        System.out.println("///////////////////////////////////////");

        //Example 4:
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        System.out.println("a = " + a);
        a.remove("Shoes");
        System.out.println("a = " + a);

    }
}
