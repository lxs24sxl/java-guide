package com.first.collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("Oracle");
        list.add("CSS");
        list.add("XML");
        list.addAll(new ArrayList<String>(){
            {
                add("Javascript");
                add("Jquery");
            }
        });
        list.add("JAVA");

        System.out.println("list: " + list);

        int count = list.size();
        System.out.println("count = " + count);

        System.out.println("get(3): " + list.get(3));

        List<String> cloneList = (List<String>) ((ArrayList<String>) list).clone();
        System.out.println("cloneList == list: " + (cloneList == list));

        System.out.println("indexOf('JAVA'): " + list.indexOf("JAVA"));

        System.out.println("isEmpty(): " + list.isEmpty());

        System.out.println("lastIndexOf('JAVA'): " + list.lastIndexOf("JAVA"));

        list.remove(0);
        System.out.println("list = " + list);

        list.removeAll(new ArrayList<String>(){{add("Javascript"); add("Jquery");}});

        System.out.println("list = " + list);
        
        list.set(0, "JAVA");
        System.out.println("list = " + list);

        System.out.println("toArray(): " + list.toArray());
    }
}
