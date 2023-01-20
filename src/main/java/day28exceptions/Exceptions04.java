package day28exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        String[] arr = {"A", "G", "M", "L"};

        getElementFromArray(arr, 1);
        getElementFromArray(arr, 5);
        System.out.println("Hi!");

    }

    //Array'lerde olmayan bir index kullanildiginda Java ArrayIndexOutOfBoundsException atar.
    public static void getElementFromArray(String[] s, int idx) {

        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }
}
