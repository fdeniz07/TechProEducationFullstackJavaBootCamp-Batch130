package day29exceptions;

public class Exception02 {

    public static void main(String[] args) {

        try {
            printAge(-35);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    //throw keyword bir method'un body'si içinde istediğimiz yerde istediğimiz koşullar için Exception atmamızı sağlar.
    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }
    }
}
