package ssg.ssq29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedListDataTuru {

    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();
        List<Integer> ll = new LinkedList();

        Queue<String> ll3 = new LinkedList();

        Deque<String> ll4 = new LinkedList();

        ll2.add("Sibel");

        ll2.add("Beşir");
        ll2.add("Busra");
        ll2.add("Mirhan");
        ll2.add(2, "furkan");
        System.out.println(ll2);//[Sibel, Beşir, Busra, Mirhan]
        ll2.remove(3);//Busra
        //eger listemiz integer elementlerde olusuyor olsaydi direkt sayiyiy yazarsak index olarak kabul edicek
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        // System.out.println(ll);//[1, 2, 3, 4, 5, 6]
        // System.out.println(ll.remove((Integer) 2));//true
        // System.out.println(ll);//[1, 3, 4, 5, 6]
        // System.out.println(ll.remove(2));//4
        // System.out.println(ll);//[1, 2, 3, 4, 6]
        List<String> lll = new LinkedList();
        lll.add("Sibel");
        lll.add("Beşir");
        // ll2.add("Busra");
        lll.add("Mirhan");
        lll.add(3, "furkan");
        System.out.println(ll2);
        System.out.println(lll);
        System.out.println(ll2.retainAll(lll));
        System.out.println(ll2);
    }
}
