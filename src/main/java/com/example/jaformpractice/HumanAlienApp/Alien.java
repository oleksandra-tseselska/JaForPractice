package com.example.jaformpractice.HumanAlienApp;

public class Alien implements IBeing {

    private int eatingLimit;

    public void setEatingLimit(int eatingLimit){
        this.eatingLimit = eatingLimit;
    }

    public int getEatingLimit(){
        return eatingLimit;
    }
    public Alien(){
        setEatingLimit(3);
    }

    @Override
    public String toString() {
        return "Alien has been fed "+getEatingLimit()+" times";
    }
}
