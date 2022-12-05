package com.example.jaformpractice.HomeWork_05_12_22;

import java.util.ArrayList;

public class MyMap <K, V>{
    private K key;
    private V value;
    private int index;

    private int length = 0;
    private MyMap myMap;

    private ArrayList indexes = new ArrayList<>();
    private ArrayList<K> keys = new ArrayList<>();
    private ArrayList<V> values = new ArrayList<>();

    private MyMap(K key, V value, int index){
        this.key = key;
        this.value = value;
        this.index = index;
    }

    public MyMap(){}

    private K getKey(){
        return key;
    }

    private V getValue() {
        return value;
    }

    private int getIndex() {
        return index;
    }

    private void setKey(K key) {
        this.key = key;
    }

    private void setValue(V value) {
        this.value = value;
    }

    private void setIndex(int index){
        this.index = index;
    }

    public int size(){
        return this.length;
    }
    public void put(K key, V value){
        if(keys.contains(key)){
            removeKayValueFromLists(key);
            putKayValueToLists(key, value);
        }else {
            this.length  += 1;
            this.index += 1 ;
            myMap = new MyMap(key, value, index);
            putKayValueToLists(key, value);
        };
    }

    private void putKayValueToLists(K key, V value){
        values.add(value);
        keys.add(key);
    }

    private void removeKayValueFromLists(K key){
        for(int i = 0; i < length - 1; i++){
            if(keys.get(i) == key){
                values.remove(i);
                keys.remove(i);
            }
        }
    }

    public V getValueByKey(K key){
        V valueInput = values.get(0);

            if(keys.contains(key)){
                int index = keys.indexOf(key);
                valueInput =  values.get(index);
            }

        return valueInput;
    }


    public void toDisplay() {
        for(int i = 0; i < length; i++){
            System.out.println("MyMap { Key: "+keys.get(i)+", Value: "+values.get(i)+" }");
        }
    }
}

