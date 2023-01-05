package day20passbyvaluemethodoverloading;

public class PassByValue02 {

    public static void main(String[] args) {

        String name = "Tom Hanks";

        String updatedName = updateName(name,"Jr.");

        System.out.println(name);//Tom Hanks
        System.out.println(updatedName);//Tom Hanks Jr.

        name = updateName(name,"Jr.");
        System.out.println(name);//Tom Hanks Jr.

    }


    public static String updateName(String name, String add) {

        name = name + " " + add;

        return name;
    }
}
