package com.example.jaformpractice.HomeWork_05_12_22;

public class HomeMain {
    public static void main(String[] args){
        MyMap<String, String> myMap = new MyMap<>();

        myMap.put("Sia", "Kate");
        myMap.put("Get", "Dan");
        myMap.put("3", "Homer");

        System.out.println(myMap.getValueByKey("Get"));

        myMap.toDisplay();
        System.out.println("\n After put new value with exist key");

        myMap.put("Get", "Piter");

        myMap.toDisplay();
        System.out.println("\n");

        System.out.println("Size of map is "+myMap.size());
        System.out.println("Value by key: "+myMap.getValueByKey("Get"));


//        MyMap<String, String> MyMapTwo = new MyMapTwo<>();
//
//        MyMapTwo.put("Sia", "Kate");
//        MyMapTwo.put("Get", "Dan");
//        MyMapTwo.put("3", "Homer");
//        MyMapTwo.put("Sia", "Dan");
//
//        System.out.println(MyMapTwo.getValueByKey("Get"));
//
//        MyMapTwo.toDisplay();
//        System.out.println("\n");
//
//        MyMapTwo.put("Get", "Piter");
//
//        MyMapTwo.toDisplay();
//        System.out.println("\n");

//        System.out.println(myMap.size());
//        System.out.println(myMap.getValueByKey("Get"));
    }
}
