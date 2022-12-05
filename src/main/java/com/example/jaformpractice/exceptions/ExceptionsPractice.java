package com.example.jaformpractice.exceptions;

import com.example.jaformpractice.BlackKnight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsPractice {
    RuntimeException runtimeException; // unchecked exceptions
    Exception exception; // checked exceptions

    public static void main(String[] args) {
//        try{
//            thisThrowsException();
//        }catch (FileNotFoundException ex){
//            ex.printStackTrace();
//        }finally {
//            System.out.println("Operation completed!");
//        }
//
//        System.out.println("Hi");

        Throwable throwable = new Throwable();
        SdaException sdaException = new SdaException("something wrong", throwable);

        IllegalAddressException illegalAddressException = new IllegalAddressException("999 @^&^&^*");

        throw illegalAddressException;
    }

    public static void thisThrowsException() throws FileNotFoundException {
        // we try to access valur of variable which is null
        BlackKnight[] knights = {};

        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader("../../file.txt"));

        System.out.println("Hello "+knights[0]);

    }
}
