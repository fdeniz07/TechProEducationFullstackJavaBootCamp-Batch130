package day14arraysforeachloop;

public class Arrays04 {

    public static void main(String[] args) {

        //Example 1:String bir array olusturunuz,6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz

        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for (String w : colors) {

            if (w.equals("Yellow")) {
                break;
            }
            System.out.println(w);
        }

        System.out.println("/////////////");

        //Example 2:String bir array olusturunuz,6 eleman ekleyiniz, Yellow'dan sonraki elemanlari yazdiriniz

        String[] colors2 = new String[6];
        colors2[0] = "Red";
        colors2[1] = "Orange";
        colors2[2] = "Blue";
        colors2[3] = "Yellow";
        colors2[4] = "Green";
        colors2[5] = "Brown";

        //1.YOL
        //Note: Elemanlari son elemandan baslayacagimiz icin for-each loop kullanamayiz, bu yüzden for-loop kuulaniriz.

                                                 // [Red, Orange, Blue, Yellow, Green, Brown]
        for (int i=colors2.length-1; i>=0; i--){

            if (colors2[i].equals("Yellow")){
                break;
            }
            System.out.println(colors2[i]);
        }

        System.out.println("/////////////");

        //2.YOL
        //Yellow elemaninin index'ini bul ve o yüzden daha büyük index'e sahip olan elemanlari yazdirir.

        int counter=0;
                                   // [Red, Orange, Blue, Yellow, Green, Brown]
        for (String w:colors2){

            if (w.equals("Yellow")){
                break;
            }
            counter++;
        }

        for (int i=counter+1; i<colors2.length; i++){
            System.out.println(colors2[i]);
        }
    }
}
