// Hashmap
/*
 * It stores value in key value pair
 * It is a NON-LINEAR DATASTRUCTURE 
 * It internally uses hash function and hash table
 * So the set and get operation is of constant time
 */

import java.util.HashMap;
 
public class MyHashMap {
    public static void main(String[] args) {

        // Declaring the hashmap
        HashMap<String, String> dictionary = new HashMap<>();

        // set the data
        dictionary.put("Apple", "Fruit");
        dictionary.put("Ball", "Stember");

        // get the data
        System.out.println(dictionary.get("Ball"));

        dictionary.put("Cat", "Animal");
        dictionary.put("Dino","Extinct");

        for (String key : dictionary.keySet()) {
            System.out.printf("%s : %s\n",key,dictionary.get(key));
        }

        // Hashmap for section : student names
        HashMap<Character, String[]> classMap = new HashMap<>();
        String[] names = {"Abi","Arjun","Babu","Deva","Dhivin","Jayandhan","Kishor"};
        classMap.put('A', names);
        System.out.println(classMap.toString());


    }
    
 }