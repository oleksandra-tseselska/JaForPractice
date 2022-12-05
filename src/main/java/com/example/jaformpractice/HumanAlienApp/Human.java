package com.example.jaformpractice.HumanAlienApp;

public class Human implements IBeing{

    private int eatingLimit;

    public void setEatingLimit(int eatingLimit){
        this.eatingLimit = eatingLimit;
    }

    public int getEatingLimit(){
        return eatingLimit;
    }
    public Human(){
        setEatingLimit(3);
    }

    @Override
    public String toString() {
        return "Human has been fed "+getEatingLimit()+" times";
    }
}
