package practice.advanced_practice.practice05;

public class Q05_Arrays_ToplamVeVeriler {

    /*
       Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
       {4,6,5,-10,8,5,20} ===> 10
           4 + 6 = 10
           5 + 5 = 10
         -10 + 20 = 10
   */

    public static void main(String[] args) {

        int[] arr = {4, 6, 5, -10, 8, 5, 20};
        checkSum(arr, 10);
    }


    public static void checkSum(int[] arr1, int sum) {
        int sayac = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = i + 1; j < arr1.length; j++) {

                if (arr1[i] + arr1[j] == sum) {
                    System.out.println(arr1[i] + " + " + arr1[j] + " = " + sum);
                }
                sayac++;
            }
            if (sayac == 0) {
                System.out.println("Toplama eşit sayı ikilileri bulunmamaktadır");
            }
        }

    }


}
