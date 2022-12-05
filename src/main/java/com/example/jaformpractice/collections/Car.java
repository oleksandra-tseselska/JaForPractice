package com.example.jaformpractice.collections;

// create a class Car with fields name and type (enum for automatic and manual)
// and implement the equals and hashCode methods

// volvo == VOLVO // true
// "mazda" == " maZda " // true


public class Car {
    private String name;
    private Type type;

    public Car(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public  Car(){
        this.name = "Anonymous car";
        this.type = Type.OTHER;
    };

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String carNameForCompering(String name){
        return name.toLowerCase().replaceAll("\\s+", "");
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true; // check for self
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;


        return (carNameForCompering(name).equals(carNameForCompering(car.name))) &&
                (type.equals(car.type));
    }

    @Override
    public int hashCode(){
        int result = 31 * carNameForCompering(name).hashCode() +
                type.hashCode();

        return result;
    }
}
