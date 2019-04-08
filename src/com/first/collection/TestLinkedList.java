package com.first.collection;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class TestLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.offer("SQL");
        queue.offer("CSS");
        queue.add("XML");
        queue.offer("Java");
        System.out.println("Queue: " + queue);

        System.out.println("queue.peek(): " + queue.peek());
//        while(queue.peek() != null) {
//            System.out.println("Head Element: " + queue.peek());
////            queue.remove();
//            String pollFirst = ((LinkedList<String>) queue).pollFirst();
//
//            System.out.println("Removed one element from Queue" + pollFirst );
//            System.out.println("Queue: " + queue);
//        }
        System.out.println("queue.isEmpty(): " + queue.isEmpty());

        System.out.println("queue.peek(): " + queue.peek());

        System.out.println("queue.peekFirst(): " + ((LinkedList<String>)queue).peekFirst());

        System.out.println("queue.peekLast(): " + ((LinkedList<String>)queue).peekLast());
        
//        Boolean isDelect = ((LinkedList<String>) queue).removeFirstOccurrence("Java");
        ((LinkedList<String>) queue).removeLastOccurrence("Java");
//        System.out.println("isDelect = " + isDelect);
        System.out.println("queue: " + queue);

        ((LinkedList<String>) queue).removeFirstOccurrence("Java");
        System.out.println("queue: " + queue);

        System.out.println("queue.size()" + queue.size());

        try {
            String str = queue.element();
            System.out.println("queue.element(): " + str);
            str = queue.remove();
            System.out.println("queue.remove(): " + str);
        } catch (NoSuchElementException e) {
            System.out.println("queue.remove(): Queue is  empty.");
        }
    }

}
