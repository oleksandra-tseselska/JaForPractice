package com.example.jaformpractice;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlackKnight implements  Comparable<BlackKnight>{
    private Byte arms = 2;
    private Byte legs = 2;
    private Byte head = 1;
    private Boolean alive = true;
    private String name;

    public static Integer numOfAliveKnights = 0;
    public static Integer numOfDeadKnights = 0;

    private static  int DEFAULT_KNIGHT_LIST_SIZE = 10;

    public static BlackKnight[] allKnights  = new BlackKnight[DEFAULT_KNIGHT_LIST_SIZE];

    public String getName() {
        return name;
    }

    public Byte getArms() {
        return arms;
    }

    public Byte getLegs() {
        return legs;
    }

    public Byte getHead() {
        return head;
    }

    public Boolean isAlive() {
        return alive;
    }

    public void cutOfArm() {
        arms--;
    }

    public void cutOfLeg() {
        legs--;
    }

    public void cutOfHead() {
        head--;
    }

    @Override
    public String toString() {
        return "BlackKnight { " + "\n" +
                "name: " + name + "\n" +
                "arms: " + arms + "\n" +
                "legs: " + legs + "\n" +
                "head: " + head + "\n" +
                "alive: " + alive + "\n" +
                "}";
    }

    public void strike() {
        if (alive) {
            if (arms > 0) {
                cutOfArm();
            } else if (legs > 0) {
                cutOfLeg();
            } else {
                cutOfHead();
                alive = !alive;
                numOfAliveKnights--;
                numOfDeadKnights++;
            }
        } else {
            System.out.println("Stop! He's already dead");
        }
    }

    public BlackKnight(String name) {
        this.name = name;
    }

    // constructor overload
    public BlackKnight() {
        this.name = "Anonymous Knight";
    }

    public static boolean createKnight(String name){
         BlackKnight knight = new BlackKnight(name);

        return insertKnightIntoArray(knight);
}

    public static boolean createKnight(){
        BlackKnight knight = new BlackKnight();

        return insertKnightIntoArray(knight);
    }

    public static Boolean insertKnightIntoArray(BlackKnight knight){
        for(int i = 0; i < allKnights.length; i++){
            if(allKnights[i] == null){
                allKnights[i] = knight;
                BlackKnight.numOfAliveKnights++;
                return true;
            }
        }

        return false;
    }

    public static BlackKnight getLatestKnight(){
        for(int i = 0; i < allKnights.length; i++){
            if(allKnights[i] == null){
                return allKnights[i - 1];
            }
        }

        return allKnights[DEFAULT_KNIGHT_LIST_SIZE - 1];
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true; // check for self
        if(o == null || getClass() != o.getClass()) return false;
        BlackKnight knight = (BlackKnight) o;


        return (arms == knight.getArms()) && // you can right in this way
                (legs == knight.legs) &&   // or in this way
                (head == knight.head) &&
                (alive == knight.alive) &&
                (name.equals(knight.name)); // this is String because we use equals
    }

    @Override
    public int hashCode(){
        int result = 31 * name.hashCode() +
                ((Byte) arms).hashCode() +
                ((Byte) legs).hashCode() +
                ((Byte) head).hashCode() +
                ((Boolean) alive).hashCode();
//        Integer.hashCode(arms) ??? it works why we use ((Byte) arms).hashCode()

        return result;
    }

    @Override
    public int compareTo(BlackKnight knight){
        return  this.name.charAt(0) -knight.name.charAt(0);
    }
}
