package com.example.jaformpractice.collections;

/*
    Create a class User which implements
    comparable.
    FIELDS: firstname, lastname, age, height

    sort by these fields in the same order
 */


import com.example.jaformpractice.BlackKnight;

public class User implements  Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;
    private int height;

    public User (String firstName, String lastName, int age, int height){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int compareTo(User user){
        int amount = 0;
        int result = 0;

        do{
            result = (int)this.firstName.charAt(amount) - (int)user.firstName.charAt(amount);
            amount++;
        } while (checkResultLength(amount, result, user));

        result = checkFirstNameLength(result, user);

        if(result == 0){
            do{
                result = (int)this.lastName.charAt(amount) - (int)user.lastName.charAt(amount);
                amount++;
            } while (checkResultLength(amount, result, user));
        }

        result = checkLastNameLength(result, user);

        if(result == 0){
            result = this.age - user.age;
        }

        if(result == 0) {
            result = this.height - user.height;
        }

        return result;
    }

    private int checkFirstNameLength(int result, User user){
        if(result == 0 && this.firstName.length() < user.firstName.length()){
            result = -1;
        } else if(result == 0 && user.firstName.length() < this.firstName.length()){
            result = 1;
        }

        return result;
    }

    private int checkLastNameLength(int result, User user){
        if(result == 0 && this.lastName.length() < user.lastName.length()){
            result = -1;
        } else if(result == 0 && user.lastName.length() < this.lastName.length()){
            result = 1;
        }

        return result;
    }

    private boolean checkResultLength(int amount, int result, User user){
        return (result == 0 && (amount < (this.firstName.length() - 1)) && (amount < (user.firstName.length() - 1)));
    }

    @Override
    public String toString() {
        return "User{ "+ firstName + " " + lastName + " " + age + " " + height + " " + "}";
    }
}
