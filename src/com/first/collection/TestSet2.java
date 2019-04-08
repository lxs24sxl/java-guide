package com.first.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet2 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("HTML");
        s1.add("CSS");
        s1.add("XML");

        Set<String> s2 = new HashSet<>();
        s2.add("Java");
        s2.add("Javascript");
        s2.add("CSS");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        performUnion(s1, s2);
        performIntersection(s1, s2);
        performDifference(s1, s2);
        testForSubset(s1, s2);
    }

    private static void testForSubset(Set<String> s1, Set<String> s2) {
        System.out.println("s2 is subset s1: " + s1.containsAll(s2));
        System.out.println("s1 is subset s2: " + s2.containsAll(s1));
    }

    private static void performDifference(Set<String> s1, Set<String> s2) {
        Set<String> s1Differences = new HashSet<>(s1);
        s1Differences.removeAll(s2);

        Set<String> s2Differences = new HashSet<>(s2);
        s2Differences.removeAll(s1);

        System.out.println("s1Differences = " + s1Differences);
        System.out.println("s2Differences = " + s2Differences);
    }

    private static void performUnion(Set<String> s1, Set<String> s2) {
        Set<String> s1Unions2 = new HashSet<>(s1);
        s1Unions2.addAll(s2);
        System.out.println("s1 union s2: " + s1Unions2);
    }

    private static void performIntersection(Set<String> s1, Set<String> s2) {
        Set<String> s1Intersections2 = new HashSet<>(s1);
        s1Intersections2.retainAll(s2);
        System.out.println("s1 intersection s2: " + s1Intersections2);
    }

}
