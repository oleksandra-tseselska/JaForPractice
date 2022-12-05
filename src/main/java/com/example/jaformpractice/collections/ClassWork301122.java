package com.example.jaformpractice.collections;

import com.example.jaformpractice.BlackKnight;

import java.util.*;

public class ClassWork301122 {
    public static void main(String[] args){

        User user1 = new User("Kate", "White",  34, 168);
        User user2 = new User("Ann", "Black",  34, 190);
        User user3 = new User("Ann", "Wood",  34, 190);
        User user4 = new User("Ann", "Wood",  34, 170);
        User user5 = new User("An", "Wood",  35, 169);
        User user6 = new User("Ann", "Wood",  35, 169);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        Collections.sort(users);
        for(User user: users){
            System.out.println(user.toString());
        }


        int result = Arrays.binarySearch(new int[]{1, 2, 5, 7, 16}, 7);
        System.out.println(result);

        Integer[] arr = new Integer[]{1, 2, 5, 7, 16};
        List<Integer> result1 = Arrays.asList(arr);

        int[] arr1 = new int[]{1, 2, 5, 7, 16};
        int[] arr2 = new int[]{1, 2, 5, 7, 16};

        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr2));

        int[] arr3 = new int[]{1, 2, 5, 7, 16};
        int[] arr4 = new int[]{1, 2, 6, 7, 16};

        System.out.println(Arrays.compare(arr3, arr4));
        System.out.println(Arrays.equals(arr3, arr4));

        int[] copiedArr1 = Arrays.copyOf(arr1, 3);
        int[] copiedArr2 = Arrays.copyOf(arr1, arr.length + 1);
        System.out.println(Arrays.toString(copiedArr1));
        System.out.println(Arrays.toString(copiedArr2));

        int[] arr5 = new int[]{11, 25, 69, 17, 16};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));


// text below about this List and Map
        List<String> list = Collections.emptyList();
        Map<String, Integer> map = Collections.emptyMap();

//        list.add("sam");  This list and map is empty, you can't add value here

        List<Integer> list1 = Arrays.asList(new Integer[]{1,34,56,67,78,89});
        System.out.println(Collections.min(list1, Collections.reverseOrder())); // get value in index [0]


        /*
            Users => name, balance
            Sales => records per user

            get all users sorted by  name
            get all users sorted by  balance ASC
            get all users sorted by most paying DESC
         */



    }
}
