package com.example.jaformpractice.collections;

// volvo == VOLVO // true
// "mazda" == " maZda " // true

import com.example.jaformpractice.BlackKnight;

import java.util.*;


//
public class ClassWork281122 {
    public static void main(String[] args){
        Car car1 = new Car("mazda", Type.COUPE);
        Car car2 = new Car(" maZda ", Type.COUPE);

        System.out.println(car1.equals(car2));

        Set<Car> cars = new HashSet<>();
        cars.add(car1);

        System.out.println(cars.contains(new Car(" \nmaZda ", Type.COUPE)));

        Integer x = 3;
        System.out.println(x.compareTo(2));
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(4));

        Comparator<Integer> integerComparator = Comparator.naturalOrder();
        System.out.println(integerComparator.compare(3,2));
        System.out.println(integerComparator.compare(3,3));
        System.out.println(integerComparator.compare(3,4));

        List<BlackKnight> knights = new ArrayList<>();

        BlackKnight knight1 = new BlackKnight("sam");
        BlackKnight knight2 = new BlackKnight("jon");
        BlackKnight knight3 = new BlackKnight("samson");
        BlackKnight knight4 = new BlackKnight("  simon");
        BlackKnight knight5 = new BlackKnight("siMson");
        BlackKnight knight6 = new BlackKnight("samuEl");
        BlackKnight knight7 = new BlackKnight("  San   ");
        BlackKnight knight8 = new BlackKnight("san set");
        BlackKnight knight9 = new BlackKnight();
        BlackKnight knight10 = new BlackKnight("sim");

        knights.add(knight1);
        knights.add(knight2);
        knights.add(knight3);
        knights.add(knight4);
        knights.add(knight5);
        knights.add(knight6);
        knights.add(knight7);
        knights.add(knight8);
        knights.add(knight9);
        knights.add(knight10);

        Collections.sort(knights, new Comparator<BlackKnight>() {
            @Override
            public int compare(BlackKnight k1, BlackKnight k2) {
                byte result = 0;
                int length;

                String k1Name = k1.getName().trim().toLowerCase();
                String K2Name = k2.getName().trim().toLowerCase();

//                if(k1Name.equals(null) || K2Name.equals(null)) { throw new RuntimeException(); }

                if(k1Name.length() == K2Name.length() || k1Name.length() < K2Name.length()){
                    length = k1Name.length();
                } else {
                    length = K2Name.length();
                }

                for(int i = 0; i < length; i++){
                    if(result == 0){
                        if((int)k1Name.charAt(i) - (int)K2Name.charAt(i) < 0){
                            result = -1;
                        }else if((int)k1Name.charAt(i) - (int)K2Name.charAt(i) > 0){
                            result = 1;
                        }else {
                            result = 0;
                        }
                    }else {
                        return result;
                    }
                }

                if(result == 0 && (length < k1Name.length() || length < K2Name.length())){
                        if(k1Name.length() < K2Name.length()){
                            result = -1;
                        }else {
                            result = 1;
                        }
                    }

                return result;
            }
        });

        Collections.sort(knights);

        for(BlackKnight knight: knights){
            System.out.println(knight.getName());
        }
    }
}
