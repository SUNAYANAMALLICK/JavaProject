package core.collectionsfunctionality;

import java.util.*;

public class Main {



    public static void arrayListExample(){

        // Creating an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements
        System.out.println("First element: " + arrayList.get(0));

        // Iterating over the ArrayList
        System.out.println("ArrayList elements:");
        arrayList.stream().forEach(System.out::println);

//        for (String fruit : arrayList) {
//            System.out.println(fruit);
//        }

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("After removal: " + arrayList);


    }

    public static void linkedListExample(){
        // Creating a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");

        // Accessing elements
        System.out.println("First element: " + linkedList.get(0));

        // Iterating over the LinkedList
        System.out.println("LinkedList elements:");
        linkedList.stream().forEach(System.out::println);

//        for (String fruit : arrayList) {
//            System.out.println(fruit);
//        }

        // Removing an element
        linkedList.remove("Cat");
        System.out.println("After removal: " + linkedList);
    }

    public static void hashSetExample(){
        // Creating a HashSet
        Set<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red"); // Duplicate element

        // Iterating over the HashSet
        System.out.println("HashSet elements:");
        hashSet.stream().forEach(System.out::println);

//        for (String color : hashSet) {
//            System.out.println(color);
//        }

        // Removing an element
        hashSet.remove("Green");
        System.out.println("After removal: " + hashSet);
    }
    public static void main(String[] args) {
    // A List is an ordered collection that allows duplicate elements.
    // Common implementations include ArrayList, LinkedList, and Vector.
        //
        // ArrayList: Resizable-array implementation of the List interface.
        arrayListExample();

        linkedListExample();

        hashSetExample();







    }
}
