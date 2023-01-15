package practice.advanced_practice.practice08;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Bakkal {

/*
        Bakkal günlük gelir programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
   */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static double toplamKazanc=0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun =0;
        while (gun<7){
            System.out.println(gunler.get(gun)+" gününün kazancını giriniz");
            double kazanc = input.nextDouble();
            gunlukKazanclar.add(kazanc);
            toplamKazanc +=kazanc;
            gun++;
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Günlük Kazançlar: "+gunlukKazanclar);
        System.out.println("Toplam Kazanç: "+toplamKazanc);
        System.out.println("Ortalama Gelir: "+decimalFormat.format(ortalamGelir()));
        System.out.println("Ortalama Üstü Günler: "+ortlamaUstuGunler());
        System.out.println("Ortalama Altı Günler: "+ortlamaAltiGunler());
        System.out.println("Ortalama Gelirli Günler: "+ortlamaGunler());
    }

    static double ortalamGelir(){
        return toplamKazanc/7;
    }

    static String ortlamaUstuGunler(){
        String ortalamaUstuGunler ="";
        for(int i=0; i<7; i++){
            if(gunlukKazanclar.get(i)>ortalamGelir()){
                ortalamaUstuGunler+=gunler.get(i)+" ";
            }
        }
        return ortalamaUstuGunler;
    }

    static String ortlamaAltiGunler(){
        String ortalamaAltiGunler ="";
        for(int i=0; i<7; i++){
            if(gunlukKazanclar.get(i)<ortalamGelir()){
                ortalamaAltiGunler+=gunler.get(i)+" ";
            }
        }
        return ortalamaAltiGunler;
    }

    static String ortlamaGunler(){
        String ortalamaGunler ="";
        for(int i=0; i<7; i++){
            if(gunlukKazanclar.get(i)==ortalamGelir()){
                ortalamaGunler+=gunler.get(i)+" ";
            }
        }
        return ortalamaGunler;
    }
}
