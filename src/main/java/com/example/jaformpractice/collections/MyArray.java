package com.example.jaformpractice.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {
    public Integer[] myIntArray = new Integer[3];

    public MyArray (){
    }

    public void add(Integer num){
        boolean result = false;

        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] == num) {
                result = true;
            }
        }
        if(!result){
                for (int j = 0; j < myIntArray.length; j++){
                    if(myIntArray[j] == null){
                        myIntArray[j] = num;
                        return;
                    }
                }
            }
        }

    public void toDisplay(){
        for (int i = 0; i < myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }
    }
    public static void main(String[] args){
        MyArray whatIsIt = new MyArray();
        whatIsIt.add(3);
        whatIsIt.add(3);
        whatIsIt.add(7);
        whatIsIt.add(7);
        whatIsIt.toDisplay();
    }
}
