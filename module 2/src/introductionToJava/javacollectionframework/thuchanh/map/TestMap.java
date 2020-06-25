package introductionToJava.javacollectionframework.thuchanh.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("A",30);
        hashMap.put("C",31);
        hashMap.put("B",29);
        hashMap.put("E",29);
        System.out.println("Display Entries in HashMap");
        System.out.println(hashMap+"\n");
        Map<String,Integer> treeMap =new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap =new LinkedHashMap<>(16,0.75f,false);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("AnderSon",31);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",30);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));


    }
}
