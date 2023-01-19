package day28exceptions;

public class C03_Exceptions {

    /*
        3) ArrrayIndexOutOfBoundExceptions
     */

    //Bir String Arrayden verilen index'deki datayi donduren bir method olusturun

    public static void main(String[] args) {
        String arr[] = {"Ali", "Can", "Tarik", "Ayse"};

        getElementFromArray(arr, 2);//positiveScenario
        getElementFromArray(arr, 0);//Ali
        getElementFromArray(arr, 4);

    }

    private static void getElementFromArray(String[] arr, int i) {

        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array'in indexinde olmayan data istendi ==> " + e.getMessage());
            e.printStackTrace();
            System.err.println("Burasi Renkli Aciklama");
        }
    }
}



