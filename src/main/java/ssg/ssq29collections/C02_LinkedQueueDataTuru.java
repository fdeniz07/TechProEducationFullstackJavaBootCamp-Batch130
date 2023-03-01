package ssg.ssq29collections;

import java.util.LinkedList;
import java.util.Queue;

public class C02_LinkedQueueDataTuru {

    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList<>();
        ll3.add("Sibel");
        ll3.add("Beşir");
        ll3.add("Busra");
        ll3.add("Mirhan");

        //kuyruk sondan eklenir bastan silinir
        System.out.println(ll3);//[Sibel, Beşir, Busra, Mirhan]
        ll3.remove("Busra");
        ll3.remove();
        System.out.println(ll3);//[Sibel, Beşir, Mirhan]
        System.out.println(ll3.peek());//Beşir
        System.out.println(ll3.element());//Beşir
        Queue<String> ll = new LinkedList();
        System.out.println(ll.peek());//null
        //System.out.println(ll.element());//throws exception NoSuchElementException
        System.out.println(ll3.poll());//Beşir sildigini elemani dondurdu //bastan siler
        //System.out.println(ll.remove());//throws exception NoSuchElementException
        System.out.println(ll.poll());//null
        System.out.println(ll3);//[Mirhan]
        ll3.offer("Ahmet");
        ll3.offer("Mirhan");
        System.out.println(ll3);

    }
}
