package com.first.collection;

import com.first.Student;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
    public static void main(String[] args) {
//        testSortSet();
//        testSortSetMethods();
        testComparator();
    }

    private static void testComparator() {
        SortedSet<String> names = new TreeSet<>(Comparator.nullsFirst(Comparator.comparing(String::length)));
        names.add("XML");
        names.add("CSS");
        names.add("HTML");
        names.add(null);

        names.forEach(System.out::println);
    }

    private static void testSortSetMethods() {
        SortedSet<String> names = new TreeSet<>();
        names.add("HTML");
        names.add("Java");
        names.add("SQL");
        names.add("CSS");
        System.out.println("Sorted Set: " + names);
        System.out.println("First: " + names.first());
        System.out.println("Last: " + names.last());

        SortedSet<String> ssBeforeCSS = ((TreeSet<String>) names).headSet("CSS");
        System.out.println(ssBeforeCSS);

        SortedSet<String> ssBetwenCSSAndHTML = ((TreeSet<String>) names).subSet("CSS", "HTML");
        System.out.println(ssBetwenCSSAndHTML);

        SortedSet<String> ssBetwenCSSAndHTML2 = names.subSet("CSS", "SQL");
        System.out.println(ssBetwenCSSAndHTML2);

        SortedSet<String> ssCSSAndAfter = ((TreeSet<String>) names).tailSet("CSS");
        System.out.println(ssCSSAndAfter);
    }

    private static void testSortSet() {
        SortedSet<Student> persionById = new TreeSet<>(Comparator.comparing(Student::getId));

        persionById.add(new Student("1", "小明"));
        persionById.add(new Student("2", "小红"));
        persionById.add(new Student("3", "小白"));
        persionById.add(new Student("4", "小蓝"));
        persionById.add(new Student("4", "小青"));

        System.out.println("Persions by Id: ");
        persionById.forEach(System.out::println);


        SortedSet<Student> persionByName = new TreeSet<>(Comparator.comparing(Student::getName));

        persionByName.add(new Student("7", "林晓舜"));
        persionByName.add(new Student("8", "张爱玲"));
        persionByName.add(new Student("5", "测试"));

        System.out.println("Persion by Name: ");
        persionByName.forEach(item -> {
            if (!(item == null)) {
                System.out.println(item);
            }
        });
    }


}
