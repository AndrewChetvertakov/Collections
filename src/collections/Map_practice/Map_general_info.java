package collections.Map_practice;

import Replits.Dog;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Map_general_info {
    public static void main(String[] args) {

        Map<String, Dog> map1 = new HashMap<>();

        Dog rex = new Dog("Rex", 3, "German sheppard");
        Dog fluffy = new Dog("Fluffy", 1, "pomeranian");

        map1.put("Rex", rex);
        map1.put("Fluffy", fluffy);

        System.out.println("map1.get(\"Rex\").getAgeInHumanYears() = " + map1.get("Rex").getAgeInHumanYears());
        System.out.println("map1.get(\"Fluffy\").getAgeInHumanYears() = " + map1.get("Fluffy").getAgeInHumanYears());



        Map<String, String> hashMap = new HashMap<>();  // <-- most popular
        Map<String, String> treeMap = new TreeMap<>();  // <-- most popular


        Map<String, String> hashTable = new Hashtable<>(); // synchronized
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();

        SortedMap<String, String> sortedMap = new TreeMap<>();






    }
}
