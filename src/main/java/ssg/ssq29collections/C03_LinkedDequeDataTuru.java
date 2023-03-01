package ssg.ssq29collections;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedDequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        ll4.add("Sibel");
        ll4.add("Beşir");
        ll4.add("Busra");
        ll4.add("Busra");
        ll4.add("Busra");
        ll4.add("Mirhan");
        ll4.add("Busra");
        System.out.println(ll4);
        ll4.removeLastOccurrence("Busra");
        System.out.println(ll4);
        System.out.println(ll4.pop());//en bastaki degeri dondurur

    }
}
