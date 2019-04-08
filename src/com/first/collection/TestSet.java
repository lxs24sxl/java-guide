package com.first.collection;

import com.first.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        testHashSet();
        testLinkedHashSet();
    }
    private static void testHashSet() {
        Set<Student> s1 = new HashSet<Student>();
        s1.add(new Student("1","HTML"));
        s1.add(new Student("2", "CSS"));
        s1.add(new Student("3", "XML"));
        s1.add(new Student("4", "XML"));

        System.out.println("s1 = " + s1);

        Set<Student> s2 = new HashSet<Student>(s1);
        s2.add(new Student("5", "JAVA"));
        s2.add(new Student("6", "SQL"));
        s2.add(null);
        s2.add(null);

        System.out.println("s2 = " + s2);

    }

    private static void testLinkedHashSet() {
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");
        s1.add("E");

        Set<String> s2 = new LinkedHashSet<>();
        s2.add("G");
        s2.add("F");


        System.out.println("s1 = " + s1);
        System.out.printf("LinkedHashSet的数量为: %d%n", s1.size());

    }



}
