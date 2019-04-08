package com.first.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListInterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Oracle");
        list.add("SQL");
        list.add("CSS");
        list.add("XML");
        System.out.println("List: " + list);
        // Get the list iterator

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            int index = iterator.nextIndex();
            String element = iterator.next();
            System.out.println("index = " + index + "; element = " + element );
        }

        while(iterator.hasPrevious()) {
            int index = iterator.previousIndex();
            String element = iterator.previous();
            System.out.println("index = " + index + "; element = " + element );
        }
    }
}
