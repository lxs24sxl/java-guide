package com.first.collection.map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TestSpecialCollection {
    public static void main(String[] args) {
        testTreeMap();
        System.out.println("========================");
        testConcurrentMap();
    }

    public static void testTreeMap() {
        // SortedMap<String, String> sMap = new TreeMap<>();

        // 根据字符串长度来定义
        Comparator<String> keyComparable = Comparator.comparing(String::length).thenComparing(String::compareToIgnoreCase);
        SortedMap<String, String> sMap = new TreeMap<>(keyComparable);

        sMap.put("CSS", "style");
        sMap.put("HTML", "mark up");
        sMap.put("Oracle", "database");
        sMap.put("XML", "data");

        System.out.println("sMap = " + ((TreeMap<String, String>) sMap).descendingMap());

        // SortedMap<String, String> tailMap = ((TreeMap<String, String>) sMap).tailMap("CSS", false);
        SortedMap<String, String> subMap = ((TreeMap<String, String>) sMap).subMap("CSS", "XML");
        System.out.println("subMap = " + subMap);
    }

    public static void testConcurrentMap() {
        ConcurrentMap<String, String> cMap = new ConcurrentHashMap<>();
        cMap.put("A", "A");

        System.out.println("Concurrent Map: " + cMap);

        System.out.println(cMap.putIfAbsent("A", "1"));
        System.out.println("cMap = " + cMap);
        System.out.println(cMap.putIfAbsent("B", "B"));
        System.out.println("cMap = " + cMap);
        System.out.println(cMap.remove("A", "B"));
        System.out.println("cMap = " + cMap);
        System.out.println(cMap.replace("A", "B"));
        System.out.println("cMap = " + cMap);

    }
}
