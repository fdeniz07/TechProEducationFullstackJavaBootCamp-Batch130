package exercises;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Question1:


        //Question2:

        //Question3:
        char arrCh[] = {'a', 'C', 'c', 'A', 'b'};

        Arrays.sort(arrCh);

        System.out.println(arrCh); //ACabc

        // Not: Aşağıdakilerden hangisi verilen Arrays'in en büyük elemanını consoleda yazdırır?() yöntem parantezine array'in adını yazarsanız, array elemanları artan sırada sıralanacaktır.


        //Question4:
        //Not: Dizinin adını method'un() yöntem parantezine yazarsanız, array öğeleri artan düzende sıralanır.

        int arr[] = {2, 11, 0, 23, 7};

        Arrays.sort(arr);

        for (int i = 4; i >= 0; i--) {

            System.out.print(arr[i] + " ");

        }

        //Ekran ciktisi nedir? //23 11 7 2 0


        //Question5:

        int arr3[] = new int[3];

        System.out.println(arr3[1]); // NOTE: *** array int oldugu icin 0 yazdirir. String olsa idi null , char olsa idi bos(hcilik) yazdirirdi


        arr3[0] = 11;

        arr3[1] = 12;

        System.out.println(Arrays.toString(arr3));
        // Ekran ciktisi nedir? //0
                                // [11, 12, 0]

        //Question6:
        int arr4[] = {3, 2, 3, 4, 4, 5};

        int count = 0;

        for(int i=0; i<arr4.length; i++) {

            if(arr4[i]==3) {

                count++;

            }

        }
        System.out.println(Arrays.toString(arr4)); //2



       // Ekran ciktisi nedir?

        //Question7:
        char arr5[] = new char[4];

        arr5[0] = 'A';

        arr5[2] = 'E';

        arr5[3] = 'M';

        System.out.println(Arrays.toString(arr5));

        //Ekran ciktisi nedir? //[A,  , E, M]



        //Question8:
        int x[] = { 3, 5, 7 };

        int a = 0;

        int b = 0;

        while (a < x.length) {

            b = b + x[a];

            a++;

        }

        System.out.println(b);

//Question9:


        //Question9:



    }


}
