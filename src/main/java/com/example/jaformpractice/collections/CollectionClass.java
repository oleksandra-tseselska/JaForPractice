package com.example.jaformpractice.collections;

import com.example.jaformpractice.BlackKnight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.function.*;
// implement a set using an array with any size and create method to add item into array
// make array act like a set


public class CollectionClass {
    public static void main(String[] args){
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Sam");
        myHashSet.add("John");
        myHashSet.add("John");

        System.out.println("Hello");
        System.out.println("myHashSet ");

        for(String name: myHashSet){
            System.out.println(name);
        }

        TreeSet <String> myTreeSet = new TreeSet<>();
        myTreeSet.add("Sam");
        myTreeSet.add("John");
        myTreeSet.add("John");

        System.out.println("\nmyTreeSet ");
        for(String name: myTreeSet){
            System.out.println(name);
        }

        Set<Integer> numberSet = new HashSet<>();
        System.out.println("\nnumberSet ");
        System.out.println(numberSet.isEmpty());
        numberSet.add(8);
        numberSet.add(34);
        numberSet.add(856);
        numberSet.add(8);

        for(Integer number: numberSet){
            System.out.println(number);
        }
        System.out.println("\nnumberSet (ForEach):");
        numberSet.forEach((Integer num) -> System.out.print(num+ ", "));
        numberSet.forEach(System.out::println);

//        List<String> namesList = new ArrayList<>();
        List<String> namesList = new LinkedList<>();
        namesList.add("sam");
        namesList.add("andrew");

        System.out.println("\nmyLinkedArray ");
        for(String name: namesList){
            System.out.println(name);
        }

        System.out.println("Before change "+namesList.get(1));
//        System.out.println("Out of boone trows error"+ namesList.get(2));

        namesList.add(1, "Kate");
        System.out.println("After change "+namesList.get(1));

        Queue<String> queue = new LinkedList<>();
        queue.offer("sam");
        queue.offer("jacob");

        System.out.println("\nqueue ");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        Deque deque = new LinkedList();

        System.out.println("\nqClassWork ");

        // create method to add a black knight into your queue
        // when knight is dead, the knight is removed from queue and next knight is used to play

        Queue<BlackKnight> blackKnightQueue = new LinkedList<>();
        blackKnightQueue.add(new BlackKnight());
        System.out.println(blackKnightQueue.peek().toString());
        do{
            blackKnightQueue.peek().strike();
        } while (blackKnightQueue.peek().isAlive());
        System.out.println(blackKnightQueue.peek().toString());
        blackKnightQueue.poll();
//        blackKnightQueue.peek().toString();

        System.out.println("\nMap ");
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "sam");
        map.put(2, "james");
        map.put(1, "jane");
        map.put(3, "jane");
        map.put(4, "sasha");
        map.put(6, "sam");
        map.put(7, "james");
        map.put(8, "jane");
        map.put(9, "jane");
        map.put(10, "sasha");

//        map.remove(4);
        System.out.println(map.containsKey(3));

        Map<String, Integer> counter = new HashMap<>();
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            if(counter.containsKey(entry.getValue())){
                counter.replace(entry.getValue(), counter.get(entry.getValue()) + 1);
            } else {
                counter.put(entry.getValue(), 1);
            }
        }

        for (Map.Entry<String, Integer> entry: counter.entrySet()){
            System.out.println(entry.getKey()+" meets "+entry.getValue()+" times");
        }

        System.out.println(map.get(2));
//        count number of knights named a certain name
        Collection<String> ggg = map.values();
        System.out.println(frequencyMap(ggg.stream()));


// TEST
        System.out.println("\nTEST ");
        List<String> list = Arrays.asList(
                "hello", "bye", "ciao", "bye", "ciao");
        Map<String, Integer> counts = list.parallelStream().
                collect(Collectors.toConcurrentMap(
                        w -> w, w -> 1, Integer::sum));
        System.out.println(counts);

        String[] chars = { "A", "B", "C", "A", "C", "A" };
        Map<String, Long> freq = Stream.of(chars)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        System.out.println(freq);

        System.out.println(frequencyMap(list.stream()));

//        28.11.22
        System.out.println("\n22.11.22 \n");

        BlackKnight knight1 = new BlackKnight("sam");
        BlackKnight knight2 = new BlackKnight("sam");

        System.out.println(knight1 == knight2);
        System.out.println(knight1.equals(knight2)); // we Override this method in classic it returns false

        List<BlackKnight> knights = Arrays.asList(
                knight1, knight2
        );

        System.out.println(knights.contains(new BlackKnight("sam"))); // we Override equals() in classic it returns false

        Set<BlackKnight> bKnights = new HashSet<>();
        bKnights.add(knight1);
        bKnights.add(knight2);

        System.out.println(knights.contains(new BlackKnight("sam"))); // we Override this method in classic it returns false

        String str = "Techie  \t  \r  \n   Delight";

        // Заменяем последовательные пробелы одним пробелом
        str = str.replaceAll("\\s+", "");

        // или используйте следующее регулярное выражение
        // str = str.replaceAll("\s{2,}", " ");

        System.out.println(str);


    }

    static <T> Map<T, Long>  frequencyMap(Stream<T> elements) {
        return elements.collect(
                Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new, // can be skipped
                        Collectors.counting()
                )
        );
    }
}
