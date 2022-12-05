package com.example.jaformpractice.HomeWork_02_12_22;

/*
            Users => name, balance
            Sales => records per user

            get all users sorted by  name
            get all users sorted by  balance ASC
            get all users sorted by most paying DESC
         */

import java.util.*;
import java.util.stream.Collectors;

public class User  implements  Comparable<User>{
    private String name;
    private Double balance;

    private Double acquisition;

    public static List<User> users = new ArrayList<>();

    public Map<String, List<User>> sortUsers = new HashMap();

    public void sortUsersInMap(){

        for(User user: User.users){
            if(!sortUsers.containsKey(user.getName())){
                List<User> users1 = new ArrayList<>();
                users1.add(user);
                sortUsers.put(user.getName(), users1);
            }else{
                sortUsers.get(user.getName()).add(user);
            }
        }

        for (Map.Entry<String, List<User>> entry : sortUsers.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue().toString());
    }
    public User (String name, Double balance){
        this.name = name;
        this.balance = balance;
        this.acquisition = 0.00;
    }
    public User (String name){
        this.name = name;
        this.balance = 0.00;
        this.acquisition = 0.00;
    }
    public User (){}

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getAcquisition() { return acquisition; }

    public void setAcquisition(Double acquisition) { this.acquisition = acquisition; }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void createUser(User user){
        User.users.add(user);
    }

    public void sortByName() {
        Collections.sort(User.users);
        for(User user: User.users){
            System.out.println(user.toString());
        }
    }

    public void sortByBalance(){
        users.sort(Comparator.comparing(User::getBalance));
        for(User user: User.users){
            System.out.println(user.toString());
        }

//
//        users.sort(Collections.reverseOrder());
//
//        for(User user: User.users){
//            System.out.println(user.toString());
//        }
    }

    public void sortByBays(){
        users.sort(Comparator.comparing(User::getAcquisition));
        for(User user: User.users){
            System.out.println(user.toString());
        }

//        users.sort(Collections.reverseOrder());

//        for(User user: User.users){
//            System.out.println(user.toString());
//        }
    }

    @Override
    public String toString() {
        return "User{ "+ name + "'s balance is " + balance +". Your bought is " + acquisition +" }";
    }

    public int compareTo(User user){
        int amount = 0;
        int result = 0;

        do{
            result = (int)this.name.toLowerCase().charAt(amount) - (int)user.name.toLowerCase().charAt(amount);
            amount++;
        } while (checkResultLength(amount, result, user));

        result = checkNameLength(result, user);


        return result;
    }

    private boolean checkResultLength(int amount, int result, User user){
        return (result == 0 && (amount < (this.name.length() - 1)) && (amount < (user.name.length() - 1)));
    }

    private int checkNameLength(int result, User user){
        if(result == 0 && this.name.length() < user.name.length()){
            result = -1;
        } else if(result == 0 && user.name.length() < this.name.length()){
            result = 1;
        }

        return result;
    }

    public static List<User> userGeneric = new ArrayList<>();

    public static <T> Box<T> createBoxedObject(T t){
        Box<T> newBox = new Box<T>();
        newBox.setItem(t);

        return newBox;
    }

    public static void main(String[] args){
        Box<User> newBoxUser = createBoxedObject(new User("Sam"));
    }

}
