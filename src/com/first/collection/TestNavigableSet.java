package com.first.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

//        Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = ns.descendingSet();

//        Print the normal and reverse views
        System.out.println("Normal orders" + ns);
        System.out.println("Reverse order: " + reverseNs);

        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
        System.out.println("3 or more: " + threeOrMore);
        System.out.println("lower(3): " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));
        System.out.println("higher(3): " + ns.higher(3));
        System.out.println("ceiling(3): " + ns.ceiling(3));

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("ns：" + ns);

        System.out.println("pollLash(): " + ns.pollLast());
        System.out.println("ns：" + ns);

        System.out.println("subSet(): " + ns.subSet(0, true, 8, true));

        Iterator iterator = ns.iterator();
        while (iterator.hasNext()) {
            System.out.println("value: " + iterator.next());
        }

    }
}
