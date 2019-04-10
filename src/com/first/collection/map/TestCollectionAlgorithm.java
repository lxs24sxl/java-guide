package com.first.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollectionAlgorithm {
    /**
     * 排序
     * @param list
     * @return List<String>
     */
    public static List<String> TestSort(List<String> list) {
        list.sort(Comparator.comparing(String::length));
        return list;
    }

    /**
     * 通过二分查找法获取下标
     * @param list
     * @param str
     * @return 下标
     */
    public static int getIndexByBinarySearch(List<String> list, String str) {
        int index = Collections.binarySearch(list, str);
        return index;
    }

    /**
     * 获取一个随机排序的列表
     * @param list
     * @return
     */
    public static List<String> getShuffleList(List<String> list) {
        List<String> temp = new ArrayList<>(list);
        Collections.shuffle(temp);
        return temp;
    }

    /**
     * 获取一个反向列表
     * @param list
     * @return
     */
    public static List<String> getReverseList(List<String> list) {
        List<String> temp = new ArrayList<>(list);
        Collections.reverse(temp);
        return temp;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("R");
        list.add("CSS");
        list.add("XML");
        System.out.println("TestSort(list): " + TestSort(list));
        System.out.println("list: " + list);
        System.out.println("getIndexByBinartSearch(list, 'R'):" +
                getIndexByBinarySearch(list, "CSS"));
        System.out.println("list = " + list);
        System.out.println("getShuffleList" + getShuffleList(list));
        System.out.println("list = " + list);
        System.out.println("getReverseList" + getReverseList(list));
        System.out.println("list = " + list);
    }
}
