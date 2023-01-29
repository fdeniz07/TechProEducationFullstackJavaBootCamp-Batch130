package exercises;

import practice.regular_practice.practiceDTNT.practice07.MyExceptions;

import java.io.IOException;


public class TryCatchExample {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch (MyException ne){
            System.out.println("A");
        }
    }

    public static void  method1(){
//        try{
//            throw 3>10 ? new MyExceptions() : new IOException();
//        }
//        catch(IOException ie){
//            System.out.println("I");
//        }
//        catch (Exception re){
//            System.out.println("B");
//        }

    }
}
