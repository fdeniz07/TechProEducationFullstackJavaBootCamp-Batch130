package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

    /*
        Iterator'lar Loop'ların yaptığı işi yapar.
        Iterator'lar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
        Javanın Iterator'ları ortaya çıkarma sebebi sonsuz Loop(inifinite Loop) tehlikesini bitirmektir.
        Iterator'larda sonsuz loop yoktur.Iterator'lar Java tarafından sonradan oluşturulmuşlardır. Loop'ların yaptıkları bütün işlemleri yapabilirler.
        Loop'lar ile Iterator'in performans farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarilidirlar.

        Iki tip Iterator var:
        1) Iterator : Sadece eleman'lari remove edebilirsiniz --> Sifreleri bir yerden kaldirmak icin kesinlikle Iterator kullanilir. Kesinlik update edilemezler.
                      Sadece sol'Dan saga calisir, Foreach loop gigi tek yönlü calisirlar.
        2) ListIterator : Eleman'i remove etme, update etme ve add etme  yapabilirsiniz
                          Hem soldan saga hem de sagdan sola calisabilir, yani cift yönlüdür.
    */


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        Iterator<String> itr1 = list1.iterator();
        while (itr1.hasNext()) {

            itr1.next();

            itr1.remove();
        }
        System.out.println();

        //ListIterator
        //Example 1:
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);

        ListIterator<String> listItr = list2.listIterator();

        while (listItr.hasNext()){

            String el = listItr.next();

            listItr.set(el+"!"); //Concatination
        }
        System.out.println(list2); //[Ali!, Can!, Aliye!]


        //Example 2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listItr2= list3.listIterator(); //[Ali, Can, Aliye]

        while (listItr2.hasNext()){
            listItr2.next();
        }

        while (listItr2.hasPrevious()){

            String el = listItr2.previous();

            System.out.print(el + " <=="); //Aliye <==Can <==Ali <==

        }
    }
}
