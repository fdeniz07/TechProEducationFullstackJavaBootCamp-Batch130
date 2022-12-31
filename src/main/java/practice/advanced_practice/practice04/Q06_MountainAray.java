package practice.advanced_practice.practice04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06_MountainAray {

    /*
Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
*/
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,0,5,4,3,2,1};

        //Array'i List'e çevir:
        List<Integer> list = new ArrayList<>();
        for (int w : arr) {
            list.add(w);
        }
        System.out.println("list = " + list);

        //Max değeri bul
        int max = list.get(0);
        for (int w : list) {
            if (w > max) {
                max = w;
            }
        }
        System.out.println("max = " + max);

        //List1
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                break;
            }
            list1.add(list.get(i));
        }
        System.out.println("list1 = " + list1);

        //List2
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (i < list.indexOf(max)) {
                continue;
            }

            list2.add(list.get(i));
        }
        System.out.println("list2 = " + list2);

        //Yedekleyip sırala
        List<Integer> list1Copy = new ArrayList<>(list1);
        List<Integer> list2Copy = new ArrayList<>(list2);

        Collections.sort(list1Copy);
        Collections.sort(list2Copy);
        Collections.reverse(list2Copy);
        System.out.println("list1Copy = " + list1Copy);
        System.out.println("list2Copy = " + list2Copy);

        //Kontrol
        if(list1.equals(list1Copy)&&list2.equals(list2Copy)){
            System.out.println("Mountain Array");
        }else {
            System.out.println("Mountain Array DEĞİL");
        }
    }
}
