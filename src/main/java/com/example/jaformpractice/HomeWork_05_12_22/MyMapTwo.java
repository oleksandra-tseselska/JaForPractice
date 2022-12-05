package com.example.jaformpractice.HomeWork_05_12_22;

import com.example.jaformpractice.BlackKnight;

import java.util.ArrayList;

public class MyMapTwo <K, V> {
    private K key;
    private V value;
    private Integer length;
    public MyMapTwo[] myMapTwo = new MyMapTwo[10];

    private MyMapTwo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public MyMapTwo() {
    }

    private K getKey() {
        return key;
    }

    private V getValue() {
        return value;
    }

    private int getLength() {
        return length;
    }

    private void setKey(K key) {
        this.key = key;
    }

    private void setValue(V value) {
        this.value = value;
    }

    private void setLength(Integer length) {
        this.length = length;
    }

    //    public int size(){
//        return this.length;
//    }
    public void put(K key, V value) {
        if (myMapTwo == null) {
            setLength(getLength() + 1);
            myMapTwo[0] = new MyMapTwo(key, value);
        } else {
            for (int i = 0; i < myMapTwo.length; i++) {
                if (myMapTwo[i] == null) {
                    myMapTwo[i] = new MyMapTwo(key, value);
                    BlackKnight.numOfAliveKnights++;
                }
            }
        }

    }

        public void toDisplay () {
            for (int i = 0; i <= myMapTwo.length; i++) {
                System.out.println("MyMap { Key: " + myMapTwo[i].getKey() + ", Value: " + myMapTwo[i].getValue() + " }");
            }
        }

}
