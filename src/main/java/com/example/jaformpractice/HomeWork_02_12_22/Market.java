package com.example.jaformpractice.HomeWork_02_12_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Market {
    public static void main(String[] args){

        User users = new User();

        users.createUser(new User("Kate"));
        users.createUser(new User("John",100.00));
        users.createUser(new User("Ann", 456.67));
        users.createUser(new User("Peter", 5.00));
        users.createUser(new User("Jo", 45.99));
        users.createUser(new User("Jo", 7.00));

//        users.sortByName();
////        users.sortByBalance();

        Sales sales = new Sales();
        sales.newSale("Kate", 30.00);
        sales.newSale("John", 30.00);
        sales.newSale("Jo", 5.99);


//        users.sortByBalance();
        System.out.println("\n");
//        users.sortByBays();

        users.sortUsersInMap();

        Box<User> box = new Box<>();
         box.setItem(new User("Sam"));

        Box box2 = new Box<User>(); // we can do like that too, this is not mistake


//        MetalBox
    }
}
