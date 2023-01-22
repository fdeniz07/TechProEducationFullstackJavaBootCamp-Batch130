package day31collections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
        1)Interface'lerden object olusturulamaz. Cünkü interface'lerin constructor'i yoktur.
        2)Abstract class'lardan object olusturulamaz.Constructor'lari vardir ama constructor object olusturmada kullanilamaz.
        3)Interfadce'lerin constructor'lari olmadigindan, collection olustururken interface isimleri "new" keyword'unden sonra kullanilamaz.
        4) *class-->class==>extends
           class-->interface==>implements
           *interface-->interface==> extends
           interface -->class==> bu mumkun degildir

        5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar o yuzden eleman silme ve ekleme islemleri coklukla
          yapilacaksa ArrayList kullanmak tavsiye edilmez.
        6)LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki Node'a "Tail" denir.
        7)LinkedList'ler yapiları dolayisiyla index kullanmadıklarından, eleman silmede ve eklemede re-index yapilmasına gerek yoktur.
           Bu da LinkedList'leri eleman ekleme ve silmede çok başarılı hale getirir, bu yüzden eleman ekleme ve silmenin çok yapılması
           gereken durumlarda LinkedList kullanmak tavsiye edilir.
        8)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
        9)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
         bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.


     */

    public static void main(String[] args) {

        LinkedList<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");//"addLast()" is equivalent to "add()".
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(3, "Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda"); //Ilk Ajda'yi siler
        System.out.println(names);//[Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon]

        names.remove(4);
        System.out.println(names); //[Cuneyt, Steve, Carl, Suleyman, Megan, Brandon]

        names.add("Süleyman");
        System.out.println(names); //[Cuneyt, Steve, Ajda, Suleyman, Megan, Brandon, Süleyman]

        String r1 = names.remove();//Retrieves and removes the first element of this list.
        System.out.println(r1);//Cuneyt
        System.out.println(names);//[Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

        //removeFirstOccurrence() ==> Belirtilen öğenin bu listedeki ilk örneğini kaldırır.
        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman,Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        //Retrieves, but does not remove, the head (first element) of this list. (Copy + Paste)
        //Returns: the head of this list, or null if this list is empty
        //Ilk elemani silmeden size verir
        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Carl, Megan, Brandon, Süleyman]


        //Retrieves and removes the head first element of this list.(Cut + Paste)
        //Returns:the head of this list, or null if this list is empty
        //remove() bos LinkedList'te kullanilirsa "hata verir", poll() bos LinkedList'te kullanilirsa "null" verir.
        names.poll();


        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        names.pop();
    }
}

























































